# ObjectAuthenticationexternalApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**authenticationexternalCreateObjectV1**](ObjectAuthenticationexternalApi.md#authenticationexternalCreateObjectV1) | **POST** /1/object/authenticationexternal | Create a new Authenticationexternal |
| [**authenticationexternalDeleteObjectV1**](ObjectAuthenticationexternalApi.md#authenticationexternalDeleteObjectV1) | **DELETE** /1/object/authenticationexternal/{pkiAuthenticationexternalID} | Delete an existing Authenticationexternal |
| [**authenticationexternalEditObjectV1**](ObjectAuthenticationexternalApi.md#authenticationexternalEditObjectV1) | **PUT** /1/object/authenticationexternal/{pkiAuthenticationexternalID} | Edit an existing Authenticationexternal |
| [**authenticationexternalGetAutocompleteV2**](ObjectAuthenticationexternalApi.md#authenticationexternalGetAutocompleteV2) | **GET** /2/object/authenticationexternal/getAutocomplete/{sSelector} | Retrieve Authenticationexternals and IDs |
| [**authenticationexternalGetListV1**](ObjectAuthenticationexternalApi.md#authenticationexternalGetListV1) | **GET** /1/object/authenticationexternal/getList | Retrieve Authenticationexternal list |
| [**authenticationexternalGetObjectV2**](ObjectAuthenticationexternalApi.md#authenticationexternalGetObjectV2) | **GET** /2/object/authenticationexternal/{pkiAuthenticationexternalID} | Retrieve an existing Authenticationexternal |
| [**authenticationexternalResetAuthorizationV1**](ObjectAuthenticationexternalApi.md#authenticationexternalResetAuthorizationV1) | **POST** /1/object/authenticationexternal/{pkiAuthenticationexternalID}/resetAuthorization | Reset the Authenticationexternal authorization |


<a id="authenticationexternalCreateObjectV1"></a>
# **authenticationexternalCreateObjectV1**
> AuthenticationexternalCreateObjectV1Response authenticationexternalCreateObjectV1(authenticationexternalCreateObjectV1Request)

Create a new Authenticationexternal

The endpoint allows to create one or many elements at once.

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectAuthenticationexternalApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectAuthenticationexternalApi apiInstance = new ObjectAuthenticationexternalApi(defaultClient);
    AuthenticationexternalCreateObjectV1Request authenticationexternalCreateObjectV1Request = new AuthenticationexternalCreateObjectV1Request(); // AuthenticationexternalCreateObjectV1Request | 
    try {
      AuthenticationexternalCreateObjectV1Response result = apiInstance.authenticationexternalCreateObjectV1(authenticationexternalCreateObjectV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectAuthenticationexternalApi#authenticationexternalCreateObjectV1");
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
| **authenticationexternalCreateObjectV1Request** | [**AuthenticationexternalCreateObjectV1Request**](AuthenticationexternalCreateObjectV1Request.md)|  | |

### Return type

[**AuthenticationexternalCreateObjectV1Response**](AuthenticationexternalCreateObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful response |  -  |

<a id="authenticationexternalDeleteObjectV1"></a>
# **authenticationexternalDeleteObjectV1**
> CommonResponse authenticationexternalDeleteObjectV1(pkiAuthenticationexternalID)

Delete an existing Authenticationexternal



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectAuthenticationexternalApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectAuthenticationexternalApi apiInstance = new ObjectAuthenticationexternalApi(defaultClient);
    Integer pkiAuthenticationexternalID = 56; // Integer | The unique ID of the Authenticationexternal
    try {
      CommonResponse result = apiInstance.authenticationexternalDeleteObjectV1(pkiAuthenticationexternalID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectAuthenticationexternalApi#authenticationexternalDeleteObjectV1");
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
| **pkiAuthenticationexternalID** | **Integer**| The unique ID of the Authenticationexternal | |

### Return type

[**CommonResponse**](CommonResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **404** | The request failed. The element on which you were trying to work does not exists. Look for detail about the error in the body |  -  |

<a id="authenticationexternalEditObjectV1"></a>
# **authenticationexternalEditObjectV1**
> CommonResponse authenticationexternalEditObjectV1(pkiAuthenticationexternalID, authenticationexternalEditObjectV1Request)

Edit an existing Authenticationexternal



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectAuthenticationexternalApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectAuthenticationexternalApi apiInstance = new ObjectAuthenticationexternalApi(defaultClient);
    Integer pkiAuthenticationexternalID = 56; // Integer | The unique ID of the Authenticationexternal
    AuthenticationexternalEditObjectV1Request authenticationexternalEditObjectV1Request = new AuthenticationexternalEditObjectV1Request(); // AuthenticationexternalEditObjectV1Request | 
    try {
      CommonResponse result = apiInstance.authenticationexternalEditObjectV1(pkiAuthenticationexternalID, authenticationexternalEditObjectV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectAuthenticationexternalApi#authenticationexternalEditObjectV1");
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
| **pkiAuthenticationexternalID** | **Integer**| The unique ID of the Authenticationexternal | |
| **authenticationexternalEditObjectV1Request** | [**AuthenticationexternalEditObjectV1Request**](AuthenticationexternalEditObjectV1Request.md)|  | |

### Return type

[**CommonResponse**](CommonResponse.md)

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
| **422** | The request was syntactically valid but failed because of an interdependance condition. Look for detail about the error in the body |  -  |

<a id="authenticationexternalGetAutocompleteV2"></a>
# **authenticationexternalGetAutocompleteV2**
> AuthenticationexternalGetAutocompleteV2Response authenticationexternalGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)

Retrieve Authenticationexternals and IDs

Get the list of Authenticationexternal to be used in a dropdown or autocomplete control.

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectAuthenticationexternalApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectAuthenticationexternalApi apiInstance = new ObjectAuthenticationexternalApi(defaultClient);
    String sSelector = "All"; // String | The type of Authenticationexternals to return
    String eFilterActive = "All"; // String | Specify which results we want to display.
    String sQuery = "sQuery_example"; // String | Allow to filter the returned results
    HeaderAcceptLanguage acceptLanguage = HeaderAcceptLanguage.fromValue("*"); // HeaderAcceptLanguage | 
    try {
      AuthenticationexternalGetAutocompleteV2Response result = apiInstance.authenticationexternalGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectAuthenticationexternalApi#authenticationexternalGetAutocompleteV2");
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
| **sSelector** | **String**| The type of Authenticationexternals to return | [enum: All] |
| **eFilterActive** | **String**| Specify which results we want to display. | [optional] [default to Active] [enum: All, Active, Inactive] |
| **sQuery** | **String**| Allow to filter the returned results | [optional] |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |

### Return type

[**AuthenticationexternalGetAutocompleteV2Response**](AuthenticationexternalGetAutocompleteV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="authenticationexternalGetListV1"></a>
# **authenticationexternalGetListV1**
> AuthenticationexternalGetListV1Response authenticationexternalGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Authenticationexternal list

Enum values that can be filtered in query parameter *sFilter*:  | Variable | Valid values | |---|---| | eAuthenticationexternalType | Salesforce&lt;br&gt;SalesforceSandbox |

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectAuthenticationexternalApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectAuthenticationexternalApi apiInstance = new ObjectAuthenticationexternalApi(defaultClient);
    String eOrderBy = "pkiAuthenticationexternalID_ASC"; // String | Specify how you want the results to be sorted
    Integer iRowMax = 56; // Integer | 
    Integer iRowOffset = 0; // Integer | 
    HeaderAcceptLanguage acceptLanguage = HeaderAcceptLanguage.fromValue("*"); // HeaderAcceptLanguage | 
    String sFilter = "sFilter_example"; // String | 
    try {
      AuthenticationexternalGetListV1Response result = apiInstance.authenticationexternalGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectAuthenticationexternalApi#authenticationexternalGetListV1");
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
| **eOrderBy** | **String**| Specify how you want the results to be sorted | [optional] [enum: pkiAuthenticationexternalID_ASC, pkiAuthenticationexternalID_DESC, sAuthenticationexternalDescription_ASC, sAuthenticationexternalDescription_DESC, eAuthenticationexternalType_ASC, eAuthenticationexternalType_DESC] |
| **iRowMax** | **Integer**|  | [optional] |
| **iRowOffset** | **Integer**|  | [optional] [default to 0] |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |
| **sFilter** | **String**|  | [optional] |

### Return type

[**AuthenticationexternalGetListV1Response**](AuthenticationexternalGetListV1Response.md)

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

<a id="authenticationexternalGetObjectV2"></a>
# **authenticationexternalGetObjectV2**
> AuthenticationexternalGetObjectV2Response authenticationexternalGetObjectV2(pkiAuthenticationexternalID)

Retrieve an existing Authenticationexternal



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectAuthenticationexternalApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectAuthenticationexternalApi apiInstance = new ObjectAuthenticationexternalApi(defaultClient);
    Integer pkiAuthenticationexternalID = 56; // Integer | The unique ID of the Authenticationexternal
    try {
      AuthenticationexternalGetObjectV2Response result = apiInstance.authenticationexternalGetObjectV2(pkiAuthenticationexternalID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectAuthenticationexternalApi#authenticationexternalGetObjectV2");
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
| **pkiAuthenticationexternalID** | **Integer**| The unique ID of the Authenticationexternal | |

### Return type

[**AuthenticationexternalGetObjectV2Response**](AuthenticationexternalGetObjectV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **404** | The request failed. The element on which you were trying to work does not exists. Look for detail about the error in the body |  -  |

<a id="authenticationexternalResetAuthorizationV1"></a>
# **authenticationexternalResetAuthorizationV1**
> CommonResponse authenticationexternalResetAuthorizationV1(pkiAuthenticationexternalID, body)

Reset the Authenticationexternal authorization



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectAuthenticationexternalApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectAuthenticationexternalApi apiInstance = new ObjectAuthenticationexternalApi(defaultClient);
    Integer pkiAuthenticationexternalID = 56; // Integer | 
    Object body = null; // Object | 
    try {
      CommonResponse result = apiInstance.authenticationexternalResetAuthorizationV1(pkiAuthenticationexternalID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectAuthenticationexternalApi#authenticationexternalResetAuthorizationV1");
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
| **pkiAuthenticationexternalID** | **Integer**|  | |
| **body** | **Object**|  | |

### Return type

[**CommonResponse**](CommonResponse.md)

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

