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
import com.ezmax.api.model.EzsignbulksendtransmissionGetEzsignsignaturesAutomaticV1Response;
import com.ezmax.api.model.EzsignbulksendtransmissionGetFormsDataV1Response;
import com.ezmax.api.model.EzsignbulksendtransmissionGetObjectV2Response;
import java.io.File;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ObjectEzsignbulksendtransmissionApi
 */
@Disabled
public class ObjectEzsignbulksendtransmissionApiTest {

    private final ObjectEzsignbulksendtransmissionApi api = new ObjectEzsignbulksendtransmissionApi();

    /**
     * Retrieve an existing Ezsignbulksendtransmission&#39;s Csv containing errors
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ezsignbulksendtransmissionGetCsvErrorsV1Test() throws ApiException {
        Integer pkiEzsignbulksendtransmissionID = null;
        String response = api.ezsignbulksendtransmissionGetCsvErrorsV1(pkiEzsignbulksendtransmissionID);
        // TODO: test validations
    }

    /**
     * Retrieve an existing Ezsignbulksendtransmission&#39;s automatic Ezsignsignatures
     *
     * Return the Ezsignsignatures that can be signed by the current user at the current step in the process
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ezsignbulksendtransmissionGetEzsignsignaturesAutomaticV1Test() throws ApiException {
        Integer pkiEzsignbulksendtransmissionID = null;
        EzsignbulksendtransmissionGetEzsignsignaturesAutomaticV1Response response = api.ezsignbulksendtransmissionGetEzsignsignaturesAutomaticV1(pkiEzsignbulksendtransmissionID);
        // TODO: test validations
    }

    /**
     * Retrieve an existing Ezsignbulksendtransmission&#39;s forms data
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ezsignbulksendtransmissionGetFormsDataV1Test() throws ApiException {
        Integer pkiEzsignbulksendtransmissionID = null;
        EzsignbulksendtransmissionGetFormsDataV1Response response = api.ezsignbulksendtransmissionGetFormsDataV1(pkiEzsignbulksendtransmissionID);
        // TODO: test validations
    }

    /**
     * Retrieve an existing Ezsignbulksendtransmission
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ezsignbulksendtransmissionGetObjectV2Test() throws ApiException {
        Integer pkiEzsignbulksendtransmissionID = null;
        EzsignbulksendtransmissionGetObjectV2Response response = api.ezsignbulksendtransmissionGetObjectV2(pkiEzsignbulksendtransmissionID);
        // TODO: test validations
    }

}
