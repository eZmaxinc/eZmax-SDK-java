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
import com.ezmax.api.model.ScimGroup;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ScimGroupsApi
 */
@Disabled
public class ScimGroupsApiTest {

    private final ScimGroupsApi api = new ScimGroupsApi();

    /**
     * Create a new Usergroup
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void groupsCreateObjectScimV2Test() throws ApiException {
        ScimGroup scimGroup = null;
        ScimGroup response = api.groupsCreateObjectScimV2(scimGroup);
        // TODO: test validations
    }

    /**
     * Delete an existing Usergroup
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void groupsDeleteObjectScimV2Test() throws ApiException {
        String groupId = null;
        api.groupsDeleteObjectScimV2(groupId);
        // TODO: test validations
    }

    /**
     * Edit an existing Usergroup
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void groupsEditObjectScimV2Test() throws ApiException {
        String groupId = null;
        ScimGroup scimGroup = null;
        ScimGroup response = api.groupsEditObjectScimV2(groupId, scimGroup);
        // TODO: test validations
    }

    /**
     * Retrieve Usergroup list
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void groupsGetListScimV2Test() throws ApiException {
        String filter = null;
        ScimGroup response = api.groupsGetListScimV2(filter);
        // TODO: test validations
    }

    /**
     * Retrieve an existing Usergroup
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void groupsGetObjectScimV2Test() throws ApiException {
        String groupId = null;
        ScimGroup response = api.groupsGetObjectScimV2(groupId);
        // TODO: test validations
    }

}