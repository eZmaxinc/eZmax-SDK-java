# ObjectDocumenttypechecklistApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**documenttypechecklistCreateObjectV1**](ObjectDocumenttypechecklistApi.md#documenttypechecklistCreateObjectV1) | **POST** /1/object/documenttypechecklist | Create a new Documenttypechecklist |
| [**documenttypechecklistDeleteObjectV1**](ObjectDocumenttypechecklistApi.md#documenttypechecklistDeleteObjectV1) | **DELETE** /1/object/documenttypechecklist/{pkiDocumenttypechecklistID} | Delete an existing Documenttypechecklist |
| [**documenttypechecklistEditObjectV1**](ObjectDocumenttypechecklistApi.md#documenttypechecklistEditObjectV1) | **PUT** /1/object/documenttypechecklist/{pkiDocumenttypechecklistID} | Edit an existing Documenttypechecklist |
| [**documenttypechecklistGetListV1**](ObjectDocumenttypechecklistApi.md#documenttypechecklistGetListV1) | **GET** /1/object/documenttypechecklist/getList | Retrieve Documenttypechecklist list |
| [**documenttypechecklistGetObjectV2**](ObjectDocumenttypechecklistApi.md#documenttypechecklistGetObjectV2) | **GET** /2/object/documenttypechecklist/{pkiDocumenttypechecklistID} | Retrieve an existing Documenttypechecklist |


<a id="documenttypechecklistCreateObjectV1"></a>
# **documenttypechecklistCreateObjectV1**
> DocumenttypechecklistCreateObjectV1Response documenttypechecklistCreateObjectV1(documenttypechecklistCreateObjectV1Request)

Create a new Documenttypechecklist

The endpoint allows to create one or many elements at once.

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectDocumenttypechecklistApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectDocumenttypechecklistApi apiInstance = new ObjectDocumenttypechecklistApi(defaultClient);
    DocumenttypechecklistCreateObjectV1Request documenttypechecklistCreateObjectV1Request = new DocumenttypechecklistCreateObjectV1Request(); // DocumenttypechecklistCreateObjectV1Request | 
    try {
      DocumenttypechecklistCreateObjectV1Response result = apiInstance.documenttypechecklistCreateObjectV1(documenttypechecklistCreateObjectV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectDocumenttypechecklistApi#documenttypechecklistCreateObjectV1");
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
| **documenttypechecklistCreateObjectV1Request** | [**DocumenttypechecklistCreateObjectV1Request**](DocumenttypechecklistCreateObjectV1Request.md)|  | |

### Return type

[**DocumenttypechecklistCreateObjectV1Response**](DocumenttypechecklistCreateObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful response |  -  |

<a id="documenttypechecklistDeleteObjectV1"></a>
# **documenttypechecklistDeleteObjectV1**
> DocumenttypechecklistDeleteObjectV1Response documenttypechecklistDeleteObjectV1(pkiDocumenttypechecklistID)

Delete an existing Documenttypechecklist



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectDocumenttypechecklistApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectDocumenttypechecklistApi apiInstance = new ObjectDocumenttypechecklistApi(defaultClient);
    Integer pkiDocumenttypechecklistID = 56; // Integer | The unique ID of the Documenttypechecklist
    try {
      DocumenttypechecklistDeleteObjectV1Response result = apiInstance.documenttypechecklistDeleteObjectV1(pkiDocumenttypechecklistID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectDocumenttypechecklistApi#documenttypechecklistDeleteObjectV1");
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
| **pkiDocumenttypechecklistID** | **Integer**| The unique ID of the Documenttypechecklist | |

### Return type

[**DocumenttypechecklistDeleteObjectV1Response**](DocumenttypechecklistDeleteObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **404** | The request failed. The element on which you were trying to work does not exists. Look for detail about the error in the body. |  -  |

<a id="documenttypechecklistEditObjectV1"></a>
# **documenttypechecklistEditObjectV1**
> DocumenttypechecklistEditObjectV1Response documenttypechecklistEditObjectV1(pkiDocumenttypechecklistID, documenttypechecklistEditObjectV1Request)

Edit an existing Documenttypechecklist



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectDocumenttypechecklistApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectDocumenttypechecklistApi apiInstance = new ObjectDocumenttypechecklistApi(defaultClient);
    Integer pkiDocumenttypechecklistID = 56; // Integer | The unique ID of the Documenttypechecklist
    DocumenttypechecklistEditObjectV1Request documenttypechecklistEditObjectV1Request = new DocumenttypechecklistEditObjectV1Request(); // DocumenttypechecklistEditObjectV1Request | 
    try {
      DocumenttypechecklistEditObjectV1Response result = apiInstance.documenttypechecklistEditObjectV1(pkiDocumenttypechecklistID, documenttypechecklistEditObjectV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectDocumenttypechecklistApi#documenttypechecklistEditObjectV1");
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
| **pkiDocumenttypechecklistID** | **Integer**| The unique ID of the Documenttypechecklist | |
| **documenttypechecklistEditObjectV1Request** | [**DocumenttypechecklistEditObjectV1Request**](DocumenttypechecklistEditObjectV1Request.md)|  | |

### Return type

[**DocumenttypechecklistEditObjectV1Response**](DocumenttypechecklistEditObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **404** | The request failed. The element on which you were trying to work does not exists. Look for detail about the error in the body. |  -  |
| **422** | The request was syntactically valid but failed because of an interdependance condition. Look for detail about the error in the body. |  -  |

<a id="documenttypechecklistGetListV1"></a>
# **documenttypechecklistGetListV1**
> DocumenttypechecklistGetListV1Response documenttypechecklistGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Documenttypechecklist list

Enum values that can be filtered in query parameter *sFilter*:  | Variable | Valid values | |---|---| | eDocumenttypechecklistStatus | Not required&lt;br&gt;Required&lt;br&gt;Filed&lt;br&gt;Justified |

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectDocumenttypechecklistApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectDocumenttypechecklistApi apiInstance = new ObjectDocumenttypechecklistApi(defaultClient);
    String eOrderBy = "pkiDocumenttypechecklistID_ASC"; // String | Specify how you want the results to be sorted
    Integer iRowMax = 56; // Integer | 
    Integer iRowOffset = 0; // Integer | 
    HeaderAcceptLanguage acceptLanguage = HeaderAcceptLanguage.fromValue("*"); // HeaderAcceptLanguage | 
    String sFilter = "sFilter_example"; // String | 
    try {
      DocumenttypechecklistGetListV1Response result = apiInstance.documenttypechecklistGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectDocumenttypechecklistApi#documenttypechecklistGetListV1");
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
| **eOrderBy** | **String**| Specify how you want the results to be sorted | [optional] [enum: pkiDocumenttypechecklistID_ASC, pkiDocumenttypechecklistID_DESC, fkiDocumenttypeID_ASC, fkiDocumenttypeID_DESC, eDocumenttypechecklistStatus_ASC, eDocumenttypechecklistStatus_DESC, tDocumenttypechecklistComment_ASC, tDocumenttypechecklistComment_DESC] |
| **iRowMax** | **Integer**|  | [optional] |
| **iRowOffset** | **Integer**|  | [optional] [default to 0] |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |
| **sFilter** | **String**|  | [optional] |

### Return type

[**DocumenttypechecklistGetListV1Response**](DocumenttypechecklistGetListV1Response.md)

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

<a id="documenttypechecklistGetObjectV2"></a>
# **documenttypechecklistGetObjectV2**
> DocumenttypechecklistGetObjectV2Response documenttypechecklistGetObjectV2(pkiDocumenttypechecklistID)

Retrieve an existing Documenttypechecklist



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectDocumenttypechecklistApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectDocumenttypechecklistApi apiInstance = new ObjectDocumenttypechecklistApi(defaultClient);
    Integer pkiDocumenttypechecklistID = 56; // Integer | The unique ID of the Documenttypechecklist
    try {
      DocumenttypechecklistGetObjectV2Response result = apiInstance.documenttypechecklistGetObjectV2(pkiDocumenttypechecklistID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectDocumenttypechecklistApi#documenttypechecklistGetObjectV2");
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
| **pkiDocumenttypechecklistID** | **Integer**| The unique ID of the Documenttypechecklist | |

### Return type

[**DocumenttypechecklistGetObjectV2Response**](DocumenttypechecklistGetObjectV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **404** | The request failed. The element on which you were trying to work does not exists. Look for detail about the error in the body. |  -  |

