/*
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.1
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
import com.ezmax.api.model.ListSaveListpresentationV1Request;
import com.ezmax.api.model.ListSaveListpresentationV1Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ModuleListApi {
    private ApiClient localVarApiClient;

    public ModuleListApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ModuleListApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for listListpresentationV1
     * @param sListName The list Name (required)
     * @param listSaveListpresentationV1Request  (required)
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
    public okhttp3.Call listListpresentationV1Call(String sListName, ListSaveListpresentationV1Request listSaveListpresentationV1Request, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = listSaveListpresentationV1Request;

        // create path and map variables
        String localVarPath = "/1/module/list/listpresentation/{sListName}"
            .replaceAll("\\{" + "sListName" + "\\}", localVarApiClient.escapeString(sListName.toString()));

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
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "Authorization" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listListpresentationV1ValidateBeforeCall(String sListName, ListSaveListpresentationV1Request listSaveListpresentationV1Request, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'sListName' is set
        if (sListName == null) {
            throw new ApiException("Missing the required parameter 'sListName' when calling listListpresentationV1(Async)");
        }
        
        // verify the required parameter 'listSaveListpresentationV1Request' is set
        if (listSaveListpresentationV1Request == null) {
            throw new ApiException("Missing the required parameter 'listSaveListpresentationV1Request' when calling listListpresentationV1(Async)");
        }
        

        okhttp3.Call localVarCall = listListpresentationV1Call(sListName, listSaveListpresentationV1Request, _callback);
        return localVarCall;

    }

    /**
     * Save all Listpresentation for a specific list
     * Users can create many Listpresentations for lists in the system. They can customize orber by, filters, numbers of rows, etc.
     * @param sListName The list Name (required)
     * @param listSaveListpresentationV1Request  (required)
     * @return ListSaveListpresentationV1Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The element you are trying to work on does not exist </td><td>  -  </td></tr>
     </table>
     */
    public ListSaveListpresentationV1Response listListpresentationV1(String sListName, ListSaveListpresentationV1Request listSaveListpresentationV1Request) throws ApiException {
        ApiResponse<ListSaveListpresentationV1Response> localVarResp = listListpresentationV1WithHttpInfo(sListName, listSaveListpresentationV1Request);
        return localVarResp.getData();
    }

    /**
     * Save all Listpresentation for a specific list
     * Users can create many Listpresentations for lists in the system. They can customize orber by, filters, numbers of rows, etc.
     * @param sListName The list Name (required)
     * @param listSaveListpresentationV1Request  (required)
     * @return ApiResponse&lt;ListSaveListpresentationV1Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The element you are trying to work on does not exist </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ListSaveListpresentationV1Response> listListpresentationV1WithHttpInfo(String sListName, ListSaveListpresentationV1Request listSaveListpresentationV1Request) throws ApiException {
        okhttp3.Call localVarCall = listListpresentationV1ValidateBeforeCall(sListName, listSaveListpresentationV1Request, null);
        Type localVarReturnType = new TypeToken<ListSaveListpresentationV1Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Save all Listpresentation for a specific list (asynchronously)
     * Users can create many Listpresentations for lists in the system. They can customize orber by, filters, numbers of rows, etc.
     * @param sListName The list Name (required)
     * @param listSaveListpresentationV1Request  (required)
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
    public okhttp3.Call listListpresentationV1Async(String sListName, ListSaveListpresentationV1Request listSaveListpresentationV1Request, final ApiCallback<ListSaveListpresentationV1Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = listListpresentationV1ValidateBeforeCall(sListName, listSaveListpresentationV1Request, _callback);
        Type localVarReturnType = new TypeToken<ListSaveListpresentationV1Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}