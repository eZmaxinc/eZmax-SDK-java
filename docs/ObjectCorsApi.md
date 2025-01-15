# ObjectCorsApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**corsCreateObjectV1**](ObjectCorsApi.md#corsCreateObjectV1) | **POST** /1/object/cors | Create a new Cors |
| [**corsDeleteObjectV1**](ObjectCorsApi.md#corsDeleteObjectV1) | **DELETE** /1/object/cors/{pkiCorsID} | Delete an existing Cors |
| [**corsEditObjectV1**](ObjectCorsApi.md#corsEditObjectV1) | **PUT** /1/object/cors/{pkiCorsID} | Edit an existing Cors |
| [**corsGetObjectV2**](ObjectCorsApi.md#corsGetObjectV2) | **GET** /2/object/cors/{pkiCorsID} | Retrieve an existing Cors |


<a id="corsCreateObjectV1"></a>
# **corsCreateObjectV1**
> CorsCreateObjectV1Response corsCreateObjectV1(corsCreateObjectV1Request)

Create a new Cors

The endpoint allows to create one or many elements at once.

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectCorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectCorsApi apiInstance = new ObjectCorsApi(defaultClient);
    CorsCreateObjectV1Request corsCreateObjectV1Request = new CorsCreateObjectV1Request(); // CorsCreateObjectV1Request | 
    try {
      CorsCreateObjectV1Response result = apiInstance.corsCreateObjectV1(corsCreateObjectV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectCorsApi#corsCreateObjectV1");
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
| **corsCreateObjectV1Request** | [**CorsCreateObjectV1Request**](CorsCreateObjectV1Request.md)|  | |

### Return type

[**CorsCreateObjectV1Response**](CorsCreateObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful response |  -  |

<a id="corsDeleteObjectV1"></a>
# **corsDeleteObjectV1**
> CommonResponse corsDeleteObjectV1(pkiCorsID)

Delete an existing Cors



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectCorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectCorsApi apiInstance = new ObjectCorsApi(defaultClient);
    Integer pkiCorsID = 56; // Integer | The unique ID of the Cors
    try {
      CommonResponse result = apiInstance.corsDeleteObjectV1(pkiCorsID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectCorsApi#corsDeleteObjectV1");
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
| **pkiCorsID** | **Integer**| The unique ID of the Cors | |

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

<a id="corsEditObjectV1"></a>
# **corsEditObjectV1**
> CommonResponse corsEditObjectV1(pkiCorsID, corsEditObjectV1Request)

Edit an existing Cors



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectCorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectCorsApi apiInstance = new ObjectCorsApi(defaultClient);
    Integer pkiCorsID = 56; // Integer | The unique ID of the Cors
    CorsEditObjectV1Request corsEditObjectV1Request = new CorsEditObjectV1Request(); // CorsEditObjectV1Request | 
    try {
      CommonResponse result = apiInstance.corsEditObjectV1(pkiCorsID, corsEditObjectV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectCorsApi#corsEditObjectV1");
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
| **pkiCorsID** | **Integer**| The unique ID of the Cors | |
| **corsEditObjectV1Request** | [**CorsEditObjectV1Request**](CorsEditObjectV1Request.md)|  | |

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

<a id="corsGetObjectV2"></a>
# **corsGetObjectV2**
> CorsGetObjectV2Response corsGetObjectV2(pkiCorsID)

Retrieve an existing Cors



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectCorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectCorsApi apiInstance = new ObjectCorsApi(defaultClient);
    Integer pkiCorsID = 56; // Integer | The unique ID of the Cors
    try {
      CorsGetObjectV2Response result = apiInstance.corsGetObjectV2(pkiCorsID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectCorsApi#corsGetObjectV2");
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
| **pkiCorsID** | **Integer**| The unique ID of the Cors | |

### Return type

[**CorsGetObjectV2Response**](CorsGetObjectV2Response.md)

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

