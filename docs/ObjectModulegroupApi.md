# ObjectModulegroupApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**modulegroupGetAllV1**](ObjectModulegroupApi.md#modulegroupGetAllV1) | **GET** /1/object/modulegroup/getAll/{eContext} | Retrieve all Modulegroups |


<a id="modulegroupGetAllV1"></a>
# **modulegroupGetAllV1**
> ModulegroupGetAllV1Response modulegroupGetAllV1(eContext)

Retrieve all Modulegroups

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectModulegroupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectModulegroupApi apiInstance = new ObjectModulegroupApi(defaultClient);
    String eContext = "Api"; // String | The context of the Modulegroup
    try {
      ModulegroupGetAllV1Response result = apiInstance.modulegroupGetAllV1(eContext);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectModulegroupApi#modulegroupGetAllV1");
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
| **eContext** | **String**| The context of the Modulegroup | [enum: Api, User] |

### Return type

[**ModulegroupGetAllV1Response**](ModulegroupGetAllV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

