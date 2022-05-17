# ObjectEzsigntemplatesignerApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**ezsigntemplatesignerCreateObjectV1**](ObjectEzsigntemplatesignerApi.md#ezsigntemplatesignerCreateObjectV1) | **POST** /1/object/ezsigntemplatesigner | Create a new Ezsigntemplatesigner |
| [**ezsigntemplatesignerDeleteObjectV1**](ObjectEzsigntemplatesignerApi.md#ezsigntemplatesignerDeleteObjectV1) | **DELETE** /1/object/ezsigntemplatesigner/{pkiEzsigntemplatesignerID} | Delete an existing Ezsigntemplatesigner |
| [**ezsigntemplatesignerEditObjectV1**](ObjectEzsigntemplatesignerApi.md#ezsigntemplatesignerEditObjectV1) | **PUT** /1/object/ezsigntemplatesigner/{pkiEzsigntemplatesignerID} | Edit an existing Ezsigntemplatesigner |
| [**ezsigntemplatesignerGetObjectV1**](ObjectEzsigntemplatesignerApi.md#ezsigntemplatesignerGetObjectV1) | **GET** /1/object/ezsigntemplatesigner/{pkiEzsigntemplatesignerID} | Retrieve an existing Ezsigntemplatesigner |


<a name="ezsigntemplatesignerCreateObjectV1"></a>
# **ezsigntemplatesignerCreateObjectV1**
> EzsigntemplatesignerCreateObjectV1Response ezsigntemplatesignerCreateObjectV1(ezsigntemplatesignerCreateObjectV1Request)

Create a new Ezsigntemplatesigner

The endpoint allows to create one or many elements at once.

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsigntemplatesignerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsigntemplatesignerApi apiInstance = new ObjectEzsigntemplatesignerApi(defaultClient);
    EzsigntemplatesignerCreateObjectV1Request ezsigntemplatesignerCreateObjectV1Request = new EzsigntemplatesignerCreateObjectV1Request(); // EzsigntemplatesignerCreateObjectV1Request | 
    try {
      EzsigntemplatesignerCreateObjectV1Response result = apiInstance.ezsigntemplatesignerCreateObjectV1(ezsigntemplatesignerCreateObjectV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsigntemplatesignerApi#ezsigntemplatesignerCreateObjectV1");
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
| **ezsigntemplatesignerCreateObjectV1Request** | [**EzsigntemplatesignerCreateObjectV1Request**](EzsigntemplatesignerCreateObjectV1Request.md)|  | |

### Return type

[**EzsigntemplatesignerCreateObjectV1Response**](EzsigntemplatesignerCreateObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful response |  -  |

<a name="ezsigntemplatesignerDeleteObjectV1"></a>
# **ezsigntemplatesignerDeleteObjectV1**
> EzsigntemplatesignerDeleteObjectV1Response ezsigntemplatesignerDeleteObjectV1(pkiEzsigntemplatesignerID)

Delete an existing Ezsigntemplatesigner



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsigntemplatesignerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsigntemplatesignerApi apiInstance = new ObjectEzsigntemplatesignerApi(defaultClient);
    Integer pkiEzsigntemplatesignerID = 56; // Integer | 
    try {
      EzsigntemplatesignerDeleteObjectV1Response result = apiInstance.ezsigntemplatesignerDeleteObjectV1(pkiEzsigntemplatesignerID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsigntemplatesignerApi#ezsigntemplatesignerDeleteObjectV1");
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
| **pkiEzsigntemplatesignerID** | **Integer**|  | |

### Return type

[**EzsigntemplatesignerDeleteObjectV1Response**](EzsigntemplatesignerDeleteObjectV1Response.md)

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

<a name="ezsigntemplatesignerEditObjectV1"></a>
# **ezsigntemplatesignerEditObjectV1**
> EzsigntemplatesignerEditObjectV1Response ezsigntemplatesignerEditObjectV1(pkiEzsigntemplatesignerID, ezsigntemplatesignerEditObjectV1Request)

Edit an existing Ezsigntemplatesigner



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsigntemplatesignerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsigntemplatesignerApi apiInstance = new ObjectEzsigntemplatesignerApi(defaultClient);
    Integer pkiEzsigntemplatesignerID = 56; // Integer | 
    EzsigntemplatesignerEditObjectV1Request ezsigntemplatesignerEditObjectV1Request = new EzsigntemplatesignerEditObjectV1Request(); // EzsigntemplatesignerEditObjectV1Request | 
    try {
      EzsigntemplatesignerEditObjectV1Response result = apiInstance.ezsigntemplatesignerEditObjectV1(pkiEzsigntemplatesignerID, ezsigntemplatesignerEditObjectV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsigntemplatesignerApi#ezsigntemplatesignerEditObjectV1");
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
| **pkiEzsigntemplatesignerID** | **Integer**|  | |
| **ezsigntemplatesignerEditObjectV1Request** | [**EzsigntemplatesignerEditObjectV1Request**](EzsigntemplatesignerEditObjectV1Request.md)|  | |

### Return type

[**EzsigntemplatesignerEditObjectV1Response**](EzsigntemplatesignerEditObjectV1Response.md)

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

<a name="ezsigntemplatesignerGetObjectV1"></a>
# **ezsigntemplatesignerGetObjectV1**
> EzsigntemplatesignerGetObjectV1Response ezsigntemplatesignerGetObjectV1(pkiEzsigntemplatesignerID)

Retrieve an existing Ezsigntemplatesigner



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsigntemplatesignerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsigntemplatesignerApi apiInstance = new ObjectEzsigntemplatesignerApi(defaultClient);
    Integer pkiEzsigntemplatesignerID = 56; // Integer | 
    try {
      EzsigntemplatesignerGetObjectV1Response result = apiInstance.ezsigntemplatesignerGetObjectV1(pkiEzsigntemplatesignerID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsigntemplatesignerApi#ezsigntemplatesignerGetObjectV1");
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
| **pkiEzsigntemplatesignerID** | **Integer**|  | |

### Return type

[**EzsigntemplatesignerGetObjectV1Response**](EzsigntemplatesignerGetObjectV1Response.md)

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

