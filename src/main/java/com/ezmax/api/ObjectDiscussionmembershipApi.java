/*
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.2.0
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ezmax.api;

import eZmaxAPI.ApiCallback;
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.ApiResponse;
import eZmaxAPI.Configuration;
import eZmaxAPI.Pair;
import eZmaxAPI.ProgressRequestBody;
import eZmaxAPI.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.ezmax.api.model.CommonResponseError;
import com.ezmax.api.model.DiscussionmembershipCreateObjectV1Request;
import com.ezmax.api.model.DiscussionmembershipCreateObjectV1Response;
import com.ezmax.api.model.DiscussionmembershipDeleteObjectV1Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ObjectDiscussionmembershipApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ObjectDiscussionmembershipApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ObjectDiscussionmembershipApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for discussionmembershipCreateObjectV1
     * @param discussionmembershipCreateObjectV1Request  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call discussionmembershipCreateObjectV1Call(DiscussionmembershipCreateObjectV1Request discussionmembershipCreateObjectV1Request, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = discussionmembershipCreateObjectV1Request;

        // create path and map variables
        String localVarPath = "/1/object/discussionmembership";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "Authorization" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call discussionmembershipCreateObjectV1ValidateBeforeCall(DiscussionmembershipCreateObjectV1Request discussionmembershipCreateObjectV1Request, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'discussionmembershipCreateObjectV1Request' is set
        if (discussionmembershipCreateObjectV1Request == null) {
            throw new ApiException("Missing the required parameter 'discussionmembershipCreateObjectV1Request' when calling discussionmembershipCreateObjectV1(Async)");
        }

        return discussionmembershipCreateObjectV1Call(discussionmembershipCreateObjectV1Request, _callback);

    }

    /**
     * Create a new Discussionmembership
     * The endpoint allows to create one or many elements at once.
     * @param discussionmembershipCreateObjectV1Request  (required)
     * @return DiscussionmembershipCreateObjectV1Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public DiscussionmembershipCreateObjectV1Response discussionmembershipCreateObjectV1(DiscussionmembershipCreateObjectV1Request discussionmembershipCreateObjectV1Request) throws ApiException {
        ApiResponse<DiscussionmembershipCreateObjectV1Response> localVarResp = discussionmembershipCreateObjectV1WithHttpInfo(discussionmembershipCreateObjectV1Request);
        return localVarResp.getData();
    }

    /**
     * Create a new Discussionmembership
     * The endpoint allows to create one or many elements at once.
     * @param discussionmembershipCreateObjectV1Request  (required)
     * @return ApiResponse&lt;DiscussionmembershipCreateObjectV1Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<DiscussionmembershipCreateObjectV1Response> discussionmembershipCreateObjectV1WithHttpInfo(DiscussionmembershipCreateObjectV1Request discussionmembershipCreateObjectV1Request) throws ApiException {
        okhttp3.Call localVarCall = discussionmembershipCreateObjectV1ValidateBeforeCall(discussionmembershipCreateObjectV1Request, null);
        Type localVarReturnType = new TypeToken<DiscussionmembershipCreateObjectV1Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create a new Discussionmembership (asynchronously)
     * The endpoint allows to create one or many elements at once.
     * @param discussionmembershipCreateObjectV1Request  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call discussionmembershipCreateObjectV1Async(DiscussionmembershipCreateObjectV1Request discussionmembershipCreateObjectV1Request, final ApiCallback<DiscussionmembershipCreateObjectV1Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = discussionmembershipCreateObjectV1ValidateBeforeCall(discussionmembershipCreateObjectV1Request, _callback);
        Type localVarReturnType = new TypeToken<DiscussionmembershipCreateObjectV1Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for discussionmembershipDeleteObjectV1
     * @param pkiDiscussionmembershipID The unique ID of the Discussionmembership (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The request failed. The element on which you were trying to work does not exists. Look for detail about the error in the body </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call discussionmembershipDeleteObjectV1Call(Integer pkiDiscussionmembershipID, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/1/object/discussionmembership/{pkiDiscussionmembershipID}"
            .replace("{" + "pkiDiscussionmembershipID" + "}", localVarApiClient.escapeString(pkiDiscussionmembershipID.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "Authorization" };
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call discussionmembershipDeleteObjectV1ValidateBeforeCall(Integer pkiDiscussionmembershipID, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'pkiDiscussionmembershipID' is set
        if (pkiDiscussionmembershipID == null) {
            throw new ApiException("Missing the required parameter 'pkiDiscussionmembershipID' when calling discussionmembershipDeleteObjectV1(Async)");
        }

        return discussionmembershipDeleteObjectV1Call(pkiDiscussionmembershipID, _callback);

    }

    /**
     * Delete an existing Discussionmembership
     * 
     * @param pkiDiscussionmembershipID The unique ID of the Discussionmembership (required)
     * @return DiscussionmembershipDeleteObjectV1Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The request failed. The element on which you were trying to work does not exists. Look for detail about the error in the body </td><td>  -  </td></tr>
     </table>
     */
    public DiscussionmembershipDeleteObjectV1Response discussionmembershipDeleteObjectV1(Integer pkiDiscussionmembershipID) throws ApiException {
        ApiResponse<DiscussionmembershipDeleteObjectV1Response> localVarResp = discussionmembershipDeleteObjectV1WithHttpInfo(pkiDiscussionmembershipID);
        return localVarResp.getData();
    }

    /**
     * Delete an existing Discussionmembership
     * 
     * @param pkiDiscussionmembershipID The unique ID of the Discussionmembership (required)
     * @return ApiResponse&lt;DiscussionmembershipDeleteObjectV1Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The request failed. The element on which you were trying to work does not exists. Look for detail about the error in the body </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<DiscussionmembershipDeleteObjectV1Response> discussionmembershipDeleteObjectV1WithHttpInfo(Integer pkiDiscussionmembershipID) throws ApiException {
        okhttp3.Call localVarCall = discussionmembershipDeleteObjectV1ValidateBeforeCall(pkiDiscussionmembershipID, null);
        Type localVarReturnType = new TypeToken<DiscussionmembershipDeleteObjectV1Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Delete an existing Discussionmembership (asynchronously)
     * 
     * @param pkiDiscussionmembershipID The unique ID of the Discussionmembership (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The request failed. The element on which you were trying to work does not exists. Look for detail about the error in the body </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call discussionmembershipDeleteObjectV1Async(Integer pkiDiscussionmembershipID, final ApiCallback<DiscussionmembershipDeleteObjectV1Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = discussionmembershipDeleteObjectV1ValidateBeforeCall(pkiDiscussionmembershipID, _callback);
        Type localVarReturnType = new TypeToken<DiscussionmembershipDeleteObjectV1Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}