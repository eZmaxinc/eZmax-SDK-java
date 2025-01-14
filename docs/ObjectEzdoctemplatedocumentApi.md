# ObjectEzdoctemplatedocumentApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**ezdoctemplatedocumentCreateObjectV1**](ObjectEzdoctemplatedocumentApi.md#ezdoctemplatedocumentCreateObjectV1) | **POST** /1/object/ezdoctemplatedocument | Create a new Ezdoctemplatedocument |
| [**ezdoctemplatedocumentDownloadV1**](ObjectEzdoctemplatedocumentApi.md#ezdoctemplatedocumentDownloadV1) | **GET** /1/object/ezdoctemplatedocument/{pkiEzdoctemplatedocumentID}/download | Retrieve the content |
| [**ezdoctemplatedocumentEditObjectV1**](ObjectEzdoctemplatedocumentApi.md#ezdoctemplatedocumentEditObjectV1) | **PUT** /1/object/ezdoctemplatedocument/{pkiEzdoctemplatedocumentID} | Edit an existing Ezdoctemplatedocument |
| [**ezdoctemplatedocumentGetAutocompleteV2**](ObjectEzdoctemplatedocumentApi.md#ezdoctemplatedocumentGetAutocompleteV2) | **GET** /2/object/ezdoctemplatedocument/getAutocomplete/{sSelector} | Retrieve Ezdoctemplatedocuments and IDs |
| [**ezdoctemplatedocumentGetListV1**](ObjectEzdoctemplatedocumentApi.md#ezdoctemplatedocumentGetListV1) | **GET** /1/object/ezdoctemplatedocument/getList | Retrieve Ezdoctemplatedocument list |
| [**ezdoctemplatedocumentGetObjectV2**](ObjectEzdoctemplatedocumentApi.md#ezdoctemplatedocumentGetObjectV2) | **GET** /2/object/ezdoctemplatedocument/{pkiEzdoctemplatedocumentID} | Retrieve an existing Ezdoctemplatedocument |
| [**ezdoctemplatedocumentPatchObjectV1**](ObjectEzdoctemplatedocumentApi.md#ezdoctemplatedocumentPatchObjectV1) | **PATCH** /1/object/ezdoctemplatedocument/{pkiEzdoctemplatedocumentID} | Patch an existing Ezdoctemplatedocument |


<a id="ezdoctemplatedocumentCreateObjectV1"></a>
# **ezdoctemplatedocumentCreateObjectV1**
> EzdoctemplatedocumentCreateObjectV1Response ezdoctemplatedocumentCreateObjectV1(ezdoctemplatedocumentCreateObjectV1Request)

Create a new Ezdoctemplatedocument

The endpoint allows to create one or many elements at once.

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzdoctemplatedocumentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzdoctemplatedocumentApi apiInstance = new ObjectEzdoctemplatedocumentApi(defaultClient);
    EzdoctemplatedocumentCreateObjectV1Request ezdoctemplatedocumentCreateObjectV1Request = new EzdoctemplatedocumentCreateObjectV1Request(); // EzdoctemplatedocumentCreateObjectV1Request | 
    try {
      EzdoctemplatedocumentCreateObjectV1Response result = apiInstance.ezdoctemplatedocumentCreateObjectV1(ezdoctemplatedocumentCreateObjectV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzdoctemplatedocumentApi#ezdoctemplatedocumentCreateObjectV1");
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
| **ezdoctemplatedocumentCreateObjectV1Request** | [**EzdoctemplatedocumentCreateObjectV1Request**](EzdoctemplatedocumentCreateObjectV1Request.md)|  | |

### Return type

[**EzdoctemplatedocumentCreateObjectV1Response**](EzdoctemplatedocumentCreateObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful response |  -  |

<a id="ezdoctemplatedocumentDownloadV1"></a>
# **ezdoctemplatedocumentDownloadV1**
> ezdoctemplatedocumentDownloadV1(pkiEzdoctemplatedocumentID)

Retrieve the content

Using this endpoint, you can retrieve the content of an ezdoctemplatedocument.

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzdoctemplatedocumentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    // Configure API key authorization: Presigned
    ApiKeyAuth Presigned = (ApiKeyAuth) defaultClient.getAuthentication("Presigned");
    Presigned.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Presigned.setApiKeyPrefix("Token");

    ObjectEzdoctemplatedocumentApi apiInstance = new ObjectEzdoctemplatedocumentApi(defaultClient);
    Integer pkiEzdoctemplatedocumentID = 56; // Integer | 
    try {
      apiInstance.ezdoctemplatedocumentDownloadV1(pkiEzdoctemplatedocumentID);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzdoctemplatedocumentApi#ezdoctemplatedocumentDownloadV1");
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
| **pkiEzdoctemplatedocumentID** | **Integer**|  | |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization), [Presigned](../README.md#Presigned)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **302** | The user has been redirected |  -  |
| **404** | The request failed. The element on which you were trying to work does not exists. Look for detail about the error in the body |  -  |

<a id="ezdoctemplatedocumentEditObjectV1"></a>
# **ezdoctemplatedocumentEditObjectV1**
> EzdoctemplatedocumentEditObjectV1Response ezdoctemplatedocumentEditObjectV1(pkiEzdoctemplatedocumentID, ezdoctemplatedocumentEditObjectV1Request)

Edit an existing Ezdoctemplatedocument



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzdoctemplatedocumentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzdoctemplatedocumentApi apiInstance = new ObjectEzdoctemplatedocumentApi(defaultClient);
    Integer pkiEzdoctemplatedocumentID = 56; // Integer | The unique ID of the Ezdoctemplatedocument
    EzdoctemplatedocumentEditObjectV1Request ezdoctemplatedocumentEditObjectV1Request = new EzdoctemplatedocumentEditObjectV1Request(); // EzdoctemplatedocumentEditObjectV1Request | 
    try {
      EzdoctemplatedocumentEditObjectV1Response result = apiInstance.ezdoctemplatedocumentEditObjectV1(pkiEzdoctemplatedocumentID, ezdoctemplatedocumentEditObjectV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzdoctemplatedocumentApi#ezdoctemplatedocumentEditObjectV1");
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
| **pkiEzdoctemplatedocumentID** | **Integer**| The unique ID of the Ezdoctemplatedocument | |
| **ezdoctemplatedocumentEditObjectV1Request** | [**EzdoctemplatedocumentEditObjectV1Request**](EzdoctemplatedocumentEditObjectV1Request.md)|  | |

### Return type

[**EzdoctemplatedocumentEditObjectV1Response**](EzdoctemplatedocumentEditObjectV1Response.md)

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

<a id="ezdoctemplatedocumentGetAutocompleteV2"></a>
# **ezdoctemplatedocumentGetAutocompleteV2**
> EzdoctemplatedocumentGetAutocompleteV2Response ezdoctemplatedocumentGetAutocompleteV2(sSelector, eType, fkiEzsignfoldertypeID, eFilterActive, sQuery, acceptLanguage)

Retrieve Ezdoctemplatedocuments and IDs

Get the list of Ezdoctemplatedocument to be used in a dropdown or autocomplete control.

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzdoctemplatedocumentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzdoctemplatedocumentApi apiInstance = new ObjectEzdoctemplatedocumentApi(defaultClient);
    String sSelector = "All"; // String | The type of Ezdoctemplatedocuments to return
    String eType = "User"; // String | The type of Ezdoctemplatedocument
    String fkiEzsignfoldertypeID = "fkiEzsignfoldertypeID_example"; // String | Specify which fkiEzsignfoldertypeID we want to display. only used when eType = Ezsignfoldertype
    String eFilterActive = "All"; // String | Specify which results we want to display.
    String sQuery = "sQuery_example"; // String | Allow to filter the returned results
    HeaderAcceptLanguage acceptLanguage = HeaderAcceptLanguage.fromValue("*"); // HeaderAcceptLanguage | 
    try {
      EzdoctemplatedocumentGetAutocompleteV2Response result = apiInstance.ezdoctemplatedocumentGetAutocompleteV2(sSelector, eType, fkiEzsignfoldertypeID, eFilterActive, sQuery, acceptLanguage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzdoctemplatedocumentApi#ezdoctemplatedocumentGetAutocompleteV2");
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
| **sSelector** | **String**| The type of Ezdoctemplatedocuments to return | [enum: All, Ezsignfolder, Ezsignfoldersignerassociations] |
| **eType** | **String**| The type of Ezdoctemplatedocument | [default to CompanyEzsignfoldertype] [enum: User, Company, Ezsignfoldertype, CompanyUser, CompanyEzsignfoldertype] |
| **fkiEzsignfoldertypeID** | **String**| Specify which fkiEzsignfoldertypeID we want to display. only used when eType &#x3D; Ezsignfoldertype | [optional] |
| **eFilterActive** | **String**| Specify which results we want to display. | [optional] [default to Active] [enum: All, Active, Inactive] |
| **sQuery** | **String**| Allow to filter the returned results | [optional] |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |

### Return type

[**EzdoctemplatedocumentGetAutocompleteV2Response**](EzdoctemplatedocumentGetAutocompleteV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="ezdoctemplatedocumentGetListV1"></a>
# **ezdoctemplatedocumentGetListV1**
> EzdoctemplatedocumentGetListV1Response ezdoctemplatedocumentGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Ezdoctemplatedocument list



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzdoctemplatedocumentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzdoctemplatedocumentApi apiInstance = new ObjectEzdoctemplatedocumentApi(defaultClient);
    String eOrderBy = "pkiEzdoctemplatedocumentID_ASC"; // String | Specify how you want the results to be sorted
    Integer iRowMax = 56; // Integer | 
    Integer iRowOffset = 0; // Integer | 
    HeaderAcceptLanguage acceptLanguage = HeaderAcceptLanguage.fromValue("*"); // HeaderAcceptLanguage | 
    String sFilter = "sFilter_example"; // String | 
    try {
      EzdoctemplatedocumentGetListV1Response result = apiInstance.ezdoctemplatedocumentGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzdoctemplatedocumentApi#ezdoctemplatedocumentGetListV1");
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
| **eOrderBy** | **String**| Specify how you want the results to be sorted | [optional] [enum: pkiEzdoctemplatedocumentID_ASC, pkiEzdoctemplatedocumentID_DESC, fkiLanguageID_ASC, fkiLanguageID_DESC, fkiEzdoctemplatetypeID_ASC, fkiEzdoctemplatetypeID_DESC, fkiEzdoctemplatefieldtypecategoryID_ASC, fkiEzdoctemplatefieldtypecategoryID_DESC, bEzdoctemplatedocumentIsactive_ASC, bEzdoctemplatedocumentIsactive_DESC, sEzdoctemplatedocumentNameX_ASC, sEzdoctemplatedocumentNameX_DESC] |
| **iRowMax** | **Integer**|  | [optional] |
| **iRowOffset** | **Integer**|  | [optional] [default to 0] |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |
| **sFilter** | **String**|  | [optional] |

### Return type

[**EzdoctemplatedocumentGetListV1Response**](EzdoctemplatedocumentGetListV1Response.md)

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

<a id="ezdoctemplatedocumentGetObjectV2"></a>
# **ezdoctemplatedocumentGetObjectV2**
> EzdoctemplatedocumentGetObjectV2Response ezdoctemplatedocumentGetObjectV2(pkiEzdoctemplatedocumentID)

Retrieve an existing Ezdoctemplatedocument



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzdoctemplatedocumentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzdoctemplatedocumentApi apiInstance = new ObjectEzdoctemplatedocumentApi(defaultClient);
    Integer pkiEzdoctemplatedocumentID = 56; // Integer | The unique ID of the Ezdoctemplatedocument
    try {
      EzdoctemplatedocumentGetObjectV2Response result = apiInstance.ezdoctemplatedocumentGetObjectV2(pkiEzdoctemplatedocumentID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzdoctemplatedocumentApi#ezdoctemplatedocumentGetObjectV2");
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
| **pkiEzdoctemplatedocumentID** | **Integer**| The unique ID of the Ezdoctemplatedocument | |

### Return type

[**EzdoctemplatedocumentGetObjectV2Response**](EzdoctemplatedocumentGetObjectV2Response.md)

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

<a id="ezdoctemplatedocumentPatchObjectV1"></a>
# **ezdoctemplatedocumentPatchObjectV1**
> EzdoctemplatedocumentPatchObjectV1Response ezdoctemplatedocumentPatchObjectV1(pkiEzdoctemplatedocumentID, ezdoctemplatedocumentPatchObjectV1Request)

Patch an existing Ezdoctemplatedocument



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzdoctemplatedocumentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzdoctemplatedocumentApi apiInstance = new ObjectEzdoctemplatedocumentApi(defaultClient);
    Integer pkiEzdoctemplatedocumentID = 56; // Integer | The unique ID of the Ezdoctemplatedocument
    EzdoctemplatedocumentPatchObjectV1Request ezdoctemplatedocumentPatchObjectV1Request = new EzdoctemplatedocumentPatchObjectV1Request(); // EzdoctemplatedocumentPatchObjectV1Request | 
    try {
      EzdoctemplatedocumentPatchObjectV1Response result = apiInstance.ezdoctemplatedocumentPatchObjectV1(pkiEzdoctemplatedocumentID, ezdoctemplatedocumentPatchObjectV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzdoctemplatedocumentApi#ezdoctemplatedocumentPatchObjectV1");
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
| **pkiEzdoctemplatedocumentID** | **Integer**| The unique ID of the Ezdoctemplatedocument | |
| **ezdoctemplatedocumentPatchObjectV1Request** | [**EzdoctemplatedocumentPatchObjectV1Request**](EzdoctemplatedocumentPatchObjectV1Request.md)|  | |

### Return type

[**EzdoctemplatedocumentPatchObjectV1Response**](EzdoctemplatedocumentPatchObjectV1Response.md)

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

