/*
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.18
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
import com.ezmax.api.model.SubnetCreateObjectV1Request;
import com.ezmax.api.model.SubnetCreateObjectV1Response;
import com.ezmax.api.model.SubnetDeleteObjectV1Response;
import com.ezmax.api.model.SubnetEditObjectV1Request;
import com.ezmax.api.model.SubnetEditObjectV1Response;
import com.ezmax.api.model.SubnetGetObjectV2Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class ObjectSubnetApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ObjectSubnetApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ObjectSubnetApi(ApiClient apiClient) {
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
     * Build call for subnetCreateObjectV1
     * @param subnetCreateObjectV1Request  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> The request was syntactically valid but failed because of an interdependance condition. Look for detail about the error in the body </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call subnetCreateObjectV1Call(SubnetCreateObjectV1Request subnetCreateObjectV1Request, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = subnetCreateObjectV1Request;

        // create path and map variables
        String localVarPath = "/1/object/subnet";

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
    private okhttp3.Call subnetCreateObjectV1ValidateBeforeCall(SubnetCreateObjectV1Request subnetCreateObjectV1Request, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'subnetCreateObjectV1Request' is set
        if (subnetCreateObjectV1Request == null) {
            throw new ApiException("Missing the required parameter 'subnetCreateObjectV1Request' when calling subnetCreateObjectV1(Async)");
        }

        return subnetCreateObjectV1Call(subnetCreateObjectV1Request, _callback);

    }

    /**
     * Create a new Subnet
     * The endpoint allows to create one or many elements at once.
     * @param subnetCreateObjectV1Request  (required)
     * @return SubnetCreateObjectV1Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> The request was syntactically valid but failed because of an interdependance condition. Look for detail about the error in the body </td><td>  -  </td></tr>
     </table>
     */
    public SubnetCreateObjectV1Response subnetCreateObjectV1(SubnetCreateObjectV1Request subnetCreateObjectV1Request) throws ApiException {
        ApiResponse<SubnetCreateObjectV1Response> localVarResp = subnetCreateObjectV1WithHttpInfo(subnetCreateObjectV1Request);
        return localVarResp.getData();
    }

    /**
     * Create a new Subnet
     * The endpoint allows to create one or many elements at once.
     * @param subnetCreateObjectV1Request  (required)
     * @return ApiResponse&lt;SubnetCreateObjectV1Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> The request was syntactically valid but failed because of an interdependance condition. Look for detail about the error in the body </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<SubnetCreateObjectV1Response> subnetCreateObjectV1WithHttpInfo(SubnetCreateObjectV1Request subnetCreateObjectV1Request) throws ApiException {
        okhttp3.Call localVarCall = subnetCreateObjectV1ValidateBeforeCall(subnetCreateObjectV1Request, null);
        Type localVarReturnType = new TypeToken<SubnetCreateObjectV1Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create a new Subnet (asynchronously)
     * The endpoint allows to create one or many elements at once.
     * @param subnetCreateObjectV1Request  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> The request was syntactically valid but failed because of an interdependance condition. Look for detail about the error in the body </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call subnetCreateObjectV1Async(SubnetCreateObjectV1Request subnetCreateObjectV1Request, final ApiCallback<SubnetCreateObjectV1Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = subnetCreateObjectV1ValidateBeforeCall(subnetCreateObjectV1Request, _callback);
        Type localVarReturnType = new TypeToken<SubnetCreateObjectV1Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for subnetDeleteObjectV1
     * @param pkiSubnetID The unique ID of the Subnet (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The request failed. The element on which you were trying to work does not exists. Look for detail about the error in the body </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> The request was syntactically valid but failed because of an interdependance condition. Look for detail about the error in the body </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call subnetDeleteObjectV1Call(Integer pkiSubnetID, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/1/object/subnet/{pkiSubnetID}"
            .replace("{" + "pkiSubnetID" + "}", localVarApiClient.escapeString(pkiSubnetID.toString()));

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
    private okhttp3.Call subnetDeleteObjectV1ValidateBeforeCall(Integer pkiSubnetID, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'pkiSubnetID' is set
        if (pkiSubnetID == null) {
            throw new ApiException("Missing the required parameter 'pkiSubnetID' when calling subnetDeleteObjectV1(Async)");
        }

        return subnetDeleteObjectV1Call(pkiSubnetID, _callback);

    }

    /**
     * Delete an existing Subnet
     * 
     * @param pkiSubnetID The unique ID of the Subnet (required)
     * @return SubnetDeleteObjectV1Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The request failed. The element on which you were trying to work does not exists. Look for detail about the error in the body </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> The request was syntactically valid but failed because of an interdependance condition. Look for detail about the error in the body </td><td>  -  </td></tr>
     </table>
     */
    public SubnetDeleteObjectV1Response subnetDeleteObjectV1(Integer pkiSubnetID) throws ApiException {
        ApiResponse<SubnetDeleteObjectV1Response> localVarResp = subnetDeleteObjectV1WithHttpInfo(pkiSubnetID);
        return localVarResp.getData();
    }

    /**
     * Delete an existing Subnet
     * 
     * @param pkiSubnetID The unique ID of the Subnet (required)
     * @return ApiResponse&lt;SubnetDeleteObjectV1Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The request failed. The element on which you were trying to work does not exists. Look for detail about the error in the body </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> The request was syntactically valid but failed because of an interdependance condition. Look for detail about the error in the body </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<SubnetDeleteObjectV1Response> subnetDeleteObjectV1WithHttpInfo(Integer pkiSubnetID) throws ApiException {
        okhttp3.Call localVarCall = subnetDeleteObjectV1ValidateBeforeCall(pkiSubnetID, null);
        Type localVarReturnType = new TypeToken<SubnetDeleteObjectV1Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Delete an existing Subnet (asynchronously)
     * 
     * @param pkiSubnetID The unique ID of the Subnet (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The request failed. The element on which you were trying to work does not exists. Look for detail about the error in the body </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> The request was syntactically valid but failed because of an interdependance condition. Look for detail about the error in the body </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call subnetDeleteObjectV1Async(Integer pkiSubnetID, final ApiCallback<SubnetDeleteObjectV1Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = subnetDeleteObjectV1ValidateBeforeCall(pkiSubnetID, _callback);
        Type localVarReturnType = new TypeToken<SubnetDeleteObjectV1Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for subnetEditObjectV1
     * @param pkiSubnetID The unique ID of the Subnet (required)
     * @param subnetEditObjectV1Request  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The request failed. The element on which you were trying to work does not exists. Look for detail about the error in the body </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> The request was syntactically valid but failed because of an interdependance condition. Look for detail about the error in the body </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call subnetEditObjectV1Call(Integer pkiSubnetID, SubnetEditObjectV1Request subnetEditObjectV1Request, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = subnetEditObjectV1Request;

        // create path and map variables
        String localVarPath = "/1/object/subnet/{pkiSubnetID}"
            .replace("{" + "pkiSubnetID" + "}", localVarApiClient.escapeString(pkiSubnetID.toString()));

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
    private okhttp3.Call subnetEditObjectV1ValidateBeforeCall(Integer pkiSubnetID, SubnetEditObjectV1Request subnetEditObjectV1Request, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'pkiSubnetID' is set
        if (pkiSubnetID == null) {
            throw new ApiException("Missing the required parameter 'pkiSubnetID' when calling subnetEditObjectV1(Async)");
        }

        // verify the required parameter 'subnetEditObjectV1Request' is set
        if (subnetEditObjectV1Request == null) {
            throw new ApiException("Missing the required parameter 'subnetEditObjectV1Request' when calling subnetEditObjectV1(Async)");
        }

        return subnetEditObjectV1Call(pkiSubnetID, subnetEditObjectV1Request, _callback);

    }

    /**
     * Edit an existing Subnet
     * 
     * @param pkiSubnetID The unique ID of the Subnet (required)
     * @param subnetEditObjectV1Request  (required)
     * @return SubnetEditObjectV1Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The request failed. The element on which you were trying to work does not exists. Look for detail about the error in the body </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> The request was syntactically valid but failed because of an interdependance condition. Look for detail about the error in the body </td><td>  -  </td></tr>
     </table>
     */
    public SubnetEditObjectV1Response subnetEditObjectV1(Integer pkiSubnetID, SubnetEditObjectV1Request subnetEditObjectV1Request) throws ApiException {
        ApiResponse<SubnetEditObjectV1Response> localVarResp = subnetEditObjectV1WithHttpInfo(pkiSubnetID, subnetEditObjectV1Request);
        return localVarResp.getData();
    }

    /**
     * Edit an existing Subnet
     * 
     * @param pkiSubnetID The unique ID of the Subnet (required)
     * @param subnetEditObjectV1Request  (required)
     * @return ApiResponse&lt;SubnetEditObjectV1Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The request failed. The element on which you were trying to work does not exists. Look for detail about the error in the body </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> The request was syntactically valid but failed because of an interdependance condition. Look for detail about the error in the body </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<SubnetEditObjectV1Response> subnetEditObjectV1WithHttpInfo(Integer pkiSubnetID, SubnetEditObjectV1Request subnetEditObjectV1Request) throws ApiException {
        okhttp3.Call localVarCall = subnetEditObjectV1ValidateBeforeCall(pkiSubnetID, subnetEditObjectV1Request, null);
        Type localVarReturnType = new TypeToken<SubnetEditObjectV1Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Edit an existing Subnet (asynchronously)
     * 
     * @param pkiSubnetID The unique ID of the Subnet (required)
     * @param subnetEditObjectV1Request  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The request failed. The element on which you were trying to work does not exists. Look for detail about the error in the body </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> The request was syntactically valid but failed because of an interdependance condition. Look for detail about the error in the body </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call subnetEditObjectV1Async(Integer pkiSubnetID, SubnetEditObjectV1Request subnetEditObjectV1Request, final ApiCallback<SubnetEditObjectV1Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = subnetEditObjectV1ValidateBeforeCall(pkiSubnetID, subnetEditObjectV1Request, _callback);
        Type localVarReturnType = new TypeToken<SubnetEditObjectV1Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for subnetGetObjectV2
     * @param pkiSubnetID The unique ID of the Subnet (required)
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
    public okhttp3.Call subnetGetObjectV2Call(Integer pkiSubnetID, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/2/object/subnet/{pkiSubnetID}"
            .replace("{" + "pkiSubnetID" + "}", localVarApiClient.escapeString(pkiSubnetID.toString()));

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
    private okhttp3.Call subnetGetObjectV2ValidateBeforeCall(Integer pkiSubnetID, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'pkiSubnetID' is set
        if (pkiSubnetID == null) {
            throw new ApiException("Missing the required parameter 'pkiSubnetID' when calling subnetGetObjectV2(Async)");
        }

        return subnetGetObjectV2Call(pkiSubnetID, _callback);

    }

    /**
     * Retrieve an existing Subnet
     * 
     * @param pkiSubnetID The unique ID of the Subnet (required)
     * @return SubnetGetObjectV2Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The request failed. The element on which you were trying to work does not exists. Look for detail about the error in the body </td><td>  -  </td></tr>
     </table>
     */
    public SubnetGetObjectV2Response subnetGetObjectV2(Integer pkiSubnetID) throws ApiException {
        ApiResponse<SubnetGetObjectV2Response> localVarResp = subnetGetObjectV2WithHttpInfo(pkiSubnetID);
        return localVarResp.getData();
    }

    /**
     * Retrieve an existing Subnet
     * 
     * @param pkiSubnetID The unique ID of the Subnet (required)
     * @return ApiResponse&lt;SubnetGetObjectV2Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The request failed. The element on which you were trying to work does not exists. Look for detail about the error in the body </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<SubnetGetObjectV2Response> subnetGetObjectV2WithHttpInfo(Integer pkiSubnetID) throws ApiException {
        okhttp3.Call localVarCall = subnetGetObjectV2ValidateBeforeCall(pkiSubnetID, null);
        Type localVarReturnType = new TypeToken<SubnetGetObjectV2Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Retrieve an existing Subnet (asynchronously)
     * 
     * @param pkiSubnetID The unique ID of the Subnet (required)
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
    public okhttp3.Call subnetGetObjectV2Async(Integer pkiSubnetID, final ApiCallback<SubnetGetObjectV2Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = subnetGetObjectV2ValidateBeforeCall(pkiSubnetID, _callback);
        Type localVarReturnType = new TypeToken<SubnetGetObjectV2Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}