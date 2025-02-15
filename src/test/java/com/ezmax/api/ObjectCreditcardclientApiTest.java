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
import com.ezmax.api.model.CommonResponseErrorCreditcardValidation;
import com.ezmax.api.model.CreditcardclientCreateObjectV1Request;
import com.ezmax.api.model.CreditcardclientCreateObjectV1Response;
import com.ezmax.api.model.CreditcardclientDeleteObjectV1Response;
import com.ezmax.api.model.CreditcardclientEditObjectV1Request;
import com.ezmax.api.model.CreditcardclientEditObjectV1Response;
import com.ezmax.api.model.CreditcardclientGetAutocompleteV2Response;
import com.ezmax.api.model.CreditcardclientGetListV1Response;
import com.ezmax.api.model.CreditcardclientGetObjectV2Response;
import com.ezmax.api.model.CreditcardclientPatchObjectV1Request;
import com.ezmax.api.model.CreditcardclientPatchObjectV1Response;
import java.io.File;
import com.ezmax.api.model.HeaderAcceptLanguage;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ObjectCreditcardclientApi
 */
@Disabled
public class ObjectCreditcardclientApiTest {

    private final ObjectCreditcardclientApi api = new ObjectCreditcardclientApi();

    /**
     * Create a new Creditcardclient
     *
     * The endpoint allows to create one or many elements at once.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void creditcardclientCreateObjectV1Test() throws ApiException {
        CreditcardclientCreateObjectV1Request creditcardclientCreateObjectV1Request = null;
        CreditcardclientCreateObjectV1Response response = api.creditcardclientCreateObjectV1(creditcardclientCreateObjectV1Request);
        // TODO: test validations
    }

    /**
     * Delete an existing Creditcardclient
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void creditcardclientDeleteObjectV1Test() throws ApiException {
        Integer pkiCreditcardclientID = null;
        CreditcardclientDeleteObjectV1Response response = api.creditcardclientDeleteObjectV1(pkiCreditcardclientID);
        // TODO: test validations
    }

    /**
     * Edit an existing Creditcardclient
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void creditcardclientEditObjectV1Test() throws ApiException {
        Integer pkiCreditcardclientID = null;
        CreditcardclientEditObjectV1Request creditcardclientEditObjectV1Request = null;
        CreditcardclientEditObjectV1Response response = api.creditcardclientEditObjectV1(pkiCreditcardclientID, creditcardclientEditObjectV1Request);
        // TODO: test validations
    }

    /**
     * Retrieve Creditcardclients and IDs
     *
     * Get the list of Creditcardclient to be used in a dropdown or autocomplete control.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void creditcardclientGetAutocompleteV2Test() throws ApiException {
        String sSelector = null;
        String eFilterActive = null;
        String sQuery = null;
        HeaderAcceptLanguage acceptLanguage = null;
        CreditcardclientGetAutocompleteV2Response response = api.creditcardclientGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage);
        // TODO: test validations
    }

    /**
     * Retrieve Creditcardclient list
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void creditcardclientGetListV1Test() throws ApiException {
        String eOrderBy = null;
        Integer iRowMax = null;
        Integer iRowOffset = null;
        HeaderAcceptLanguage acceptLanguage = null;
        String sFilter = null;
        CreditcardclientGetListV1Response response = api.creditcardclientGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter);
        // TODO: test validations
    }

    /**
     * Retrieve an existing Creditcardclient
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void creditcardclientGetObjectV2Test() throws ApiException {
        Integer pkiCreditcardclientID = null;
        CreditcardclientGetObjectV2Response response = api.creditcardclientGetObjectV2(pkiCreditcardclientID);
        // TODO: test validations
    }

    /**
     * Patch an existing Creditcardclient
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void creditcardclientPatchObjectV1Test() throws ApiException {
        Integer pkiCreditcardclientID = null;
        CreditcardclientPatchObjectV1Request creditcardclientPatchObjectV1Request = null;
        CreditcardclientPatchObjectV1Response response = api.creditcardclientPatchObjectV1(pkiCreditcardclientID, creditcardclientPatchObjectV1Request);
        // TODO: test validations
    }

}
