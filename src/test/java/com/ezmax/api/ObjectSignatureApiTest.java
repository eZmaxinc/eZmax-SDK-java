/*
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.2.1
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ezmax.api;

import eZmaxAPI.ApiException;
import com.ezmax.api.model.CommonResponseError;
import com.ezmax.api.model.SignatureCreateObjectV1Request;
import com.ezmax.api.model.SignatureCreateObjectV1Response;
import com.ezmax.api.model.SignatureDeleteObjectV1Response;
import com.ezmax.api.model.SignatureEditObjectV1Request;
import com.ezmax.api.model.SignatureEditObjectV1Response;
import com.ezmax.api.model.SignatureGetObjectV2Response;
import com.ezmax.api.model.SignatureGetObjectV3Response;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ObjectSignatureApi
 */
@Disabled
public class ObjectSignatureApiTest {

    private final ObjectSignatureApi api = new ObjectSignatureApi();

    /**
     * Create a new Signature
     *
     * The endpoint allows to create one or many elements at once.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void signatureCreateObjectV1Test() throws ApiException {
        SignatureCreateObjectV1Request signatureCreateObjectV1Request = null;
        SignatureCreateObjectV1Response response = api.signatureCreateObjectV1(signatureCreateObjectV1Request);
        // TODO: test validations
    }

    /**
     * Delete an existing Signature
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void signatureDeleteObjectV1Test() throws ApiException {
        Integer pkiSignatureID = null;
        SignatureDeleteObjectV1Response response = api.signatureDeleteObjectV1(pkiSignatureID);
        // TODO: test validations
    }

    /**
     * Edit an existing Signature
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void signatureEditObjectV1Test() throws ApiException {
        Integer pkiSignatureID = null;
        SignatureEditObjectV1Request signatureEditObjectV1Request = null;
        SignatureEditObjectV1Response response = api.signatureEditObjectV1(pkiSignatureID, signatureEditObjectV1Request);
        // TODO: test validations
    }

    /**
     * Retrieve an existing Signature
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void signatureGetObjectV2Test() throws ApiException {
        Integer pkiSignatureID = null;
        SignatureGetObjectV2Response response = api.signatureGetObjectV2(pkiSignatureID);
        // TODO: test validations
    }

    /**
     * Retrieve an existing Signature
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void signatureGetObjectV3Test() throws ApiException {
        Integer pkiSignatureID = null;
        SignatureGetObjectV3Response response = api.signatureGetObjectV3(pkiSignatureID);
        // TODO: test validations
    }

    /**
     * Retrieve an existing Signature initial SVG
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void signatureGetSVGInitialsV1Test() throws ApiException {
        Integer pkiSignatureID = null;
        api.signatureGetSVGInitialsV1(pkiSignatureID);
        // TODO: test validations
    }

    /**
     * Retrieve an existing Signature SVG
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void signatureGetSVGSignatureV1Test() throws ApiException {
        Integer pkiSignatureID = null;
        api.signatureGetSVGSignatureV1(pkiSignatureID);
        // TODO: test validations
    }

}
