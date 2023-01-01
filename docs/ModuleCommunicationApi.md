# ModuleCommunicationApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**communicationGetCommunicationCountV1**](ModuleCommunicationApi.md#communicationGetCommunicationCountV1) | **GET** /1/module/communication/getCommunicationCount | Get the number of communication |
| [**communicationGetCommunicationListV1**](ModuleCommunicationApi.md#communicationGetCommunicationListV1) | **GET** /1/module/communication/getCommunicationList | Retrieve communication list |


<a name="communicationGetCommunicationCountV1"></a>
# **communicationGetCommunicationCountV1**
> CommunicationGetCountV1Response communicationGetCommunicationCountV1(eCommunicationModule, pkiEzsignfolderID)

Get the number of communication

Get the number of communication in specified module

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ModuleCommunicationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ModuleCommunicationApi apiInstance = new ModuleCommunicationApi(defaultClient);
    String eCommunicationModule = "Ezsignfolder"; // String | Specify the requested module
    Integer pkiEzsignfolderID = 56; // Integer | The unique ID of the Ezsignfolder
    try {
      CommunicationGetCountV1Response result = apiInstance.communicationGetCommunicationCountV1(eCommunicationModule, pkiEzsignfolderID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModuleCommunicationApi#communicationGetCommunicationCountV1");
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
| **eCommunicationModule** | **String**| Specify the requested module | [enum: Ezsignfolder] |
| **pkiEzsignfolderID** | **Integer**| The unique ID of the Ezsignfolder | [optional] |

### Return type

[**CommunicationGetCountV1Response**](CommunicationGetCountV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **404** | The request failed. The element on which you were trying to work does not exists. Look for detail about the error in the body |  -  |

<a name="communicationGetCommunicationListV1"></a>
# **communicationGetCommunicationListV1**
> CommunicationGetListV1Response communicationGetCommunicationListV1(eCommunicationModule, pkiEzsignfolderID)

Retrieve communication list

Retrieve communication list

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ModuleCommunicationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ModuleCommunicationApi apiInstance = new ModuleCommunicationApi(defaultClient);
    String eCommunicationModule = "Ezsignfolder"; // String | Specify the requested module
    Integer pkiEzsignfolderID = 56; // Integer | The unique ID of the Ezsignfolder
    try {
      CommunicationGetListV1Response result = apiInstance.communicationGetCommunicationListV1(eCommunicationModule, pkiEzsignfolderID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModuleCommunicationApi#communicationGetCommunicationListV1");
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
| **eCommunicationModule** | **String**| Specify the requested module | [enum: Ezsignfolder] |
| **pkiEzsignfolderID** | **Integer**| The unique ID of the Ezsignfolder | [optional] |

### Return type

[**CommunicationGetListV1Response**](CommunicationGetListV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **404** | The request failed. The element on which you were trying to work does not exists. Look for detail about the error in the body |  -  |

