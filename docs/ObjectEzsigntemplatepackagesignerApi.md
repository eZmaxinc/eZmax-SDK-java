# ObjectEzsigntemplatepackagesignerApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**ezsigntemplatepackagesignerCreateObjectV1**](ObjectEzsigntemplatepackagesignerApi.md#ezsigntemplatepackagesignerCreateObjectV1) | **POST** /1/object/ezsigntemplatepackagesigner | Create a new Ezsigntemplatepackagesigner |
| [**ezsigntemplatepackagesignerCreateObjectV2**](ObjectEzsigntemplatepackagesignerApi.md#ezsigntemplatepackagesignerCreateObjectV2) | **POST** /2/object/ezsigntemplatepackagesigner | Create a new Ezsigntemplatepackagesigner |
| [**ezsigntemplatepackagesignerDeleteObjectV1**](ObjectEzsigntemplatepackagesignerApi.md#ezsigntemplatepackagesignerDeleteObjectV1) | **DELETE** /1/object/ezsigntemplatepackagesigner/{pkiEzsigntemplatepackagesignerID} | Delete an existing Ezsigntemplatepackagesigner |
| [**ezsigntemplatepackagesignerEditObjectV1**](ObjectEzsigntemplatepackagesignerApi.md#ezsigntemplatepackagesignerEditObjectV1) | **PUT** /1/object/ezsigntemplatepackagesigner/{pkiEzsigntemplatepackagesignerID} | Edit an existing Ezsigntemplatepackagesigner |
| [**ezsigntemplatepackagesignerEditObjectV2**](ObjectEzsigntemplatepackagesignerApi.md#ezsigntemplatepackagesignerEditObjectV2) | **PUT** /2/object/ezsigntemplatepackagesigner/{pkiEzsigntemplatepackagesignerID} | Edit an existing Ezsigntemplatepackagesigner |
| [**ezsigntemplatepackagesignerGetObjectV2**](ObjectEzsigntemplatepackagesignerApi.md#ezsigntemplatepackagesignerGetObjectV2) | **GET** /2/object/ezsigntemplatepackagesigner/{pkiEzsigntemplatepackagesignerID} | Retrieve an existing Ezsigntemplatepackagesigner |
| [**ezsigntemplatepackagesignerGetObjectV3**](ObjectEzsigntemplatepackagesignerApi.md#ezsigntemplatepackagesignerGetObjectV3) | **GET** /3/object/ezsigntemplatepackagesigner/{pkiEzsigntemplatepackagesignerID} | Retrieve an existing Ezsigntemplatepackagesigner |


<a id="ezsigntemplatepackagesignerCreateObjectV1"></a>
# **ezsigntemplatepackagesignerCreateObjectV1**
> EzsigntemplatepackagesignerCreateObjectV1Response ezsigntemplatepackagesignerCreateObjectV1(ezsigntemplatepackagesignerCreateObjectV1Request)

Create a new Ezsigntemplatepackagesigner

The endpoint allows to create one or many elements at once.

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsigntemplatepackagesignerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsigntemplatepackagesignerApi apiInstance = new ObjectEzsigntemplatepackagesignerApi(defaultClient);
    EzsigntemplatepackagesignerCreateObjectV1Request ezsigntemplatepackagesignerCreateObjectV1Request = new EzsigntemplatepackagesignerCreateObjectV1Request(); // EzsigntemplatepackagesignerCreateObjectV1Request | 
    try {
      EzsigntemplatepackagesignerCreateObjectV1Response result = apiInstance.ezsigntemplatepackagesignerCreateObjectV1(ezsigntemplatepackagesignerCreateObjectV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsigntemplatepackagesignerApi#ezsigntemplatepackagesignerCreateObjectV1");
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
| **ezsigntemplatepackagesignerCreateObjectV1Request** | [**EzsigntemplatepackagesignerCreateObjectV1Request**](EzsigntemplatepackagesignerCreateObjectV1Request.md)|  | |

### Return type

[**EzsigntemplatepackagesignerCreateObjectV1Response**](EzsigntemplatepackagesignerCreateObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful response |  -  |

<a id="ezsigntemplatepackagesignerCreateObjectV2"></a>
# **ezsigntemplatepackagesignerCreateObjectV2**
> EzsigntemplatepackagesignerCreateObjectV2Response ezsigntemplatepackagesignerCreateObjectV2(ezsigntemplatepackagesignerCreateObjectV2Request)

Create a new Ezsigntemplatepackagesigner

The endpoint allows to create one or many elements at once.

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsigntemplatepackagesignerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsigntemplatepackagesignerApi apiInstance = new ObjectEzsigntemplatepackagesignerApi(defaultClient);
    EzsigntemplatepackagesignerCreateObjectV2Request ezsigntemplatepackagesignerCreateObjectV2Request = new EzsigntemplatepackagesignerCreateObjectV2Request(); // EzsigntemplatepackagesignerCreateObjectV2Request | 
    try {
      EzsigntemplatepackagesignerCreateObjectV2Response result = apiInstance.ezsigntemplatepackagesignerCreateObjectV2(ezsigntemplatepackagesignerCreateObjectV2Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsigntemplatepackagesignerApi#ezsigntemplatepackagesignerCreateObjectV2");
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
| **ezsigntemplatepackagesignerCreateObjectV2Request** | [**EzsigntemplatepackagesignerCreateObjectV2Request**](EzsigntemplatepackagesignerCreateObjectV2Request.md)|  | |

### Return type

[**EzsigntemplatepackagesignerCreateObjectV2Response**](EzsigntemplatepackagesignerCreateObjectV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful response |  -  |

<a id="ezsigntemplatepackagesignerDeleteObjectV1"></a>
# **ezsigntemplatepackagesignerDeleteObjectV1**
> EzsigntemplatepackagesignerDeleteObjectV1Response ezsigntemplatepackagesignerDeleteObjectV1(pkiEzsigntemplatepackagesignerID)

Delete an existing Ezsigntemplatepackagesigner



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsigntemplatepackagesignerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsigntemplatepackagesignerApi apiInstance = new ObjectEzsigntemplatepackagesignerApi(defaultClient);
    Integer pkiEzsigntemplatepackagesignerID = 56; // Integer | 
    try {
      EzsigntemplatepackagesignerDeleteObjectV1Response result = apiInstance.ezsigntemplatepackagesignerDeleteObjectV1(pkiEzsigntemplatepackagesignerID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsigntemplatepackagesignerApi#ezsigntemplatepackagesignerDeleteObjectV1");
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
| **pkiEzsigntemplatepackagesignerID** | **Integer**|  | |

### Return type

[**EzsigntemplatepackagesignerDeleteObjectV1Response**](EzsigntemplatepackagesignerDeleteObjectV1Response.md)

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

<a id="ezsigntemplatepackagesignerEditObjectV1"></a>
# **ezsigntemplatepackagesignerEditObjectV1**
> EzsigntemplatepackagesignerEditObjectV1Response ezsigntemplatepackagesignerEditObjectV1(pkiEzsigntemplatepackagesignerID, ezsigntemplatepackagesignerEditObjectV1Request)

Edit an existing Ezsigntemplatepackagesigner



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsigntemplatepackagesignerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsigntemplatepackagesignerApi apiInstance = new ObjectEzsigntemplatepackagesignerApi(defaultClient);
    Integer pkiEzsigntemplatepackagesignerID = 56; // Integer | 
    EzsigntemplatepackagesignerEditObjectV1Request ezsigntemplatepackagesignerEditObjectV1Request = new EzsigntemplatepackagesignerEditObjectV1Request(); // EzsigntemplatepackagesignerEditObjectV1Request | 
    try {
      EzsigntemplatepackagesignerEditObjectV1Response result = apiInstance.ezsigntemplatepackagesignerEditObjectV1(pkiEzsigntemplatepackagesignerID, ezsigntemplatepackagesignerEditObjectV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsigntemplatepackagesignerApi#ezsigntemplatepackagesignerEditObjectV1");
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
| **pkiEzsigntemplatepackagesignerID** | **Integer**|  | |
| **ezsigntemplatepackagesignerEditObjectV1Request** | [**EzsigntemplatepackagesignerEditObjectV1Request**](EzsigntemplatepackagesignerEditObjectV1Request.md)|  | |

### Return type

[**EzsigntemplatepackagesignerEditObjectV1Response**](EzsigntemplatepackagesignerEditObjectV1Response.md)

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

<a id="ezsigntemplatepackagesignerEditObjectV2"></a>
# **ezsigntemplatepackagesignerEditObjectV2**
> EzsigntemplatepackagesignerEditObjectV2Response ezsigntemplatepackagesignerEditObjectV2(pkiEzsigntemplatepackagesignerID, ezsigntemplatepackagesignerEditObjectV2Request)

Edit an existing Ezsigntemplatepackagesigner



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsigntemplatepackagesignerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsigntemplatepackagesignerApi apiInstance = new ObjectEzsigntemplatepackagesignerApi(defaultClient);
    Integer pkiEzsigntemplatepackagesignerID = 56; // Integer | 
    EzsigntemplatepackagesignerEditObjectV2Request ezsigntemplatepackagesignerEditObjectV2Request = new EzsigntemplatepackagesignerEditObjectV2Request(); // EzsigntemplatepackagesignerEditObjectV2Request | 
    try {
      EzsigntemplatepackagesignerEditObjectV2Response result = apiInstance.ezsigntemplatepackagesignerEditObjectV2(pkiEzsigntemplatepackagesignerID, ezsigntemplatepackagesignerEditObjectV2Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsigntemplatepackagesignerApi#ezsigntemplatepackagesignerEditObjectV2");
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
| **pkiEzsigntemplatepackagesignerID** | **Integer**|  | |
| **ezsigntemplatepackagesignerEditObjectV2Request** | [**EzsigntemplatepackagesignerEditObjectV2Request**](EzsigntemplatepackagesignerEditObjectV2Request.md)|  | |

### Return type

[**EzsigntemplatepackagesignerEditObjectV2Response**](EzsigntemplatepackagesignerEditObjectV2Response.md)

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

<a id="ezsigntemplatepackagesignerGetObjectV2"></a>
# **ezsigntemplatepackagesignerGetObjectV2**
> EzsigntemplatepackagesignerGetObjectV2Response ezsigntemplatepackagesignerGetObjectV2(pkiEzsigntemplatepackagesignerID)

Retrieve an existing Ezsigntemplatepackagesigner



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsigntemplatepackagesignerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsigntemplatepackagesignerApi apiInstance = new ObjectEzsigntemplatepackagesignerApi(defaultClient);
    Integer pkiEzsigntemplatepackagesignerID = 56; // Integer | 
    try {
      EzsigntemplatepackagesignerGetObjectV2Response result = apiInstance.ezsigntemplatepackagesignerGetObjectV2(pkiEzsigntemplatepackagesignerID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsigntemplatepackagesignerApi#ezsigntemplatepackagesignerGetObjectV2");
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
| **pkiEzsigntemplatepackagesignerID** | **Integer**|  | |

### Return type

[**EzsigntemplatepackagesignerGetObjectV2Response**](EzsigntemplatepackagesignerGetObjectV2Response.md)

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

<a id="ezsigntemplatepackagesignerGetObjectV3"></a>
# **ezsigntemplatepackagesignerGetObjectV3**
> EzsigntemplatepackagesignerGetObjectV3Response ezsigntemplatepackagesignerGetObjectV3(pkiEzsigntemplatepackagesignerID)

Retrieve an existing Ezsigntemplatepackagesigner



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsigntemplatepackagesignerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsigntemplatepackagesignerApi apiInstance = new ObjectEzsigntemplatepackagesignerApi(defaultClient);
    Integer pkiEzsigntemplatepackagesignerID = 56; // Integer | 
    try {
      EzsigntemplatepackagesignerGetObjectV3Response result = apiInstance.ezsigntemplatepackagesignerGetObjectV3(pkiEzsigntemplatepackagesignerID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsigntemplatepackagesignerApi#ezsigntemplatepackagesignerGetObjectV3");
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
| **pkiEzsigntemplatepackagesignerID** | **Integer**|  | |

### Return type

[**EzsigntemplatepackagesignerGetObjectV3Response**](EzsigntemplatepackagesignerGetObjectV3Response.md)

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

