# ModuleSsprApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ssprResetPasswordRequestV1**](ModuleSsprApi.md#ssprResetPasswordRequestV1) | **POST** /1/module/sspr/resetPasswordRequest | Reset Password Request
[**ssprResetPasswordV1**](ModuleSsprApi.md#ssprResetPasswordV1) | **POST** /1/module/sspr/resetPassword | Reset Password
[**ssprSendUsernamesV1**](ModuleSsprApi.md#ssprSendUsernamesV1) | **POST** /1/module/sspr/sendUsernames | Send username(s)
[**ssprUnlockAccountRequestV1**](ModuleSsprApi.md#ssprUnlockAccountRequestV1) | **POST** /1/module/sspr/unlockAccountRequest | Unlock Account Request
[**ssprUnlockAccountV1**](ModuleSsprApi.md#ssprUnlockAccountV1) | **POST** /1/module/sspr/unlockAccount | Unlock Account
[**ssprValidateTokenV1**](ModuleSsprApi.md#ssprValidateTokenV1) | **POST** /1/module/sspr/validateToken | Validate Token


<a name="ssprResetPasswordRequestV1"></a>
# **ssprResetPasswordRequestV1**
> ssprResetPasswordRequestV1(ssprResetPasswordRequestV1Request)

Reset Password Request

This endpoint sends an email with a link to reset the user&#39;s password.  sEmailAddress must be set if eUserTypeSSPR &#x3D; EzsignUser  sUserLoginname must be set if eUserTypeSSPR &#x3D; Native

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
    SsprResetPasswordRequestV1Request ssprResetPasswordRequestV1Request = new SsprResetPasswordRequestV1Request(); // SsprResetPasswordRequestV1Request | 
    try {
      apiInstance.ssprResetPasswordRequestV1(ssprResetPasswordRequestV1Request);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModuleSsprApi#ssprResetPasswordRequestV1");
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
 **ssprResetPasswordRequestV1Request** | [**SsprResetPasswordRequestV1Request**](SsprResetPasswordRequestV1Request.md)|  |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | The request was accepted.  Do not misinterpret as \&quot;the account exists\&quot;. It only means an email will be sent if (and only if) an account exists. |  -  |
**403** | You are not allowed to call this function |  -  |
**422** | The syntax of the request is valid but the request cannot be completed. Look for detail in body. |  -  |

<a name="ssprResetPasswordV1"></a>
# **ssprResetPasswordV1**
> ssprResetPasswordV1(ssprResetPasswordV1Request)

Reset Password

This endpoint resets the user&#39;s password.  sEmailAddress must be set if eUserTypeSSPR &#x3D; EzsignUser  sUserLoginname must be set if eUserTypeSSPR &#x3D; Native

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
    SsprResetPasswordV1Request ssprResetPasswordV1Request = new SsprResetPasswordV1Request(); // SsprResetPasswordV1Request | 
    try {
      apiInstance.ssprResetPasswordV1(ssprResetPasswordV1Request);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModuleSsprApi#ssprResetPasswordV1");
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
 **ssprResetPasswordV1Request** | [**SsprResetPasswordV1Request**](SsprResetPasswordV1Request.md)|  |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | The password was reset Successfully |  -  |
**403** | You are not allowed to call this function |  -  |
**422** | The syntax of the request is valid but the request cannot be completed. Look for detail in body. |  -  |

<a name="ssprSendUsernamesV1"></a>
# **ssprSendUsernamesV1**
> ssprSendUsernamesV1(ssprSendUsernamesV1Request)

Send username(s)

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
    SsprSendUsernamesV1Request ssprSendUsernamesV1Request = new SsprSendUsernamesV1Request(); // SsprSendUsernamesV1Request | 
    try {
      apiInstance.ssprSendUsernamesV1(ssprSendUsernamesV1Request);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModuleSsprApi#ssprSendUsernamesV1");
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
 **ssprSendUsernamesV1Request** | [**SsprSendUsernamesV1Request**](SsprSendUsernamesV1Request.md)|  |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | The request was accepted.  Do not misinterpret as \&quot;the email address has an account attached to it\&quot;. It only means an email will be sent if (and only if) an account exists for that email address. |  -  |
**403** | You are not allowed to call this function |  -  |
**422** | The syntax of the request is valid but the request cannot be completed. Look for detail in body. |  -  |

<a name="ssprUnlockAccountRequestV1"></a>
# **ssprUnlockAccountRequestV1**
> ssprUnlockAccountRequestV1(ssprUnlockAccountRequestV1Request)

Unlock Account Request

This endpoint sends an email with a link to unlock the user account.  sEmailAddress must be set if eUserTypeSSPR &#x3D; EzsignUser  sUserLoginname must be set if eUserTypeSSPR &#x3D; Native

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
    SsprUnlockAccountRequestV1Request ssprUnlockAccountRequestV1Request = new SsprUnlockAccountRequestV1Request(); // SsprUnlockAccountRequestV1Request | 
    try {
      apiInstance.ssprUnlockAccountRequestV1(ssprUnlockAccountRequestV1Request);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModuleSsprApi#ssprUnlockAccountRequestV1");
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
 **ssprUnlockAccountRequestV1Request** | [**SsprUnlockAccountRequestV1Request**](SsprUnlockAccountRequestV1Request.md)|  |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | The request was accepted.  Do not misinterpret as \&quot;the account exists\&quot;. It only means an email will be sent if (and only if) an account exists. |  -  |
**403** | You are not allowed to call this function |  -  |
**422** | The syntax of the request is valid but the request cannot be completed. Look for detail in body. |  -  |

<a name="ssprUnlockAccountV1"></a>
# **ssprUnlockAccountV1**
> ssprUnlockAccountV1(ssprUnlockAccountV1Request)

Unlock Account

This endpoint unlocks the user account.  sEmailAddress must be set if eUserTypeSSPR &#x3D; EzsignUser  sUserLoginname must be set if eUserTypeSSPR &#x3D; Native

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
    SsprUnlockAccountV1Request ssprUnlockAccountV1Request = new SsprUnlockAccountV1Request(); // SsprUnlockAccountV1Request | 
    try {
      apiInstance.ssprUnlockAccountV1(ssprUnlockAccountV1Request);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModuleSsprApi#ssprUnlockAccountV1");
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
 **ssprUnlockAccountV1Request** | [**SsprUnlockAccountV1Request**](SsprUnlockAccountV1Request.md)|  |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | The account was unlocked Successfully |  -  |
**403** | You are not allowed to call this function |  -  |
**422** | The syntax of the request is valid but the request cannot be completed. Look for detail in body. |  -  |

<a name="ssprValidateTokenV1"></a>
# **ssprValidateTokenV1**
> ssprValidateTokenV1(ssprValidateTokenV1Request)

Validate Token

This endpoint validates if a Token is valid and not expired.  sEmailAddress must be set if eUserTypeSSPR &#x3D; EzsignUser  sUserLoginname must be set if eUserTypeSSPR &#x3D; Native

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
    SsprValidateTokenV1Request ssprValidateTokenV1Request = new SsprValidateTokenV1Request(); // SsprValidateTokenV1Request | 
    try {
      apiInstance.ssprValidateTokenV1(ssprValidateTokenV1Request);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModuleSsprApi#ssprValidateTokenV1");
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
 **ssprValidateTokenV1Request** | [**SsprValidateTokenV1Request**](SsprValidateTokenV1Request.md)|  |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | The token is valid |  -  |
**403** | You are not allowed to call this function |  -  |
**422** | The syntax of the request is valid but the request cannot be completed. Look for detail in body. |  -  |

