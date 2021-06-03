# ModuleAuthenticateApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authenticateAuthenticateV2**](ModuleAuthenticateApi.md#authenticateAuthenticateV2) | **POST** /2/module/authenticate/authenticate/{eSessionType} | Authenticate a user


<a name="authenticateAuthenticateV2"></a>
# **authenticateAuthenticateV2**
> AuthenticateAuthenticateV2Response authenticateAuthenticateV2(eSessionType, authenticateAuthenticateV2Request)

Authenticate a user

This endpoint authenticates a user.

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ModuleAuthenticateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ModuleAuthenticateApi apiInstance = new ModuleAuthenticateApi(defaultClient);
    String eSessionType = "eSessionType_example"; // String | 
    AuthenticateAuthenticateV2Request authenticateAuthenticateV2Request = new AuthenticateAuthenticateV2Request(); // AuthenticateAuthenticateV2Request | 
    try {
      AuthenticateAuthenticateV2Response result = apiInstance.authenticateAuthenticateV2(eSessionType, authenticateAuthenticateV2Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModuleAuthenticateApi#authenticateAuthenticateV2");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eSessionType** | **String**|  | [enum: ezsignuser]
 **authenticateAuthenticateV2Request** | [**AuthenticateAuthenticateV2Request**](AuthenticateAuthenticateV2Request.md)|  |

### Return type

[**AuthenticateAuthenticateV2Response**](AuthenticateAuthenticateV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |
**401** | Unauthorized |  -  |

