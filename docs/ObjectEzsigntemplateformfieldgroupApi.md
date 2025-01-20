# ObjectEzsigntemplateformfieldgroupApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**ezsigntemplateformfieldgroupCreateObjectV1**](ObjectEzsigntemplateformfieldgroupApi.md#ezsigntemplateformfieldgroupCreateObjectV1) | **POST** /1/object/ezsigntemplateformfieldgroup | Create a new Ezsigntemplateformfieldgroup |
| [**ezsigntemplateformfieldgroupDeleteObjectV1**](ObjectEzsigntemplateformfieldgroupApi.md#ezsigntemplateformfieldgroupDeleteObjectV1) | **DELETE** /1/object/ezsigntemplateformfieldgroup/{pkiEzsigntemplateformfieldgroupID} | Delete an existing Ezsigntemplateformfieldgroup |
| [**ezsigntemplateformfieldgroupEditObjectV1**](ObjectEzsigntemplateformfieldgroupApi.md#ezsigntemplateformfieldgroupEditObjectV1) | **PUT** /1/object/ezsigntemplateformfieldgroup/{pkiEzsigntemplateformfieldgroupID} | Edit an existing Ezsigntemplateformfieldgroup |
| [**ezsigntemplateformfieldgroupGetObjectV2**](ObjectEzsigntemplateformfieldgroupApi.md#ezsigntemplateformfieldgroupGetObjectV2) | **GET** /2/object/ezsigntemplateformfieldgroup/{pkiEzsigntemplateformfieldgroupID} | Retrieve an existing Ezsigntemplateformfieldgroup |


<a id="ezsigntemplateformfieldgroupCreateObjectV1"></a>
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

<a id="ezsigntemplateformfieldgroupDeleteObjectV1"></a>
# **ezsigntemplateformfieldgroupDeleteObjectV1**
> CommonResponse ezsigntemplateformfieldgroupDeleteObjectV1(pkiEzsigntemplateformfieldgroupID)

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
      CommonResponse result = apiInstance.ezsigntemplateformfieldgroupDeleteObjectV1(pkiEzsigntemplateformfieldgroupID);
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

<a id="ezsigntemplateformfieldgroupEditObjectV1"></a>
# **ezsigntemplateformfieldgroupEditObjectV1**
> CommonResponse ezsigntemplateformfieldgroupEditObjectV1(pkiEzsigntemplateformfieldgroupID, ezsigntemplateformfieldgroupEditObjectV1Request)

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
      CommonResponse result = apiInstance.ezsigntemplateformfieldgroupEditObjectV1(pkiEzsigntemplateformfieldgroupID, ezsigntemplateformfieldgroupEditObjectV1Request);
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

<a id="ezsigntemplateformfieldgroupGetObjectV2"></a>
# **ezsigntemplateformfieldgroupGetObjectV2**
> EzsigntemplateformfieldgroupGetObjectV2Response ezsigntemplateformfieldgroupGetObjectV2(pkiEzsigntemplateformfieldgroupID)

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
      EzsigntemplateformfieldgroupGetObjectV2Response result = apiInstance.ezsigntemplateformfieldgroupGetObjectV2(pkiEzsigntemplateformfieldgroupID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsigntemplateformfieldgroupApi#ezsigntemplateformfieldgroupGetObjectV2");
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

[**EzsigntemplateformfieldgroupGetObjectV2Response**](EzsigntemplateformfieldgroupGetObjectV2Response.md)

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

