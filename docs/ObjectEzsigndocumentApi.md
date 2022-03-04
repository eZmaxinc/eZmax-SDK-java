# ObjectEzsigndocumentApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ezsigndocumentApplyEzsigntemplateV1**](ObjectEzsigndocumentApi.md#ezsigndocumentApplyEzsigntemplateV1) | **POST** /1/object/ezsigndocument/{pkiEzsigndocumentID}/applyezsigntemplate | Apply an Ezsign Template to the Ezsigndocument.
[**ezsigndocumentApplyEzsigntemplateV2**](ObjectEzsigndocumentApi.md#ezsigndocumentApplyEzsigntemplateV2) | **POST** /2/object/ezsigndocument/{pkiEzsigndocumentID}/applyEzsigntemplate | Apply an Ezsign Template to the Ezsigndocument.
[**ezsigndocumentCreateObjectV1**](ObjectEzsigndocumentApi.md#ezsigndocumentCreateObjectV1) | **POST** /1/object/ezsigndocument | Create a new Ezsigndocument
[**ezsigndocumentCreateObjectV2**](ObjectEzsigndocumentApi.md#ezsigndocumentCreateObjectV2) | **POST** /2/object/ezsigndocument | Create a new Ezsigndocument
[**ezsigndocumentDeleteObjectV1**](ObjectEzsigndocumentApi.md#ezsigndocumentDeleteObjectV1) | **DELETE** /1/object/ezsigndocument/{pkiEzsigndocumentID} | Delete an existing Ezsigndocument
[**ezsigndocumentEditEzsignformfieldgroupsV1**](ObjectEzsigndocumentApi.md#ezsigndocumentEditEzsignformfieldgroupsV1) | **PUT** /1/object/ezsigndocument/{pkiEzsigndocumentID}/editEzsignformfieldgroups | Edit multiple Ezsignformfieldgroups
[**ezsigndocumentEditEzsignsignaturesV1**](ObjectEzsigndocumentApi.md#ezsigndocumentEditEzsignsignaturesV1) | **PUT** /1/object/ezsigndocument/{pkiEzsigndocumentID}/editEzsignsignatures | Edit multiple Ezsignsignatures
[**ezsigndocumentEndPrematurelyV1**](ObjectEzsigndocumentApi.md#ezsigndocumentEndPrematurelyV1) | **POST** /1/object/ezsigndocument/{pkiEzsigndocumentID}/endPrematurely | End prematurely
[**ezsigndocumentGetDownloadUrlV1**](ObjectEzsigndocumentApi.md#ezsigndocumentGetDownloadUrlV1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID}/getDownloadUrl/{eDocumentType} | Retrieve a URL to download documents.
[**ezsigndocumentGetEzsignformfieldgroupsV1**](ObjectEzsigndocumentApi.md#ezsigndocumentGetEzsignformfieldgroupsV1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID}/getEzsignformfieldgroups | Retrieve an existing Ezsigndocument&#39;s Ezsignformfieldgroups
[**ezsigndocumentGetEzsignpagesV1**](ObjectEzsigndocumentApi.md#ezsigndocumentGetEzsignpagesV1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID}/getEzsignpages | Retrieve an existing Ezsigndocument&#39;s Ezsignpages
[**ezsigndocumentGetEzsignsignaturesV1**](ObjectEzsigndocumentApi.md#ezsigndocumentGetEzsignsignaturesV1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID}/getEzsignsignatures | Retrieve an existing Ezsigndocument&#39;s Ezsignsignatures
[**ezsigndocumentGetFormDataV1**](ObjectEzsigndocumentApi.md#ezsigndocumentGetFormDataV1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID}/getFormData | Retrieve an existing Ezsigndocument&#39;s Form Data
[**ezsigndocumentGetObjectV1**](ObjectEzsigndocumentApi.md#ezsigndocumentGetObjectV1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID} | Retrieve an existing Ezsigndocument
[**ezsigndocumentGetTemporaryProofV1**](ObjectEzsigndocumentApi.md#ezsigndocumentGetTemporaryProofV1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID}/getTemporaryProof | Retrieve the temporary proof
[**ezsigndocumentGetWordsPositionsV1**](ObjectEzsigndocumentApi.md#ezsigndocumentGetWordsPositionsV1) | **POST** /1/object/ezsigndocument/{pkiEzsigndocumentID}/getWordsPositions | Retrieve positions X,Y of given words from a Ezsigndocument
[**ezsigndocumentPatchObjectV1**](ObjectEzsigndocumentApi.md#ezsigndocumentPatchObjectV1) | **PATCH** /1/object/ezsigndocument/{pkiEzsigndocumentID} | Patch an existing Ezsigndocument


<a name="ezsigndocumentApplyEzsigntemplateV1"></a>
# **ezsigndocumentApplyEzsigntemplateV1**
> EzsigndocumentApplyEzsigntemplateV1Response ezsigndocumentApplyEzsigntemplateV1(pkiEzsigndocumentID, ezsigndocumentApplyEzsigntemplateV1Request)

Apply an Ezsign Template to the Ezsigndocument.

This function is deprecated. Please use *applyEzsigntemplate* instead which is doing the same thing but with a capital \&quot;E\&quot; to normalize the nomenclature.  This endpoint applies a predefined template to the ezsign document. This allows to automatically apply all the form and signature fields on a document in a single step.  The document must not already have fields otherwise an error will be returned.

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsigndocumentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsigndocumentApi apiInstance = new ObjectEzsigndocumentApi(defaultClient);
    Integer pkiEzsigndocumentID = 56; // Integer | 
    EzsigndocumentApplyEzsigntemplateV1Request ezsigndocumentApplyEzsigntemplateV1Request = new EzsigndocumentApplyEzsigntemplateV1Request(); // EzsigndocumentApplyEzsigntemplateV1Request | 
    try {
      EzsigndocumentApplyEzsigntemplateV1Response result = apiInstance.ezsigndocumentApplyEzsigntemplateV1(pkiEzsigndocumentID, ezsigndocumentApplyEzsigntemplateV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsigndocumentApi#ezsigndocumentApplyEzsigntemplateV1");
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
 **pkiEzsigndocumentID** | **Integer**|  |
 **ezsigndocumentApplyEzsigntemplateV1Request** | [**EzsigndocumentApplyEzsigntemplateV1Request**](EzsigndocumentApplyEzsigntemplateV1Request.md)|  |

### Return type

[**EzsigndocumentApplyEzsigntemplateV1Response**](EzsigndocumentApplyEzsigntemplateV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |
**404** | The element you are trying to work on does not exist |  -  |
**422** | The syntax of the request is valid but the request cannot be completed. Look for detail in body. |  -  |

<a name="ezsigndocumentApplyEzsigntemplateV2"></a>
# **ezsigndocumentApplyEzsigntemplateV2**
> EzsigndocumentApplyEzsigntemplateV2Response ezsigndocumentApplyEzsigntemplateV2(pkiEzsigndocumentID, ezsigndocumentApplyEzsigntemplateV2Request)

Apply an Ezsign Template to the Ezsigndocument.

This endpoint applies a predefined template to the ezsign document. This allows to automatically apply all the form and signature fields on a document in a single step.  The document must not already have fields otherwise an error will be returned.

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsigndocumentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsigndocumentApi apiInstance = new ObjectEzsigndocumentApi(defaultClient);
    Integer pkiEzsigndocumentID = 56; // Integer | 
    EzsigndocumentApplyEzsigntemplateV2Request ezsigndocumentApplyEzsigntemplateV2Request = new EzsigndocumentApplyEzsigntemplateV2Request(); // EzsigndocumentApplyEzsigntemplateV2Request | 
    try {
      EzsigndocumentApplyEzsigntemplateV2Response result = apiInstance.ezsigndocumentApplyEzsigntemplateV2(pkiEzsigndocumentID, ezsigndocumentApplyEzsigntemplateV2Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsigndocumentApi#ezsigndocumentApplyEzsigntemplateV2");
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
 **pkiEzsigndocumentID** | **Integer**|  |
 **ezsigndocumentApplyEzsigntemplateV2Request** | [**EzsigndocumentApplyEzsigntemplateV2Request**](EzsigndocumentApplyEzsigntemplateV2Request.md)|  |

### Return type

[**EzsigndocumentApplyEzsigntemplateV2Response**](EzsigndocumentApplyEzsigntemplateV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |
**404** | The element you are trying to work on does not exist |  -  |
**422** | The syntax of the request is valid but the request cannot be completed. Look for detail in body. |  -  |

<a name="ezsigndocumentCreateObjectV1"></a>
# **ezsigndocumentCreateObjectV1**
> EzsigndocumentCreateObjectV1Response ezsigndocumentCreateObjectV1(ezsigndocumentCreateObjectV1Request)

Create a new Ezsigndocument

The endpoint allows to create one or many elements at once.  The array can contain simple (Just the object) or compound (The object and its child) objects.  Creating compound elements allows to reduce the multiple requests to create all child objects.

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsigndocumentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsigndocumentApi apiInstance = new ObjectEzsigndocumentApi(defaultClient);
    List<EzsigndocumentCreateObjectV1Request> ezsigndocumentCreateObjectV1Request = Arrays.asList(); // List<EzsigndocumentCreateObjectV1Request> | 
    try {
      EzsigndocumentCreateObjectV1Response result = apiInstance.ezsigndocumentCreateObjectV1(ezsigndocumentCreateObjectV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsigndocumentApi#ezsigndocumentCreateObjectV1");
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
 **ezsigndocumentCreateObjectV1Request** | [**List&lt;EzsigndocumentCreateObjectV1Request&gt;**](EzsigndocumentCreateObjectV1Request.md)|  |

### Return type

[**EzsigndocumentCreateObjectV1Response**](EzsigndocumentCreateObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Successful response |  -  |
**422** | The syntax of the request is valid but the request cannot be completed. Look for detail in body. If the error is recoverable sTemporaryFileUrl will be set and you can use this url to try a new request without sending the file over again |  -  |

<a name="ezsigndocumentCreateObjectV2"></a>
# **ezsigndocumentCreateObjectV2**
> EzsigndocumentCreateObjectV2Response ezsigndocumentCreateObjectV2(ezsigndocumentCreateObjectV2Request)

Create a new Ezsigndocument

The endpoint allows to create one or many elements at once.

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsigndocumentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsigndocumentApi apiInstance = new ObjectEzsigndocumentApi(defaultClient);
    EzsigndocumentCreateObjectV2Request ezsigndocumentCreateObjectV2Request = new EzsigndocumentCreateObjectV2Request(); // EzsigndocumentCreateObjectV2Request | 
    try {
      EzsigndocumentCreateObjectV2Response result = apiInstance.ezsigndocumentCreateObjectV2(ezsigndocumentCreateObjectV2Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsigndocumentApi#ezsigndocumentCreateObjectV2");
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
 **ezsigndocumentCreateObjectV2Request** | [**EzsigndocumentCreateObjectV2Request**](EzsigndocumentCreateObjectV2Request.md)|  |

### Return type

[**EzsigndocumentCreateObjectV2Response**](EzsigndocumentCreateObjectV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Successful response |  -  |
**422** | The syntax of the request is valid but the request cannot be completed. Look for detail in body. If the error is recoverable sTemporaryFileUrl will be set and you can use this url to try a new request without sending the file over again |  -  |

<a name="ezsigndocumentDeleteObjectV1"></a>
# **ezsigndocumentDeleteObjectV1**
> EzsigndocumentDeleteObjectV1Response ezsigndocumentDeleteObjectV1(pkiEzsigndocumentID)

Delete an existing Ezsigndocument



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsigndocumentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsigndocumentApi apiInstance = new ObjectEzsigndocumentApi(defaultClient);
    Integer pkiEzsigndocumentID = 56; // Integer | 
    try {
      EzsigndocumentDeleteObjectV1Response result = apiInstance.ezsigndocumentDeleteObjectV1(pkiEzsigndocumentID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsigndocumentApi#ezsigndocumentDeleteObjectV1");
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
 **pkiEzsigndocumentID** | **Integer**|  |

### Return type

[**EzsigndocumentDeleteObjectV1Response**](EzsigndocumentDeleteObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |
**404** | The element you are trying to work on does not exist |  -  |
**422** | The syntax of the request is valid but the request cannot be completed. Look for detail in body. |  -  |

<a name="ezsigndocumentEditEzsignformfieldgroupsV1"></a>
# **ezsigndocumentEditEzsignformfieldgroupsV1**
> EzsigndocumentEditEzsignformfieldgroupsV1Response ezsigndocumentEditEzsignformfieldgroupsV1(pkiEzsigndocumentID, ezsigndocumentEditEzsignformfieldgroupsV1Request)

Edit multiple Ezsignformfieldgroups

Using this endpoint, you can edit multiple Ezsignformfieldgroups at the same time.

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsigndocumentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsigndocumentApi apiInstance = new ObjectEzsigndocumentApi(defaultClient);
    Integer pkiEzsigndocumentID = 56; // Integer | 
    EzsigndocumentEditEzsignformfieldgroupsV1Request ezsigndocumentEditEzsignformfieldgroupsV1Request = new EzsigndocumentEditEzsignformfieldgroupsV1Request(); // EzsigndocumentEditEzsignformfieldgroupsV1Request | 
    try {
      EzsigndocumentEditEzsignformfieldgroupsV1Response result = apiInstance.ezsigndocumentEditEzsignformfieldgroupsV1(pkiEzsigndocumentID, ezsigndocumentEditEzsignformfieldgroupsV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsigndocumentApi#ezsigndocumentEditEzsignformfieldgroupsV1");
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
 **pkiEzsigndocumentID** | **Integer**|  |
 **ezsigndocumentEditEzsignformfieldgroupsV1Request** | [**EzsigndocumentEditEzsignformfieldgroupsV1Request**](EzsigndocumentEditEzsignformfieldgroupsV1Request.md)|  |

### Return type

[**EzsigndocumentEditEzsignformfieldgroupsV1Response**](EzsigndocumentEditEzsignformfieldgroupsV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |
**404** | The element you are trying to work on does not exist |  -  |
**422** | The syntax of the request is valid but the request cannot be completed. Look for detail in body. |  -  |

<a name="ezsigndocumentEditEzsignsignaturesV1"></a>
# **ezsigndocumentEditEzsignsignaturesV1**
> EzsigndocumentEditEzsignsignaturesV1Response ezsigndocumentEditEzsignsignaturesV1(pkiEzsigndocumentID, ezsigndocumentEditEzsignsignaturesV1Request)

Edit multiple Ezsignsignatures

Using this endpoint, you can edit multiple Ezsignsignatures at the same time.

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsigndocumentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsigndocumentApi apiInstance = new ObjectEzsigndocumentApi(defaultClient);
    Integer pkiEzsigndocumentID = 56; // Integer | 
    EzsigndocumentEditEzsignsignaturesV1Request ezsigndocumentEditEzsignsignaturesV1Request = new EzsigndocumentEditEzsignsignaturesV1Request(); // EzsigndocumentEditEzsignsignaturesV1Request | 
    try {
      EzsigndocumentEditEzsignsignaturesV1Response result = apiInstance.ezsigndocumentEditEzsignsignaturesV1(pkiEzsigndocumentID, ezsigndocumentEditEzsignsignaturesV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsigndocumentApi#ezsigndocumentEditEzsignsignaturesV1");
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
 **pkiEzsigndocumentID** | **Integer**|  |
 **ezsigndocumentEditEzsignsignaturesV1Request** | [**EzsigndocumentEditEzsignsignaturesV1Request**](EzsigndocumentEditEzsignsignaturesV1Request.md)|  |

### Return type

[**EzsigndocumentEditEzsignsignaturesV1Response**](EzsigndocumentEditEzsignsignaturesV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |
**404** | The element you are trying to work on does not exist |  -  |
**422** | The syntax of the request is valid but the request cannot be completed. Look for detail in body. |  -  |

<a name="ezsigndocumentEndPrematurelyV1"></a>
# **ezsigndocumentEndPrematurelyV1**
> EzsigndocumentEndPrematurelyV1Response ezsigndocumentEndPrematurelyV1(pkiEzsigndocumentID, body)

End prematurely

End prematurely an Ezsigndocument when some signatures are still required

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsigndocumentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsigndocumentApi apiInstance = new ObjectEzsigndocumentApi(defaultClient);
    Integer pkiEzsigndocumentID = 56; // Integer | 
    Object body = null; // Object | 
    try {
      EzsigndocumentEndPrematurelyV1Response result = apiInstance.ezsigndocumentEndPrematurelyV1(pkiEzsigndocumentID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsigndocumentApi#ezsigndocumentEndPrematurelyV1");
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
 **pkiEzsigndocumentID** | **Integer**|  |
 **body** | **Object**|  |

### Return type

[**EzsigndocumentEndPrematurelyV1Response**](EzsigndocumentEndPrematurelyV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |
**404** | The element you are trying to work on does not exist |  -  |
**422** | The syntax of the request is valid but the request cannot be completed. Look for detail in body. |  -  |

<a name="ezsigndocumentGetDownloadUrlV1"></a>
# **ezsigndocumentGetDownloadUrlV1**
> EzsigndocumentGetDownloadUrlV1Response ezsigndocumentGetDownloadUrlV1(pkiEzsigndocumentID, eDocumentType)

Retrieve a URL to download documents.

This endpoint returns URLs to different files that can be downloaded during the signing process.  These links will expire after 5 minutes so the download of the file should be made soon after retrieving the link.

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsigndocumentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsigndocumentApi apiInstance = new ObjectEzsigndocumentApi(defaultClient);
    Integer pkiEzsigndocumentID = 56; // Integer | 
    String eDocumentType = "Initial"; // String | The type of document to retrieve.  1. **Initial** Is the initial document before any signature were applied. 2. **Signed** Is the final document once all signatures were applied. 3. **Proofdocument** Is the evidence report. 4. **Proof** Is the complete evidence archive including all of the above and more. 
    try {
      EzsigndocumentGetDownloadUrlV1Response result = apiInstance.ezsigndocumentGetDownloadUrlV1(pkiEzsigndocumentID, eDocumentType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsigndocumentApi#ezsigndocumentGetDownloadUrlV1");
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
 **pkiEzsigndocumentID** | **Integer**|  |
 **eDocumentType** | **String**| The type of document to retrieve.  1. **Initial** Is the initial document before any signature were applied. 2. **Signed** Is the final document once all signatures were applied. 3. **Proofdocument** Is the evidence report. 4. **Proof** Is the complete evidence archive including all of the above and more.  | [enum: Initial, Signed, Proof, Proofdocument]

### Return type

[**EzsigndocumentGetDownloadUrlV1Response**](EzsigndocumentGetDownloadUrlV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |
**404** | The element you are trying to work on does not exist |  -  |
**422** | The syntax of the request is valid but the request cannot be completed. Look for detail in body. |  -  |

<a name="ezsigndocumentGetEzsignformfieldgroupsV1"></a>
# **ezsigndocumentGetEzsignformfieldgroupsV1**
> EzsigndocumentGetEzsignformfieldgroupsV1Response ezsigndocumentGetEzsignformfieldgroupsV1(pkiEzsigndocumentID)

Retrieve an existing Ezsigndocument&#39;s Ezsignformfieldgroups



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsigndocumentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsigndocumentApi apiInstance = new ObjectEzsigndocumentApi(defaultClient);
    Integer pkiEzsigndocumentID = 56; // Integer | 
    try {
      EzsigndocumentGetEzsignformfieldgroupsV1Response result = apiInstance.ezsigndocumentGetEzsignformfieldgroupsV1(pkiEzsigndocumentID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsigndocumentApi#ezsigndocumentGetEzsignformfieldgroupsV1");
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
 **pkiEzsigndocumentID** | **Integer**|  |

### Return type

[**EzsigndocumentGetEzsignformfieldgroupsV1Response**](EzsigndocumentGetEzsignformfieldgroupsV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |
**404** | The element you are trying to work on does not exist |  -  |
**422** | The syntax of the request is valid but the request cannot be completed. Look for detail in body. |  -  |

<a name="ezsigndocumentGetEzsignpagesV1"></a>
# **ezsigndocumentGetEzsignpagesV1**
> EzsigndocumentGetEzsignpagesV1Response ezsigndocumentGetEzsignpagesV1(pkiEzsigndocumentID)

Retrieve an existing Ezsigndocument&#39;s Ezsignpages



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsigndocumentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsigndocumentApi apiInstance = new ObjectEzsigndocumentApi(defaultClient);
    Integer pkiEzsigndocumentID = 56; // Integer | 
    try {
      EzsigndocumentGetEzsignpagesV1Response result = apiInstance.ezsigndocumentGetEzsignpagesV1(pkiEzsigndocumentID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsigndocumentApi#ezsigndocumentGetEzsignpagesV1");
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
 **pkiEzsigndocumentID** | **Integer**|  |

### Return type

[**EzsigndocumentGetEzsignpagesV1Response**](EzsigndocumentGetEzsignpagesV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |
**404** | The element you are trying to work on does not exist |  -  |
**422** | The syntax of the request is valid but the request cannot be completed. Look for detail in body. |  -  |

<a name="ezsigndocumentGetEzsignsignaturesV1"></a>
# **ezsigndocumentGetEzsignsignaturesV1**
> EzsigndocumentGetEzsignsignaturesV1Response ezsigndocumentGetEzsignsignaturesV1(pkiEzsigndocumentID)

Retrieve an existing Ezsigndocument&#39;s Ezsignsignatures



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsigndocumentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsigndocumentApi apiInstance = new ObjectEzsigndocumentApi(defaultClient);
    Integer pkiEzsigndocumentID = 56; // Integer | 
    try {
      EzsigndocumentGetEzsignsignaturesV1Response result = apiInstance.ezsigndocumentGetEzsignsignaturesV1(pkiEzsigndocumentID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsigndocumentApi#ezsigndocumentGetEzsignsignaturesV1");
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
 **pkiEzsigndocumentID** | **Integer**|  |

### Return type

[**EzsigndocumentGetEzsignsignaturesV1Response**](EzsigndocumentGetEzsignsignaturesV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |
**404** | The element you are trying to work on does not exist |  -  |
**422** | The syntax of the request is valid but the request cannot be completed. Look for detail in body. |  -  |

<a name="ezsigndocumentGetFormDataV1"></a>
# **ezsigndocumentGetFormDataV1**
> EzsigndocumentGetFormDataV1Response ezsigndocumentGetFormDataV1(pkiEzsigndocumentID)

Retrieve an existing Ezsigndocument&#39;s Form Data



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsigndocumentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsigndocumentApi apiInstance = new ObjectEzsigndocumentApi(defaultClient);
    Integer pkiEzsigndocumentID = 56; // Integer | 
    try {
      EzsigndocumentGetFormDataV1Response result = apiInstance.ezsigndocumentGetFormDataV1(pkiEzsigndocumentID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsigndocumentApi#ezsigndocumentGetFormDataV1");
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
 **pkiEzsigndocumentID** | **Integer**|  |

### Return type

[**EzsigndocumentGetFormDataV1Response**](EzsigndocumentGetFormDataV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/zip, text/csv

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |
**404** | The element you are trying to work on does not exist |  -  |
**406** | One of the accept header is not defined or invalid. |  -  |
**422** | The syntax of the request is valid but the request cannot be completed. Look for detail in body. |  -  |

<a name="ezsigndocumentGetObjectV1"></a>
# **ezsigndocumentGetObjectV1**
> EzsigndocumentGetObjectV1Response ezsigndocumentGetObjectV1(pkiEzsigndocumentID)

Retrieve an existing Ezsigndocument

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsigndocumentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsigndocumentApi apiInstance = new ObjectEzsigndocumentApi(defaultClient);
    Integer pkiEzsigndocumentID = 56; // Integer | 
    try {
      EzsigndocumentGetObjectV1Response result = apiInstance.ezsigndocumentGetObjectV1(pkiEzsigndocumentID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsigndocumentApi#ezsigndocumentGetObjectV1");
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
 **pkiEzsigndocumentID** | **Integer**|  |

### Return type

[**EzsigndocumentGetObjectV1Response**](EzsigndocumentGetObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |
**404** | The element you are trying to work on does not exist |  -  |

<a name="ezsigndocumentGetTemporaryProofV1"></a>
# **ezsigndocumentGetTemporaryProofV1**
> EzsigndocumentGetTemporaryProofV1Response ezsigndocumentGetTemporaryProofV1(pkiEzsigndocumentID)

Retrieve the temporary proof

Retrieve the temporary proof while the Ezsigndocument is being processed since the proof isn&#39;t available until the Ezsigndocument is completed

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsigndocumentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsigndocumentApi apiInstance = new ObjectEzsigndocumentApi(defaultClient);
    Integer pkiEzsigndocumentID = 56; // Integer | 
    try {
      EzsigndocumentGetTemporaryProofV1Response result = apiInstance.ezsigndocumentGetTemporaryProofV1(pkiEzsigndocumentID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsigndocumentApi#ezsigndocumentGetTemporaryProofV1");
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
 **pkiEzsigndocumentID** | **Integer**|  |

### Return type

[**EzsigndocumentGetTemporaryProofV1Response**](EzsigndocumentGetTemporaryProofV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |
**404** | The element you are trying to work on does not exist |  -  |
**422** | The syntax of the request is valid but the request cannot be completed. Look for detail in body. |  -  |

<a name="ezsigndocumentGetWordsPositionsV1"></a>
# **ezsigndocumentGetWordsPositionsV1**
> EzsigndocumentGetWordsPositionsV1Response ezsigndocumentGetWordsPositionsV1(pkiEzsigndocumentID, ezsigndocumentGetWordsPositionsV1Request)

Retrieve positions X,Y of given words from a Ezsigndocument



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsigndocumentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsigndocumentApi apiInstance = new ObjectEzsigndocumentApi(defaultClient);
    Integer pkiEzsigndocumentID = 56; // Integer | 
    EzsigndocumentGetWordsPositionsV1Request ezsigndocumentGetWordsPositionsV1Request = new EzsigndocumentGetWordsPositionsV1Request(); // EzsigndocumentGetWordsPositionsV1Request | 
    try {
      EzsigndocumentGetWordsPositionsV1Response result = apiInstance.ezsigndocumentGetWordsPositionsV1(pkiEzsigndocumentID, ezsigndocumentGetWordsPositionsV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsigndocumentApi#ezsigndocumentGetWordsPositionsV1");
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
 **pkiEzsigndocumentID** | **Integer**|  |
 **ezsigndocumentGetWordsPositionsV1Request** | [**EzsigndocumentGetWordsPositionsV1Request**](EzsigndocumentGetWordsPositionsV1Request.md)|  |

### Return type

[**EzsigndocumentGetWordsPositionsV1Response**](EzsigndocumentGetWordsPositionsV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |
**404** | The element you are trying to work on does not exist |  -  |
**422** | The syntax of the request is valid but the request cannot be completed. Look for detail in body. |  -  |

<a name="ezsigndocumentPatchObjectV1"></a>
# **ezsigndocumentPatchObjectV1**
> EzsigndocumentPatchObjectV1Response ezsigndocumentPatchObjectV1(pkiEzsigndocumentID, ezsigndocumentPatchObjectV1Request)

Patch an existing Ezsigndocument



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsigndocumentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsigndocumentApi apiInstance = new ObjectEzsigndocumentApi(defaultClient);
    Integer pkiEzsigndocumentID = 56; // Integer | 
    EzsigndocumentPatchObjectV1Request ezsigndocumentPatchObjectV1Request = new EzsigndocumentPatchObjectV1Request(); // EzsigndocumentPatchObjectV1Request | 
    try {
      EzsigndocumentPatchObjectV1Response result = apiInstance.ezsigndocumentPatchObjectV1(pkiEzsigndocumentID, ezsigndocumentPatchObjectV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsigndocumentApi#ezsigndocumentPatchObjectV1");
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
 **pkiEzsigndocumentID** | **Integer**|  |
 **ezsigndocumentPatchObjectV1Request** | [**EzsigndocumentPatchObjectV1Request**](EzsigndocumentPatchObjectV1Request.md)|  |

### Return type

[**EzsigndocumentPatchObjectV1Response**](EzsigndocumentPatchObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |
**404** | The element you are trying to work on does not exist |  -  |
**422** | The syntax of the request is valid but the request cannot be completed. Look for detail in body. |  -  |

