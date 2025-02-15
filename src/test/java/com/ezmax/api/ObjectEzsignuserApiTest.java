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
import com.ezmax.api.model.EzsignuserEditObjectV1Request;
import com.ezmax.api.model.EzsignuserEditObjectV1Response;
import com.ezmax.api.model.EzsignuserGetObjectV2Response;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ObjectEzsignuserApi
 */
@Disabled
public class ObjectEzsignuserApiTest {

    private final ObjectEzsignuserApi api = new ObjectEzsignuserApi();

    /**
     * Edit an existing Ezsignuser
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ezsignuserEditObjectV1Test() throws ApiException {
        Integer pkiEzsignuserID = null;
        EzsignuserEditObjectV1Request ezsignuserEditObjectV1Request = null;
        EzsignuserEditObjectV1Response response = api.ezsignuserEditObjectV1(pkiEzsignuserID, ezsignuserEditObjectV1Request);
        // TODO: test validations
    }

    /**
     * Retrieve an existing Ezsignuser
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ezsignuserGetObjectV2Test() throws ApiException {
        Integer pkiEzsignuserID = null;
        EzsignuserGetObjectV2Response response = api.ezsignuserGetObjectV2(pkiEzsignuserID);
        // TODO: test validations
    }

}
