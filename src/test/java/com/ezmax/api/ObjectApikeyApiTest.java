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
import com.ezmax.api.model.ApikeyCreateObjectV2Request;
import com.ezmax.api.model.ApikeyCreateObjectV2Response;
import com.ezmax.api.model.ApikeyEditObjectV1Request;
import com.ezmax.api.model.ApikeyEditObjectV1Response;
import com.ezmax.api.model.ApikeyEditPermissionsV1Request;
import com.ezmax.api.model.ApikeyEditPermissionsV1Response;
import com.ezmax.api.model.ApikeyGenerateDelegatedCredentialsV1Request;
import com.ezmax.api.model.ApikeyGenerateDelegatedCredentialsV1Response;
import com.ezmax.api.model.ApikeyGetCorsV1Response;
import com.ezmax.api.model.ApikeyGetListV1Response;
import com.ezmax.api.model.ApikeyGetObjectV2Response;
import com.ezmax.api.model.ApikeyGetPermissionsV1Response;
import com.ezmax.api.model.ApikeyGetSubnetsV1Response;
import com.ezmax.api.model.ApikeyRegenerateV1Request;
import com.ezmax.api.model.ApikeyRegenerateV1Response;
import com.ezmax.api.model.CommonResponseError;
import java.io.File;
import com.ezmax.api.model.HeaderAcceptLanguage;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ObjectApikeyApi
 */
@Disabled
public class ObjectApikeyApiTest {

    private final ObjectApikeyApi api = new ObjectApikeyApi();

    /**
     * Create a new Apikey
     *
     * The endpoint allows to create one or many elements at once.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apikeyCreateObjectV2Test() throws ApiException {
        ApikeyCreateObjectV2Request apikeyCreateObjectV2Request = null;
        ApikeyCreateObjectV2Response response = api.apikeyCreateObjectV2(apikeyCreateObjectV2Request);
        // TODO: test validations
    }

    /**
     * Edit an existing Apikey
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apikeyEditObjectV1Test() throws ApiException {
        Integer pkiApikeyID = null;
        ApikeyEditObjectV1Request apikeyEditObjectV1Request = null;
        ApikeyEditObjectV1Response response = api.apikeyEditObjectV1(pkiApikeyID, apikeyEditObjectV1Request);
        // TODO: test validations
    }

    /**
     * Edit multiple Permissions
     *
     * Using this endpoint, you can edit multiple Permissions at the same time.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apikeyEditPermissionsV1Test() throws ApiException {
        Integer pkiApikeyID = null;
        ApikeyEditPermissionsV1Request apikeyEditPermissionsV1Request = null;
        ApikeyEditPermissionsV1Response response = api.apikeyEditPermissionsV1(pkiApikeyID, apikeyEditPermissionsV1Request);
        // TODO: test validations
    }

    /**
     * Generate a delegated credentials
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apikeyGenerateDelegatedCredentialsV1Test() throws ApiException {
        ApikeyGenerateDelegatedCredentialsV1Request apikeyGenerateDelegatedCredentialsV1Request = null;
        ApikeyGenerateDelegatedCredentialsV1Response response = api.apikeyGenerateDelegatedCredentialsV1(apikeyGenerateDelegatedCredentialsV1Request);
        // TODO: test validations
    }

    /**
     * Retrieve an existing Apikey&#39;s cors
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apikeyGetCorsV1Test() throws ApiException {
        Integer pkiApikeyID = null;
        ApikeyGetCorsV1Response response = api.apikeyGetCorsV1(pkiApikeyID);
        // TODO: test validations
    }

    /**
     * Retrieve Apikey list
     *
     * Enum values that can be filtered in query parameter *sFilter*:  | Variable | Valid values | |---|---|
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apikeyGetListV1Test() throws ApiException {
        String eOrderBy = null;
        Integer iRowMax = null;
        Integer iRowOffset = null;
        HeaderAcceptLanguage acceptLanguage = null;
        String sFilter = null;
        ApikeyGetListV1Response response = api.apikeyGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter);
        // TODO: test validations
    }

    /**
     * Retrieve an existing Apikey
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apikeyGetObjectV2Test() throws ApiException {
        Integer pkiApikeyID = null;
        ApikeyGetObjectV2Response response = api.apikeyGetObjectV2(pkiApikeyID);
        // TODO: test validations
    }

    /**
     * Retrieve an existing Apikey&#39;s Permissions
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apikeyGetPermissionsV1Test() throws ApiException {
        Integer pkiApikeyID = null;
        ApikeyGetPermissionsV1Response response = api.apikeyGetPermissionsV1(pkiApikeyID);
        // TODO: test validations
    }

    /**
     * Retrieve an existing Apikey&#39;s subnets
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apikeyGetSubnetsV1Test() throws ApiException {
        Integer pkiApikeyID = null;
        ApikeyGetSubnetsV1Response response = api.apikeyGetSubnetsV1(pkiApikeyID);
        // TODO: test validations
    }

    /**
     * Regenerate the Apikey
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apikeyRegenerateV1Test() throws ApiException {
        Integer pkiApikeyID = null;
        ApikeyRegenerateV1Request apikeyRegenerateV1Request = null;
        ApikeyRegenerateV1Response response = api.apikeyRegenerateV1(pkiApikeyID, apikeyRegenerateV1Request);
        // TODO: test validations
    }

}
