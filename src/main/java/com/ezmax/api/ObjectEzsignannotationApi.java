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
import com.ezmax.api.model.EzsignannotationCreateObjectV1Request;
import com.ezmax.api.model.EzsignannotationCreateObjectV1Response;
import com.ezmax.api.model.EzsignannotationDeleteObjectV1Response;
import com.ezmax.api.model.EzsignannotationEditObjectV1Request;
import com.ezmax.api.model.EzsignannotationEditObjectV1Response;
import com.ezmax.api.model.EzsignannotationGetObjectV2Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ObjectEzsignannotationApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ObjectEzsignannotationApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ObjectEzsignannotationApi(ApiClient apiClient) {
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
     * Build call for ezsignannotationCreateObjectV1
     * @param ezsignannotationCreateObjectV1Request  (required)
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
    public okhttp3.Call ezsignannotationCreateObjectV1Call(EzsignannotationCreateObjectV1Request ezsignannotationCreateObjectV1Request, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = ezsignannotationCreateObjectV1Request;

        // create path and map variables
        String localVarPath = "/1/object/ezsignannotation";

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
    private okhttp3.Call ezsignannotationCreateObjectV1ValidateBeforeCall(EzsignannotationCreateObjectV1Request ezsignannotationCreateObjectV1Request, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'ezsignannotationCreateObjectV1Request' is set
        if (ezsignannotationCreateObjectV1Request == null) {
            throw new ApiException("Missing the required parameter 'ezsignannotationCreateObjectV1Request' when calling ezsignannotationCreateObjectV1(Async)");
        }

        return ezsignannotationCreateObjectV1Call(ezsignannotationCreateObjectV1Request, _callback);

    }

    /**
     * Create a new Ezsignannotation
     * The endpoint allows to create one or many elements at once.
     * @param ezsignannotationCreateObjectV1Request  (required)
     * @return EzsignannotationCreateObjectV1Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public EzsignannotationCreateObjectV1Response ezsignannotationCreateObjectV1(EzsignannotationCreateObjectV1Request ezsignannotationCreateObjectV1Request) throws ApiException {
        ApiResponse<EzsignannotationCreateObjectV1Response> localVarResp = ezsignannotationCreateObjectV1WithHttpInfo(ezsignannotationCreateObjectV1Request);
        return localVarResp.getData();
    }

    /**
     * Create a new Ezsignannotation
     * The endpoint allows to create one or many elements at once.
     * @param ezsignannotationCreateObjectV1Request  (required)
     * @return ApiResponse&lt;EzsignannotationCreateObjectV1Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<EzsignannotationCreateObjectV1Response> ezsignannotationCreateObjectV1WithHttpInfo(EzsignannotationCreateObjectV1Request ezsignannotationCreateObjectV1Request) throws ApiException {
        okhttp3.Call localVarCall = ezsignannotationCreateObjectV1ValidateBeforeCall(ezsignannotationCreateObjectV1Request, null);
        Type localVarReturnType = new TypeToken<EzsignannotationCreateObjectV1Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create a new Ezsignannotation (asynchronously)
     * The endpoint allows to create one or many elements at once.
     * @param ezsignannotationCreateObjectV1Request  (required)
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
    public okhttp3.Call ezsignannotationCreateObjectV1Async(EzsignannotationCreateObjectV1Request ezsignannotationCreateObjectV1Request, final ApiCallback<EzsignannotationCreateObjectV1Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = ezsignannotationCreateObjectV1ValidateBeforeCall(ezsignannotationCreateObjectV1Request, _callback);
        Type localVarReturnType = new TypeToken<EzsignannotationCreateObjectV1Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for ezsignannotationDeleteObjectV1
     * @param pkiEzsignannotationID  (required)
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
    public okhttp3.Call ezsignannotationDeleteObjectV1Call(Integer pkiEzsignannotationID, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/1/object/ezsignannotation/{pkiEzsignannotationID}"
            .replace("{" + "pkiEzsignannotationID" + "}", localVarApiClient.escapeString(pkiEzsignannotationID.toString()));

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
    private okhttp3.Call ezsignannotationDeleteObjectV1ValidateBeforeCall(Integer pkiEzsignannotationID, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'pkiEzsignannotationID' is set
        if (pkiEzsignannotationID == null) {
            throw new ApiException("Missing the required parameter 'pkiEzsignannotationID' when calling ezsignannotationDeleteObjectV1(Async)");
        }

        return ezsignannotationDeleteObjectV1Call(pkiEzsignannotationID, _callback);

    }

    /**
     * Delete an existing Ezsignannotation
     * 
     * @param pkiEzsignannotationID  (required)
     * @return EzsignannotationDeleteObjectV1Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The request failed. The element on which you were trying to work does not exists. Look for detail about the error in the body </td><td>  -  </td></tr>
     </table>
     */
    public EzsignannotationDeleteObjectV1Response ezsignannotationDeleteObjectV1(Integer pkiEzsignannotationID) throws ApiException {
        ApiResponse<EzsignannotationDeleteObjectV1Response> localVarResp = ezsignannotationDeleteObjectV1WithHttpInfo(pkiEzsignannotationID);
        return localVarResp.getData();
    }

    /**
     * Delete an existing Ezsignannotation
     * 
     * @param pkiEzsignannotationID  (required)
     * @return ApiResponse&lt;EzsignannotationDeleteObjectV1Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The request failed. The element on which you were trying to work does not exists. Look for detail about the error in the body </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<EzsignannotationDeleteObjectV1Response> ezsignannotationDeleteObjectV1WithHttpInfo(Integer pkiEzsignannotationID) throws ApiException {
        okhttp3.Call localVarCall = ezsignannotationDeleteObjectV1ValidateBeforeCall(pkiEzsignannotationID, null);
        Type localVarReturnType = new TypeToken<EzsignannotationDeleteObjectV1Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Delete an existing Ezsignannotation (asynchronously)
     * 
     * @param pkiEzsignannotationID  (required)
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
    public okhttp3.Call ezsignannotationDeleteObjectV1Async(Integer pkiEzsignannotationID, final ApiCallback<EzsignannotationDeleteObjectV1Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = ezsignannotationDeleteObjectV1ValidateBeforeCall(pkiEzsignannotationID, _callback);
        Type localVarReturnType = new TypeToken<EzsignannotationDeleteObjectV1Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for ezsignannotationEditObjectV1
     * @param pkiEzsignannotationID  (required)
     * @param ezsignannotationEditObjectV1Request  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The request failed. The element on which you were trying to work does not exists. Look for detail about the error in the body </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> The request was syntactically valid but failed because of an interdependance condition. Look for detail about the error in the body </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call ezsignannotationEditObjectV1Call(Integer pkiEzsignannotationID, EzsignannotationEditObjectV1Request ezsignannotationEditObjectV1Request, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = ezsignannotationEditObjectV1Request;

        // create path and map variables
        String localVarPath = "/1/object/ezsignannotation/{pkiEzsignannotationID}"
            .replace("{" + "pkiEzsignannotationID" + "}", localVarApiClient.escapeString(pkiEzsignannotationID.toString()));

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
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call ezsignannotationEditObjectV1ValidateBeforeCall(Integer pkiEzsignannotationID, EzsignannotationEditObjectV1Request ezsignannotationEditObjectV1Request, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'pkiEzsignannotationID' is set
        if (pkiEzsignannotationID == null) {
            throw new ApiException("Missing the required parameter 'pkiEzsignannotationID' when calling ezsignannotationEditObjectV1(Async)");
        }

        // verify the required parameter 'ezsignannotationEditObjectV1Request' is set
        if (ezsignannotationEditObjectV1Request == null) {
            throw new ApiException("Missing the required parameter 'ezsignannotationEditObjectV1Request' when calling ezsignannotationEditObjectV1(Async)");
        }

        return ezsignannotationEditObjectV1Call(pkiEzsignannotationID, ezsignannotationEditObjectV1Request, _callback);

    }

    /**
     * Edit an existing Ezsignannotation
     * 
     * @param pkiEzsignannotationID  (required)
     * @param ezsignannotationEditObjectV1Request  (required)
     * @return EzsignannotationEditObjectV1Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The request failed. The element on which you were trying to work does not exists. Look for detail about the error in the body </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> The request was syntactically valid but failed because of an interdependance condition. Look for detail about the error in the body </td><td>  -  </td></tr>
     </table>
     */
    public EzsignannotationEditObjectV1Response ezsignannotationEditObjectV1(Integer pkiEzsignannotationID, EzsignannotationEditObjectV1Request ezsignannotationEditObjectV1Request) throws ApiException {
        ApiResponse<EzsignannotationEditObjectV1Response> localVarResp = ezsignannotationEditObjectV1WithHttpInfo(pkiEzsignannotationID, ezsignannotationEditObjectV1Request);
        return localVarResp.getData();
    }

    /**
     * Edit an existing Ezsignannotation
     * 
     * @param pkiEzsignannotationID  (required)
     * @param ezsignannotationEditObjectV1Request  (required)
     * @return ApiResponse&lt;EzsignannotationEditObjectV1Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The request failed. The element on which you were trying to work does not exists. Look for detail about the error in the body </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> The request was syntactically valid but failed because of an interdependance condition. Look for detail about the error in the body </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<EzsignannotationEditObjectV1Response> ezsignannotationEditObjectV1WithHttpInfo(Integer pkiEzsignannotationID, EzsignannotationEditObjectV1Request ezsignannotationEditObjectV1Request) throws ApiException {
        okhttp3.Call localVarCall = ezsignannotationEditObjectV1ValidateBeforeCall(pkiEzsignannotationID, ezsignannotationEditObjectV1Request, null);
        Type localVarReturnType = new TypeToken<EzsignannotationEditObjectV1Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Edit an existing Ezsignannotation (asynchronously)
     * 
     * @param pkiEzsignannotationID  (required)
     * @param ezsignannotationEditObjectV1Request  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The request failed. The element on which you were trying to work does not exists. Look for detail about the error in the body </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> The request was syntactically valid but failed because of an interdependance condition. Look for detail about the error in the body </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call ezsignannotationEditObjectV1Async(Integer pkiEzsignannotationID, EzsignannotationEditObjectV1Request ezsignannotationEditObjectV1Request, final ApiCallback<EzsignannotationEditObjectV1Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = ezsignannotationEditObjectV1ValidateBeforeCall(pkiEzsignannotationID, ezsignannotationEditObjectV1Request, _callback);
        Type localVarReturnType = new TypeToken<EzsignannotationEditObjectV1Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for ezsignannotationGetObjectV2
     * @param pkiEzsignannotationID  (required)
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
    public okhttp3.Call ezsignannotationGetObjectV2Call(Integer pkiEzsignannotationID, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/2/object/ezsignannotation/{pkiEzsignannotationID}"
            .replace("{" + "pkiEzsignannotationID" + "}", localVarApiClient.escapeString(pkiEzsignannotationID.toString()));

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
    private okhttp3.Call ezsignannotationGetObjectV2ValidateBeforeCall(Integer pkiEzsignannotationID, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'pkiEzsignannotationID' is set
        if (pkiEzsignannotationID == null) {
            throw new ApiException("Missing the required parameter 'pkiEzsignannotationID' when calling ezsignannotationGetObjectV2(Async)");
        }

        return ezsignannotationGetObjectV2Call(pkiEzsignannotationID, _callback);

    }

    /**
     * Retrieve an existing Ezsignannotation
     * 
     * @param pkiEzsignannotationID  (required)
     * @return EzsignannotationGetObjectV2Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The request failed. The element on which you were trying to work does not exists. Look for detail about the error in the body </td><td>  -  </td></tr>
     </table>
     */
    public EzsignannotationGetObjectV2Response ezsignannotationGetObjectV2(Integer pkiEzsignannotationID) throws ApiException {
        ApiResponse<EzsignannotationGetObjectV2Response> localVarResp = ezsignannotationGetObjectV2WithHttpInfo(pkiEzsignannotationID);
        return localVarResp.getData();
    }

    /**
     * Retrieve an existing Ezsignannotation
     * 
     * @param pkiEzsignannotationID  (required)
     * @return ApiResponse&lt;EzsignannotationGetObjectV2Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The request failed. The element on which you were trying to work does not exists. Look for detail about the error in the body </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<EzsignannotationGetObjectV2Response> ezsignannotationGetObjectV2WithHttpInfo(Integer pkiEzsignannotationID) throws ApiException {
        okhttp3.Call localVarCall = ezsignannotationGetObjectV2ValidateBeforeCall(pkiEzsignannotationID, null);
        Type localVarReturnType = new TypeToken<EzsignannotationGetObjectV2Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Retrieve an existing Ezsignannotation (asynchronously)
     * 
     * @param pkiEzsignannotationID  (required)
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
    public okhttp3.Call ezsignannotationGetObjectV2Async(Integer pkiEzsignannotationID, final ApiCallback<EzsignannotationGetObjectV2Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = ezsignannotationGetObjectV2ValidateBeforeCall(pkiEzsignannotationID, _callback);
        Type localVarReturnType = new TypeToken<EzsignannotationGetObjectV2Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
