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
import com.ezmax.api.model.CustomerCreateObjectV1Request;
import com.ezmax.api.model.CustomerCreateObjectV1Response;
import com.ezmax.api.model.CustomerGetObjectV2Response;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ObjectCustomerApi
 */
@Disabled
public class ObjectCustomerApiTest {

    private final ObjectCustomerApi api = new ObjectCustomerApi();

    /**
     * Create a new Customer
     *
     * The endpoint allows to create one or many elements at once.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void customerCreateObjectV1Test() throws ApiException {
        CustomerCreateObjectV1Request customerCreateObjectV1Request = null;
        CustomerCreateObjectV1Response response = api.customerCreateObjectV1(customerCreateObjectV1Request);
        // TODO: test validations
    }

    /**
     * Retrieve an existing Customer
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void customerGetObjectV2Test() throws ApiException {
        Integer pkiCustomerID = null;
        CustomerGetObjectV2Response response = api.customerGetObjectV2(pkiCustomerID);
        // TODO: test validations
    }

}
