# ObjectEzsigntemplateformfieldgroupApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**ezsigntemplateformfieldgroupCreateObjectV1**](ObjectEzsigntemplateformfieldgroupApi.md#ezsigntemplateformfieldgroupCreateObjectV1) | **POST** /1/object/ezsigntemplateformfieldgroup | Create a new Ezsigntemplateformfieldgroup |
| [**ezsigntemplateformfieldgroupDeleteObjectV1**](ObjectEzsigntemplateformfieldgroupApi.md#ezsigntemplateformfieldgroupDeleteObjectV1) | **DELETE** /1/object/ezsigntemplateformfieldgroup/{pkiEzsigntemplateformfieldgroupID} | Delete an existing Ezsigntemplateformfieldgroup |
| [**ezsigntemplateformfieldgroupEditObjectV1**](ObjectEzsigntemplateformfieldgroupApi.md#ezsigntemplateformfieldgroupEditObjectV1) | **PUT** /1/object/ezsigntemplateformfieldgroup/{pkiEzsigntemplateformfieldgroupID} | Edit an existing Ezsigntemplateformfieldgroup |
| [**ezsigntemplateformfieldgroupGetObjectV1**](ObjectEzsigntemplateformfieldgroupApi.md#ezsigntemplateformfieldgroupGetObjectV1) | **GET** /1/object/ezsigntemplateformfieldgroup/{pkiEzsigntemplateformfieldgroupID} | Retrieve an existing Ezsigntemplateformfieldgroup |


<a name="ezsigntemplateformfieldgroupCreateObjectV1"></a>
# **ezsigntemplateformfieldgroupCreateObjectV1**
> EzsigntemplateformfieldgroupCreateObjectV1Response ezsigntemplateformfieldgroupCreateObjectV1(ezsigntemplateformfieldgroupCreateObjectV1Request)

Create a new Ezsigntemplateformfieldgroup

The endpoint allows to create one or many elements at once.

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsigntemplateformfieldgroupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsigntemplateformfieldgroupApi apiInstance = new ObjectEzsigntemplateformfieldgroupApi(defaultClient);
    EzsigntemplateformfieldgroupCreateObjectV1Request ezsigntemplateformfieldgroupCreateObjectV1Request = new EzsigntemplateformfieldgroupCreateObjectV1Request(); // EzsigntemplateformfieldgroupCreateObjectV1Request | 
    try {
      EzsigntemplateformfieldgroupCreateObjectV1Response result = apiInstance.ezsigntemplateformfieldgroupCreateObjectV1(ezsigntemplateformfieldgroupCreateObjectV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsigntemplateformfieldgroupApi#ezsigntemplateformfieldgroupCreateObjectV1");
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
| **ezsigntemplateformfieldgroupCreateObjectV1Request** | [**EzsigntemplateformfieldgroupCreateObjectV1Request**](EzsigntemplateformfieldgroupCreateObjectV1Request.md)|  | |

### Return type

[**EzsigntemplateformfieldgroupCreateObjectV1Response**](EzsigntemplateformfieldgroupCreateObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful response |  -  |

<a name="ezsigntemplateformfieldgroupDeleteObjectV1"></a>
# **ezsigntemplateformfieldgroupDeleteObjectV1**
> EzsigntemplateformfieldgroupDeleteObjectV1Response ezsigntemplateformfieldgroupDeleteObjectV1(pkiEzsigntemplateformfieldgroupID)

Delete an existing Ezsigntemplateformfieldgroup



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsigntemplateformfieldgroupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsigntemplateformfieldgroupApi apiInstance = new ObjectEzsigntemplateformfieldgroupApi(defaultClient);
    Integer pkiEzsigntemplateformfieldgroupID = 56; // Integer | 
    try {
      EzsigntemplateformfieldgroupDeleteObjectV1Response result = apiInstance.ezsigntemplateformfieldgroupDeleteObjectV1(pkiEzsigntemplateformfieldgroupID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsigntemplateformfieldgroupApi#ezsigntemplateformfieldgroupDeleteObjectV1");
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
| **pkiEzsigntemplateformfieldgroupID** | **Integer**|  | |

### Return type

[**EzsigntemplateformfieldgroupDeleteObjectV1Response**](EzsigntemplateformfieldgroupDeleteObjectV1Response.md)

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

<a name="ezsigntemplateformfieldgroupEditObjectV1"></a>
# **ezsigntemplateformfieldgroupEditObjectV1**
> EzsigntemplateformfieldgroupEditObjectV1Response ezsigntemplateformfieldgroupEditObjectV1(pkiEzsigntemplateformfieldgroupID, ezsigntemplateformfieldgroupEditObjectV1Request)

Edit an existing Ezsigntemplateformfieldgroup



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsigntemplateformfieldgroupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsigntemplateformfieldgroupApi apiInstance = new ObjectEzsigntemplateformfieldgroupApi(defaultClient);
    Integer pkiEzsigntemplateformfieldgroupID = 56; // Integer | 
    EzsigntemplateformfieldgroupEditObjectV1Request ezsigntemplateformfieldgroupEditObjectV1Request = new EzsigntemplateformfieldgroupEditObjectV1Request(); // EzsigntemplateformfieldgroupEditObjectV1Request | 
    try {
      EzsigntemplateformfieldgroupEditObjectV1Response result = apiInstance.ezsigntemplateformfieldgroupEditObjectV1(pkiEzsigntemplateformfieldgroupID, ezsigntemplateformfieldgroupEditObjectV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsigntemplateformfieldgroupApi#ezsigntemplateformfieldgroupEditObjectV1");
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
| **pkiEzsigntemplateformfieldgroupID** | **Integer**|  | |
| **ezsigntemplateformfieldgroupEditObjectV1Request** | [**EzsigntemplateformfieldgroupEditObjectV1Request**](EzsigntemplateformfieldgroupEditObjectV1Request.md)|  | |

### Return type

[**EzsigntemplateformfieldgroupEditObjectV1Response**](EzsigntemplateformfieldgroupEditObjectV1Response.md)

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

<a name="ezsigntemplateformfieldgroupGetObjectV1"></a>
# **ezsigntemplateformfieldgroupGetObjectV1**
> EzsigntemplateformfieldgroupGetObjectV1Response ezsigntemplateformfieldgroupGetObjectV1(pkiEzsigntemplateformfieldgroupID)

Retrieve an existing Ezsigntemplateformfieldgroup



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsigntemplateformfieldgroupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsigntemplateformfieldgroupApi apiInstance = new ObjectEzsigntemplateformfieldgroupApi(defaultClient);
    Integer pkiEzsigntemplateformfieldgroupID = 56; // Integer | 
    try {
      EzsigntemplateformfieldgroupGetObjectV1Response result = apiInstance.ezsigntemplateformfieldgroupGetObjectV1(pkiEzsigntemplateformfieldgroupID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsigntemplateformfieldgroupApi#ezsigntemplateformfieldgroupGetObjectV1");
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
| **pkiEzsigntemplateformfieldgroupID** | **Integer**|  | |

### Return type

[**EzsigntemplateformfieldgroupGetObjectV1Response**](EzsigntemplateformfieldgroupGetObjectV1Response.md)

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

