# ModuleUserApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**userCreateEzsignuserV1**](ModuleUserApi.md#userCreateEzsignuserV1) | **POST** /1/module/user/createezsignuser | Create a new User of type Ezsignuser |


<a id="userCreateEzsignuserV1"></a>
# **userCreateEzsignuserV1**
> UserCreateEzsignuserV1Response userCreateEzsignuserV1(userCreateEzsignuserV1Request)

Create a new User of type Ezsignuser

The endpoint allows to initiate the creation or a user of type Ezsignuser.  The user will be created only once the email verification process will be completed

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ModuleUserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ModuleUserApi apiInstance = new ModuleUserApi(defaultClient);
    List<UserCreateEzsignuserV1Request> userCreateEzsignuserV1Request = Arrays.asList(); // List<UserCreateEzsignuserV1Request> | 
    try {
      UserCreateEzsignuserV1Response result = apiInstance.userCreateEzsignuserV1(userCreateEzsignuserV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModuleUserApi#userCreateEzsignuserV1");
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
| **userCreateEzsignuserV1Request** | [**List&lt;UserCreateEzsignuserV1Request&gt;**](UserCreateEzsignuserV1Request.md)|  | |

### Return type

[**UserCreateEzsignuserV1Response**](UserCreateEzsignuserV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

