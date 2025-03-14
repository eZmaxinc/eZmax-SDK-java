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
import com.ezmax.api.model.InscriptiontempGetCommunicationCountV1Response;
import com.ezmax.api.model.InscriptiontempGetCommunicationListV1Response;
import com.ezmax.api.model.InscriptiontempGetCommunicationrecipientsV1Response;
import com.ezmax.api.model.InscriptiontempGetCommunicationsendersV1Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ObjectInscriptiontempApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ObjectInscriptiontempApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ObjectInscriptiontempApi(ApiClient apiClient) {
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
     * Build call for inscriptiontempGetCommunicationCountV1
     * @param pkiInscriptiontempID  (required)
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
    public okhttp3.Call inscriptiontempGetCommunicationCountV1Call(Integer pkiInscriptiontempID, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/1/object/inscriptiontemp/{pkiInscriptiontempID}/getCommunicationCount"
            .replace("{" + "pkiInscriptiontempID" + "}", localVarApiClient.escapeString(pkiInscriptiontempID.toString()));

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
    private okhttp3.Call inscriptiontempGetCommunicationCountV1ValidateBeforeCall(Integer pkiInscriptiontempID, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'pkiInscriptiontempID' is set
        if (pkiInscriptiontempID == null) {
            throw new ApiException("Missing the required parameter 'pkiInscriptiontempID' when calling inscriptiontempGetCommunicationCountV1(Async)");
        }

        return inscriptiontempGetCommunicationCountV1Call(pkiInscriptiontempID, _callback);

    }

    /**
     * Retrieve Communication count
     * 
     * @param pkiInscriptiontempID  (required)
     * @return InscriptiontempGetCommunicationCountV1Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The request failed. The element on which you were trying to work does not exists. Look for detail about the error in the body </td><td>  -  </td></tr>
     </table>
     */
    public InscriptiontempGetCommunicationCountV1Response inscriptiontempGetCommunicationCountV1(Integer pkiInscriptiontempID) throws ApiException {
        ApiResponse<InscriptiontempGetCommunicationCountV1Response> localVarResp = inscriptiontempGetCommunicationCountV1WithHttpInfo(pkiInscriptiontempID);
        return localVarResp.getData();
    }

    /**
     * Retrieve Communication count
     * 
     * @param pkiInscriptiontempID  (required)
     * @return ApiResponse&lt;InscriptiontempGetCommunicationCountV1Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The request failed. The element on which you were trying to work does not exists. Look for detail about the error in the body </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<InscriptiontempGetCommunicationCountV1Response> inscriptiontempGetCommunicationCountV1WithHttpInfo(Integer pkiInscriptiontempID) throws ApiException {
        okhttp3.Call localVarCall = inscriptiontempGetCommunicationCountV1ValidateBeforeCall(pkiInscriptiontempID, null);
        Type localVarReturnType = new TypeToken<InscriptiontempGetCommunicationCountV1Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Retrieve Communication count (asynchronously)
     * 
     * @param pkiInscriptiontempID  (required)
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
    public okhttp3.Call inscriptiontempGetCommunicationCountV1Async(Integer pkiInscriptiontempID, final ApiCallback<InscriptiontempGetCommunicationCountV1Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = inscriptiontempGetCommunicationCountV1ValidateBeforeCall(pkiInscriptiontempID, _callback);
        Type localVarReturnType = new TypeToken<InscriptiontempGetCommunicationCountV1Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for inscriptiontempGetCommunicationListV1
     * @param pkiInscriptiontempID  (required)
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
    public okhttp3.Call inscriptiontempGetCommunicationListV1Call(Integer pkiInscriptiontempID, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/1/object/inscriptiontemp/{pkiInscriptiontempID}/getCommunicationList"
            .replace("{" + "pkiInscriptiontempID" + "}", localVarApiClient.escapeString(pkiInscriptiontempID.toString()));

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
    private okhttp3.Call inscriptiontempGetCommunicationListV1ValidateBeforeCall(Integer pkiInscriptiontempID, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'pkiInscriptiontempID' is set
        if (pkiInscriptiontempID == null) {
            throw new ApiException("Missing the required parameter 'pkiInscriptiontempID' when calling inscriptiontempGetCommunicationListV1(Async)");
        }

        return inscriptiontempGetCommunicationListV1Call(pkiInscriptiontempID, _callback);

    }

    /**
     * Retrieve Communication list
     * 
     * @param pkiInscriptiontempID  (required)
     * @return InscriptiontempGetCommunicationListV1Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The request failed. The element on which you were trying to work does not exists. Look for detail about the error in the body </td><td>  -  </td></tr>
     </table>
     */
    public InscriptiontempGetCommunicationListV1Response inscriptiontempGetCommunicationListV1(Integer pkiInscriptiontempID) throws ApiException {
        ApiResponse<InscriptiontempGetCommunicationListV1Response> localVarResp = inscriptiontempGetCommunicationListV1WithHttpInfo(pkiInscriptiontempID);
        return localVarResp.getData();
    }

    /**
     * Retrieve Communication list
     * 
     * @param pkiInscriptiontempID  (required)
     * @return ApiResponse&lt;InscriptiontempGetCommunicationListV1Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The request failed. The element on which you were trying to work does not exists. Look for detail about the error in the body </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<InscriptiontempGetCommunicationListV1Response> inscriptiontempGetCommunicationListV1WithHttpInfo(Integer pkiInscriptiontempID) throws ApiException {
        okhttp3.Call localVarCall = inscriptiontempGetCommunicationListV1ValidateBeforeCall(pkiInscriptiontempID, null);
        Type localVarReturnType = new TypeToken<InscriptiontempGetCommunicationListV1Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Retrieve Communication list (asynchronously)
     * 
     * @param pkiInscriptiontempID  (required)
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
    public okhttp3.Call inscriptiontempGetCommunicationListV1Async(Integer pkiInscriptiontempID, final ApiCallback<InscriptiontempGetCommunicationListV1Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = inscriptiontempGetCommunicationListV1ValidateBeforeCall(pkiInscriptiontempID, _callback);
        Type localVarReturnType = new TypeToken<InscriptiontempGetCommunicationListV1Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for inscriptiontempGetCommunicationrecipientsV1
     * @param pkiInscriptiontempID  (required)
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
    public okhttp3.Call inscriptiontempGetCommunicationrecipientsV1Call(Integer pkiInscriptiontempID, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/1/object/inscriptiontemp/{pkiInscriptiontempID}/getCommunicationrecipients"
            .replace("{" + "pkiInscriptiontempID" + "}", localVarApiClient.escapeString(pkiInscriptiontempID.toString()));

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
    private okhttp3.Call inscriptiontempGetCommunicationrecipientsV1ValidateBeforeCall(Integer pkiInscriptiontempID, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'pkiInscriptiontempID' is set
        if (pkiInscriptiontempID == null) {
            throw new ApiException("Missing the required parameter 'pkiInscriptiontempID' when calling inscriptiontempGetCommunicationrecipientsV1(Async)");
        }

        return inscriptiontempGetCommunicationrecipientsV1Call(pkiInscriptiontempID, _callback);

    }

    /**
     * Retrieve Inscriptiontemp&#39;s Communicationrecipient
     * 
     * @param pkiInscriptiontempID  (required)
     * @return InscriptiontempGetCommunicationrecipientsV1Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The request failed. The element on which you were trying to work does not exists. Look for detail about the error in the body </td><td>  -  </td></tr>
     </table>
     */
    public InscriptiontempGetCommunicationrecipientsV1Response inscriptiontempGetCommunicationrecipientsV1(Integer pkiInscriptiontempID) throws ApiException {
        ApiResponse<InscriptiontempGetCommunicationrecipientsV1Response> localVarResp = inscriptiontempGetCommunicationrecipientsV1WithHttpInfo(pkiInscriptiontempID);
        return localVarResp.getData();
    }

    /**
     * Retrieve Inscriptiontemp&#39;s Communicationrecipient
     * 
     * @param pkiInscriptiontempID  (required)
     * @return ApiResponse&lt;InscriptiontempGetCommunicationrecipientsV1Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The request failed. The element on which you were trying to work does not exists. Look for detail about the error in the body </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<InscriptiontempGetCommunicationrecipientsV1Response> inscriptiontempGetCommunicationrecipientsV1WithHttpInfo(Integer pkiInscriptiontempID) throws ApiException {
        okhttp3.Call localVarCall = inscriptiontempGetCommunicationrecipientsV1ValidateBeforeCall(pkiInscriptiontempID, null);
        Type localVarReturnType = new TypeToken<InscriptiontempGetCommunicationrecipientsV1Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Retrieve Inscriptiontemp&#39;s Communicationrecipient (asynchronously)
     * 
     * @param pkiInscriptiontempID  (required)
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
    public okhttp3.Call inscriptiontempGetCommunicationrecipientsV1Async(Integer pkiInscriptiontempID, final ApiCallback<InscriptiontempGetCommunicationrecipientsV1Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = inscriptiontempGetCommunicationrecipientsV1ValidateBeforeCall(pkiInscriptiontempID, _callback);
        Type localVarReturnType = new TypeToken<InscriptiontempGetCommunicationrecipientsV1Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for inscriptiontempGetCommunicationsendersV1
     * @param pkiInscriptiontempID  (required)
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
    public okhttp3.Call inscriptiontempGetCommunicationsendersV1Call(Integer pkiInscriptiontempID, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/1/object/inscriptiontemp/{pkiInscriptiontempID}/getCommunicationsenders"
            .replace("{" + "pkiInscriptiontempID" + "}", localVarApiClient.escapeString(pkiInscriptiontempID.toString()));

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
    private okhttp3.Call inscriptiontempGetCommunicationsendersV1ValidateBeforeCall(Integer pkiInscriptiontempID, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'pkiInscriptiontempID' is set
        if (pkiInscriptiontempID == null) {
            throw new ApiException("Missing the required parameter 'pkiInscriptiontempID' when calling inscriptiontempGetCommunicationsendersV1(Async)");
        }

        return inscriptiontempGetCommunicationsendersV1Call(pkiInscriptiontempID, _callback);

    }

    /**
     * Retrieve Inscriptiontemp&#39;s Communicationsender
     * 
     * @param pkiInscriptiontempID  (required)
     * @return InscriptiontempGetCommunicationsendersV1Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The request failed. The element on which you were trying to work does not exists. Look for detail about the error in the body </td><td>  -  </td></tr>
     </table>
     */
    public InscriptiontempGetCommunicationsendersV1Response inscriptiontempGetCommunicationsendersV1(Integer pkiInscriptiontempID) throws ApiException {
        ApiResponse<InscriptiontempGetCommunicationsendersV1Response> localVarResp = inscriptiontempGetCommunicationsendersV1WithHttpInfo(pkiInscriptiontempID);
        return localVarResp.getData();
    }

    /**
     * Retrieve Inscriptiontemp&#39;s Communicationsender
     * 
     * @param pkiInscriptiontempID  (required)
     * @return ApiResponse&lt;InscriptiontempGetCommunicationsendersV1Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The request failed. The element on which you were trying to work does not exists. Look for detail about the error in the body </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<InscriptiontempGetCommunicationsendersV1Response> inscriptiontempGetCommunicationsendersV1WithHttpInfo(Integer pkiInscriptiontempID) throws ApiException {
        okhttp3.Call localVarCall = inscriptiontempGetCommunicationsendersV1ValidateBeforeCall(pkiInscriptiontempID, null);
        Type localVarReturnType = new TypeToken<InscriptiontempGetCommunicationsendersV1Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Retrieve Inscriptiontemp&#39;s Communicationsender (asynchronously)
     * 
     * @param pkiInscriptiontempID  (required)
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
    public okhttp3.Call inscriptiontempGetCommunicationsendersV1Async(Integer pkiInscriptiontempID, final ApiCallback<InscriptiontempGetCommunicationsendersV1Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = inscriptiontempGetCommunicationsendersV1ValidateBeforeCall(pkiInscriptiontempID, _callback);
        Type localVarReturnType = new TypeToken<InscriptiontempGetCommunicationsendersV1Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
