# ObjectEzsignbulksendApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**ezsignbulksendCreateEzsignbulksendtransmissionV1**](ObjectEzsignbulksendApi.md#ezsignbulksendCreateEzsignbulksendtransmissionV1) | **POST** /1/object/ezsignbulksend/{pkiEzsignbulksendID}/createEzsignbulksendtransmission | Create a new Ezsignbulksendtransmission in the Ezsignbulksend |
| [**ezsignbulksendCreateObjectV1**](ObjectEzsignbulksendApi.md#ezsignbulksendCreateObjectV1) | **POST** /1/object/ezsignbulksend | Create a new Ezsignbulksend |
| [**ezsignbulksendDeleteObjectV1**](ObjectEzsignbulksendApi.md#ezsignbulksendDeleteObjectV1) | **DELETE** /1/object/ezsignbulksend/{pkiEzsignbulksendID} | Delete an existing Ezsignbulksend |
| [**ezsignbulksendEditObjectV1**](ObjectEzsignbulksendApi.md#ezsignbulksendEditObjectV1) | **PUT** /1/object/ezsignbulksend/{pkiEzsignbulksendID} | Edit an existing Ezsignbulksend |
| [**ezsignbulksendGetCsvTemplateV1**](ObjectEzsignbulksendApi.md#ezsignbulksendGetCsvTemplateV1) | **GET** /1/object/ezsignbulksend/{pkiEzsignbulksendID}/getCsvTemplate | Retrieve an existing Ezsignbulksend&#39;s empty Csv template |
| [**ezsignbulksendGetEzsignbulksendtransmissionsV1**](ObjectEzsignbulksendApi.md#ezsignbulksendGetEzsignbulksendtransmissionsV1) | **GET** /1/object/ezsignbulksend/{pkiEzsignbulksendID}/getEzsignbulksendtransmissions | Retrieve an existing Ezsignbulksend&#39;s Ezsignbulksendtransmissions |
| [**ezsignbulksendGetFormsDataV1**](ObjectEzsignbulksendApi.md#ezsignbulksendGetFormsDataV1) | **GET** /1/object/ezsignbulksend/{pkiEzsignbulksendID}/getFormsData | Retrieve an existing Ezsignbulksend&#39;s forms data |
| [**ezsignbulksendGetListV1**](ObjectEzsignbulksendApi.md#ezsignbulksendGetListV1) | **GET** /1/object/ezsignbulksend/getList | Retrieve Ezsignbulksend list |
| [**ezsignbulksendGetObjectV1**](ObjectEzsignbulksendApi.md#ezsignbulksendGetObjectV1) | **GET** /1/object/ezsignbulksend/{pkiEzsignbulksendID} | Retrieve an existing Ezsignbulksend |
| [**ezsignbulksendReorderV1**](ObjectEzsignbulksendApi.md#ezsignbulksendReorderV1) | **POST** /1/object/ezsignbulksend/{pkiEzsignbulksendID}/reorder | Reorder Ezsignbulksenddocumentmappings in the Ezsignbulksend |


<a name="ezsignbulksendCreateEzsignbulksendtransmissionV1"></a>
# **ezsignbulksendCreateEzsignbulksendtransmissionV1**
> EzsignbulksendCreateEzsignbulksendtransmissionV1Response ezsignbulksendCreateEzsignbulksendtransmissionV1(pkiEzsignbulksendID, ezsignbulksendCreateEzsignbulksendtransmissionV1Request)

Create a new Ezsignbulksendtransmission in the Ezsignbulksend

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsignbulksendApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsignbulksendApi apiInstance = new ObjectEzsignbulksendApi(defaultClient);
    Integer pkiEzsignbulksendID = 56; // Integer | 
    EzsignbulksendCreateEzsignbulksendtransmissionV1Request ezsignbulksendCreateEzsignbulksendtransmissionV1Request = new EzsignbulksendCreateEzsignbulksendtransmissionV1Request(); // EzsignbulksendCreateEzsignbulksendtransmissionV1Request | 
    try {
      EzsignbulksendCreateEzsignbulksendtransmissionV1Response result = apiInstance.ezsignbulksendCreateEzsignbulksendtransmissionV1(pkiEzsignbulksendID, ezsignbulksendCreateEzsignbulksendtransmissionV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsignbulksendApi#ezsignbulksendCreateEzsignbulksendtransmissionV1");
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
| **pkiEzsignbulksendID** | **Integer**|  | |
| **ezsignbulksendCreateEzsignbulksendtransmissionV1Request** | [**EzsignbulksendCreateEzsignbulksendtransmissionV1Request**](EzsignbulksendCreateEzsignbulksendtransmissionV1Request.md)|  | |

### Return type

[**EzsignbulksendCreateEzsignbulksendtransmissionV1Response**](EzsignbulksendCreateEzsignbulksendtransmissionV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **404** | The element you are trying to work on does not exist |  -  |
| **422** | The syntax of the request is valid but the request cannot be completed. Look for detail in body. |  -  |

<a name="ezsignbulksendCreateObjectV1"></a>
# **ezsignbulksendCreateObjectV1**
> EzsignbulksendCreateObjectV1Response ezsignbulksendCreateObjectV1(ezsignbulksendCreateObjectV1Request)

Create a new Ezsignbulksend

The endpoint allows to create one or many elements at once.

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsignbulksendApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsignbulksendApi apiInstance = new ObjectEzsignbulksendApi(defaultClient);
    EzsignbulksendCreateObjectV1Request ezsignbulksendCreateObjectV1Request = new EzsignbulksendCreateObjectV1Request(); // EzsignbulksendCreateObjectV1Request | 
    try {
      EzsignbulksendCreateObjectV1Response result = apiInstance.ezsignbulksendCreateObjectV1(ezsignbulksendCreateObjectV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsignbulksendApi#ezsignbulksendCreateObjectV1");
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
| **ezsignbulksendCreateObjectV1Request** | [**EzsignbulksendCreateObjectV1Request**](EzsignbulksendCreateObjectV1Request.md)|  | |

### Return type

[**EzsignbulksendCreateObjectV1Response**](EzsignbulksendCreateObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful response |  -  |

<a name="ezsignbulksendDeleteObjectV1"></a>
# **ezsignbulksendDeleteObjectV1**
> EzsignbulksendDeleteObjectV1Response ezsignbulksendDeleteObjectV1(pkiEzsignbulksendID)

Delete an existing Ezsignbulksend



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsignbulksendApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsignbulksendApi apiInstance = new ObjectEzsignbulksendApi(defaultClient);
    Integer pkiEzsignbulksendID = 56; // Integer | 
    try {
      EzsignbulksendDeleteObjectV1Response result = apiInstance.ezsignbulksendDeleteObjectV1(pkiEzsignbulksendID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsignbulksendApi#ezsignbulksendDeleteObjectV1");
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
| **pkiEzsignbulksendID** | **Integer**|  | |

### Return type

[**EzsignbulksendDeleteObjectV1Response**](EzsignbulksendDeleteObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **404** | The element you are trying to work on does not exist |  -  |
| **422** | The syntax of the request is valid but the request cannot be completed. Look for detail in body. |  -  |

<a name="ezsignbulksendEditObjectV1"></a>
# **ezsignbulksendEditObjectV1**
> EzsignbulksendEditObjectV1Response ezsignbulksendEditObjectV1(pkiEzsignbulksendID, ezsignbulksendEditObjectV1Request)

Edit an existing Ezsignbulksend



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsignbulksendApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsignbulksendApi apiInstance = new ObjectEzsignbulksendApi(defaultClient);
    Integer pkiEzsignbulksendID = 56; // Integer | 
    EzsignbulksendEditObjectV1Request ezsignbulksendEditObjectV1Request = new EzsignbulksendEditObjectV1Request(); // EzsignbulksendEditObjectV1Request | 
    try {
      EzsignbulksendEditObjectV1Response result = apiInstance.ezsignbulksendEditObjectV1(pkiEzsignbulksendID, ezsignbulksendEditObjectV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsignbulksendApi#ezsignbulksendEditObjectV1");
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
| **pkiEzsignbulksendID** | **Integer**|  | |
| **ezsignbulksendEditObjectV1Request** | [**EzsignbulksendEditObjectV1Request**](EzsignbulksendEditObjectV1Request.md)|  | |

### Return type

[**EzsignbulksendEditObjectV1Response**](EzsignbulksendEditObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **404** | The element you are trying to work on does not exist |  -  |
| **422** | The syntax of the request is valid but the request cannot be completed. Look for detail in body. |  -  |

<a name="ezsignbulksendGetCsvTemplateV1"></a>
# **ezsignbulksendGetCsvTemplateV1**
> String ezsignbulksendGetCsvTemplateV1(pkiEzsignbulksendID, eCsvSeparator)

Retrieve an existing Ezsignbulksend&#39;s empty Csv template



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsignbulksendApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsignbulksendApi apiInstance = new ObjectEzsignbulksendApi(defaultClient);
    Integer pkiEzsignbulksendID = 56; // Integer | 
    String eCsvSeparator = "Comma"; // String | Separator that will be used to separate fields
    try {
      String result = apiInstance.ezsignbulksendGetCsvTemplateV1(pkiEzsignbulksendID, eCsvSeparator);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsignbulksendApi#ezsignbulksendGetCsvTemplateV1");
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
| **pkiEzsignbulksendID** | **Integer**|  | |
| **eCsvSeparator** | **String**| Separator that will be used to separate fields | [enum: Comma, Semicolon] |

### Return type

**String**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/csv, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **404** | The element you are trying to work on does not exist |  -  |
| **406** | One of the accept header is not defined or invalid. |  -  |
| **422** | The syntax of the request is valid but the request cannot be completed. Look for detail in body. |  -  |

<a name="ezsignbulksendGetEzsignbulksendtransmissionsV1"></a>
# **ezsignbulksendGetEzsignbulksendtransmissionsV1**
> EzsignbulksendGetEzsignbulksendtransmissionsV1Response ezsignbulksendGetEzsignbulksendtransmissionsV1(pkiEzsignbulksendID)

Retrieve an existing Ezsignbulksend&#39;s Ezsignbulksendtransmissions



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsignbulksendApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsignbulksendApi apiInstance = new ObjectEzsignbulksendApi(defaultClient);
    Integer pkiEzsignbulksendID = 56; // Integer | 
    try {
      EzsignbulksendGetEzsignbulksendtransmissionsV1Response result = apiInstance.ezsignbulksendGetEzsignbulksendtransmissionsV1(pkiEzsignbulksendID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsignbulksendApi#ezsignbulksendGetEzsignbulksendtransmissionsV1");
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
| **pkiEzsignbulksendID** | **Integer**|  | |

### Return type

[**EzsignbulksendGetEzsignbulksendtransmissionsV1Response**](EzsignbulksendGetEzsignbulksendtransmissionsV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **404** | The element you are trying to work on does not exist |  -  |

<a name="ezsignbulksendGetFormsDataV1"></a>
# **ezsignbulksendGetFormsDataV1**
> EzsignbulksendGetFormsDataV1Response ezsignbulksendGetFormsDataV1(pkiEzsignbulksendID)

Retrieve an existing Ezsignbulksend&#39;s forms data



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsignbulksendApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsignbulksendApi apiInstance = new ObjectEzsignbulksendApi(defaultClient);
    Integer pkiEzsignbulksendID = 56; // Integer | 
    try {
      EzsignbulksendGetFormsDataV1Response result = apiInstance.ezsignbulksendGetFormsDataV1(pkiEzsignbulksendID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsignbulksendApi#ezsignbulksendGetFormsDataV1");
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
| **pkiEzsignbulksendID** | **Integer**|  | |

### Return type

[**EzsignbulksendGetFormsDataV1Response**](EzsignbulksendGetFormsDataV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/zip

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **404** | The element you are trying to work on does not exist |  -  |
| **406** | One of the accept header is not defined or invalid. |  -  |
| **422** | The syntax of the request is valid but the request cannot be completed. Look for detail in body. |  -  |

<a name="ezsignbulksendGetListV1"></a>
# **ezsignbulksendGetListV1**
> EzsignbulksendGetListV1Response ezsignbulksendGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Ezsignbulksend list

Enum values that can be filtered in query parameter *sFilter*:  | Variable | Valid values | |---|---| | eEzsignfoldertypePrivacylevel | User&lt;br&gt;Usergroup |

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsignbulksendApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsignbulksendApi apiInstance = new ObjectEzsignbulksendApi(defaultClient);
    String eOrderBy = "pkiEzsignbulksendID_ASC"; // String | Specify how you want the results to be sorted
    Integer iRowMax = 56; // Integer | 
    Integer iRowOffset = 56; // Integer | 
    HeaderAcceptLanguage acceptLanguage = HeaderAcceptLanguage.fromValue("*"); // HeaderAcceptLanguage | 
    String sFilter = "sFilter_example"; // String | 
    try {
      EzsignbulksendGetListV1Response result = apiInstance.ezsignbulksendGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsignbulksendApi#ezsignbulksendGetListV1");
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
| **eOrderBy** | **String**| Specify how you want the results to be sorted | [optional] [enum: pkiEzsignbulksendID_ASC, pkiEzsignbulksendID_DESC, fkiEzsignfoldertypeID_ASC, fkiEzsignfoldertypeID_DESC, sEzsignbulksendDescription_ASC, sEzsignbulksendDescription_DESC, sEzsignfoldertypeNameX_ASC, sEzsignfoldertypeNameX_DESC, eEzsignfoldertypePrivacylevel_ASC, eEzsignfoldertypePrivacylevel_DESC, bEzsignbulksendNeedvalidation_ASC, bEzsignbulksendNeedvalidation_DESC, bEzsignbulksendIsactive_ASC, bEzsignbulksendIsactive_DESC, iEzsignbulksendtransmission_ASC, iEzsignbulksendtransmission_DESC, iEzsignfolder_ASC, iEzsignfolder_DESC, iEzsigndocument_ASC, iEzsigndocument_DESC, iEzsignsignature_ASC, iEzsignsignature_DESC, iEzsignsignatureSigned_ASC, iEzsignsignatureSigned_DESC] |
| **iRowMax** | **Integer**|  | [optional] |
| **iRowOffset** | **Integer**|  | [optional] |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |
| **sFilter** | **String**|  | [optional] |

### Return type

[**EzsignbulksendGetListV1Response**](EzsignbulksendGetListV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/vnd.openxmlformats-officedocument.spreadsheetml.sheet

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **406** | One of the accept header is not defined or invalid. |  -  |

<a name="ezsignbulksendGetObjectV1"></a>
# **ezsignbulksendGetObjectV1**
> EzsignbulksendGetObjectV1Response ezsignbulksendGetObjectV1(pkiEzsignbulksendID)

Retrieve an existing Ezsignbulksend



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsignbulksendApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsignbulksendApi apiInstance = new ObjectEzsignbulksendApi(defaultClient);
    Integer pkiEzsignbulksendID = 56; // Integer | 
    try {
      EzsignbulksendGetObjectV1Response result = apiInstance.ezsignbulksendGetObjectV1(pkiEzsignbulksendID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsignbulksendApi#ezsignbulksendGetObjectV1");
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
| **pkiEzsignbulksendID** | **Integer**|  | |

### Return type

[**EzsignbulksendGetObjectV1Response**](EzsignbulksendGetObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **404** | The element you are trying to work on does not exist |  -  |

<a name="ezsignbulksendReorderV1"></a>
# **ezsignbulksendReorderV1**
> EzsignbulksendReorderV1Response ezsignbulksendReorderV1(pkiEzsignbulksendID, ezsignbulksendReorderV1Request)

Reorder Ezsignbulksenddocumentmappings in the Ezsignbulksend

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsignbulksendApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsignbulksendApi apiInstance = new ObjectEzsignbulksendApi(defaultClient);
    Integer pkiEzsignbulksendID = 56; // Integer | 
    EzsignbulksendReorderV1Request ezsignbulksendReorderV1Request = new EzsignbulksendReorderV1Request(); // EzsignbulksendReorderV1Request | 
    try {
      EzsignbulksendReorderV1Response result = apiInstance.ezsignbulksendReorderV1(pkiEzsignbulksendID, ezsignbulksendReorderV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsignbulksendApi#ezsignbulksendReorderV1");
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
| **pkiEzsignbulksendID** | **Integer**|  | |
| **ezsignbulksendReorderV1Request** | [**EzsignbulksendReorderV1Request**](EzsignbulksendReorderV1Request.md)|  | |

### Return type

[**EzsignbulksendReorderV1Response**](EzsignbulksendReorderV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **404** | The element you are trying to work on does not exist |  -  |
| **422** | The syntax of the request is valid but the request cannot be completed. Look for detail in body. |  -  |

