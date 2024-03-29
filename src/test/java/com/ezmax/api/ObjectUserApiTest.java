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
import com.ezmax.api.model.CommonResponseError;
import java.io.File;
import com.ezmax.api.model.HeaderAcceptLanguage;
import com.ezmax.api.model.UserCreateObjectV1Request;
import com.ezmax.api.model.UserCreateObjectV1Response;
import com.ezmax.api.model.UserEditObjectV1Request;
import com.ezmax.api.model.UserEditObjectV1Response;
import com.ezmax.api.model.UserEditPermissionsV1Request;
import com.ezmax.api.model.UserEditPermissionsV1Response;
import com.ezmax.api.model.UserGetAutocompleteV2Response;
import com.ezmax.api.model.UserGetEffectivePermissionsV1Response;
import com.ezmax.api.model.UserGetListV1Response;
import com.ezmax.api.model.UserGetObjectV2Response;
import com.ezmax.api.model.UserGetPermissionsV1Response;
import com.ezmax.api.model.UserGetSubnetsV1Response;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ObjectUserApi
 */
@Disabled
public class ObjectUserApiTest {

    private final ObjectUserApi api = new ObjectUserApi();

    /**
     * Create a new User
     *
     * The endpoint allows to create one or many elements at once.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void userCreateObjectV1Test() throws ApiException {
        UserCreateObjectV1Request userCreateObjectV1Request = null;
        UserCreateObjectV1Response response = api.userCreateObjectV1(userCreateObjectV1Request);
        // TODO: test validations
    }

    /**
     * Edit an existing User
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void userEditObjectV1Test() throws ApiException {
        Integer pkiUserID = null;
        UserEditObjectV1Request userEditObjectV1Request = null;
        UserEditObjectV1Response response = api.userEditObjectV1(pkiUserID, userEditObjectV1Request);
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
    public void userEditPermissionsV1Test() throws ApiException {
        Integer pkiUserID = null;
        UserEditPermissionsV1Request userEditPermissionsV1Request = null;
        UserEditPermissionsV1Response response = api.userEditPermissionsV1(pkiUserID, userEditPermissionsV1Request);
        // TODO: test validations
    }

    /**
     * Retrieve Users and IDs
     *
     * Get the list of User to be used in a dropdown or autocomplete control.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void userGetAutocompleteV2Test() throws ApiException {
        String sSelector = null;
        String eFilterActive = null;
        String sQuery = null;
        HeaderAcceptLanguage acceptLanguage = null;
        UserGetAutocompleteV2Response response = api.userGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage);
        // TODO: test validations
    }

    /**
     * Retrieve an existing User&#39;s Effective Permissions
     *
     * Effective Permissions refers to the combination of Permissions held by a User and the Permissions associated with the Usergroups they belong to.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void userGetEffectivePermissionsV1Test() throws ApiException {
        Integer pkiUserID = null;
        UserGetEffectivePermissionsV1Response response = api.userGetEffectivePermissionsV1(pkiUserID);
        // TODO: test validations
    }

    /**
     * Retrieve User list
     *
     * Enum values that can be filtered in query parameter *sFilter*:  | Variable | Valid values | |---|---| | eUserType | AgentBroker&lt;br&gt;Assistant&lt;br&gt;Employee&lt;br&gt;EzsignUser&lt;br&gt;Normal | | eUserOrigin | BuiltIn&lt;br&gt;External | | eUserEzsignaccess | No&lt;br&gt;PaidByOffice&lt;br&gt;PerDocument&lt;br&gt;Prepaid |
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void userGetListV1Test() throws ApiException {
        String eOrderBy = null;
        Integer iRowMax = null;
        Integer iRowOffset = null;
        HeaderAcceptLanguage acceptLanguage = null;
        String sFilter = null;
        UserGetListV1Response response = api.userGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter);
        // TODO: test validations
    }

    /**
     * Retrieve an existing User
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void userGetObjectV2Test() throws ApiException {
        Integer pkiUserID = null;
        UserGetObjectV2Response response = api.userGetObjectV2(pkiUserID);
        // TODO: test validations
    }

    /**
     * Retrieve an existing User&#39;s Permissions
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void userGetPermissionsV1Test() throws ApiException {
        Integer pkiUserID = null;
        UserGetPermissionsV1Response response = api.userGetPermissionsV1(pkiUserID);
        // TODO: test validations
    }

    /**
     * Retrieve an existing User&#39;s Subnets
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void userGetSubnetsV1Test() throws ApiException {
        Integer pkiUserID = null;
        UserGetSubnetsV1Response response = api.userGetSubnetsV1(pkiUserID);
        // TODO: test validations
    }

}
