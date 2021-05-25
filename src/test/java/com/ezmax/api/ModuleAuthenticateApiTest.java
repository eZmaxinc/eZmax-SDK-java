/*
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.0.43
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ezmax.api;

import eZmaxAPI.ApiException;
import com.ezmax.api.model.AuthenticateAuthenticateV2Request;
import com.ezmax.api.model.AuthenticateAuthenticateV2Response;
import com.ezmax.api.model.CommonResponseError;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ModuleAuthenticateApi
 */
@Ignore
public class ModuleAuthenticateApiTest {

    private final ModuleAuthenticateApi api = new ModuleAuthenticateApi();

    
    /**
     * Authenticate a user
     *
     * This endpoint authenticates a user.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void authenticateAuthenticateV2Test() throws ApiException {
        String eSessionType = null;
        AuthenticateAuthenticateV2Request authenticateAuthenticateV2Request = null;
        AuthenticateAuthenticateV2Response response = api.authenticateAuthenticateV2(eSessionType, authenticateAuthenticateV2Request);

        // TODO: test validations
    }
    
}