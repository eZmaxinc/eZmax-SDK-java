/*
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.16
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ezmax.api;

import eZmaxAPI.ApiException;
import com.ezmax.api.model.CommonResponseError;
import com.ezmax.api.model.CommonResponseErrorTooManyRequests;
import java.io.File;
import com.ezmax.api.model.HeaderAcceptLanguage;
import com.ezmax.api.model.WebhookCreateObjectV1Request;
import com.ezmax.api.model.WebhookCreateObjectV1Response;
import com.ezmax.api.model.WebhookDeleteObjectV1Response;
import com.ezmax.api.model.WebhookEditObjectV1Request;
import com.ezmax.api.model.WebhookEditObjectV1Response;
import com.ezmax.api.model.WebhookGetHistoryV1Response;
import com.ezmax.api.model.WebhookGetListV1Response;
import com.ezmax.api.model.WebhookGetObjectV1Response;
import com.ezmax.api.model.WebhookGetObjectV2Response;
import com.ezmax.api.model.WebhookTestV1Response;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ObjectWebhookApi
 */
@Disabled
public class ObjectWebhookApiTest {

    private final ObjectWebhookApi api = new ObjectWebhookApi();

    /**
     * Create a new Webhook
     *
     * The endpoint allows to create one or many elements at once.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void webhookCreateObjectV1Test() throws ApiException {
        WebhookCreateObjectV1Request webhookCreateObjectV1Request = null;
        WebhookCreateObjectV1Response response = api.webhookCreateObjectV1(webhookCreateObjectV1Request);
        // TODO: test validations
    }

    /**
     * Delete an existing Webhook
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void webhookDeleteObjectV1Test() throws ApiException {
        Integer pkiWebhookID = null;
        WebhookDeleteObjectV1Response response = api.webhookDeleteObjectV1(pkiWebhookID);
        // TODO: test validations
    }

    /**
     * Edit an existing Webhook
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void webhookEditObjectV1Test() throws ApiException {
        Integer pkiWebhookID = null;
        WebhookEditObjectV1Request webhookEditObjectV1Request = null;
        WebhookEditObjectV1Response response = api.webhookEditObjectV1(pkiWebhookID, webhookEditObjectV1Request);
        // TODO: test validations
    }

    /**
     * Retrieve the logs for recent Webhook calls
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void webhookGetHistoryV1Test() throws ApiException {
        Integer pkiWebhookID = null;
        String eWebhookHistoryinterval = null;
        WebhookGetHistoryV1Response response = api.webhookGetHistoryV1(pkiWebhookID, eWebhookHistoryinterval);
        // TODO: test validations
    }

    /**
     * Retrieve Webhook list
     *
     * Enum values that can be filtered in query parameter *sFilter*:  | Variable | Valid values | |---|---| | eWebhookModule | Ezsign&lt;br&gt;Management | | eWebhookEzsignevent | DocumentCompleted&lt;br&gt;FolderCompleted | | eWebhookManagementevent | UserCreated |
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void webhookGetListV1Test() throws ApiException {
        String eOrderBy = null;
        Integer iRowMax = null;
        Integer iRowOffset = null;
        HeaderAcceptLanguage acceptLanguage = null;
        String sFilter = null;
        WebhookGetListV1Response response = api.webhookGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter);
        // TODO: test validations
    }

    /**
     * Retrieve an existing Webhook
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void webhookGetObjectV1Test() throws ApiException {
        Integer pkiWebhookID = null;
        WebhookGetObjectV1Response response = api.webhookGetObjectV1(pkiWebhookID);
        // TODO: test validations
    }

    /**
     * Retrieve an existing Webhook
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void webhookGetObjectV2Test() throws ApiException {
        Integer pkiWebhookID = null;
        WebhookGetObjectV2Response response = api.webhookGetObjectV2(pkiWebhookID);
        // TODO: test validations
    }

    /**
     * Test the Webhook by calling the Url
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void webhookTestV1Test() throws ApiException {
        Integer pkiWebhookID = null;
        Object body = null;
        WebhookTestV1Response response = api.webhookTestV1(pkiWebhookID, body);
        // TODO: test validations
    }

}