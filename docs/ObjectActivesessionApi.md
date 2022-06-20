# ObjectActivesessionApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**activesessionGetCurrentV1**](ObjectActivesessionApi.md#activesessionGetCurrentV1) | **GET** /1/object/activesession/getCurrent | Get Current Activesession |


<a name="activesessionGetCurrentV1"></a>
# **activesessionGetCurrentV1**
> ActivesessionGetCurrentV1Response activesessionGetCurrentV1()

Get Current Activesession

Retrieve the details about the current activesession

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectActivesessionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectActivesessionApi apiInstance = new ObjectActivesessionApi(defaultClient);
    try {
      ActivesessionGetCurrentV1Response result = apiInstance.activesessionGetCurrentV1();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectActivesessionApi#activesessionGetCurrentV1");
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

[**ActivesessionGetCurrentV1Response**](ActivesessionGetCurrentV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **350** | The user must authenticate before he can continue with this request |  -  |
| **351** | The user is configured with 2FA and needs to validate its phone number before he can continue with this request |  -  |
| **352** | The user is configured with 2FA and needs to answer a Secretquestion before he can continue with this request |  -  |
| **353** | The user must accept clauses before he can continue with this request |  -  |
| **354** | The user&#39;s computer must be validated before he can continue with this request |  -  |
| **355** | The user must change its password before he can continue with this request |  -  |
| **356** | The user is not running the latest version of the native application. He must valide or update its version before he can continue with this request |  -  |

