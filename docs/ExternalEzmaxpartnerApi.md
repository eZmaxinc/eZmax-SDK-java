# ExternalEzmaxpartnerApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**externalpartnerSubscribeV1**](ExternalEzmaxpartnerApi.md#externalpartnerSubscribeV1) | **POST** /1/external/ezmaxpartner/subscribe | Subscribe to an Ezmaxparnerproductstage |


<a id="externalpartnerSubscribeV1"></a>
# **externalpartnerSubscribeV1**
> DocumentationSubscribeV1Response externalpartnerSubscribeV1(documentationSubscribeV1Request)

Subscribe to an Ezmaxparnerproductstage

Subscribe to an Ezmaxparnerproductstage

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ExternalEzmaxpartnerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ExternalEzmaxpartnerApi apiInstance = new ExternalEzmaxpartnerApi(defaultClient);
    DocumentationSubscribeV1Request documentationSubscribeV1Request = new DocumentationSubscribeV1Request(); // DocumentationSubscribeV1Request | 
    try {
      DocumentationSubscribeV1Response result = apiInstance.externalpartnerSubscribeV1(documentationSubscribeV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalEzmaxpartnerApi#externalpartnerSubscribeV1");
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
| **documentationSubscribeV1Request** | [**DocumentationSubscribeV1Request**](DocumentationSubscribeV1Request.md)|  | |

### Return type

[**DocumentationSubscribeV1Response**](DocumentationSubscribeV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

