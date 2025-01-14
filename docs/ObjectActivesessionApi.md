# ObjectActivesessionApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**activesessionGenerateFederationTokenV1**](ObjectActivesessionApi.md#activesessionGenerateFederationTokenV1) | **POST** /1/object/activesession/generateFederationToken | Generate a federation token |
| [**activesessionGetCurrentV1**](ObjectActivesessionApi.md#activesessionGetCurrentV1) | **GET** /1/object/activesession/getCurrent | Get Current Activesession |
| [**activesessionGetListV1**](ObjectActivesessionApi.md#activesessionGetListV1) | **GET** /1/object/activesession/getList | Retrieve Activesession list |


<a id="activesessionGenerateFederationTokenV1"></a>
# **activesessionGenerateFederationTokenV1**
> ActivesessionGenerateFederationTokenV1Response activesessionGenerateFederationTokenV1(activesessionGenerateFederationTokenV1Request)

Generate a federation token



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
    ActivesessionGenerateFederationTokenV1Request activesessionGenerateFederationTokenV1Request = new ActivesessionGenerateFederationTokenV1Request(); // ActivesessionGenerateFederationTokenV1Request | 
    try {
      ActivesessionGenerateFederationTokenV1Response result = apiInstance.activesessionGenerateFederationTokenV1(activesessionGenerateFederationTokenV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectActivesessionApi#activesessionGenerateFederationTokenV1");
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
| **activesessionGenerateFederationTokenV1Request** | [**ActivesessionGenerateFederationTokenV1Request**](ActivesessionGenerateFederationTokenV1Request.md)|  | |

### Return type

[**ActivesessionGenerateFederationTokenV1Response**](ActivesessionGenerateFederationTokenV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **422** | The request was syntactically valid but failed because of an interdependance condition. Look for detail about the error in the body |  -  |

<a id="activesessionGetCurrentV1"></a>
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

<a id="activesessionGetListV1"></a>
# **activesessionGetListV1**
> ActivesessionGetListV1Response activesessionGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Activesession list

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
    String eOrderBy = "pkiActivesessionID_ASC"; // String | Specify how you want the results to be sorted
    Integer iRowMax = 56; // Integer | 
    Integer iRowOffset = 0; // Integer | 
    HeaderAcceptLanguage acceptLanguage = HeaderAcceptLanguage.fromValue("*"); // HeaderAcceptLanguage | 
    String sFilter = "sFilter_example"; // String | 
    try {
      ActivesessionGetListV1Response result = apiInstance.activesessionGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectActivesessionApi#activesessionGetListV1");
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
| **eOrderBy** | **String**| Specify how you want the results to be sorted | [optional] [enum: pkiActivesessionID_ASC, pkiActivesessionID_DESC, fkiUserID_ASC, fkiUserID_DESC, fkiComputerID_ASC, fkiComputerID_DESC, fkiCompanyID_ASC, fkiCompanyID_DESC, fkiDepartmentID_ASC, fkiDepartmentID_DESC, sCompanyNameX_ASC, sCompanyNameX_DESC, sDepartmentNameX_ASC, sDepartmentNameX_DESC, sActivesessionLoginname_ASC, sActivesessionLoginname_DESC, sComputerDescription_ASC, sComputerDescription_DESC, dtActivesessionFirsthit_ASC, dtActivesessionFirsthit_DESC, dtActivesessionLasthit_ASC, dtActivesessionLasthit_DESC, sActivesessionIP_ASC, sActivesessionIP_DESC] |
| **iRowMax** | **Integer**|  | [optional] |
| **iRowOffset** | **Integer**|  | [optional] [default to 0] |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |
| **sFilter** | **String**|  | [optional] |

### Return type

[**ActivesessionGetListV1Response**](ActivesessionGetListV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/vnd.openxmlformats-officedocument.spreadsheetml.sheet

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **406** | The URL is valid, but one of the Accept header is not defined or invalid. For example, you set the header \&quot;Accept: application/json\&quot; but the function can only return \&quot;Content-type: image/png\&quot; |  -  |

