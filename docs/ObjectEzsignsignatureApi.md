# ObjectEzsignsignatureApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**ezsignsignatureCreateObjectV1**](ObjectEzsignsignatureApi.md#ezsignsignatureCreateObjectV1) | **POST** /1/object/ezsignsignature | Create a new Ezsignsignature |
| [**ezsignsignatureCreateObjectV2**](ObjectEzsignsignatureApi.md#ezsignsignatureCreateObjectV2) | **POST** /2/object/ezsignsignature | Create a new Ezsignsignature |
| [**ezsignsignatureCreateObjectV3**](ObjectEzsignsignatureApi.md#ezsignsignatureCreateObjectV3) | **POST** /3/object/ezsignsignature | Create a new Ezsignsignature |
| [**ezsignsignatureDeleteObjectV1**](ObjectEzsignsignatureApi.md#ezsignsignatureDeleteObjectV1) | **DELETE** /1/object/ezsignsignature/{pkiEzsignsignatureID} | Delete an existing Ezsignsignature |
| [**ezsignsignatureEditObjectV2**](ObjectEzsignsignatureApi.md#ezsignsignatureEditObjectV2) | **PUT** /2/object/ezsignsignature/{pkiEzsignsignatureID} | Edit an existing Ezsignsignature |
| [**ezsignsignatureGetEzsignsignatureattachmentV1**](ObjectEzsignsignatureApi.md#ezsignsignatureGetEzsignsignatureattachmentV1) | **GET** /1/object/ezsignsignature/{pkiEzsignsignatureID}/getEzsignsignatureattachment | Retrieve an existing Ezsignsignature&#39;s Ezsignsignatureattachments |
| [**ezsignsignatureGetEzsignsignaturesAutomaticV1**](ObjectEzsignsignatureApi.md#ezsignsignatureGetEzsignsignaturesAutomaticV1) | **GET** /1/object/ezsignsignature/getEzsignsignaturesAutomatic | Retrieve all automatic Ezsignsignatures |
| [**ezsignsignatureGetObjectV3**](ObjectEzsignsignatureApi.md#ezsignsignatureGetObjectV3) | **GET** /3/object/ezsignsignature/{pkiEzsignsignatureID} | Retrieve an existing Ezsignsignature |
| [**ezsignsignatureSignV1**](ObjectEzsignsignatureApi.md#ezsignsignatureSignV1) | **POST** /1/object/ezsignsignature/{pkiEzsignsignatureID}/sign | Sign the Ezsignsignature |


<a id="ezsignsignatureCreateObjectV1"></a>
# **ezsignsignatureCreateObjectV1**
> EzsignsignatureCreateObjectV1Response ezsignsignatureCreateObjectV1(ezsignsignatureCreateObjectV1Request)

Create a new Ezsignsignature

The endpoint allows to create one or many elements at once.  The array can contain simple (Just the object) or compound (The object and its child) objects.  Creating compound elements allows to reduce the multiple requests to create all child objects.

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsignsignatureApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsignsignatureApi apiInstance = new ObjectEzsignsignatureApi(defaultClient);
    List<EzsignsignatureCreateObjectV1Request> ezsignsignatureCreateObjectV1Request = Arrays.asList(); // List<EzsignsignatureCreateObjectV1Request> | 
    try {
      EzsignsignatureCreateObjectV1Response result = apiInstance.ezsignsignatureCreateObjectV1(ezsignsignatureCreateObjectV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsignsignatureApi#ezsignsignatureCreateObjectV1");
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
| **ezsignsignatureCreateObjectV1Request** | [**List&lt;EzsignsignatureCreateObjectV1Request&gt;**](EzsignsignatureCreateObjectV1Request.md)|  | |

### Return type

[**EzsignsignatureCreateObjectV1Response**](EzsignsignatureCreateObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful response |  -  |

<a id="ezsignsignatureCreateObjectV2"></a>
# **ezsignsignatureCreateObjectV2**
> EzsignsignatureCreateObjectV2Response ezsignsignatureCreateObjectV2(ezsignsignatureCreateObjectV2Request)

Create a new Ezsignsignature

The endpoint allows to create one or many elements at once.

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsignsignatureApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsignsignatureApi apiInstance = new ObjectEzsignsignatureApi(defaultClient);
    EzsignsignatureCreateObjectV2Request ezsignsignatureCreateObjectV2Request = new EzsignsignatureCreateObjectV2Request(); // EzsignsignatureCreateObjectV2Request | 
    try {
      EzsignsignatureCreateObjectV2Response result = apiInstance.ezsignsignatureCreateObjectV2(ezsignsignatureCreateObjectV2Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsignsignatureApi#ezsignsignatureCreateObjectV2");
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
| **ezsignsignatureCreateObjectV2Request** | [**EzsignsignatureCreateObjectV2Request**](EzsignsignatureCreateObjectV2Request.md)|  | |

### Return type

[**EzsignsignatureCreateObjectV2Response**](EzsignsignatureCreateObjectV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful response |  -  |

<a id="ezsignsignatureCreateObjectV3"></a>
# **ezsignsignatureCreateObjectV3**
> EzsignsignatureCreateObjectV3Response ezsignsignatureCreateObjectV3(ezsignsignatureCreateObjectV3Request)

Create a new Ezsignsignature

The endpoint allows to create one or many elements at once.

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsignsignatureApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsignsignatureApi apiInstance = new ObjectEzsignsignatureApi(defaultClient);
    EzsignsignatureCreateObjectV3Request ezsignsignatureCreateObjectV3Request = new EzsignsignatureCreateObjectV3Request(); // EzsignsignatureCreateObjectV3Request | 
    try {
      EzsignsignatureCreateObjectV3Response result = apiInstance.ezsignsignatureCreateObjectV3(ezsignsignatureCreateObjectV3Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsignsignatureApi#ezsignsignatureCreateObjectV3");
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
| **ezsignsignatureCreateObjectV3Request** | [**EzsignsignatureCreateObjectV3Request**](EzsignsignatureCreateObjectV3Request.md)|  | |

### Return type

[**EzsignsignatureCreateObjectV3Response**](EzsignsignatureCreateObjectV3Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful response |  -  |

<a id="ezsignsignatureDeleteObjectV1"></a>
# **ezsignsignatureDeleteObjectV1**
> EzsignsignatureDeleteObjectV1Response ezsignsignatureDeleteObjectV1(pkiEzsignsignatureID)

Delete an existing Ezsignsignature



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsignsignatureApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsignsignatureApi apiInstance = new ObjectEzsignsignatureApi(defaultClient);
    Integer pkiEzsignsignatureID = 56; // Integer | 
    try {
      EzsignsignatureDeleteObjectV1Response result = apiInstance.ezsignsignatureDeleteObjectV1(pkiEzsignsignatureID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsignsignatureApi#ezsignsignatureDeleteObjectV1");
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
| **pkiEzsignsignatureID** | **Integer**|  | |

### Return type

[**EzsignsignatureDeleteObjectV1Response**](EzsignsignatureDeleteObjectV1Response.md)

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
| **422** | The request was syntactically valid but failed because of an interdependance condition. Look for detail about the error in the body |  -  |

<a id="ezsignsignatureEditObjectV2"></a>
# **ezsignsignatureEditObjectV2**
> EzsignsignatureEditObjectV2Response ezsignsignatureEditObjectV2(pkiEzsignsignatureID, ezsignsignatureEditObjectV2Request)

Edit an existing Ezsignsignature



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsignsignatureApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsignsignatureApi apiInstance = new ObjectEzsignsignatureApi(defaultClient);
    Integer pkiEzsignsignatureID = 56; // Integer | 
    EzsignsignatureEditObjectV2Request ezsignsignatureEditObjectV2Request = new EzsignsignatureEditObjectV2Request(); // EzsignsignatureEditObjectV2Request | 
    try {
      EzsignsignatureEditObjectV2Response result = apiInstance.ezsignsignatureEditObjectV2(pkiEzsignsignatureID, ezsignsignatureEditObjectV2Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsignsignatureApi#ezsignsignatureEditObjectV2");
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
| **pkiEzsignsignatureID** | **Integer**|  | |
| **ezsignsignatureEditObjectV2Request** | [**EzsignsignatureEditObjectV2Request**](EzsignsignatureEditObjectV2Request.md)|  | |

### Return type

[**EzsignsignatureEditObjectV2Response**](EzsignsignatureEditObjectV2Response.md)

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

<a id="ezsignsignatureGetEzsignsignatureattachmentV1"></a>
# **ezsignsignatureGetEzsignsignatureattachmentV1**
> EzsignsignatureGetEzsignsignatureattachmentV1Response ezsignsignatureGetEzsignsignatureattachmentV1(pkiEzsignsignatureID)

Retrieve an existing Ezsignsignature&#39;s Ezsignsignatureattachments

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsignsignatureApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsignsignatureApi apiInstance = new ObjectEzsignsignatureApi(defaultClient);
    Integer pkiEzsignsignatureID = 56; // Integer | 
    try {
      EzsignsignatureGetEzsignsignatureattachmentV1Response result = apiInstance.ezsignsignatureGetEzsignsignatureattachmentV1(pkiEzsignsignatureID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsignsignatureApi#ezsignsignatureGetEzsignsignatureattachmentV1");
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
| **pkiEzsignsignatureID** | **Integer**|  | |

### Return type

[**EzsignsignatureGetEzsignsignatureattachmentV1Response**](EzsignsignatureGetEzsignsignatureattachmentV1Response.md)

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
| **422** | The request was syntactically valid but failed because of an interdependance condition. Look for detail about the error in the body |  -  |

<a id="ezsignsignatureGetEzsignsignaturesAutomaticV1"></a>
# **ezsignsignatureGetEzsignsignaturesAutomaticV1**
> EzsignsignatureGetEzsignsignaturesAutomaticV1Response ezsignsignatureGetEzsignsignaturesAutomaticV1()

Retrieve all automatic Ezsignsignatures

Return all the Ezsignsignatures that can be signed by the current user

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsignsignatureApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsignsignatureApi apiInstance = new ObjectEzsignsignatureApi(defaultClient);
    try {
      EzsignsignatureGetEzsignsignaturesAutomaticV1Response result = apiInstance.ezsignsignatureGetEzsignsignaturesAutomaticV1();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsignsignatureApi#ezsignsignatureGetEzsignsignaturesAutomaticV1");
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

[**EzsignsignatureGetEzsignsignaturesAutomaticV1Response**](EzsignsignatureGetEzsignsignaturesAutomaticV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="ezsignsignatureGetObjectV3"></a>
# **ezsignsignatureGetObjectV3**
> EzsignsignatureGetObjectV3Response ezsignsignatureGetObjectV3(pkiEzsignsignatureID)

Retrieve an existing Ezsignsignature



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsignsignatureApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsignsignatureApi apiInstance = new ObjectEzsignsignatureApi(defaultClient);
    Integer pkiEzsignsignatureID = 56; // Integer | 
    try {
      EzsignsignatureGetObjectV3Response result = apiInstance.ezsignsignatureGetObjectV3(pkiEzsignsignatureID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsignsignatureApi#ezsignsignatureGetObjectV3");
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
| **pkiEzsignsignatureID** | **Integer**|  | |

### Return type

[**EzsignsignatureGetObjectV3Response**](EzsignsignatureGetObjectV3Response.md)

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

<a id="ezsignsignatureSignV1"></a>
# **ezsignsignatureSignV1**
> EzsignsignatureSignV1Response ezsignsignatureSignV1(pkiEzsignsignatureID, ezsignsignatureSignV1Request)

Sign the Ezsignsignature



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsignsignatureApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsignsignatureApi apiInstance = new ObjectEzsignsignatureApi(defaultClient);
    Integer pkiEzsignsignatureID = 56; // Integer | 
    EzsignsignatureSignV1Request ezsignsignatureSignV1Request = new EzsignsignatureSignV1Request(); // EzsignsignatureSignV1Request | 
    try {
      EzsignsignatureSignV1Response result = apiInstance.ezsignsignatureSignV1(pkiEzsignsignatureID, ezsignsignatureSignV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsignsignatureApi#ezsignsignatureSignV1");
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
| **pkiEzsignsignatureID** | **Integer**|  | |
| **ezsignsignatureSignV1Request** | [**EzsignsignatureSignV1Request**](EzsignsignatureSignV1Request.md)|  | |

### Return type

[**EzsignsignatureSignV1Response**](EzsignsignatureSignV1Response.md)

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

