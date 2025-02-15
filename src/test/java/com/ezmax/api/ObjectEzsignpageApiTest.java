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
import com.ezmax.api.model.EzsignpageConsultV1Response;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ObjectEzsignpageApi
 */
@Disabled
public class ObjectEzsignpageApiTest {

    private final ObjectEzsignpageApi api = new ObjectEzsignpageApi();

    /**
     * Consult an Ezsignpage
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ezsignpageConsultV1Test() throws ApiException {
        Integer pkiEzsignpageID = null;
        Object body = null;
        EzsignpageConsultV1Response response = api.ezsignpageConsultV1(pkiEzsignpageID, body);
        // TODO: test validations
    }

}
