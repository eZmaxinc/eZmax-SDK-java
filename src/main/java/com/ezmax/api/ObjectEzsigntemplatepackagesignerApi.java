/*
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.8
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
import com.ezmax.api.model.EzsigntemplatepackagesignerCreateObjectV1Request;
import com.ezmax.api.model.EzsigntemplatepackagesignerCreateObjectV1Response;
import com.ezmax.api.model.EzsigntemplatepackagesignerDeleteObjectV1Response;
import com.ezmax.api.model.EzsigntemplatepackagesignerEditObjectV1Request;
import com.ezmax.api.model.EzsigntemplatepackagesignerEditObjectV1Response;
import com.ezmax.api.model.EzsigntemplatepackagesignerGetObjectV1Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class ObjectEzsigntemplatepackagesignerApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ObjectEzsigntemplatepackagesignerApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ObjectEzsigntemplatepackagesignerApi(ApiClient apiClient) {
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
     * Build call for ezsigntemplatepackagesignerCreateObjectV1
     * @param ezsigntemplatepackagesignerCreateObjectV1Request  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call ezsigntemplatepackagesignerCreateObjectV1Call(EzsigntemplatepackagesignerCreateObjectV1Request ezsigntemplatepackagesignerCreateObjectV1Request, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = ezsigntemplatepackagesignerCreateObjectV1Request;

        // create path and map variables
        String localVarPath = "/1/object/ezsigntemplatepackagesigner";

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
    private okhttp3.Call ezsigntemplatepackagesignerCreateObjectV1ValidateBeforeCall(EzsigntemplatepackagesignerCreateObjectV1Request ezsigntemplatepackagesignerCreateObjectV1Request, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'ezsigntemplatepackagesignerCreateObjectV1Request' is set
        if (ezsigntemplatepackagesignerCreateObjectV1Request == null) {
            throw new ApiException("Missing the required parameter 'ezsigntemplatepackagesignerCreateObjectV1Request' when calling ezsigntemplatepackagesignerCreateObjectV1(Async)");
        }
        

        okhttp3.Call localVarCall = ezsigntemplatepackagesignerCreateObjectV1Call(ezsigntemplatepackagesignerCreateObjectV1Request, _callback);
        return localVarCall;

    }

    /**
     * Create a new Ezsigntemplatepackagesigner
     * The endpoint allows to create one or many elements at once.
     * @param ezsigntemplatepackagesignerCreateObjectV1Request  (required)
     * @return EzsigntemplatepackagesignerCreateObjectV1Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public EzsigntemplatepackagesignerCreateObjectV1Response ezsigntemplatepackagesignerCreateObjectV1(EzsigntemplatepackagesignerCreateObjectV1Request ezsigntemplatepackagesignerCreateObjectV1Request) throws ApiException {
        ApiResponse<EzsigntemplatepackagesignerCreateObjectV1Response> localVarResp = ezsigntemplatepackagesignerCreateObjectV1WithHttpInfo(ezsigntemplatepackagesignerCreateObjectV1Request);
        return localVarResp.getData();
    }

    /**
     * Create a new Ezsigntemplatepackagesigner
     * The endpoint allows to create one or many elements at once.
     * @param ezsigntemplatepackagesignerCreateObjectV1Request  (required)
     * @return ApiResponse&lt;EzsigntemplatepackagesignerCreateObjectV1Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<EzsigntemplatepackagesignerCreateObjectV1Response> ezsigntemplatepackagesignerCreateObjectV1WithHttpInfo(EzsigntemplatepackagesignerCreateObjectV1Request ezsigntemplatepackagesignerCreateObjectV1Request) throws ApiException {
        okhttp3.Call localVarCall = ezsigntemplatepackagesignerCreateObjectV1ValidateBeforeCall(ezsigntemplatepackagesignerCreateObjectV1Request, null);
        Type localVarReturnType = new TypeToken<EzsigntemplatepackagesignerCreateObjectV1Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create a new Ezsigntemplatepackagesigner (asynchronously)
     * The endpoint allows to create one or many elements at once.
     * @param ezsigntemplatepackagesignerCreateObjectV1Request  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call ezsigntemplatepackagesignerCreateObjectV1Async(EzsigntemplatepackagesignerCreateObjectV1Request ezsigntemplatepackagesignerCreateObjectV1Request, final ApiCallback<EzsigntemplatepackagesignerCreateObjectV1Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = ezsigntemplatepackagesignerCreateObjectV1ValidateBeforeCall(ezsigntemplatepackagesignerCreateObjectV1Request, _callback);
        Type localVarReturnType = new TypeToken<EzsigntemplatepackagesignerCreateObjectV1Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for ezsigntemplatepackagesignerDeleteObjectV1
     * @param pkiEzsigntemplatepackagesignerID  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The element you are trying to work on does not exist </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call ezsigntemplatepackagesignerDeleteObjectV1Call(Integer pkiEzsigntemplatepackagesignerID, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/1/object/ezsigntemplatepackagesigner/{pkiEzsigntemplatepackagesignerID}"
            .replaceAll("\\{" + "pkiEzsigntemplatepackagesignerID" + "\\}", localVarApiClient.escapeString(pkiEzsigntemplatepackagesignerID.toString()));

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
    private okhttp3.Call ezsigntemplatepackagesignerDeleteObjectV1ValidateBeforeCall(Integer pkiEzsigntemplatepackagesignerID, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'pkiEzsigntemplatepackagesignerID' is set
        if (pkiEzsigntemplatepackagesignerID == null) {
            throw new ApiException("Missing the required parameter 'pkiEzsigntemplatepackagesignerID' when calling ezsigntemplatepackagesignerDeleteObjectV1(Async)");
        }
        

        okhttp3.Call localVarCall = ezsigntemplatepackagesignerDeleteObjectV1Call(pkiEzsigntemplatepackagesignerID, _callback);
        return localVarCall;

    }

    /**
     * Delete an existing Ezsigntemplatepackagesigner
     * 
     * @param pkiEzsigntemplatepackagesignerID  (required)
     * @return EzsigntemplatepackagesignerDeleteObjectV1Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The element you are trying to work on does not exist </td><td>  -  </td></tr>
     </table>
     */
    public EzsigntemplatepackagesignerDeleteObjectV1Response ezsigntemplatepackagesignerDeleteObjectV1(Integer pkiEzsigntemplatepackagesignerID) throws ApiException {
        ApiResponse<EzsigntemplatepackagesignerDeleteObjectV1Response> localVarResp = ezsigntemplatepackagesignerDeleteObjectV1WithHttpInfo(pkiEzsigntemplatepackagesignerID);
        return localVarResp.getData();
    }

    /**
     * Delete an existing Ezsigntemplatepackagesigner
     * 
     * @param pkiEzsigntemplatepackagesignerID  (required)
     * @return ApiResponse&lt;EzsigntemplatepackagesignerDeleteObjectV1Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The element you are trying to work on does not exist </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<EzsigntemplatepackagesignerDeleteObjectV1Response> ezsigntemplatepackagesignerDeleteObjectV1WithHttpInfo(Integer pkiEzsigntemplatepackagesignerID) throws ApiException {
        okhttp3.Call localVarCall = ezsigntemplatepackagesignerDeleteObjectV1ValidateBeforeCall(pkiEzsigntemplatepackagesignerID, null);
        Type localVarReturnType = new TypeToken<EzsigntemplatepackagesignerDeleteObjectV1Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Delete an existing Ezsigntemplatepackagesigner (asynchronously)
     * 
     * @param pkiEzsigntemplatepackagesignerID  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The element you are trying to work on does not exist </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call ezsigntemplatepackagesignerDeleteObjectV1Async(Integer pkiEzsigntemplatepackagesignerID, final ApiCallback<EzsigntemplatepackagesignerDeleteObjectV1Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = ezsigntemplatepackagesignerDeleteObjectV1ValidateBeforeCall(pkiEzsigntemplatepackagesignerID, _callback);
        Type localVarReturnType = new TypeToken<EzsigntemplatepackagesignerDeleteObjectV1Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for ezsigntemplatepackagesignerEditObjectV1
     * @param pkiEzsigntemplatepackagesignerID  (required)
     * @param ezsigntemplatepackagesignerEditObjectV1Request  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The element you are trying to work on does not exist </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> The syntax of the request is valid but the request cannot be completed. Look for detail in body. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call ezsigntemplatepackagesignerEditObjectV1Call(Integer pkiEzsigntemplatepackagesignerID, EzsigntemplatepackagesignerEditObjectV1Request ezsigntemplatepackagesignerEditObjectV1Request, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = ezsigntemplatepackagesignerEditObjectV1Request;

        // create path and map variables
        String localVarPath = "/1/object/ezsigntemplatepackagesigner/{pkiEzsigntemplatepackagesignerID}"
            .replaceAll("\\{" + "pkiEzsigntemplatepackagesignerID" + "\\}", localVarApiClient.escapeString(pkiEzsigntemplatepackagesignerID.toString()));

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
    private okhttp3.Call ezsigntemplatepackagesignerEditObjectV1ValidateBeforeCall(Integer pkiEzsigntemplatepackagesignerID, EzsigntemplatepackagesignerEditObjectV1Request ezsigntemplatepackagesignerEditObjectV1Request, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'pkiEzsigntemplatepackagesignerID' is set
        if (pkiEzsigntemplatepackagesignerID == null) {
            throw new ApiException("Missing the required parameter 'pkiEzsigntemplatepackagesignerID' when calling ezsigntemplatepackagesignerEditObjectV1(Async)");
        }
        
        // verify the required parameter 'ezsigntemplatepackagesignerEditObjectV1Request' is set
        if (ezsigntemplatepackagesignerEditObjectV1Request == null) {
            throw new ApiException("Missing the required parameter 'ezsigntemplatepackagesignerEditObjectV1Request' when calling ezsigntemplatepackagesignerEditObjectV1(Async)");
        }
        

        okhttp3.Call localVarCall = ezsigntemplatepackagesignerEditObjectV1Call(pkiEzsigntemplatepackagesignerID, ezsigntemplatepackagesignerEditObjectV1Request, _callback);
        return localVarCall;

    }

    /**
     * Edit an existing Ezsigntemplatepackagesigner
     * 
     * @param pkiEzsigntemplatepackagesignerID  (required)
     * @param ezsigntemplatepackagesignerEditObjectV1Request  (required)
     * @return EzsigntemplatepackagesignerEditObjectV1Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The element you are trying to work on does not exist </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> The syntax of the request is valid but the request cannot be completed. Look for detail in body. </td><td>  -  </td></tr>
     </table>
     */
    public EzsigntemplatepackagesignerEditObjectV1Response ezsigntemplatepackagesignerEditObjectV1(Integer pkiEzsigntemplatepackagesignerID, EzsigntemplatepackagesignerEditObjectV1Request ezsigntemplatepackagesignerEditObjectV1Request) throws ApiException {
        ApiResponse<EzsigntemplatepackagesignerEditObjectV1Response> localVarResp = ezsigntemplatepackagesignerEditObjectV1WithHttpInfo(pkiEzsigntemplatepackagesignerID, ezsigntemplatepackagesignerEditObjectV1Request);
        return localVarResp.getData();
    }

    /**
     * Edit an existing Ezsigntemplatepackagesigner
     * 
     * @param pkiEzsigntemplatepackagesignerID  (required)
     * @param ezsigntemplatepackagesignerEditObjectV1Request  (required)
     * @return ApiResponse&lt;EzsigntemplatepackagesignerEditObjectV1Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The element you are trying to work on does not exist </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> The syntax of the request is valid but the request cannot be completed. Look for detail in body. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<EzsigntemplatepackagesignerEditObjectV1Response> ezsigntemplatepackagesignerEditObjectV1WithHttpInfo(Integer pkiEzsigntemplatepackagesignerID, EzsigntemplatepackagesignerEditObjectV1Request ezsigntemplatepackagesignerEditObjectV1Request) throws ApiException {
        okhttp3.Call localVarCall = ezsigntemplatepackagesignerEditObjectV1ValidateBeforeCall(pkiEzsigntemplatepackagesignerID, ezsigntemplatepackagesignerEditObjectV1Request, null);
        Type localVarReturnType = new TypeToken<EzsigntemplatepackagesignerEditObjectV1Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Edit an existing Ezsigntemplatepackagesigner (asynchronously)
     * 
     * @param pkiEzsigntemplatepackagesignerID  (required)
     * @param ezsigntemplatepackagesignerEditObjectV1Request  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The element you are trying to work on does not exist </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> The syntax of the request is valid but the request cannot be completed. Look for detail in body. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call ezsigntemplatepackagesignerEditObjectV1Async(Integer pkiEzsigntemplatepackagesignerID, EzsigntemplatepackagesignerEditObjectV1Request ezsigntemplatepackagesignerEditObjectV1Request, final ApiCallback<EzsigntemplatepackagesignerEditObjectV1Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = ezsigntemplatepackagesignerEditObjectV1ValidateBeforeCall(pkiEzsigntemplatepackagesignerID, ezsigntemplatepackagesignerEditObjectV1Request, _callback);
        Type localVarReturnType = new TypeToken<EzsigntemplatepackagesignerEditObjectV1Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for ezsigntemplatepackagesignerGetObjectV1
     * @param pkiEzsigntemplatepackagesignerID  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The element you are trying to work on does not exist </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call ezsigntemplatepackagesignerGetObjectV1Call(Integer pkiEzsigntemplatepackagesignerID, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/1/object/ezsigntemplatepackagesigner/{pkiEzsigntemplatepackagesignerID}"
            .replaceAll("\\{" + "pkiEzsigntemplatepackagesignerID" + "\\}", localVarApiClient.escapeString(pkiEzsigntemplatepackagesignerID.toString()));

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
    private okhttp3.Call ezsigntemplatepackagesignerGetObjectV1ValidateBeforeCall(Integer pkiEzsigntemplatepackagesignerID, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'pkiEzsigntemplatepackagesignerID' is set
        if (pkiEzsigntemplatepackagesignerID == null) {
            throw new ApiException("Missing the required parameter 'pkiEzsigntemplatepackagesignerID' when calling ezsigntemplatepackagesignerGetObjectV1(Async)");
        }
        

        okhttp3.Call localVarCall = ezsigntemplatepackagesignerGetObjectV1Call(pkiEzsigntemplatepackagesignerID, _callback);
        return localVarCall;

    }

    /**
     * Retrieve an existing Ezsigntemplatepackagesigner
     * 
     * @param pkiEzsigntemplatepackagesignerID  (required)
     * @return EzsigntemplatepackagesignerGetObjectV1Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The element you are trying to work on does not exist </td><td>  -  </td></tr>
     </table>
     */
    public EzsigntemplatepackagesignerGetObjectV1Response ezsigntemplatepackagesignerGetObjectV1(Integer pkiEzsigntemplatepackagesignerID) throws ApiException {
        ApiResponse<EzsigntemplatepackagesignerGetObjectV1Response> localVarResp = ezsigntemplatepackagesignerGetObjectV1WithHttpInfo(pkiEzsigntemplatepackagesignerID);
        return localVarResp.getData();
    }

    /**
     * Retrieve an existing Ezsigntemplatepackagesigner
     * 
     * @param pkiEzsigntemplatepackagesignerID  (required)
     * @return ApiResponse&lt;EzsigntemplatepackagesignerGetObjectV1Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The element you are trying to work on does not exist </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<EzsigntemplatepackagesignerGetObjectV1Response> ezsigntemplatepackagesignerGetObjectV1WithHttpInfo(Integer pkiEzsigntemplatepackagesignerID) throws ApiException {
        okhttp3.Call localVarCall = ezsigntemplatepackagesignerGetObjectV1ValidateBeforeCall(pkiEzsigntemplatepackagesignerID, null);
        Type localVarReturnType = new TypeToken<EzsigntemplatepackagesignerGetObjectV1Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Retrieve an existing Ezsigntemplatepackagesigner (asynchronously)
     * 
     * @param pkiEzsigntemplatepackagesignerID  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The element you are trying to work on does not exist </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call ezsigntemplatepackagesignerGetObjectV1Async(Integer pkiEzsigntemplatepackagesignerID, final ApiCallback<EzsigntemplatepackagesignerGetObjectV1Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = ezsigntemplatepackagesignerGetObjectV1ValidateBeforeCall(pkiEzsigntemplatepackagesignerID, _callback);
        Type localVarReturnType = new TypeToken<EzsigntemplatepackagesignerGetObjectV1Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}