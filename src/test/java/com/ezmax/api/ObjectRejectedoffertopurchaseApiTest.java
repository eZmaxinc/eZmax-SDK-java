/*
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.2.0
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ezmax.api;

import eZmaxAPI.ApiException;
import com.ezmax.api.model.CommonResponseError;
import com.ezmax.api.model.RejectedoffertopurchaseGetCommunicationListV1Response;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ObjectRejectedoffertopurchaseApi
 */
@Disabled
public class ObjectRejectedoffertopurchaseApiTest {

    private final ObjectRejectedoffertopurchaseApi api = new ObjectRejectedoffertopurchaseApi();

    /**
     * Retrieve Communication list
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void rejectedoffertopurchaseGetCommunicationListV1Test() throws ApiException {
        Integer pkiRejectedoffertopurchaseID = null;
        RejectedoffertopurchaseGetCommunicationListV1Response response = api.rejectedoffertopurchaseGetCommunicationListV1(pkiRejectedoffertopurchaseID);
        // TODO: test validations
    }

}