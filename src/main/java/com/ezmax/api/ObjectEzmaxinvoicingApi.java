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
import com.ezmax.api.model.EzmaxinvoicingGetAutocompleteV2Response;
import com.ezmax.api.model.EzmaxinvoicingGetObjectV2Response;
import com.ezmax.api.model.EzmaxinvoicingGetProvisionalV1Response;
import com.ezmax.api.model.HeaderAcceptLanguage;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ObjectEzmaxinvoicingApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ObjectEzmaxinvoicingApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ObjectEzmaxinvoicingApi(ApiClient apiClient) {
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
     * Build call for ezmaxinvoicingGetAutocompleteV2
     * @param sSelector The type of Ezmaxinvoicings to return (required)
     * @param eFilterActive Specify which results we want to display. (optional, default to Active)
     * @param sQuery Allow to filter the returned results (optional)
     * @param acceptLanguage  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call ezmaxinvoicingGetAutocompleteV2Call(String sSelector, String eFilterActive, String sQuery, HeaderAcceptLanguage acceptLanguage, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/2/object/ezmaxinvoicing/getAutocomplete/{sSelector}"
            .replace("{" + "sSelector" + "}", localVarApiClient.escapeString(sSelector.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (eFilterActive != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("eFilterActive", eFilterActive));
        }

        if (sQuery != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("sQuery", sQuery));
        }

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

        if (acceptLanguage != null) {
            localVarHeaderParams.put("Accept-Language", localVarApiClient.parameterToString(acceptLanguage));
        }


        String[] localVarAuthNames = new String[] { "Authorization" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call ezmaxinvoicingGetAutocompleteV2ValidateBeforeCall(String sSelector, String eFilterActive, String sQuery, HeaderAcceptLanguage acceptLanguage, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'sSelector' is set
        if (sSelector == null) {
            throw new ApiException("Missing the required parameter 'sSelector' when calling ezmaxinvoicingGetAutocompleteV2(Async)");
        }

        return ezmaxinvoicingGetAutocompleteV2Call(sSelector, eFilterActive, sQuery, acceptLanguage, _callback);

    }

    /**
     * Retrieve Ezmaxinvoicings and IDs
     * Get the list of Ezmaxinvoicing to be used in a dropdown or autocomplete control.
     * @param sSelector The type of Ezmaxinvoicings to return (required)
     * @param eFilterActive Specify which results we want to display. (optional, default to Active)
     * @param sQuery Allow to filter the returned results (optional)
     * @param acceptLanguage  (optional)
     * @return EzmaxinvoicingGetAutocompleteV2Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public EzmaxinvoicingGetAutocompleteV2Response ezmaxinvoicingGetAutocompleteV2(String sSelector, String eFilterActive, String sQuery, HeaderAcceptLanguage acceptLanguage) throws ApiException {
        ApiResponse<EzmaxinvoicingGetAutocompleteV2Response> localVarResp = ezmaxinvoicingGetAutocompleteV2WithHttpInfo(sSelector, eFilterActive, sQuery, acceptLanguage);
        return localVarResp.getData();
    }

    /**
     * Retrieve Ezmaxinvoicings and IDs
     * Get the list of Ezmaxinvoicing to be used in a dropdown or autocomplete control.
     * @param sSelector The type of Ezmaxinvoicings to return (required)
     * @param eFilterActive Specify which results we want to display. (optional, default to Active)
     * @param sQuery Allow to filter the returned results (optional)
     * @param acceptLanguage  (optional)
     * @return ApiResponse&lt;EzmaxinvoicingGetAutocompleteV2Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<EzmaxinvoicingGetAutocompleteV2Response> ezmaxinvoicingGetAutocompleteV2WithHttpInfo(String sSelector, String eFilterActive, String sQuery, HeaderAcceptLanguage acceptLanguage) throws ApiException {
        okhttp3.Call localVarCall = ezmaxinvoicingGetAutocompleteV2ValidateBeforeCall(sSelector, eFilterActive, sQuery, acceptLanguage, null);
        Type localVarReturnType = new TypeToken<EzmaxinvoicingGetAutocompleteV2Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Retrieve Ezmaxinvoicings and IDs (asynchronously)
     * Get the list of Ezmaxinvoicing to be used in a dropdown or autocomplete control.
     * @param sSelector The type of Ezmaxinvoicings to return (required)
     * @param eFilterActive Specify which results we want to display. (optional, default to Active)
     * @param sQuery Allow to filter the returned results (optional)
     * @param acceptLanguage  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call ezmaxinvoicingGetAutocompleteV2Async(String sSelector, String eFilterActive, String sQuery, HeaderAcceptLanguage acceptLanguage, final ApiCallback<EzmaxinvoicingGetAutocompleteV2Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = ezmaxinvoicingGetAutocompleteV2ValidateBeforeCall(sSelector, eFilterActive, sQuery, acceptLanguage, _callback);
        Type localVarReturnType = new TypeToken<EzmaxinvoicingGetAutocompleteV2Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for ezmaxinvoicingGetObjectV2
     * @param pkiEzmaxinvoicingID  (required)
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
    public okhttp3.Call ezmaxinvoicingGetObjectV2Call(Integer pkiEzmaxinvoicingID, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/2/object/ezmaxinvoicing/{pkiEzmaxinvoicingID}"
            .replace("{" + "pkiEzmaxinvoicingID" + "}", localVarApiClient.escapeString(pkiEzmaxinvoicingID.toString()));

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
    private okhttp3.Call ezmaxinvoicingGetObjectV2ValidateBeforeCall(Integer pkiEzmaxinvoicingID, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'pkiEzmaxinvoicingID' is set
        if (pkiEzmaxinvoicingID == null) {
            throw new ApiException("Missing the required parameter 'pkiEzmaxinvoicingID' when calling ezmaxinvoicingGetObjectV2(Async)");
        }

        return ezmaxinvoicingGetObjectV2Call(pkiEzmaxinvoicingID, _callback);

    }

    /**
     * Retrieve an existing Ezmaxinvoicing
     * 
     * @param pkiEzmaxinvoicingID  (required)
     * @return EzmaxinvoicingGetObjectV2Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The request failed. The element on which you were trying to work does not exists. Look for detail about the error in the body </td><td>  -  </td></tr>
     </table>
     */
    public EzmaxinvoicingGetObjectV2Response ezmaxinvoicingGetObjectV2(Integer pkiEzmaxinvoicingID) throws ApiException {
        ApiResponse<EzmaxinvoicingGetObjectV2Response> localVarResp = ezmaxinvoicingGetObjectV2WithHttpInfo(pkiEzmaxinvoicingID);
        return localVarResp.getData();
    }

    /**
     * Retrieve an existing Ezmaxinvoicing
     * 
     * @param pkiEzmaxinvoicingID  (required)
     * @return ApiResponse&lt;EzmaxinvoicingGetObjectV2Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The request failed. The element on which you were trying to work does not exists. Look for detail about the error in the body </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<EzmaxinvoicingGetObjectV2Response> ezmaxinvoicingGetObjectV2WithHttpInfo(Integer pkiEzmaxinvoicingID) throws ApiException {
        okhttp3.Call localVarCall = ezmaxinvoicingGetObjectV2ValidateBeforeCall(pkiEzmaxinvoicingID, null);
        Type localVarReturnType = new TypeToken<EzmaxinvoicingGetObjectV2Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Retrieve an existing Ezmaxinvoicing (asynchronously)
     * 
     * @param pkiEzmaxinvoicingID  (required)
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
    public okhttp3.Call ezmaxinvoicingGetObjectV2Async(Integer pkiEzmaxinvoicingID, final ApiCallback<EzmaxinvoicingGetObjectV2Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = ezmaxinvoicingGetObjectV2ValidateBeforeCall(pkiEzmaxinvoicingID, _callback);
        Type localVarReturnType = new TypeToken<EzmaxinvoicingGetObjectV2Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for ezmaxinvoicingGetProvisionalV1
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> The request was syntactically valid but failed because of an interdependance condition. Look for detail about the error in the body </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call ezmaxinvoicingGetProvisionalV1Call(final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/1/object/ezmaxinvoicing/getProvisional";

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
    private okhttp3.Call ezmaxinvoicingGetProvisionalV1ValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return ezmaxinvoicingGetProvisionalV1Call(_callback);

    }

    /**
     * Retrieve provisional Ezmaxinvoicing
     * 
     * @return EzmaxinvoicingGetProvisionalV1Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> The request was syntactically valid but failed because of an interdependance condition. Look for detail about the error in the body </td><td>  -  </td></tr>
     </table>
     */
    public EzmaxinvoicingGetProvisionalV1Response ezmaxinvoicingGetProvisionalV1() throws ApiException {
        ApiResponse<EzmaxinvoicingGetProvisionalV1Response> localVarResp = ezmaxinvoicingGetProvisionalV1WithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Retrieve provisional Ezmaxinvoicing
     * 
     * @return ApiResponse&lt;EzmaxinvoicingGetProvisionalV1Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> The request was syntactically valid but failed because of an interdependance condition. Look for detail about the error in the body </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<EzmaxinvoicingGetProvisionalV1Response> ezmaxinvoicingGetProvisionalV1WithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = ezmaxinvoicingGetProvisionalV1ValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<EzmaxinvoicingGetProvisionalV1Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Retrieve provisional Ezmaxinvoicing (asynchronously)
     * 
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> The request was syntactically valid but failed because of an interdependance condition. Look for detail about the error in the body </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call ezmaxinvoicingGetProvisionalV1Async(final ApiCallback<EzmaxinvoicingGetProvisionalV1Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = ezmaxinvoicingGetProvisionalV1ValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<EzmaxinvoicingGetProvisionalV1Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
