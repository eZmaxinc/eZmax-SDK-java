# ObjectVersionhistoryApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**versionhistoryGetObjectV2**](ObjectVersionhistoryApi.md#versionhistoryGetObjectV2) | **GET** /2/object/versionhistory/{pkiVersionhistoryID} | Retrieve an existing Versionhistory |


<a id="versionhistoryGetObjectV2"></a>
# **versionhistoryGetObjectV2**
> VersionhistoryGetObjectV2Response versionhistoryGetObjectV2(pkiVersionhistoryID)

Retrieve an existing Versionhistory



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectVersionhistoryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectVersionhistoryApi apiInstance = new ObjectVersionhistoryApi(defaultClient);
    Integer pkiVersionhistoryID = 56; // Integer | 
    try {
      VersionhistoryGetObjectV2Response result = apiInstance.versionhistoryGetObjectV2(pkiVersionhistoryID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectVersionhistoryApi#versionhistoryGetObjectV2");
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
| **pkiVersionhistoryID** | **Integer**|  | |

### Return type

[**VersionhistoryGetObjectV2Response**](VersionhistoryGetObjectV2Response.md)

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

