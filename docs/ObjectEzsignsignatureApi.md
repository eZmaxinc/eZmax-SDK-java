# ObjectEzsignsignatureApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ezsignsignatureCreateObjectV1**](ObjectEzsignsignatureApi.md#ezsignsignatureCreateObjectV1) | **POST** /1/object/ezsignsignature | Create a new Ezsignsignature
[**ezsignsignatureCreateObjectV2**](ObjectEzsignsignatureApi.md#ezsignsignatureCreateObjectV2) | **POST** /2/object/ezsignsignature | Create a new Ezsignsignature
[**ezsignsignatureDeleteObjectV1**](ObjectEzsignsignatureApi.md#ezsignsignatureDeleteObjectV1) | **DELETE** /1/object/ezsignsignature/{pkiEzsignsignatureID} | Delete an existing Ezsignsignature
[**ezsignsignatureEditObjectV1**](ObjectEzsignsignatureApi.md#ezsignsignatureEditObjectV1) | **PUT** /1/object/ezsignsignature/{pkiEzsignsignatureID} | Edit an existing Ezsignsignature
[**ezsignsignatureGetObjectV1**](ObjectEzsignsignatureApi.md#ezsignsignatureGetObjectV1) | **GET** /1/object/ezsignsignature/{pkiEzsignsignatureID} | Retrieve an existing Ezsignsignature


<a name="ezsignsignatureCreateObjectV1"></a>
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ezsignsignatureCreateObjectV1Request** | [**List&lt;EzsignsignatureCreateObjectV1Request&gt;**](EzsignsignatureCreateObjectV1Request.md)|  |

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
**201** | Successful response |  -  |

<a name="ezsignsignatureCreateObjectV2"></a>
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ezsignsignatureCreateObjectV2Request** | [**EzsignsignatureCreateObjectV2Request**](EzsignsignatureCreateObjectV2Request.md)|  |

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
**201** | Successful response |  -  |

<a name="ezsignsignatureDeleteObjectV1"></a>
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignsignatureID** | **Integer**|  |

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
**200** | Successful response |  -  |
**404** | The element you are trying to work on does not exist |  -  |
**422** | The syntax of the request is valid but the request cannot be completed. Look for detail in body. |  -  |

<a name="ezsignsignatureEditObjectV1"></a>
# **ezsignsignatureEditObjectV1**
> EzsignsignatureEditObjectV1Response ezsignsignatureEditObjectV1(pkiEzsignsignatureID, ezsignsignatureEditObjectV1Request)

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
    EzsignsignatureEditObjectV1Request ezsignsignatureEditObjectV1Request = new EzsignsignatureEditObjectV1Request(); // EzsignsignatureEditObjectV1Request | 
    try {
      EzsignsignatureEditObjectV1Response result = apiInstance.ezsignsignatureEditObjectV1(pkiEzsignsignatureID, ezsignsignatureEditObjectV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsignsignatureApi#ezsignsignatureEditObjectV1");
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
 **pkiEzsignsignatureID** | **Integer**|  |
 **ezsignsignatureEditObjectV1Request** | [**EzsignsignatureEditObjectV1Request**](EzsignsignatureEditObjectV1Request.md)|  |

### Return type

[**EzsignsignatureEditObjectV1Response**](EzsignsignatureEditObjectV1Response.md)

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

<a name="ezsignsignatureGetObjectV1"></a>
# **ezsignsignatureGetObjectV1**
> EzsignsignatureGetObjectV1Response ezsignsignatureGetObjectV1(pkiEzsignsignatureID)

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
      EzsignsignatureGetObjectV1Response result = apiInstance.ezsignsignatureGetObjectV1(pkiEzsignsignatureID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsignsignatureApi#ezsignsignatureGetObjectV1");
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
 **pkiEzsignsignatureID** | **Integer**|  |

### Return type

[**EzsignsignatureGetObjectV1Response**](EzsignsignatureGetObjectV1Response.md)

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

