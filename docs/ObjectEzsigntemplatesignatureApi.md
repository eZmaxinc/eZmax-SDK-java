# ObjectEzsigntemplatesignatureApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**ezsigntemplatesignatureCreateObjectV2**](ObjectEzsigntemplatesignatureApi.md#ezsigntemplatesignatureCreateObjectV2) | **POST** /2/object/ezsigntemplatesignature | Create a new Ezsigntemplatesignature |
| [**ezsigntemplatesignatureDeleteObjectV1**](ObjectEzsigntemplatesignatureApi.md#ezsigntemplatesignatureDeleteObjectV1) | **DELETE** /1/object/ezsigntemplatesignature/{pkiEzsigntemplatesignatureID} | Delete an existing Ezsigntemplatesignature |
| [**ezsigntemplatesignatureEditObjectV2**](ObjectEzsigntemplatesignatureApi.md#ezsigntemplatesignatureEditObjectV2) | **PUT** /2/object/ezsigntemplatesignature/{pkiEzsigntemplatesignatureID} | Edit an existing Ezsigntemplatesignature |
| [**ezsigntemplatesignatureGetObjectV3**](ObjectEzsigntemplatesignatureApi.md#ezsigntemplatesignatureGetObjectV3) | **GET** /3/object/ezsigntemplatesignature/{pkiEzsigntemplatesignatureID} | Retrieve an existing Ezsigntemplatesignature |


<a id="ezsigntemplatesignatureCreateObjectV2"></a>
# **ezsigntemplatesignatureCreateObjectV2**
> EzsigntemplatesignatureCreateObjectV2Response ezsigntemplatesignatureCreateObjectV2(ezsigntemplatesignatureCreateObjectV2Request)

Create a new Ezsigntemplatesignature

The endpoint allows to create one or many elements at once.

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsigntemplatesignatureApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsigntemplatesignatureApi apiInstance = new ObjectEzsigntemplatesignatureApi(defaultClient);
    EzsigntemplatesignatureCreateObjectV2Request ezsigntemplatesignatureCreateObjectV2Request = new EzsigntemplatesignatureCreateObjectV2Request(); // EzsigntemplatesignatureCreateObjectV2Request | 
    try {
      EzsigntemplatesignatureCreateObjectV2Response result = apiInstance.ezsigntemplatesignatureCreateObjectV2(ezsigntemplatesignatureCreateObjectV2Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsigntemplatesignatureApi#ezsigntemplatesignatureCreateObjectV2");
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
| **ezsigntemplatesignatureCreateObjectV2Request** | [**EzsigntemplatesignatureCreateObjectV2Request**](EzsigntemplatesignatureCreateObjectV2Request.md)|  | |

### Return type

[**EzsigntemplatesignatureCreateObjectV2Response**](EzsigntemplatesignatureCreateObjectV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful response |  -  |

<a id="ezsigntemplatesignatureDeleteObjectV1"></a>
# **ezsigntemplatesignatureDeleteObjectV1**
> EzsigntemplatesignatureDeleteObjectV1Response ezsigntemplatesignatureDeleteObjectV1(pkiEzsigntemplatesignatureID)

Delete an existing Ezsigntemplatesignature



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsigntemplatesignatureApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsigntemplatesignatureApi apiInstance = new ObjectEzsigntemplatesignatureApi(defaultClient);
    Integer pkiEzsigntemplatesignatureID = 56; // Integer | 
    try {
      EzsigntemplatesignatureDeleteObjectV1Response result = apiInstance.ezsigntemplatesignatureDeleteObjectV1(pkiEzsigntemplatesignatureID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsigntemplatesignatureApi#ezsigntemplatesignatureDeleteObjectV1");
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
| **pkiEzsigntemplatesignatureID** | **Integer**|  | |

### Return type

[**EzsigntemplatesignatureDeleteObjectV1Response**](EzsigntemplatesignatureDeleteObjectV1Response.md)

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

<a id="ezsigntemplatesignatureEditObjectV2"></a>
# **ezsigntemplatesignatureEditObjectV2**
> EzsigntemplatesignatureEditObjectV2Response ezsigntemplatesignatureEditObjectV2(pkiEzsigntemplatesignatureID, ezsigntemplatesignatureEditObjectV2Request)

Edit an existing Ezsigntemplatesignature



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsigntemplatesignatureApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsigntemplatesignatureApi apiInstance = new ObjectEzsigntemplatesignatureApi(defaultClient);
    Integer pkiEzsigntemplatesignatureID = 56; // Integer | 
    EzsigntemplatesignatureEditObjectV2Request ezsigntemplatesignatureEditObjectV2Request = new EzsigntemplatesignatureEditObjectV2Request(); // EzsigntemplatesignatureEditObjectV2Request | 
    try {
      EzsigntemplatesignatureEditObjectV2Response result = apiInstance.ezsigntemplatesignatureEditObjectV2(pkiEzsigntemplatesignatureID, ezsigntemplatesignatureEditObjectV2Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsigntemplatesignatureApi#ezsigntemplatesignatureEditObjectV2");
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
| **pkiEzsigntemplatesignatureID** | **Integer**|  | |
| **ezsigntemplatesignatureEditObjectV2Request** | [**EzsigntemplatesignatureEditObjectV2Request**](EzsigntemplatesignatureEditObjectV2Request.md)|  | |

### Return type

[**EzsigntemplatesignatureEditObjectV2Response**](EzsigntemplatesignatureEditObjectV2Response.md)

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

<a id="ezsigntemplatesignatureGetObjectV3"></a>
# **ezsigntemplatesignatureGetObjectV3**
> EzsigntemplatesignatureGetObjectV3Response ezsigntemplatesignatureGetObjectV3(pkiEzsigntemplatesignatureID)

Retrieve an existing Ezsigntemplatesignature



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsigntemplatesignatureApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsigntemplatesignatureApi apiInstance = new ObjectEzsigntemplatesignatureApi(defaultClient);
    Integer pkiEzsigntemplatesignatureID = 56; // Integer | 
    try {
      EzsigntemplatesignatureGetObjectV3Response result = apiInstance.ezsigntemplatesignatureGetObjectV3(pkiEzsigntemplatesignatureID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsigntemplatesignatureApi#ezsigntemplatesignatureGetObjectV3");
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
| **pkiEzsigntemplatesignatureID** | **Integer**|  | |

### Return type

[**EzsigntemplatesignatureGetObjectV3Response**](EzsigntemplatesignatureGetObjectV3Response.md)

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

