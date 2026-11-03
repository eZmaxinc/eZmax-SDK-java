package com.ezmax.api;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.LinkedHashMap;
import java.util.Map;

public class RequestSignature {

    public static String getFingerprintV1(String authorization, String date, String method, String url, String body, Integer expiration) {
        String safeBody = (body != null) ? body : "";
        String content = method + "\n" + url + "\n" + safeBody + "\n" + authorization + "\n" + date;
        if (expiration != null) {
            content += "\n" + expiration;
        }
        return "v1=" + sha256Hex(content);
    }

    public static String getSignatureV1(String authorization, String date, String fingerprint, String secret) {
        String contentToSign = fingerprint + authorization + date;
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(secret.getBytes(StandardCharsets.UTF_8), "HmacSHA256"));
            return "v1=" + toHex(mac.doFinal(contentToSign.getBytes(StandardCharsets.UTF_8)));
        } catch (NoSuchAlgorithmException | InvalidKeyException e) {
            throw new IllegalStateException("Unable to calculate HMAC-SHA-256 signature", e);
        }
    }

    
    public static Map<String, String> getHeadersV1(String authorization, String secret, String method, String url, String body, Integer expiration) {
        String dtDate = DateTimeFormatter.ISO_INSTANT.format(Instant.now().truncatedTo(ChronoUnit.SECONDS));
        String fingerprint = getFingerprintV1(authorization, dtDate, method, url, body, expiration);
        String signature = getSignatureV1(authorization, dtDate, fingerprint, secret);
        
        Map<String, String> headers = new LinkedHashMap<>();
        headers.put("Ezmax-Date", dtDate);
        headers.put("Ezmax-Fingerprint", fingerprint);
        headers.put("Ezmax-Signature", signature);
        if (expiration != null) {
            headers.put("Ezmax-Expiration", String.valueOf(expiration));
        }
        return headers;
    }
    
    private static String sha256Hex(String content) {
        try {
            return toHex(MessageDigest.getInstance("SHA-256").digest(content.getBytes(StandardCharsets.UTF_8)));
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("Unable to calculate SHA-256 fingerprint", e);
        }
    }

    private static String toHex(byte[] bytes) {
        char[] hex = "0123456789abcdef".toCharArray();
        StringBuilder result = new StringBuilder(bytes.length * 2);
        for (byte value : bytes) {
            int unsignedValue = value & 0xff;
            result.append(hex[unsignedValue >>> 4]);
            result.append(hex[unsignedValue & 0x0f]);
        }
        return result.toString();
    }
}