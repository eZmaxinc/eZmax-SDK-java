# ModuleSsprApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ssprRemindUsernamesV1**](ModuleSsprApi.md#ssprRemindUsernamesV1) | **POST** /1/module/sspr/remindUsernames | Remind of forgotten username(s)


<a name="ssprRemindUsernamesV1"></a>
# **ssprRemindUsernamesV1**
> ssprRemindUsernamesV1()

Remind of forgotten username(s)

This endpoint returns an email with the username(s) matching the email address provided in case of forgotten username

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ModuleSsprApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ModuleSsprApi apiInstance = new ModuleSsprApi(defaultClient);
    try {
      apiInstance.ssprRemindUsernamesV1();
    } catch (ApiException e) {
      System.err.println("Exception when calling ModuleSsprApi#ssprRemindUsernamesV1");
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

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | The request was accepted.  Do not misinterpret as \&quot;the email address has an account attached to it\&quot;. It only means an email will be sent if (and only if) an account exists for that email address. |  -  |
**403** | You are not allowed to call this function |  -  |
**404** | The element you are trying to work on does not exist |  -  |
**422** | The syntax of the request is valid but the request cannot be completed. Look for detail in body. |  -  |

