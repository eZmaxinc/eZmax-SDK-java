package com.ezmax.api;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.codec.digest.HmacAlgorithms;
import org.apache.commons.codec.digest.HmacUtils;

import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.LinkedHashMap;
import java.util.Map;

public class RequestSignature {

    public static String getFingerprintV1(String authorization, String date, String method, String url, String body, Integer expiration) {
        String safeBody = (body != null) ? body : "";
        String content = method + "\n" + url + "\n" + safeBody + "\n" + authorization + "\n" + date;
        if (expiration != null) {
            content += "\n" + expiration;
        }
        return "v1=" + DigestUtils.sha256Hex(content);
    }

    public static String getSignatureV1(String authorization, String date, String fingerprint, String secret) {
        String contentToSign = fingerprint + authorization + date;
        return "v1=" + new HmacUtils(HmacAlgorithms.HMAC_SHA_256, secret).hmacHex(contentToSign);
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

    public static void main(String[] args) {
        // 1. Données de test fictives (ou utilise tes vrais identifiants)
        String apiKey = "ThisIsMyAuthorizationKey";
        String secret = "ThisIsTheSecretAssociatedToTheAuthorizationKey";
        String method = "GET";
        String url = "https://prod.api.appcluster01.ca-central-1.ezmax.com/rest/1/object/activesession/getCurrent";
        String body = "";
        String dateFixe = "2000-12-31T23:59:59Z";

        System.out.println("==========================================");
        System.out.println("TEST 1: getFingerprintV1 (avec date fixe)");
        System.out.println("==========================================");
        String fingerprint = RequestSignature.getFingerprintV1(apiKey, dateFixe, method, url, body, null);
        System.out.println("Fingerprint généré : " + fingerprint);

        System.out.println("\n==========================================");
        System.out.println("TEST 2: getSignatureV1");
        System.out.println("==========================================");
        String signature = RequestSignature.getSignatureV1(apiKey, dateFixe, fingerprint, secret);
        System.out.println("Signature générée   : " + signature);

        method = "POST";
        url = "https://prod.api.global.ezmax.com/1/module/sspr/sendUsernames";
        body = "{\"pksCustomerCode\": \"demo\",\"fkiLanguageID\": \"2\",\"eUserTypeSSPR\": \"Native\",\"sEmailAddress\": \"email@example.com\"}";

        System.out.println("\n==========================================");
        System.out.println("TEST 3: getFingerprintV1 POST (flux complet en direct)");
        System.out.println("==========================================");
        fingerprint = RequestSignature.getFingerprintV1(apiKey, dateFixe, method, url, body, null);
        System.out.println("Fingerprint généré : " + fingerprint);

        System.out.println("\n==========================================");
        System.out.println("TEST 4: getSignatureV1 POST (flux complet en direct)");
        System.out.println("==========================================");
        signature = RequestSignature.getSignatureV1(apiKey, dateFixe, fingerprint, secret);
        System.out.println("Signature générée   : " + signature);


        System.out.println("\n==========================================");
        System.out.println("TEST 5: getHeadersV1 (flux complet en direct)");
        System.out.println("==========================================");
        Map<String, String> headers = RequestSignature.getHeadersV1(apiKey, secret, method, url, body, null);
        
        headers.forEach((key, value) -> {
            System.out.println(key + " -> " + value);
        });
        System.out.println("==========================================");
    }
}