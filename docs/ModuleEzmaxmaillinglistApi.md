# ModuleEzmaxmaillinglistApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**ezmaxmaillinglistSubscribeV1**](ModuleEzmaxmaillinglistApi.md#ezmaxmaillinglistSubscribeV1) | **POST** /1/module/ezmaxmaillinglist/subscribe | Subscribe to specific Ezmaxmaillinglist |


<a id="ezmaxmaillinglistSubscribeV1"></a>
# **ezmaxmaillinglistSubscribeV1**
> EzmaxmaillinglistSubscribeV1Response ezmaxmaillinglistSubscribeV1(ezmaxmaillinglistSubscribeV1Request)

Subscribe to specific Ezmaxmaillinglist

Users can subscribe to specific Ezmaxmaillinglist

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ModuleEzmaxmaillinglistApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ModuleEzmaxmaillinglistApi apiInstance = new ModuleEzmaxmaillinglistApi(defaultClient);
    EzmaxmaillinglistSubscribeV1Request ezmaxmaillinglistSubscribeV1Request = new EzmaxmaillinglistSubscribeV1Request(); // EzmaxmaillinglistSubscribeV1Request | 
    try {
      EzmaxmaillinglistSubscribeV1Response result = apiInstance.ezmaxmaillinglistSubscribeV1(ezmaxmaillinglistSubscribeV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModuleEzmaxmaillinglistApi#ezmaxmaillinglistSubscribeV1");
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
| **ezmaxmaillinglistSubscribeV1Request** | [**EzmaxmaillinglistSubscribeV1Request**](EzmaxmaillinglistSubscribeV1Request.md)|  | |

### Return type

[**EzmaxmaillinglistSubscribeV1Response**](EzmaxmaillinglistSubscribeV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **404** | The request failed. The element on which you were trying to work does not exists. Look for detail about the error in the body |  -  |

