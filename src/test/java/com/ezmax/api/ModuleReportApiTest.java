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
import com.ezmax.api.model.CommonGetReportV1Response;
import com.ezmax.api.model.CommonResponseError;
import java.io.File;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ModuleReportApi
 */
@Disabled
public class ModuleReportApiTest {

    private final ModuleReportApi api = new ModuleReportApi();

    /**
     * Retrieve report from cache
     *
     * Retrieve a report that was previously generated and cached
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void reportGetReportFromCacheV1Test() throws ApiException {
        String sReportgroupCacheID = null;
        CommonGetReportV1Response response = api.reportGetReportFromCacheV1(sReportgroupCacheID);
        // TODO: test validations
    }

}