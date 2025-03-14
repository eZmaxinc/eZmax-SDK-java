/*
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.2.2
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
import com.ezmax.api.model.EzsigndiscussionCreateObjectV1Request;
import com.ezmax.api.model.EzsigndiscussionCreateObjectV1Response;
import com.ezmax.api.model.EzsigndiscussionDeleteObjectV1Response;
import com.ezmax.api.model.EzsigndiscussionGetObjectV2Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ObjectEzsigndiscussionApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ObjectEzsigndiscussionApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ObjectEzsigndiscussionApi(ApiClient apiClient) {
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
     * Build call for ezsigndiscussionCreateObjectV1
     * @param ezsigndiscussionCreateObjectV1Request  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call ezsigndiscussionCreateObjectV1Call(EzsigndiscussionCreateObjectV1Request ezsigndiscussionCreateObjectV1Request, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = ezsigndiscussionCreateObjectV1Request;

        // create path and map variables
        String localVarPath = "/1/object/ezsigndiscussion";

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
    private okhttp3.Call ezsigndiscussionCreateObjectV1ValidateBeforeCall(EzsigndiscussionCreateObjectV1Request ezsigndiscussionCreateObjectV1Request, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'ezsigndiscussionCreateObjectV1Request' is set
        if (ezsigndiscussionCreateObjectV1Request == null) {
            throw new ApiException("Missing the required parameter 'ezsigndiscussionCreateObjectV1Request' when calling ezsigndiscussionCreateObjectV1(Async)");
        }

        return ezsigndiscussionCreateObjectV1Call(ezsigndiscussionCreateObjectV1Request, _callback);

    }

    /**
     * Create a new Ezsigndiscussion
     * The endpoint allows to create one or many elements at once.
     * @param ezsigndiscussionCreateObjectV1Request  (required)
     * @return EzsigndiscussionCreateObjectV1Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public EzsigndiscussionCreateObjectV1Response ezsigndiscussionCreateObjectV1(EzsigndiscussionCreateObjectV1Request ezsigndiscussionCreateObjectV1Request) throws ApiException {
        ApiResponse<EzsigndiscussionCreateObjectV1Response> localVarResp = ezsigndiscussionCreateObjectV1WithHttpInfo(ezsigndiscussionCreateObjectV1Request);
        return localVarResp.getData();
    }

    /**
     * Create a new Ezsigndiscussion
     * The endpoint allows to create one or many elements at once.
     * @param ezsigndiscussionCreateObjectV1Request  (required)
     * @return ApiResponse&lt;EzsigndiscussionCreateObjectV1Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<EzsigndiscussionCreateObjectV1Response> ezsigndiscussionCreateObjectV1WithHttpInfo(EzsigndiscussionCreateObjectV1Request ezsigndiscussionCreateObjectV1Request) throws ApiException {
        okhttp3.Call localVarCall = ezsigndiscussionCreateObjectV1ValidateBeforeCall(ezsigndiscussionCreateObjectV1Request, null);
        Type localVarReturnType = new TypeToken<EzsigndiscussionCreateObjectV1Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create a new Ezsigndiscussion (asynchronously)
     * The endpoint allows to create one or many elements at once.
     * @param ezsigndiscussionCreateObjectV1Request  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call ezsigndiscussionCreateObjectV1Async(EzsigndiscussionCreateObjectV1Request ezsigndiscussionCreateObjectV1Request, final ApiCallback<EzsigndiscussionCreateObjectV1Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = ezsigndiscussionCreateObjectV1ValidateBeforeCall(ezsigndiscussionCreateObjectV1Request, _callback);
        Type localVarReturnType = new TypeToken<EzsigndiscussionCreateObjectV1Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for ezsigndiscussionDeleteObjectV1
     * @param pkiEzsigndiscussionID The unique ID of the Ezsigndiscussion (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The request failed. The element on which you were trying to work does not exists. Look for detail about the error in the body </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call ezsigndiscussionDeleteObjectV1Call(Integer pkiEzsigndiscussionID, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/1/object/ezsigndiscussion/{pkiEzsigndiscussionID}"
            .replace("{" + "pkiEzsigndiscussionID" + "}", localVarApiClient.escapeString(pkiEzsigndiscussionID.toString()));

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
    private okhttp3.Call ezsigndiscussionDeleteObjectV1ValidateBeforeCall(Integer pkiEzsigndiscussionID, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'pkiEzsigndiscussionID' is set
        if (pkiEzsigndiscussionID == null) {
            throw new ApiException("Missing the required parameter 'pkiEzsigndiscussionID' when calling ezsigndiscussionDeleteObjectV1(Async)");
        }

        return ezsigndiscussionDeleteObjectV1Call(pkiEzsigndiscussionID, _callback);

    }

    /**
     * Delete an existing Ezsigndiscussion
     * 
     * @param pkiEzsigndiscussionID The unique ID of the Ezsigndiscussion (required)
     * @return EzsigndiscussionDeleteObjectV1Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The request failed. The element on which you were trying to work does not exists. Look for detail about the error in the body </td><td>  -  </td></tr>
     </table>
     */
    public EzsigndiscussionDeleteObjectV1Response ezsigndiscussionDeleteObjectV1(Integer pkiEzsigndiscussionID) throws ApiException {
        ApiResponse<EzsigndiscussionDeleteObjectV1Response> localVarResp = ezsigndiscussionDeleteObjectV1WithHttpInfo(pkiEzsigndiscussionID);
        return localVarResp.getData();
    }

    /**
     * Delete an existing Ezsigndiscussion
     * 
     * @param pkiEzsigndiscussionID The unique ID of the Ezsigndiscussion (required)
     * @return ApiResponse&lt;EzsigndiscussionDeleteObjectV1Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The request failed. The element on which you were trying to work does not exists. Look for detail about the error in the body </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<EzsigndiscussionDeleteObjectV1Response> ezsigndiscussionDeleteObjectV1WithHttpInfo(Integer pkiEzsigndiscussionID) throws ApiException {
        okhttp3.Call localVarCall = ezsigndiscussionDeleteObjectV1ValidateBeforeCall(pkiEzsigndiscussionID, null);
        Type localVarReturnType = new TypeToken<EzsigndiscussionDeleteObjectV1Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Delete an existing Ezsigndiscussion (asynchronously)
     * 
     * @param pkiEzsigndiscussionID The unique ID of the Ezsigndiscussion (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The request failed. The element on which you were trying to work does not exists. Look for detail about the error in the body </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call ezsigndiscussionDeleteObjectV1Async(Integer pkiEzsigndiscussionID, final ApiCallback<EzsigndiscussionDeleteObjectV1Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = ezsigndiscussionDeleteObjectV1ValidateBeforeCall(pkiEzsigndiscussionID, _callback);
        Type localVarReturnType = new TypeToken<EzsigndiscussionDeleteObjectV1Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for ezsigndiscussionGetObjectV2
     * @param pkiEzsigndiscussionID The unique ID of the Ezsigndiscussion (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The request failed. The element on which you were trying to work does not exists. Look for detail about the error in the body </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call ezsigndiscussionGetObjectV2Call(Integer pkiEzsigndiscussionID, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/2/object/ezsigndiscussion/{pkiEzsigndiscussionID}"
            .replace("{" + "pkiEzsigndiscussionID" + "}", localVarApiClient.escapeString(pkiEzsigndiscussionID.toString()));

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
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call ezsigndiscussionGetObjectV2ValidateBeforeCall(Integer pkiEzsigndiscussionID, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'pkiEzsigndiscussionID' is set
        if (pkiEzsigndiscussionID == null) {
            throw new ApiException("Missing the required parameter 'pkiEzsigndiscussionID' when calling ezsigndiscussionGetObjectV2(Async)");
        }

        return ezsigndiscussionGetObjectV2Call(pkiEzsigndiscussionID, _callback);

    }

    /**
     * Retrieve an existing Ezsigndiscussion
     * 
     * @param pkiEzsigndiscussionID The unique ID of the Ezsigndiscussion (required)
     * @return EzsigndiscussionGetObjectV2Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The request failed. The element on which you were trying to work does not exists. Look for detail about the error in the body </td><td>  -  </td></tr>
     </table>
     */
    public EzsigndiscussionGetObjectV2Response ezsigndiscussionGetObjectV2(Integer pkiEzsigndiscussionID) throws ApiException {
        ApiResponse<EzsigndiscussionGetObjectV2Response> localVarResp = ezsigndiscussionGetObjectV2WithHttpInfo(pkiEzsigndiscussionID);
        return localVarResp.getData();
    }

    /**
     * Retrieve an existing Ezsigndiscussion
     * 
     * @param pkiEzsigndiscussionID The unique ID of the Ezsigndiscussion (required)
     * @return ApiResponse&lt;EzsigndiscussionGetObjectV2Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The request failed. The element on which you were trying to work does not exists. Look for detail about the error in the body </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<EzsigndiscussionGetObjectV2Response> ezsigndiscussionGetObjectV2WithHttpInfo(Integer pkiEzsigndiscussionID) throws ApiException {
        okhttp3.Call localVarCall = ezsigndiscussionGetObjectV2ValidateBeforeCall(pkiEzsigndiscussionID, null);
        Type localVarReturnType = new TypeToken<EzsigndiscussionGetObjectV2Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Retrieve an existing Ezsigndiscussion (asynchronously)
     * 
     * @param pkiEzsigndiscussionID The unique ID of the Ezsigndiscussion (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The request failed. The element on which you were trying to work does not exists. Look for detail about the error in the body </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call ezsigndiscussionGetObjectV2Async(Integer pkiEzsigndiscussionID, final ApiCallback<EzsigndiscussionGetObjectV2Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = ezsigndiscussionGetObjectV2ValidateBeforeCall(pkiEzsigndiscussionID, _callback);
        Type localVarReturnType = new TypeToken<EzsigndiscussionGetObjectV2Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
