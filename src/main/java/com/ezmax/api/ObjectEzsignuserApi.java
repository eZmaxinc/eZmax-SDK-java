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
import com.ezmax.api.model.EzsignuserEditObjectV1Request;
import com.ezmax.api.model.EzsignuserEditObjectV1Response;
import com.ezmax.api.model.EzsignuserGetObjectV2Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ObjectEzsignuserApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ObjectEzsignuserApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ObjectEzsignuserApi(ApiClient apiClient) {
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
     * Build call for ezsignuserEditObjectV1
     * @param pkiEzsignuserID The unique ID of the Ezsignuser (required)
     * @param ezsignuserEditObjectV1Request  (required)
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
    public okhttp3.Call ezsignuserEditObjectV1Call(Integer pkiEzsignuserID, EzsignuserEditObjectV1Request ezsignuserEditObjectV1Request, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = ezsignuserEditObjectV1Request;

        // create path and map variables
        String localVarPath = "/1/object/ezsignuser/{pkiEzsignuserID}"
            .replace("{" + "pkiEzsignuserID" + "}", localVarApiClient.escapeString(pkiEzsignuserID.toString()));

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
    private okhttp3.Call ezsignuserEditObjectV1ValidateBeforeCall(Integer pkiEzsignuserID, EzsignuserEditObjectV1Request ezsignuserEditObjectV1Request, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'pkiEzsignuserID' is set
        if (pkiEzsignuserID == null) {
            throw new ApiException("Missing the required parameter 'pkiEzsignuserID' when calling ezsignuserEditObjectV1(Async)");
        }

        // verify the required parameter 'ezsignuserEditObjectV1Request' is set
        if (ezsignuserEditObjectV1Request == null) {
            throw new ApiException("Missing the required parameter 'ezsignuserEditObjectV1Request' when calling ezsignuserEditObjectV1(Async)");
        }

        return ezsignuserEditObjectV1Call(pkiEzsignuserID, ezsignuserEditObjectV1Request, _callback);

    }

    /**
     * Edit an existing Ezsignuser
     * 
     * @param pkiEzsignuserID The unique ID of the Ezsignuser (required)
     * @param ezsignuserEditObjectV1Request  (required)
     * @return EzsignuserEditObjectV1Response
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
    public EzsignuserEditObjectV1Response ezsignuserEditObjectV1(Integer pkiEzsignuserID, EzsignuserEditObjectV1Request ezsignuserEditObjectV1Request) throws ApiException {
        ApiResponse<EzsignuserEditObjectV1Response> localVarResp = ezsignuserEditObjectV1WithHttpInfo(pkiEzsignuserID, ezsignuserEditObjectV1Request);
        return localVarResp.getData();
    }

    /**
     * Edit an existing Ezsignuser
     * 
     * @param pkiEzsignuserID The unique ID of the Ezsignuser (required)
     * @param ezsignuserEditObjectV1Request  (required)
     * @return ApiResponse&lt;EzsignuserEditObjectV1Response&gt;
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
    public ApiResponse<EzsignuserEditObjectV1Response> ezsignuserEditObjectV1WithHttpInfo(Integer pkiEzsignuserID, EzsignuserEditObjectV1Request ezsignuserEditObjectV1Request) throws ApiException {
        okhttp3.Call localVarCall = ezsignuserEditObjectV1ValidateBeforeCall(pkiEzsignuserID, ezsignuserEditObjectV1Request, null);
        Type localVarReturnType = new TypeToken<EzsignuserEditObjectV1Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Edit an existing Ezsignuser (asynchronously)
     * 
     * @param pkiEzsignuserID The unique ID of the Ezsignuser (required)
     * @param ezsignuserEditObjectV1Request  (required)
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
    public okhttp3.Call ezsignuserEditObjectV1Async(Integer pkiEzsignuserID, EzsignuserEditObjectV1Request ezsignuserEditObjectV1Request, final ApiCallback<EzsignuserEditObjectV1Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = ezsignuserEditObjectV1ValidateBeforeCall(pkiEzsignuserID, ezsignuserEditObjectV1Request, _callback);
        Type localVarReturnType = new TypeToken<EzsignuserEditObjectV1Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for ezsignuserGetObjectV2
     * @param pkiEzsignuserID The unique ID of the Ezsignuser (required)
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
    public okhttp3.Call ezsignuserGetObjectV2Call(Integer pkiEzsignuserID, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/2/object/ezsignuser/{pkiEzsignuserID}"
            .replace("{" + "pkiEzsignuserID" + "}", localVarApiClient.escapeString(pkiEzsignuserID.toString()));

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
    private okhttp3.Call ezsignuserGetObjectV2ValidateBeforeCall(Integer pkiEzsignuserID, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'pkiEzsignuserID' is set
        if (pkiEzsignuserID == null) {
            throw new ApiException("Missing the required parameter 'pkiEzsignuserID' when calling ezsignuserGetObjectV2(Async)");
        }

        return ezsignuserGetObjectV2Call(pkiEzsignuserID, _callback);

    }

    /**
     * Retrieve an existing Ezsignuser
     * 
     * @param pkiEzsignuserID The unique ID of the Ezsignuser (required)
     * @return EzsignuserGetObjectV2Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The request failed. The element on which you were trying to work does not exists. Look for detail about the error in the body </td><td>  -  </td></tr>
     </table>
     */
    public EzsignuserGetObjectV2Response ezsignuserGetObjectV2(Integer pkiEzsignuserID) throws ApiException {
        ApiResponse<EzsignuserGetObjectV2Response> localVarResp = ezsignuserGetObjectV2WithHttpInfo(pkiEzsignuserID);
        return localVarResp.getData();
    }

    /**
     * Retrieve an existing Ezsignuser
     * 
     * @param pkiEzsignuserID The unique ID of the Ezsignuser (required)
     * @return ApiResponse&lt;EzsignuserGetObjectV2Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The request failed. The element on which you were trying to work does not exists. Look for detail about the error in the body </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<EzsignuserGetObjectV2Response> ezsignuserGetObjectV2WithHttpInfo(Integer pkiEzsignuserID) throws ApiException {
        okhttp3.Call localVarCall = ezsignuserGetObjectV2ValidateBeforeCall(pkiEzsignuserID, null);
        Type localVarReturnType = new TypeToken<EzsignuserGetObjectV2Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Retrieve an existing Ezsignuser (asynchronously)
     * 
     * @param pkiEzsignuserID The unique ID of the Ezsignuser (required)
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
    public okhttp3.Call ezsignuserGetObjectV2Async(Integer pkiEzsignuserID, final ApiCallback<EzsignuserGetObjectV2Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = ezsignuserGetObjectV2ValidateBeforeCall(pkiEzsignuserID, _callback);
        Type localVarReturnType = new TypeToken<EzsignuserGetObjectV2Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
