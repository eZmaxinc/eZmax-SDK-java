# ObjectEzsignfoldertypeApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**ezsignfoldertypeCreateObjectV3**](ObjectEzsignfoldertypeApi.md#ezsignfoldertypeCreateObjectV3) | **POST** /3/object/ezsignfoldertype | Create a new Ezsignfoldertype |
| [**ezsignfoldertypeEditObjectV3**](ObjectEzsignfoldertypeApi.md#ezsignfoldertypeEditObjectV3) | **PUT** /3/object/ezsignfoldertype/{pkiEzsignfoldertypeID} | Edit an existing Ezsignfoldertype |
| [**ezsignfoldertypeGetAutocompleteV2**](ObjectEzsignfoldertypeApi.md#ezsignfoldertypeGetAutocompleteV2) | **GET** /2/object/ezsignfoldertype/getAutocomplete/{sSelector} | Retrieve Ezsignfoldertypes and IDs |
| [**ezsignfoldertypeGetListV1**](ObjectEzsignfoldertypeApi.md#ezsignfoldertypeGetListV1) | **GET** /1/object/ezsignfoldertype/getList | Retrieve Ezsignfoldertype list |
| [**ezsignfoldertypeGetObjectV2**](ObjectEzsignfoldertypeApi.md#ezsignfoldertypeGetObjectV2) | **GET** /2/object/ezsignfoldertype/{pkiEzsignfoldertypeID} | Retrieve an existing Ezsignfoldertype |
| [**ezsignfoldertypeGetObjectV4**](ObjectEzsignfoldertypeApi.md#ezsignfoldertypeGetObjectV4) | **GET** /4/object/ezsignfoldertype/{pkiEzsignfoldertypeID} | Retrieve an existing Ezsignfoldertype |


<a id="ezsignfoldertypeCreateObjectV3"></a>
# **ezsignfoldertypeCreateObjectV3**
> EzsignfoldertypeCreateObjectV3Response ezsignfoldertypeCreateObjectV3(ezsignfoldertypeCreateObjectV3Request)

Create a new Ezsignfoldertype

The endpoint allows to create one or many elements at once.

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsignfoldertypeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsignfoldertypeApi apiInstance = new ObjectEzsignfoldertypeApi(defaultClient);
    EzsignfoldertypeCreateObjectV3Request ezsignfoldertypeCreateObjectV3Request = new EzsignfoldertypeCreateObjectV3Request(); // EzsignfoldertypeCreateObjectV3Request | 
    try {
      EzsignfoldertypeCreateObjectV3Response result = apiInstance.ezsignfoldertypeCreateObjectV3(ezsignfoldertypeCreateObjectV3Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsignfoldertypeApi#ezsignfoldertypeCreateObjectV3");
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
| **ezsignfoldertypeCreateObjectV3Request** | [**EzsignfoldertypeCreateObjectV3Request**](EzsignfoldertypeCreateObjectV3Request.md)|  | |

### Return type

[**EzsignfoldertypeCreateObjectV3Response**](EzsignfoldertypeCreateObjectV3Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful response |  -  |

<a id="ezsignfoldertypeEditObjectV3"></a>
# **ezsignfoldertypeEditObjectV3**
> EzsignfoldertypeEditObjectV3Response ezsignfoldertypeEditObjectV3(pkiEzsignfoldertypeID, ezsignfoldertypeEditObjectV3Request)

Edit an existing Ezsignfoldertype



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsignfoldertypeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsignfoldertypeApi apiInstance = new ObjectEzsignfoldertypeApi(defaultClient);
    Integer pkiEzsignfoldertypeID = 56; // Integer | 
    EzsignfoldertypeEditObjectV3Request ezsignfoldertypeEditObjectV3Request = new EzsignfoldertypeEditObjectV3Request(); // EzsignfoldertypeEditObjectV3Request | 
    try {
      EzsignfoldertypeEditObjectV3Response result = apiInstance.ezsignfoldertypeEditObjectV3(pkiEzsignfoldertypeID, ezsignfoldertypeEditObjectV3Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsignfoldertypeApi#ezsignfoldertypeEditObjectV3");
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
| **pkiEzsignfoldertypeID** | **Integer**|  | |
| **ezsignfoldertypeEditObjectV3Request** | [**EzsignfoldertypeEditObjectV3Request**](EzsignfoldertypeEditObjectV3Request.md)|  | |

### Return type

[**EzsignfoldertypeEditObjectV3Response**](EzsignfoldertypeEditObjectV3Response.md)

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

<a id="ezsignfoldertypeGetAutocompleteV2"></a>
# **ezsignfoldertypeGetAutocompleteV2**
> EzsignfoldertypeGetAutocompleteV2Response ezsignfoldertypeGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)

Retrieve Ezsignfoldertypes and IDs

Get the list of Ezsignfoldertype to be used in a dropdown or autocomplete control.

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsignfoldertypeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsignfoldertypeApi apiInstance = new ObjectEzsignfoldertypeApi(defaultClient);
    String sSelector = "Active"; // String | The type of Ezsignfoldertypes to return
    String eFilterActive = "All"; // String | Specify which results we want to display.
    String sQuery = "sQuery_example"; // String | Allow to filter the returned results
    HeaderAcceptLanguage acceptLanguage = HeaderAcceptLanguage.fromValue("*"); // HeaderAcceptLanguage | 
    try {
      EzsignfoldertypeGetAutocompleteV2Response result = apiInstance.ezsignfoldertypeGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsignfoldertypeApi#ezsignfoldertypeGetAutocompleteV2");
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
| **sSelector** | **String**| The type of Ezsignfoldertypes to return | [enum: Active, All, EzsigntemplateEdit, EzsigntemplateUsergroup] |
| **eFilterActive** | **String**| Specify which results we want to display. | [optional] [default to Active] [enum: All, Active, Inactive] |
| **sQuery** | **String**| Allow to filter the returned results | [optional] |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |

### Return type

[**EzsignfoldertypeGetAutocompleteV2Response**](EzsignfoldertypeGetAutocompleteV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="ezsignfoldertypeGetListV1"></a>
# **ezsignfoldertypeGetListV1**
> EzsignfoldertypeGetListV1Response ezsignfoldertypeGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Ezsignfoldertype list

Enum values that can be filtered in query parameter *sFilter*:  | Variable | Valid values | |---|---| | eEzsignfoldertypePrivacylevel | User&lt;br&gt;Usergroup |

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsignfoldertypeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsignfoldertypeApi apiInstance = new ObjectEzsignfoldertypeApi(defaultClient);
    String eOrderBy = "pkiEzsignfoldertypeID_ASC"; // String | Specify how you want the results to be sorted
    Integer iRowMax = 56; // Integer | 
    Integer iRowOffset = 0; // Integer | 
    HeaderAcceptLanguage acceptLanguage = HeaderAcceptLanguage.fromValue("*"); // HeaderAcceptLanguage | 
    String sFilter = "sFilter_example"; // String | 
    try {
      EzsignfoldertypeGetListV1Response result = apiInstance.ezsignfoldertypeGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsignfoldertypeApi#ezsignfoldertypeGetListV1");
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
| **eOrderBy** | **String**| Specify how you want the results to be sorted | [optional] [enum: pkiEzsignfoldertypeID_ASC, pkiEzsignfoldertypeID_DESC, eEzsignfoldertypePrivacylevel_ASC, eEzsignfoldertypePrivacylevel_DESC, sEzsignfoldertypeNameX_ASC, sEzsignfoldertypeNameX_DESC, bEzsignfoldertypeIsactive_ASC, bEzsignfoldertypeIsactive_DESC] |
| **iRowMax** | **Integer**|  | [optional] |
| **iRowOffset** | **Integer**|  | [optional] [default to 0] |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |
| **sFilter** | **String**|  | [optional] |

### Return type

[**EzsignfoldertypeGetListV1Response**](EzsignfoldertypeGetListV1Response.md)

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

<a id="ezsignfoldertypeGetObjectV2"></a>
# **ezsignfoldertypeGetObjectV2**
> EzsignfoldertypeGetObjectV2Response ezsignfoldertypeGetObjectV2(pkiEzsignfoldertypeID)

Retrieve an existing Ezsignfoldertype



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsignfoldertypeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsignfoldertypeApi apiInstance = new ObjectEzsignfoldertypeApi(defaultClient);
    Integer pkiEzsignfoldertypeID = 56; // Integer | 
    try {
      EzsignfoldertypeGetObjectV2Response result = apiInstance.ezsignfoldertypeGetObjectV2(pkiEzsignfoldertypeID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsignfoldertypeApi#ezsignfoldertypeGetObjectV2");
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
| **pkiEzsignfoldertypeID** | **Integer**|  | |

### Return type

[**EzsignfoldertypeGetObjectV2Response**](EzsignfoldertypeGetObjectV2Response.md)

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

<a id="ezsignfoldertypeGetObjectV4"></a>
# **ezsignfoldertypeGetObjectV4**
> EzsignfoldertypeGetObjectV4Response ezsignfoldertypeGetObjectV4(pkiEzsignfoldertypeID)

Retrieve an existing Ezsignfoldertype



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsignfoldertypeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsignfoldertypeApi apiInstance = new ObjectEzsignfoldertypeApi(defaultClient);
    Integer pkiEzsignfoldertypeID = 56; // Integer | 
    try {
      EzsignfoldertypeGetObjectV4Response result = apiInstance.ezsignfoldertypeGetObjectV4(pkiEzsignfoldertypeID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsignfoldertypeApi#ezsignfoldertypeGetObjectV4");
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
| **pkiEzsignfoldertypeID** | **Integer**|  | |

### Return type

[**EzsignfoldertypeGetObjectV4Response**](EzsignfoldertypeGetObjectV4Response.md)

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

