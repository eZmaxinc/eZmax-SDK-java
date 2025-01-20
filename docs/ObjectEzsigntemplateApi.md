# ObjectEzsigntemplateApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**ezsigntemplateCopyV1**](ObjectEzsigntemplateApi.md#ezsigntemplateCopyV1) | **POST** /1/object/ezsigntemplate/{pkiEzsigntemplateID}/copy | Copy the Ezsigntemplate |
| [**ezsigntemplateCreateObjectV3**](ObjectEzsigntemplateApi.md#ezsigntemplateCreateObjectV3) | **POST** /3/object/ezsigntemplate | Create a new Ezsigntemplate |
| [**ezsigntemplateDeleteObjectV1**](ObjectEzsigntemplateApi.md#ezsigntemplateDeleteObjectV1) | **DELETE** /1/object/ezsigntemplate/{pkiEzsigntemplateID} | Delete an existing Ezsigntemplate |
| [**ezsigntemplateEditObjectV3**](ObjectEzsigntemplateApi.md#ezsigntemplateEditObjectV3) | **PUT** /3/object/ezsigntemplate/{pkiEzsigntemplateID} | Edit an existing Ezsigntemplate |
| [**ezsigntemplateGetAutocompleteV2**](ObjectEzsigntemplateApi.md#ezsigntemplateGetAutocompleteV2) | **GET** /2/object/ezsigntemplate/getAutocomplete/{sSelector} | Retrieve Ezsigntemplates and IDs |
| [**ezsigntemplateGetListV1**](ObjectEzsigntemplateApi.md#ezsigntemplateGetListV1) | **GET** /1/object/ezsigntemplate/getList | Retrieve Ezsigntemplate list |
| [**ezsigntemplateGetObjectV3**](ObjectEzsigntemplateApi.md#ezsigntemplateGetObjectV3) | **GET** /3/object/ezsigntemplate/{pkiEzsigntemplateID} | Retrieve an existing Ezsigntemplate |


<a id="ezsigntemplateCopyV1"></a>
# **ezsigntemplateCopyV1**
> EzsigntemplateCopyV1Response ezsigntemplateCopyV1(pkiEzsigntemplateID, ezsigntemplateCopyV1Request)

Copy the Ezsigntemplate



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsigntemplateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsigntemplateApi apiInstance = new ObjectEzsigntemplateApi(defaultClient);
    Integer pkiEzsigntemplateID = 56; // Integer | 
    EzsigntemplateCopyV1Request ezsigntemplateCopyV1Request = new EzsigntemplateCopyV1Request(); // EzsigntemplateCopyV1Request | 
    try {
      EzsigntemplateCopyV1Response result = apiInstance.ezsigntemplateCopyV1(pkiEzsigntemplateID, ezsigntemplateCopyV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsigntemplateApi#ezsigntemplateCopyV1");
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
| **pkiEzsigntemplateID** | **Integer**|  | |
| **ezsigntemplateCopyV1Request** | [**EzsigntemplateCopyV1Request**](EzsigntemplateCopyV1Request.md)|  | |

### Return type

[**EzsigntemplateCopyV1Response**](EzsigntemplateCopyV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful response |  -  |
| **404** | The request failed. The element on which you were trying to work does not exists. Look for detail about the error in the body |  -  |

<a id="ezsigntemplateCreateObjectV3"></a>
# **ezsigntemplateCreateObjectV3**
> EzsigntemplateCreateObjectV3Response ezsigntemplateCreateObjectV3(ezsigntemplateCreateObjectV3Request)

Create a new Ezsigntemplate

The endpoint allows to create one or many elements at once.

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsigntemplateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsigntemplateApi apiInstance = new ObjectEzsigntemplateApi(defaultClient);
    EzsigntemplateCreateObjectV3Request ezsigntemplateCreateObjectV3Request = new EzsigntemplateCreateObjectV3Request(); // EzsigntemplateCreateObjectV3Request | 
    try {
      EzsigntemplateCreateObjectV3Response result = apiInstance.ezsigntemplateCreateObjectV3(ezsigntemplateCreateObjectV3Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsigntemplateApi#ezsigntemplateCreateObjectV3");
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
| **ezsigntemplateCreateObjectV3Request** | [**EzsigntemplateCreateObjectV3Request**](EzsigntemplateCreateObjectV3Request.md)|  | |

### Return type

[**EzsigntemplateCreateObjectV3Response**](EzsigntemplateCreateObjectV3Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful response |  -  |

<a id="ezsigntemplateDeleteObjectV1"></a>
# **ezsigntemplateDeleteObjectV1**
> EzsigntemplateDeleteObjectV1Response ezsigntemplateDeleteObjectV1(pkiEzsigntemplateID)

Delete an existing Ezsigntemplate



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsigntemplateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsigntemplateApi apiInstance = new ObjectEzsigntemplateApi(defaultClient);
    Integer pkiEzsigntemplateID = 56; // Integer | 
    try {
      EzsigntemplateDeleteObjectV1Response result = apiInstance.ezsigntemplateDeleteObjectV1(pkiEzsigntemplateID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsigntemplateApi#ezsigntemplateDeleteObjectV1");
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
| **pkiEzsigntemplateID** | **Integer**|  | |

### Return type

[**EzsigntemplateDeleteObjectV1Response**](EzsigntemplateDeleteObjectV1Response.md)

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

<a id="ezsigntemplateEditObjectV3"></a>
# **ezsigntemplateEditObjectV3**
> EzsigntemplateEditObjectV3Response ezsigntemplateEditObjectV3(pkiEzsigntemplateID, ezsigntemplateEditObjectV3Request)

Edit an existing Ezsigntemplate



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsigntemplateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsigntemplateApi apiInstance = new ObjectEzsigntemplateApi(defaultClient);
    Integer pkiEzsigntemplateID = 56; // Integer | 
    EzsigntemplateEditObjectV3Request ezsigntemplateEditObjectV3Request = new EzsigntemplateEditObjectV3Request(); // EzsigntemplateEditObjectV3Request | 
    try {
      EzsigntemplateEditObjectV3Response result = apiInstance.ezsigntemplateEditObjectV3(pkiEzsigntemplateID, ezsigntemplateEditObjectV3Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsigntemplateApi#ezsigntemplateEditObjectV3");
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
| **pkiEzsigntemplateID** | **Integer**|  | |
| **ezsigntemplateEditObjectV3Request** | [**EzsigntemplateEditObjectV3Request**](EzsigntemplateEditObjectV3Request.md)|  | |

### Return type

[**EzsigntemplateEditObjectV3Response**](EzsigntemplateEditObjectV3Response.md)

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

<a id="ezsigntemplateGetAutocompleteV2"></a>
# **ezsigntemplateGetAutocompleteV2**
> EzsigntemplateGetAutocompleteV2Response ezsigntemplateGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage, fkiEzsignfoldertypeID)

Retrieve Ezsigntemplates and IDs

Get the list of Ezsigntemplate to be used in a dropdown or autocomplete control.

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsigntemplateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsigntemplateApi apiInstance = new ObjectEzsigntemplateApi(defaultClient);
    String sSelector = "All"; // String | The type of Ezsigntemplates to return
    String eFilterActive = "All"; // String | Specify which results we want to display.
    String sQuery = "sQuery_example"; // String | Allow to filter the returned results
    HeaderAcceptLanguage acceptLanguage = HeaderAcceptLanguage.fromValue("*"); // HeaderAcceptLanguage | 
    Integer fkiEzsignfoldertypeID = 56; // Integer | The fkiEzsignfoldertypeID to use with the selector Ezsigntemplatepublic
    try {
      EzsigntemplateGetAutocompleteV2Response result = apiInstance.ezsigntemplateGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage, fkiEzsignfoldertypeID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsigntemplateApi#ezsigntemplateGetAutocompleteV2");
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
| **sSelector** | **String**| The type of Ezsigntemplates to return | [enum: All, Ezsigntemplatepublic] |
| **eFilterActive** | **String**| Specify which results we want to display. | [optional] [default to Active] [enum: All, Active, Inactive] |
| **sQuery** | **String**| Allow to filter the returned results | [optional] |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |
| **fkiEzsignfoldertypeID** | **Integer**| The fkiEzsignfoldertypeID to use with the selector Ezsigntemplatepublic | [optional] |

### Return type

[**EzsigntemplateGetAutocompleteV2Response**](EzsigntemplateGetAutocompleteV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="ezsigntemplateGetListV1"></a>
# **ezsigntemplateGetListV1**
> EzsigntemplateGetListV1Response ezsigntemplateGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Ezsigntemplate list

Enum values that can be filtered in query parameter *sFilter*:  | Variable | Valid values | |---|---| | eEzsigntemplateType | Company&lt;br&gt;Team&lt;br&gt;User&lt;br&gt;Usergroup | 

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsigntemplateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsigntemplateApi apiInstance = new ObjectEzsigntemplateApi(defaultClient);
    String eOrderBy = "pkiEzsigntemplateID_ASC"; // String | Specify how you want the results to be sorted
    Integer iRowMax = 56; // Integer | 
    Integer iRowOffset = 0; // Integer | 
    HeaderAcceptLanguage acceptLanguage = HeaderAcceptLanguage.fromValue("*"); // HeaderAcceptLanguage | 
    String sFilter = "sFilter_example"; // String | 
    try {
      EzsigntemplateGetListV1Response result = apiInstance.ezsigntemplateGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsigntemplateApi#ezsigntemplateGetListV1");
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
| **eOrderBy** | **String**| Specify how you want the results to be sorted | [optional] [enum: pkiEzsigntemplateID_ASC, pkiEzsigntemplateID_DESC, fkiTeamID_ASC, fkiTeamID_DESC, fkiEzsignfoldertypeID_ASC, fkiEzsignfoldertypeID_DESC, fkiUserIDOwner_ASC, fkiUserIDOwner_DESC, fkiLanguageID_ASC, fkiLanguageID_DESC, eEzsigntemplateType_ASC, eEzsigntemplateType_DESC, sEzsigntemplateDescription_ASC, sEzsigntemplateDescription_DESC, sEzsigntemplatedocumentDescription_ASC, sEzsigntemplatedocumentDescription_DESC, iEzsigntemplatedocumentPagetotal_ASC, iEzsigntemplatedocumentPagetotal_DESC, iEzsigntemplateSignaturetotal_ASC, iEzsigntemplateSignaturetotal_DESC, sEzsignfoldertypeNameX_ASC, sEzsignfoldertypeNameX_DESC, eEzsigntemplateType_ASC, eEzsigntemplateType_DESC] |
| **iRowMax** | **Integer**|  | [optional] |
| **iRowOffset** | **Integer**|  | [optional] [default to 0] |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |
| **sFilter** | **String**|  | [optional] |

### Return type

[**EzsigntemplateGetListV1Response**](EzsigntemplateGetListV1Response.md)

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

<a id="ezsigntemplateGetObjectV3"></a>
# **ezsigntemplateGetObjectV3**
> EzsigntemplateGetObjectV3Response ezsigntemplateGetObjectV3(pkiEzsigntemplateID)

Retrieve an existing Ezsigntemplate



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsigntemplateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsigntemplateApi apiInstance = new ObjectEzsigntemplateApi(defaultClient);
    Integer pkiEzsigntemplateID = 56; // Integer | 
    try {
      EzsigntemplateGetObjectV3Response result = apiInstance.ezsigntemplateGetObjectV3(pkiEzsigntemplateID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsigntemplateApi#ezsigntemplateGetObjectV3");
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
| **pkiEzsigntemplateID** | **Integer**|  | |

### Return type

[**EzsigntemplateGetObjectV3Response**](EzsigntemplateGetObjectV3Response.md)

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

