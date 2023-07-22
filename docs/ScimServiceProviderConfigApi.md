# ScimServiceProviderConfigApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**serviceProviderConfigGetObjectScimV2**](ScimServiceProviderConfigApi.md#serviceProviderConfigGetObjectScimV2) | **GET** /2/scim/ServiceProviderConfig | Get Service Provider Configuration |


<a id="serviceProviderConfigGetObjectScimV2"></a>
# **serviceProviderConfigGetObjectScimV2**
> ScimServiceProviderConfig serviceProviderConfigGetObjectScimV2()

Get Service Provider Configuration

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.models.*;
import com.ezmax.api.ScimServiceProviderConfigApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");

    ScimServiceProviderConfigApi apiInstance = new ScimServiceProviderConfigApi(defaultClient);
    try {
      ScimServiceProviderConfig result = apiInstance.serviceProviderConfigGetObjectScimV2();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScimServiceProviderConfigApi#serviceProviderConfigGetObjectScimV2");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ScimServiceProviderConfig**](ScimServiceProviderConfig.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

