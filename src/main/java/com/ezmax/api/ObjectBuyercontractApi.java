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


import com.ezmax.api.model.BuyercontractGetCommunicationListV1Response;
import com.ezmax.api.model.CommonResponseError;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ObjectBuyercontractApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ObjectBuyercontractApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ObjectBuyercontractApi(ApiClient apiClient) {
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
     * Build call for buyercontractGetCommunicationListV1
     * @param pkiBuyercontractID  (required)
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
    public okhttp3.Call buyercontractGetCommunicationListV1Call(Integer pkiBuyercontractID, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/1/object/buyercontract/{pkiBuyercontractID}/getCommunicationList"
            .replace("{" + "pkiBuyercontractID" + "}", localVarApiClient.escapeString(pkiBuyercontractID.toString()));

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
    private okhttp3.Call buyercontractGetCommunicationListV1ValidateBeforeCall(Integer pkiBuyercontractID, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'pkiBuyercontractID' is set
        if (pkiBuyercontractID == null) {
            throw new ApiException("Missing the required parameter 'pkiBuyercontractID' when calling buyercontractGetCommunicationListV1(Async)");
        }

        return buyercontractGetCommunicationListV1Call(pkiBuyercontractID, _callback);

    }

    /**
     * Retrieve Communication list
     * 
     * @param pkiBuyercontractID  (required)
     * @return BuyercontractGetCommunicationListV1Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The request failed. The element on which you were trying to work does not exists. Look for detail about the error in the body </td><td>  -  </td></tr>
     </table>
     */
    public BuyercontractGetCommunicationListV1Response buyercontractGetCommunicationListV1(Integer pkiBuyercontractID) throws ApiException {
        ApiResponse<BuyercontractGetCommunicationListV1Response> localVarResp = buyercontractGetCommunicationListV1WithHttpInfo(pkiBuyercontractID);
        return localVarResp.getData();
    }

    /**
     * Retrieve Communication list
     * 
     * @param pkiBuyercontractID  (required)
     * @return ApiResponse&lt;BuyercontractGetCommunicationListV1Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The request failed. The element on which you were trying to work does not exists. Look for detail about the error in the body </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<BuyercontractGetCommunicationListV1Response> buyercontractGetCommunicationListV1WithHttpInfo(Integer pkiBuyercontractID) throws ApiException {
        okhttp3.Call localVarCall = buyercontractGetCommunicationListV1ValidateBeforeCall(pkiBuyercontractID, null);
        Type localVarReturnType = new TypeToken<BuyercontractGetCommunicationListV1Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Retrieve Communication list (asynchronously)
     * 
     * @param pkiBuyercontractID  (required)
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
    public okhttp3.Call buyercontractGetCommunicationListV1Async(Integer pkiBuyercontractID, final ApiCallback<BuyercontractGetCommunicationListV1Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = buyercontractGetCommunicationListV1ValidateBeforeCall(pkiBuyercontractID, _callback);
        Type localVarReturnType = new TypeToken<BuyercontractGetCommunicationListV1Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}