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
import com.ezmax.api.model.EzsignsignergroupmembershipCreateObjectV1Request;
import com.ezmax.api.model.EzsignsignergroupmembershipCreateObjectV1Response;
import com.ezmax.api.model.EzsignsignergroupmembershipDeleteObjectV1Response;
import com.ezmax.api.model.EzsignsignergroupmembershipGetObjectV2Response;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ObjectEzsignsignergroupmembershipApi
 */
@Disabled
public class ObjectEzsignsignergroupmembershipApiTest {

    private final ObjectEzsignsignergroupmembershipApi api = new ObjectEzsignsignergroupmembershipApi();

    /**
     * Create a new Ezsignsignergroupmembership
     *
     * The endpoint allows to create one or many elements at once.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ezsignsignergroupmembershipCreateObjectV1Test() throws ApiException {
        EzsignsignergroupmembershipCreateObjectV1Request ezsignsignergroupmembershipCreateObjectV1Request = null;
        EzsignsignergroupmembershipCreateObjectV1Response response = api.ezsignsignergroupmembershipCreateObjectV1(ezsignsignergroupmembershipCreateObjectV1Request);
        // TODO: test validations
    }

    /**
     * Delete an existing Ezsignsignergroupmembership
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ezsignsignergroupmembershipDeleteObjectV1Test() throws ApiException {
        Integer pkiEzsignsignergroupmembershipID = null;
        EzsignsignergroupmembershipDeleteObjectV1Response response = api.ezsignsignergroupmembershipDeleteObjectV1(pkiEzsignsignergroupmembershipID);
        // TODO: test validations
    }

    /**
     * Retrieve an existing Ezsignsignergroupmembership
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ezsignsignergroupmembershipGetObjectV2Test() throws ApiException {
        Integer pkiEzsignsignergroupmembershipID = null;
        EzsignsignergroupmembershipGetObjectV2Response response = api.ezsignsignergroupmembershipGetObjectV2(pkiEzsignsignergroupmembershipID);
        // TODO: test validations
    }

}