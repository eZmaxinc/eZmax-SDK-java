# ObjectEzsigntemplatepackageApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**ezsigntemplatepackageCreateObjectV1**](ObjectEzsigntemplatepackageApi.md#ezsigntemplatepackageCreateObjectV1) | **POST** /1/object/ezsigntemplatepackage | Create a new Ezsigntemplatepackage |
| [**ezsigntemplatepackageDeleteObjectV1**](ObjectEzsigntemplatepackageApi.md#ezsigntemplatepackageDeleteObjectV1) | **DELETE** /1/object/ezsigntemplatepackage/{pkiEzsigntemplatepackageID} | Delete an existing Ezsigntemplatepackage |
| [**ezsigntemplatepackageEditEzsigntemplatepackagesignersV1**](ObjectEzsigntemplatepackageApi.md#ezsigntemplatepackageEditEzsigntemplatepackagesignersV1) | **PUT** /1/object/ezsigntemplatepackage/{pkiEzsigntemplatepackageID}/editEzsigntemplatepackagesigners | Edit multiple Ezsigntemplatepackagesigners |
| [**ezsigntemplatepackageEditObjectV1**](ObjectEzsigntemplatepackageApi.md#ezsigntemplatepackageEditObjectV1) | **PUT** /1/object/ezsigntemplatepackage/{pkiEzsigntemplatepackageID} | Edit an existing Ezsigntemplatepackage |
| [**ezsigntemplatepackageGetAutocompleteV1**](ObjectEzsigntemplatepackageApi.md#ezsigntemplatepackageGetAutocompleteV1) | **GET** /1/object/ezsigntemplatepackage/getAutocomplete/{sSelector} | Retrieve Ezsigntemplatepackages and IDs |
| [**ezsigntemplatepackageGetListV1**](ObjectEzsigntemplatepackageApi.md#ezsigntemplatepackageGetListV1) | **GET** /1/object/ezsigntemplatepackage/getList | Retrieve Ezsigntemplatepackage list |
| [**ezsigntemplatepackageGetObjectV1**](ObjectEzsigntemplatepackageApi.md#ezsigntemplatepackageGetObjectV1) | **GET** /1/object/ezsigntemplatepackage/{pkiEzsigntemplatepackageID} | Retrieve an existing Ezsigntemplatepackage |


<a name="ezsigntemplatepackageCreateObjectV1"></a>
# **ezsigntemplatepackageCreateObjectV1**
> EzsigntemplatepackageCreateObjectV1Response ezsigntemplatepackageCreateObjectV1(ezsigntemplatepackageCreateObjectV1Request)

Create a new Ezsigntemplatepackage

The endpoint allows to create one or many elements at once.

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsigntemplatepackageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsigntemplatepackageApi apiInstance = new ObjectEzsigntemplatepackageApi(defaultClient);
    EzsigntemplatepackageCreateObjectV1Request ezsigntemplatepackageCreateObjectV1Request = new EzsigntemplatepackageCreateObjectV1Request(); // EzsigntemplatepackageCreateObjectV1Request | 
    try {
      EzsigntemplatepackageCreateObjectV1Response result = apiInstance.ezsigntemplatepackageCreateObjectV1(ezsigntemplatepackageCreateObjectV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsigntemplatepackageApi#ezsigntemplatepackageCreateObjectV1");
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
| **ezsigntemplatepackageCreateObjectV1Request** | [**EzsigntemplatepackageCreateObjectV1Request**](EzsigntemplatepackageCreateObjectV1Request.md)|  | |

### Return type

[**EzsigntemplatepackageCreateObjectV1Response**](EzsigntemplatepackageCreateObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful response |  -  |

<a name="ezsigntemplatepackageDeleteObjectV1"></a>
# **ezsigntemplatepackageDeleteObjectV1**
> EzsigntemplatepackageDeleteObjectV1Response ezsigntemplatepackageDeleteObjectV1(pkiEzsigntemplatepackageID)

Delete an existing Ezsigntemplatepackage



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsigntemplatepackageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsigntemplatepackageApi apiInstance = new ObjectEzsigntemplatepackageApi(defaultClient);
    Integer pkiEzsigntemplatepackageID = 56; // Integer | 
    try {
      EzsigntemplatepackageDeleteObjectV1Response result = apiInstance.ezsigntemplatepackageDeleteObjectV1(pkiEzsigntemplatepackageID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsigntemplatepackageApi#ezsigntemplatepackageDeleteObjectV1");
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
| **pkiEzsigntemplatepackageID** | **Integer**|  | |

### Return type

[**EzsigntemplatepackageDeleteObjectV1Response**](EzsigntemplatepackageDeleteObjectV1Response.md)

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

<a name="ezsigntemplatepackageEditEzsigntemplatepackagesignersV1"></a>
# **ezsigntemplatepackageEditEzsigntemplatepackagesignersV1**
> EzsigntemplatepackageEditEzsigntemplatepackagesignersV1Response ezsigntemplatepackageEditEzsigntemplatepackagesignersV1(pkiEzsigntemplatepackageID, ezsigntemplatepackageEditEzsigntemplatepackagesignersV1Request)

Edit multiple Ezsigntemplatepackagesigners

Using this endpoint, you can edit multiple Ezsigntemplatepackagesigners at the same time.

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsigntemplatepackageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsigntemplatepackageApi apiInstance = new ObjectEzsigntemplatepackageApi(defaultClient);
    Integer pkiEzsigntemplatepackageID = 56; // Integer | 
    EzsigntemplatepackageEditEzsigntemplatepackagesignersV1Request ezsigntemplatepackageEditEzsigntemplatepackagesignersV1Request = new EzsigntemplatepackageEditEzsigntemplatepackagesignersV1Request(); // EzsigntemplatepackageEditEzsigntemplatepackagesignersV1Request | 
    try {
      EzsigntemplatepackageEditEzsigntemplatepackagesignersV1Response result = apiInstance.ezsigntemplatepackageEditEzsigntemplatepackagesignersV1(pkiEzsigntemplatepackageID, ezsigntemplatepackageEditEzsigntemplatepackagesignersV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsigntemplatepackageApi#ezsigntemplatepackageEditEzsigntemplatepackagesignersV1");
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
| **pkiEzsigntemplatepackageID** | **Integer**|  | |
| **ezsigntemplatepackageEditEzsigntemplatepackagesignersV1Request** | [**EzsigntemplatepackageEditEzsigntemplatepackagesignersV1Request**](EzsigntemplatepackageEditEzsigntemplatepackagesignersV1Request.md)|  | |

### Return type

[**EzsigntemplatepackageEditEzsigntemplatepackagesignersV1Response**](EzsigntemplatepackageEditEzsigntemplatepackagesignersV1Response.md)

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

<a name="ezsigntemplatepackageEditObjectV1"></a>
# **ezsigntemplatepackageEditObjectV1**
> EzsigntemplatepackageEditObjectV1Response ezsigntemplatepackageEditObjectV1(pkiEzsigntemplatepackageID, ezsigntemplatepackageEditObjectV1Request)

Edit an existing Ezsigntemplatepackage



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsigntemplatepackageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsigntemplatepackageApi apiInstance = new ObjectEzsigntemplatepackageApi(defaultClient);
    Integer pkiEzsigntemplatepackageID = 56; // Integer | 
    EzsigntemplatepackageEditObjectV1Request ezsigntemplatepackageEditObjectV1Request = new EzsigntemplatepackageEditObjectV1Request(); // EzsigntemplatepackageEditObjectV1Request | 
    try {
      EzsigntemplatepackageEditObjectV1Response result = apiInstance.ezsigntemplatepackageEditObjectV1(pkiEzsigntemplatepackageID, ezsigntemplatepackageEditObjectV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsigntemplatepackageApi#ezsigntemplatepackageEditObjectV1");
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
| **pkiEzsigntemplatepackageID** | **Integer**|  | |
| **ezsigntemplatepackageEditObjectV1Request** | [**EzsigntemplatepackageEditObjectV1Request**](EzsigntemplatepackageEditObjectV1Request.md)|  | |

### Return type

[**EzsigntemplatepackageEditObjectV1Response**](EzsigntemplatepackageEditObjectV1Response.md)

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

<a name="ezsigntemplatepackageGetAutocompleteV1"></a>
# **ezsigntemplatepackageGetAutocompleteV1**
> CommonGetAutocompleteDisabledV1Response ezsigntemplatepackageGetAutocompleteV1(sSelector, eFilterActive, sQuery, acceptLanguage)

Retrieve Ezsigntemplatepackages and IDs

Get the list of Ezsigntemplatepackage to be used in a dropdown or autocomplete control.

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsigntemplatepackageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsigntemplatepackageApi apiInstance = new ObjectEzsigntemplatepackageApi(defaultClient);
    String sSelector = "All"; // String | The type of Ezsigntemplatepackages to return
    String eFilterActive = "All"; // String | Specify which results we want to display.
    String sQuery = "sQuery_example"; // String | Allow to filter the returned results
    HeaderAcceptLanguage acceptLanguage = HeaderAcceptLanguage.fromValue("*"); // HeaderAcceptLanguage | 
    try {
      CommonGetAutocompleteDisabledV1Response result = apiInstance.ezsigntemplatepackageGetAutocompleteV1(sSelector, eFilterActive, sQuery, acceptLanguage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsigntemplatepackageApi#ezsigntemplatepackageGetAutocompleteV1");
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
| **sSelector** | **String**| The type of Ezsigntemplatepackages to return | [enum: All, AllMultipleCopiesDisabled] |
| **eFilterActive** | **String**| Specify which results we want to display. | [optional] [default to Active] [enum: All, Active, Inactive] |
| **sQuery** | **String**| Allow to filter the returned results | [optional] |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |

### Return type

[**CommonGetAutocompleteDisabledV1Response**](CommonGetAutocompleteDisabledV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a name="ezsigntemplatepackageGetListV1"></a>
# **ezsigntemplatepackageGetListV1**
> EzsigntemplatepackageGetListV1Response ezsigntemplatepackageGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Ezsigntemplatepackage list

Enum values that can be filtered in query parameter *sFilter*:  | Variable | Valid values | |---|---| | eEzsigntemplatepackageType | Company&lt;br&gt;Team&lt;br&gt;User&lt;br&gt;Usergroup |

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsigntemplatepackageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsigntemplatepackageApi apiInstance = new ObjectEzsigntemplatepackageApi(defaultClient);
    String eOrderBy = "pkiEzsigntemplatepackageID_ASC"; // String | Specify how you want the results to be sorted
    Integer iRowMax = 56; // Integer | 
    Integer iRowOffset = 56; // Integer | 
    HeaderAcceptLanguage acceptLanguage = HeaderAcceptLanguage.fromValue("*"); // HeaderAcceptLanguage | 
    String sFilter = "sFilter_example"; // String | 
    try {
      EzsigntemplatepackageGetListV1Response result = apiInstance.ezsigntemplatepackageGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsigntemplatepackageApi#ezsigntemplatepackageGetListV1");
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
| **eOrderBy** | **String**| Specify how you want the results to be sorted | [optional] [enum: pkiEzsigntemplatepackageID_ASC, pkiEzsigntemplatepackageID_DESC, fkiTeamID_ASC, fkiTeamID_DESC, fkiEzsignfoldertypeID_ASC, fkiEzsignfoldertypeID_DESC, fkiLanguageID_ASC, fkiLanguageID_DESC, eEzsigntemplatepackageType_ASC, eEzsigntemplatepackageType_DESC, sEzsigntemplatepackageTypedescriptionX_ASC, sEzsigntemplatepackageTypedescriptionX_DESC, sEzsigntemplatepackageDescription_ASC, sEzsigntemplatepackageDescription_DESC, bEzsigntemplatepackageNeedvalidation_ASC, bEzsigntemplatepackageNeedvalidation_DESC, iEzsigntemplatepackagemembership_ASC, iEzsigntemplatepackagemembership_DESC, bEzsigntemplatepackageIsactive_ASC, bEzsigntemplatepackageIsactive_DESC] |
| **iRowMax** | **Integer**|  | [optional] |
| **iRowOffset** | **Integer**|  | [optional] |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |
| **sFilter** | **String**|  | [optional] |

### Return type

[**EzsigntemplatepackageGetListV1Response**](EzsigntemplatepackageGetListV1Response.md)

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

<a name="ezsigntemplatepackageGetObjectV1"></a>
# **ezsigntemplatepackageGetObjectV1**
> EzsigntemplatepackageGetObjectV1Response ezsigntemplatepackageGetObjectV1(pkiEzsigntemplatepackageID)

Retrieve an existing Ezsigntemplatepackage



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsigntemplatepackageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsigntemplatepackageApi apiInstance = new ObjectEzsigntemplatepackageApi(defaultClient);
    Integer pkiEzsigntemplatepackageID = 56; // Integer | 
    try {
      EzsigntemplatepackageGetObjectV1Response result = apiInstance.ezsigntemplatepackageGetObjectV1(pkiEzsigntemplatepackageID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsigntemplatepackageApi#ezsigntemplatepackageGetObjectV1");
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
| **pkiEzsigntemplatepackageID** | **Integer**|  | |

### Return type

[**EzsigntemplatepackageGetObjectV1Response**](EzsigntemplatepackageGetObjectV1Response.md)

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

