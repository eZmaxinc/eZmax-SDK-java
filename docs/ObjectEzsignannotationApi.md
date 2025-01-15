# ObjectEzsignannotationApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**ezsignannotationCreateObjectV1**](ObjectEzsignannotationApi.md#ezsignannotationCreateObjectV1) | **POST** /1/object/ezsignannotation | Create a new Ezsignannotation |
| [**ezsignannotationDeleteObjectV1**](ObjectEzsignannotationApi.md#ezsignannotationDeleteObjectV1) | **DELETE** /1/object/ezsignannotation/{pkiEzsignannotationID} | Delete an existing Ezsignannotation |
| [**ezsignannotationEditObjectV1**](ObjectEzsignannotationApi.md#ezsignannotationEditObjectV1) | **PUT** /1/object/ezsignannotation/{pkiEzsignannotationID} | Edit an existing Ezsignannotation |
| [**ezsignannotationGetObjectV2**](ObjectEzsignannotationApi.md#ezsignannotationGetObjectV2) | **GET** /2/object/ezsignannotation/{pkiEzsignannotationID} | Retrieve an existing Ezsignannotation |


<a id="ezsignannotationCreateObjectV1"></a>
# **ezsignannotationCreateObjectV1**
> EzsignannotationCreateObjectV1Response ezsignannotationCreateObjectV1(ezsignannotationCreateObjectV1Request)

Create a new Ezsignannotation

The endpoint allows to create one or many elements at once.

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsignannotationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsignannotationApi apiInstance = new ObjectEzsignannotationApi(defaultClient);
    EzsignannotationCreateObjectV1Request ezsignannotationCreateObjectV1Request = new EzsignannotationCreateObjectV1Request(); // EzsignannotationCreateObjectV1Request | 
    try {
      EzsignannotationCreateObjectV1Response result = apiInstance.ezsignannotationCreateObjectV1(ezsignannotationCreateObjectV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsignannotationApi#ezsignannotationCreateObjectV1");
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
| **ezsignannotationCreateObjectV1Request** | [**EzsignannotationCreateObjectV1Request**](EzsignannotationCreateObjectV1Request.md)|  | |

### Return type

[**EzsignannotationCreateObjectV1Response**](EzsignannotationCreateObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful response |  -  |

<a id="ezsignannotationDeleteObjectV1"></a>
# **ezsignannotationDeleteObjectV1**
> CommonResponse ezsignannotationDeleteObjectV1(pkiEzsignannotationID)

Delete an existing Ezsignannotation



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsignannotationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsignannotationApi apiInstance = new ObjectEzsignannotationApi(defaultClient);
    Integer pkiEzsignannotationID = 56; // Integer | 
    try {
      CommonResponse result = apiInstance.ezsignannotationDeleteObjectV1(pkiEzsignannotationID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsignannotationApi#ezsignannotationDeleteObjectV1");
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
| **pkiEzsignannotationID** | **Integer**|  | |

### Return type

[**CommonResponse**](CommonResponse.md)

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

<a id="ezsignannotationEditObjectV1"></a>
# **ezsignannotationEditObjectV1**
> CommonResponse ezsignannotationEditObjectV1(pkiEzsignannotationID, ezsignannotationEditObjectV1Request)

Edit an existing Ezsignannotation



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsignannotationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsignannotationApi apiInstance = new ObjectEzsignannotationApi(defaultClient);
    Integer pkiEzsignannotationID = 56; // Integer | 
    EzsignannotationEditObjectV1Request ezsignannotationEditObjectV1Request = new EzsignannotationEditObjectV1Request(); // EzsignannotationEditObjectV1Request | 
    try {
      CommonResponse result = apiInstance.ezsignannotationEditObjectV1(pkiEzsignannotationID, ezsignannotationEditObjectV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsignannotationApi#ezsignannotationEditObjectV1");
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
| **pkiEzsignannotationID** | **Integer**|  | |
| **ezsignannotationEditObjectV1Request** | [**EzsignannotationEditObjectV1Request**](EzsignannotationEditObjectV1Request.md)|  | |

### Return type

[**CommonResponse**](CommonResponse.md)

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

<a id="ezsignannotationGetObjectV2"></a>
# **ezsignannotationGetObjectV2**
> EzsignannotationGetObjectV2Response ezsignannotationGetObjectV2(pkiEzsignannotationID)

Retrieve an existing Ezsignannotation



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsignannotationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsignannotationApi apiInstance = new ObjectEzsignannotationApi(defaultClient);
    Integer pkiEzsignannotationID = 56; // Integer | 
    try {
      EzsignannotationGetObjectV2Response result = apiInstance.ezsignannotationGetObjectV2(pkiEzsignannotationID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsignannotationApi#ezsignannotationGetObjectV2");
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
| **pkiEzsignannotationID** | **Integer**|  | |

### Return type

[**EzsignannotationGetObjectV2Response**](EzsignannotationGetObjectV2Response.md)

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

