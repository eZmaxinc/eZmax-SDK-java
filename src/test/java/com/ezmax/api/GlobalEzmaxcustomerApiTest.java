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
import com.ezmax.api.model.GlobalEzmaxcustomerGetConfigurationV1Response;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GlobalEzmaxcustomerApi
 */
@Disabled
public class GlobalEzmaxcustomerApiTest {

    private final GlobalEzmaxcustomerApi api = new GlobalEzmaxcustomerApi();

    /**
     * Get ezmaxcustomer configuration
     *
     * Retrieve the ezmaxcustomer&#39;s specific configuration. This will help locate the proper region (ie: sInfrastructureregionCode) and the proper environment (ie: sInfrastructureenvironmenttypeDescription) where the customer&#39;s data is stored.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void globalEzmaxcustomerGetConfigurationV1Test() throws ApiException {
        String pksEzmaxcustomerCode = null;
        GlobalEzmaxcustomerGetConfigurationV1Response response = api.globalEzmaxcustomerGetConfigurationV1(pksEzmaxcustomerCode);
        // TODO: test validations
    }

}
