/*
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.8
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ezmax.api;

import eZmaxAPI.ApiException;
import com.ezmax.api.model.CommonResponseError;
import com.ezmax.api.model.CommonResponseErrorSTemporaryFileUrl;
import com.ezmax.api.model.EzsigntemplatedocumentCreateObjectV1Request;
import com.ezmax.api.model.EzsigntemplatedocumentCreateObjectV1Response;
import com.ezmax.api.model.EzsigntemplatedocumentEditEzsigntemplateformfieldgroupsV1Request;
import com.ezmax.api.model.EzsigntemplatedocumentEditEzsigntemplateformfieldgroupsV1Response;
import com.ezmax.api.model.EzsigntemplatedocumentEditEzsigntemplatesignaturesV1Request;
import com.ezmax.api.model.EzsigntemplatedocumentEditEzsigntemplatesignaturesV1Response;
import com.ezmax.api.model.EzsigntemplatedocumentEditObjectV1Request;
import com.ezmax.api.model.EzsigntemplatedocumentEditObjectV1Response;
import com.ezmax.api.model.EzsigntemplatedocumentGetEzsigntemplatedocumentpagesV1Response;
import com.ezmax.api.model.EzsigntemplatedocumentGetEzsigntemplateformfieldgroupsV1Response;
import com.ezmax.api.model.EzsigntemplatedocumentGetEzsigntemplatesignaturesV1Response;
import com.ezmax.api.model.EzsigntemplatedocumentGetObjectV1Response;
import com.ezmax.api.model.EzsigntemplatedocumentGetWordsPositionsV1Request;
import com.ezmax.api.model.EzsigntemplatedocumentGetWordsPositionsV1Response;
import com.ezmax.api.model.EzsigntemplatedocumentPatchObjectV1Request;
import com.ezmax.api.model.EzsigntemplatedocumentPatchObjectV1Response;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ObjectEzsigntemplatedocumentApi
 */
@Disabled
public class ObjectEzsigntemplatedocumentApiTest {

    private final ObjectEzsigntemplatedocumentApi api = new ObjectEzsigntemplatedocumentApi();

    /**
     * Create a new Ezsigntemplatedocument
     *
     * The endpoint allows to create one or many elements at once.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ezsigntemplatedocumentCreateObjectV1Test() throws ApiException {
        EzsigntemplatedocumentCreateObjectV1Request ezsigntemplatedocumentCreateObjectV1Request = null;
        EzsigntemplatedocumentCreateObjectV1Response response = api.ezsigntemplatedocumentCreateObjectV1(ezsigntemplatedocumentCreateObjectV1Request);
        // TODO: test validations
    }

    /**
     * Edit multiple Ezsigntemplateformfieldgroups
     *
     * Using this endpoint, you can edit multiple Ezsigntemplateformfieldgroups at the same time.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ezsigntemplatedocumentEditEzsigntemplateformfieldgroupsV1Test() throws ApiException {
        Integer pkiEzsigntemplatedocumentID = null;
        EzsigntemplatedocumentEditEzsigntemplateformfieldgroupsV1Request ezsigntemplatedocumentEditEzsigntemplateformfieldgroupsV1Request = null;
        EzsigntemplatedocumentEditEzsigntemplateformfieldgroupsV1Response response = api.ezsigntemplatedocumentEditEzsigntemplateformfieldgroupsV1(pkiEzsigntemplatedocumentID, ezsigntemplatedocumentEditEzsigntemplateformfieldgroupsV1Request);
        // TODO: test validations
    }

    /**
     * Edit multiple Ezsigntemplatesignatures
     *
     * Using this endpoint, you can edit multiple Ezsigntemplatesignatures at the same time.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ezsigntemplatedocumentEditEzsigntemplatesignaturesV1Test() throws ApiException {
        Integer pkiEzsigntemplatedocumentID = null;
        EzsigntemplatedocumentEditEzsigntemplatesignaturesV1Request ezsigntemplatedocumentEditEzsigntemplatesignaturesV1Request = null;
        EzsigntemplatedocumentEditEzsigntemplatesignaturesV1Response response = api.ezsigntemplatedocumentEditEzsigntemplatesignaturesV1(pkiEzsigntemplatedocumentID, ezsigntemplatedocumentEditEzsigntemplatesignaturesV1Request);
        // TODO: test validations
    }

    /**
     * Edit an existing Ezsigntemplatedocument
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ezsigntemplatedocumentEditObjectV1Test() throws ApiException {
        Integer pkiEzsigntemplatedocumentID = null;
        EzsigntemplatedocumentEditObjectV1Request ezsigntemplatedocumentEditObjectV1Request = null;
        EzsigntemplatedocumentEditObjectV1Response response = api.ezsigntemplatedocumentEditObjectV1(pkiEzsigntemplatedocumentID, ezsigntemplatedocumentEditObjectV1Request);
        // TODO: test validations
    }

    /**
     * Retrieve an existing Ezsigntemplatedocument&#39;s Ezsigntemplatedocumentpages
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ezsigntemplatedocumentGetEzsigntemplatedocumentpagesV1Test() throws ApiException {
        Integer pkiEzsigntemplatedocumentID = null;
        EzsigntemplatedocumentGetEzsigntemplatedocumentpagesV1Response response = api.ezsigntemplatedocumentGetEzsigntemplatedocumentpagesV1(pkiEzsigntemplatedocumentID);
        // TODO: test validations
    }

    /**
     * Retrieve an existing Ezsigntemplatedocument&#39;s Ezsigntemplateformfieldgroups
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ezsigntemplatedocumentGetEzsigntemplateformfieldgroupsV1Test() throws ApiException {
        Integer pkiEzsigntemplatedocumentID = null;
        EzsigntemplatedocumentGetEzsigntemplateformfieldgroupsV1Response response = api.ezsigntemplatedocumentGetEzsigntemplateformfieldgroupsV1(pkiEzsigntemplatedocumentID);
        // TODO: test validations
    }

    /**
     * Retrieve an existing Ezsigntemplatedocument&#39;s Ezsigntemplatesignatures
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ezsigntemplatedocumentGetEzsigntemplatesignaturesV1Test() throws ApiException {
        Integer pkiEzsigntemplatedocumentID = null;
        EzsigntemplatedocumentGetEzsigntemplatesignaturesV1Response response = api.ezsigntemplatedocumentGetEzsigntemplatesignaturesV1(pkiEzsigntemplatedocumentID);
        // TODO: test validations
    }

    /**
     * Retrieve an existing Ezsigntemplatedocument
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ezsigntemplatedocumentGetObjectV1Test() throws ApiException {
        Integer pkiEzsigntemplatedocumentID = null;
        EzsigntemplatedocumentGetObjectV1Response response = api.ezsigntemplatedocumentGetObjectV1(pkiEzsigntemplatedocumentID);
        // TODO: test validations
    }

    /**
     * Retrieve positions X,Y of given words from a Ezsigntemplatedocument
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ezsigntemplatedocumentGetWordsPositionsV1Test() throws ApiException {
        Integer pkiEzsigntemplatedocumentID = null;
        EzsigntemplatedocumentGetWordsPositionsV1Request ezsigntemplatedocumentGetWordsPositionsV1Request = null;
        EzsigntemplatedocumentGetWordsPositionsV1Response response = api.ezsigntemplatedocumentGetWordsPositionsV1(pkiEzsigntemplatedocumentID, ezsigntemplatedocumentGetWordsPositionsV1Request);
        // TODO: test validations
    }

    /**
     * Patch an existing Ezsigntemplatedocument
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ezsigntemplatedocumentPatchObjectV1Test() throws ApiException {
        Integer pkiEzsigntemplatedocumentID = null;
        EzsigntemplatedocumentPatchObjectV1Request ezsigntemplatedocumentPatchObjectV1Request = null;
        EzsigntemplatedocumentPatchObjectV1Response response = api.ezsigntemplatedocumentPatchObjectV1(pkiEzsigntemplatedocumentID, ezsigntemplatedocumentPatchObjectV1Request);
        // TODO: test validations
    }

}