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
import com.ezmax.api.model.InscriptionnotauthenticatedGetCommunicationListV1Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ObjectInscriptionnotauthenticatedApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ObjectInscriptionnotauthenticatedApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ObjectInscriptionnotauthenticatedApi(ApiClient apiClient) {
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
     * Build call for inscriptionnotauthenticatedGetCommunicationListV1
     * @param pkiInscriptionnotauthenticatedID  (required)
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
    public okhttp3.Call inscriptionnotauthenticatedGetCommunicationListV1Call(Integer pkiInscriptionnotauthenticatedID, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/1/object/inscriptionnotauthenticated/{pkiInscriptionnotauthenticatedID}/getCommunicationList"
            .replace("{" + "pkiInscriptionnotauthenticatedID" + "}", localVarApiClient.escapeString(pkiInscriptionnotauthenticatedID.toString()));

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
    private okhttp3.Call inscriptionnotauthenticatedGetCommunicationListV1ValidateBeforeCall(Integer pkiInscriptionnotauthenticatedID, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'pkiInscriptionnotauthenticatedID' is set
        if (pkiInscriptionnotauthenticatedID == null) {
            throw new ApiException("Missing the required parameter 'pkiInscriptionnotauthenticatedID' when calling inscriptionnotauthenticatedGetCommunicationListV1(Async)");
        }

        return inscriptionnotauthenticatedGetCommunicationListV1Call(pkiInscriptionnotauthenticatedID, _callback);

    }

    /**
     * Retrieve Communication list
     * 
     * @param pkiInscriptionnotauthenticatedID  (required)
     * @return InscriptionnotauthenticatedGetCommunicationListV1Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The request failed. The element on which you were trying to work does not exists. Look for detail about the error in the body </td><td>  -  </td></tr>
     </table>
     */
    public InscriptionnotauthenticatedGetCommunicationListV1Response inscriptionnotauthenticatedGetCommunicationListV1(Integer pkiInscriptionnotauthenticatedID) throws ApiException {
        ApiResponse<InscriptionnotauthenticatedGetCommunicationListV1Response> localVarResp = inscriptionnotauthenticatedGetCommunicationListV1WithHttpInfo(pkiInscriptionnotauthenticatedID);
        return localVarResp.getData();
    }

    /**
     * Retrieve Communication list
     * 
     * @param pkiInscriptionnotauthenticatedID  (required)
     * @return ApiResponse&lt;InscriptionnotauthenticatedGetCommunicationListV1Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The request failed. The element on which you were trying to work does not exists. Look for detail about the error in the body </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<InscriptionnotauthenticatedGetCommunicationListV1Response> inscriptionnotauthenticatedGetCommunicationListV1WithHttpInfo(Integer pkiInscriptionnotauthenticatedID) throws ApiException {
        okhttp3.Call localVarCall = inscriptionnotauthenticatedGetCommunicationListV1ValidateBeforeCall(pkiInscriptionnotauthenticatedID, null);
        Type localVarReturnType = new TypeToken<InscriptionnotauthenticatedGetCommunicationListV1Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Retrieve Communication list (asynchronously)
     * 
     * @param pkiInscriptionnotauthenticatedID  (required)
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
    public okhttp3.Call inscriptionnotauthenticatedGetCommunicationListV1Async(Integer pkiInscriptionnotauthenticatedID, final ApiCallback<InscriptionnotauthenticatedGetCommunicationListV1Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = inscriptionnotauthenticatedGetCommunicationListV1ValidateBeforeCall(pkiInscriptionnotauthenticatedID, _callback);
        Type localVarReturnType = new TypeToken<InscriptionnotauthenticatedGetCommunicationListV1Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}