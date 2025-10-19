# ObjectInscriptionchecklistApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**inscriptionchecklistGetAutocompleteV2**](ObjectInscriptionchecklistApi.md#inscriptionchecklistGetAutocompleteV2) | **GET** /2/object/inscriptionchecklist/getAutocomplete/{sSelector} | Retrieve Inscriptionchecklists and IDs |
| [**inscriptionchecklistGetAutocompleteV3**](ObjectInscriptionchecklistApi.md#inscriptionchecklistGetAutocompleteV3) | **GET** /3/object/inscriptionchecklist/getAutocomplete/{sSelector} | Retrieve Inscriptionchecklists and IDs |


<a id="inscriptionchecklistGetAutocompleteV2"></a>
# **inscriptionchecklistGetAutocompleteV2**
> InscriptionchecklistGetAutocompleteV2Response inscriptionchecklistGetAutocompleteV2(sSelector, fkiID, eType, eFilterActive, sQuery, acceptLanguage)

Retrieve Inscriptionchecklists and IDs

Get the list of Inscriptionchecklist to be used in a dropdown or autocomplete control.

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectInscriptionchecklistApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectInscriptionchecklistApi apiInstance = new ObjectInscriptionchecklistApi(defaultClient);
    String sSelector = "All"; // String | The type of Inscriptionchecklist to return
    String fkiID = "fkiID_example"; // String | Specify which fkiID we want to display.
    String eType = "Buyercontract"; // String | The type of Inscriptionchecklist
    String eFilterActive = "All"; // String | Specify which results we want to display.
    String sQuery = "sQuery_example"; // String | Allow to filter the returned results
    HeaderAcceptLanguage acceptLanguage = HeaderAcceptLanguage.fromValue("*"); // HeaderAcceptLanguage | 
    try {
      InscriptionchecklistGetAutocompleteV2Response result = apiInstance.inscriptionchecklistGetAutocompleteV2(sSelector, fkiID, eType, eFilterActive, sQuery, acceptLanguage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectInscriptionchecklistApi#inscriptionchecklistGetAutocompleteV2");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sSelector** | **String**| The type of Inscriptionchecklist to return | [enum: All] |
| **fkiID** | **String**| Specify which fkiID we want to display. | [optional] |
| **eType** | **String**| The type of Inscriptionchecklist | [optional] [enum: Buyercontract, Inscription, Inscriptionnotauthenticated, Inscriptiontemp, Agent, Broker, Otherincome, Rejectedoffertopurchase] |
| **eFilterActive** | **String**| Specify which results we want to display. | [optional] [default to Active] [enum: All, Active, Inactive] |
| **sQuery** | **String**| Allow to filter the returned results | [optional] |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |

### Return type

[**InscriptionchecklistGetAutocompleteV2Response**](InscriptionchecklistGetAutocompleteV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="inscriptionchecklistGetAutocompleteV3"></a>
# **inscriptionchecklistGetAutocompleteV3**
> InscriptionchecklistGetAutocompleteV3Response inscriptionchecklistGetAutocompleteV3(sSelector, fkiBuyercontractID, fkiInscriptionID, fkiInscriptionnotauthenticatedID, fkiInscriptiontempID, fkiAgentID, fkiBrokerID, fkiOtherincomeID, fkiRejectedoffertopurchaseID, eFilterActive, sQuery, acceptLanguage)

Retrieve Inscriptionchecklists and IDs

Get the list of Inscriptionchecklist to be used in a dropdown or autocomplete control.

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectInscriptionchecklistApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectInscriptionchecklistApi apiInstance = new ObjectInscriptionchecklistApi(defaultClient);
    String sSelector = "All"; // String | The type of Inscriptionchecklist to return
    String fkiBuyercontractID = "fkiBuyercontractID_example"; // String | Specify which Buyercontract we want to display.
    String fkiInscriptionID = "fkiInscriptionID_example"; // String | Specify which Inscription we want to display.
    String fkiInscriptionnotauthenticatedID = "fkiInscriptionnotauthenticatedID_example"; // String | Specify which Inscriptionnotauthenticated we want to display.
    String fkiInscriptiontempID = "fkiInscriptiontempID_example"; // String | Specify which Inscriptiontemp we want to display.
    String fkiAgentID = "fkiAgentID_example"; // String | Specify which Agent we want to display.
    String fkiBrokerID = "fkiBrokerID_example"; // String | Specify which Broker we want to display.
    String fkiOtherincomeID = "fkiOtherincomeID_example"; // String | Specify which Otherincome we want to display.
    String fkiRejectedoffertopurchaseID = "fkiRejectedoffertopurchaseID_example"; // String | Specify which Rejectedoffertopurchase we want to display.
    String eFilterActive = "All"; // String | Specify which results we want to display.
    String sQuery = "sQuery_example"; // String | Allow to filter the returned results
    HeaderAcceptLanguage acceptLanguage = HeaderAcceptLanguage.fromValue("*"); // HeaderAcceptLanguage | 
    try {
      InscriptionchecklistGetAutocompleteV3Response result = apiInstance.inscriptionchecklistGetAutocompleteV3(sSelector, fkiBuyercontractID, fkiInscriptionID, fkiInscriptionnotauthenticatedID, fkiInscriptiontempID, fkiAgentID, fkiBrokerID, fkiOtherincomeID, fkiRejectedoffertopurchaseID, eFilterActive, sQuery, acceptLanguage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectInscriptionchecklistApi#inscriptionchecklistGetAutocompleteV3");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sSelector** | **String**| The type of Inscriptionchecklist to return | [enum: All] |
| **fkiBuyercontractID** | **String**| Specify which Buyercontract we want to display. | [optional] |
| **fkiInscriptionID** | **String**| Specify which Inscription we want to display. | [optional] |
| **fkiInscriptionnotauthenticatedID** | **String**| Specify which Inscriptionnotauthenticated we want to display. | [optional] |
| **fkiInscriptiontempID** | **String**| Specify which Inscriptiontemp we want to display. | [optional] |
| **fkiAgentID** | **String**| Specify which Agent we want to display. | [optional] |
| **fkiBrokerID** | **String**| Specify which Broker we want to display. | [optional] |
| **fkiOtherincomeID** | **String**| Specify which Otherincome we want to display. | [optional] |
| **fkiRejectedoffertopurchaseID** | **String**| Specify which Rejectedoffertopurchase we want to display. | [optional] |
| **eFilterActive** | **String**| Specify which results we want to display. | [optional] [default to Active] [enum: All, Active, Inactive] |
| **sQuery** | **String**| Allow to filter the returned results | [optional] |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |

### Return type

[**InscriptionchecklistGetAutocompleteV3Response**](InscriptionchecklistGetAutocompleteV3Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

