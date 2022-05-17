# ObjectEzsigntemplatepackagemembershipApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**ezsigntemplatepackagemembershipCreateObjectV1**](ObjectEzsigntemplatepackagemembershipApi.md#ezsigntemplatepackagemembershipCreateObjectV1) | **POST** /1/object/ezsigntemplatepackagemembership | Create a new Ezsigntemplatepackagemembership |
| [**ezsigntemplatepackagemembershipDeleteObjectV1**](ObjectEzsigntemplatepackagemembershipApi.md#ezsigntemplatepackagemembershipDeleteObjectV1) | **DELETE** /1/object/ezsigntemplatepackagemembership/{pkiEzsigntemplatepackagemembershipID} | Delete an existing Ezsigntemplatepackagemembership |
| [**ezsigntemplatepackagemembershipGetObjectV1**](ObjectEzsigntemplatepackagemembershipApi.md#ezsigntemplatepackagemembershipGetObjectV1) | **GET** /1/object/ezsigntemplatepackagemembership/{pkiEzsigntemplatepackagemembershipID} | Retrieve an existing Ezsigntemplatepackagemembership |


<a name="ezsigntemplatepackagemembershipCreateObjectV1"></a>
# **ezsigntemplatepackagemembershipCreateObjectV1**
> EzsigntemplatepackagemembershipCreateObjectV1Response ezsigntemplatepackagemembershipCreateObjectV1(ezsigntemplatepackagemembershipCreateObjectV1Request)

Create a new Ezsigntemplatepackagemembership

The endpoint allows to create one or many elements at once.

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsigntemplatepackagemembershipApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsigntemplatepackagemembershipApi apiInstance = new ObjectEzsigntemplatepackagemembershipApi(defaultClient);
    EzsigntemplatepackagemembershipCreateObjectV1Request ezsigntemplatepackagemembershipCreateObjectV1Request = new EzsigntemplatepackagemembershipCreateObjectV1Request(); // EzsigntemplatepackagemembershipCreateObjectV1Request | 
    try {
      EzsigntemplatepackagemembershipCreateObjectV1Response result = apiInstance.ezsigntemplatepackagemembershipCreateObjectV1(ezsigntemplatepackagemembershipCreateObjectV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsigntemplatepackagemembershipApi#ezsigntemplatepackagemembershipCreateObjectV1");
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
| **ezsigntemplatepackagemembershipCreateObjectV1Request** | [**EzsigntemplatepackagemembershipCreateObjectV1Request**](EzsigntemplatepackagemembershipCreateObjectV1Request.md)|  | |

### Return type

[**EzsigntemplatepackagemembershipCreateObjectV1Response**](EzsigntemplatepackagemembershipCreateObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful response |  -  |
| **422** | The syntax of the request is valid but the request cannot be completed. Look for detail in body. |  -  |

<a name="ezsigntemplatepackagemembershipDeleteObjectV1"></a>
# **ezsigntemplatepackagemembershipDeleteObjectV1**
> EzsigntemplatepackagemembershipDeleteObjectV1Response ezsigntemplatepackagemembershipDeleteObjectV1(pkiEzsigntemplatepackagemembershipID)

Delete an existing Ezsigntemplatepackagemembership



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsigntemplatepackagemembershipApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsigntemplatepackagemembershipApi apiInstance = new ObjectEzsigntemplatepackagemembershipApi(defaultClient);
    Integer pkiEzsigntemplatepackagemembershipID = 56; // Integer | 
    try {
      EzsigntemplatepackagemembershipDeleteObjectV1Response result = apiInstance.ezsigntemplatepackagemembershipDeleteObjectV1(pkiEzsigntemplatepackagemembershipID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsigntemplatepackagemembershipApi#ezsigntemplatepackagemembershipDeleteObjectV1");
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
| **pkiEzsigntemplatepackagemembershipID** | **Integer**|  | |

### Return type

[**EzsigntemplatepackagemembershipDeleteObjectV1Response**](EzsigntemplatepackagemembershipDeleteObjectV1Response.md)

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

<a name="ezsigntemplatepackagemembershipGetObjectV1"></a>
# **ezsigntemplatepackagemembershipGetObjectV1**
> EzsigntemplatepackagemembershipGetObjectV1Response ezsigntemplatepackagemembershipGetObjectV1(pkiEzsigntemplatepackagemembershipID)

Retrieve an existing Ezsigntemplatepackagemembership



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsigntemplatepackagemembershipApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsigntemplatepackagemembershipApi apiInstance = new ObjectEzsigntemplatepackagemembershipApi(defaultClient);
    Integer pkiEzsigntemplatepackagemembershipID = 56; // Integer | 
    try {
      EzsigntemplatepackagemembershipGetObjectV1Response result = apiInstance.ezsigntemplatepackagemembershipGetObjectV1(pkiEzsigntemplatepackagemembershipID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsigntemplatepackagemembershipApi#ezsigntemplatepackagemembershipGetObjectV1");
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
| **pkiEzsigntemplatepackagemembershipID** | **Integer**|  | |

### Return type

[**EzsigntemplatepackagemembershipGetObjectV1Response**](EzsigntemplatepackagemembershipGetObjectV1Response.md)

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

