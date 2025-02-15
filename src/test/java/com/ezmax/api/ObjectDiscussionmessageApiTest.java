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
import com.ezmax.api.model.DiscussionmessageCreateObjectV1Request;
import com.ezmax.api.model.DiscussionmessageCreateObjectV1Response;
import com.ezmax.api.model.DiscussionmessageDeleteObjectV1Response;
import com.ezmax.api.model.DiscussionmessagePatchObjectV1Request;
import com.ezmax.api.model.DiscussionmessagePatchObjectV1Response;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ObjectDiscussionmessageApi
 */
@Disabled
public class ObjectDiscussionmessageApiTest {

    private final ObjectDiscussionmessageApi api = new ObjectDiscussionmessageApi();

    /**
     * Create a new Discussionmessage
     *
     * The endpoint allows to create one or many elements at once.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void discussionmessageCreateObjectV1Test() throws ApiException {
        DiscussionmessageCreateObjectV1Request discussionmessageCreateObjectV1Request = null;
        DiscussionmessageCreateObjectV1Response response = api.discussionmessageCreateObjectV1(discussionmessageCreateObjectV1Request);
        // TODO: test validations
    }

    /**
     * Delete an existing Discussionmessage
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void discussionmessageDeleteObjectV1Test() throws ApiException {
        Integer pkiDiscussionmessageID = null;
        DiscussionmessageDeleteObjectV1Response response = api.discussionmessageDeleteObjectV1(pkiDiscussionmessageID);
        // TODO: test validations
    }

    /**
     * Patch an existing Discussionmessage
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void discussionmessagePatchObjectV1Test() throws ApiException {
        Integer pkiDiscussionmessageID = null;
        DiscussionmessagePatchObjectV1Request discussionmessagePatchObjectV1Request = null;
        DiscussionmessagePatchObjectV1Response response = api.discussionmessagePatchObjectV1(pkiDiscussionmessageID, discussionmessagePatchObjectV1Request);
        // TODO: test validations
    }

}
