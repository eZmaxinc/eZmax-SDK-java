/*
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.18
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ezmax.api;

import eZmaxAPI.ApiException;
import com.ezmax.api.model.ModulegroupGetAllV1Response;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ObjectModulegroupApi
 */
@Disabled
public class ObjectModulegroupApiTest {

    private final ObjectModulegroupApi api = new ObjectModulegroupApi();

    /**
     * Retrieve all Modulegroups
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modulegroupGetAllV1Test() throws ApiException {
        String eContext = null;
        ModulegroupGetAllV1Response response = api.modulegroupGetAllV1(eContext);
        // TODO: test validations
    }

}