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
import com.ezmax.api.model.HeaderAcceptLanguage;
import com.ezmax.api.model.TimezoneGetAutocompleteV2Response;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ObjectTimezoneApi
 */
@Disabled
public class ObjectTimezoneApiTest {

    private final ObjectTimezoneApi api = new ObjectTimezoneApi();

    /**
     * Retrieve Timezones and IDs
     *
     * Get the list of Timezone to be used in a dropdown or autocomplete control.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void timezoneGetAutocompleteV2Test() throws ApiException {
        String sSelector = null;
        String eFilterActive = null;
        String sQuery = null;
        HeaderAcceptLanguage acceptLanguage = null;
        TimezoneGetAutocompleteV2Response response = api.timezoneGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage);
        // TODO: test validations
    }

}
