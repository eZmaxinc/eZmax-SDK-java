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
import com.ezmax.api.model.CreditcardtypeGetAutocompleteV2Response;
import com.ezmax.api.model.HeaderAcceptLanguage;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ObjectCreditcardtypeApi
 */
@Disabled
public class ObjectCreditcardtypeApiTest {

    private final ObjectCreditcardtypeApi api = new ObjectCreditcardtypeApi();

    /**
     * Retrieve Creditcardtypes and IDs
     *
     * Get the list of Creditcardtype to be used in a dropdown or autocomplete control.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void creditcardtypeGetAutocompleteV2Test() throws ApiException {
        String sSelector = null;
        String eFilterActive = null;
        String sQuery = null;
        HeaderAcceptLanguage acceptLanguage = null;
        CreditcardtypeGetAutocompleteV2Response response = api.creditcardtypeGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage);
        // TODO: test validations
    }

}
