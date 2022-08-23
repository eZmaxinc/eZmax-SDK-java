# ObjectEzsignbulksendsignermappingApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**ezsignbulksendsignermappingCreateObjectV1**](ObjectEzsignbulksendsignermappingApi.md#ezsignbulksendsignermappingCreateObjectV1) | **POST** /1/object/ezsignbulksendsignermapping | Create a new Ezsignbulksendsignermapping |
| [**ezsignbulksendsignermappingDeleteObjectV1**](ObjectEzsignbulksendsignermappingApi.md#ezsignbulksendsignermappingDeleteObjectV1) | **DELETE** /1/object/ezsignbulksendsignermapping/{pkiEzsignbulksendsignermappingID} | Delete an existing Ezsignbulksendsignermapping |
| [**ezsignbulksendsignermappingGetObjectV1**](ObjectEzsignbulksendsignermappingApi.md#ezsignbulksendsignermappingGetObjectV1) | **GET** /1/object/ezsignbulksendsignermapping/{pkiEzsignbulksendsignermappingID} | Retrieve an existing Ezsignbulksendsignermapping |


<a name="ezsignbulksendsignermappingCreateObjectV1"></a>
# **ezsignbulksendsignermappingCreateObjectV1**
> EzsignbulksendsignermappingCreateObjectV1Response ezsignbulksendsignermappingCreateObjectV1(ezsignbulksendsignermappingCreateObjectV1Request)

Create a new Ezsignbulksendsignermapping

The endpoint allows to create one or many elements at once.

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsignbulksendsignermappingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsignbulksendsignermappingApi apiInstance = new ObjectEzsignbulksendsignermappingApi(defaultClient);
    EzsignbulksendsignermappingCreateObjectV1Request ezsignbulksendsignermappingCreateObjectV1Request = new EzsignbulksendsignermappingCreateObjectV1Request(); // EzsignbulksendsignermappingCreateObjectV1Request | 
    try {
      EzsignbulksendsignermappingCreateObjectV1Response result = apiInstance.ezsignbulksendsignermappingCreateObjectV1(ezsignbulksendsignermappingCreateObjectV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsignbulksendsignermappingApi#ezsignbulksendsignermappingCreateObjectV1");
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
| **ezsignbulksendsignermappingCreateObjectV1Request** | [**EzsignbulksendsignermappingCreateObjectV1Request**](EzsignbulksendsignermappingCreateObjectV1Request.md)|  | |

### Return type

[**EzsignbulksendsignermappingCreateObjectV1Response**](EzsignbulksendsignermappingCreateObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful response |  -  |

<a name="ezsignbulksendsignermappingDeleteObjectV1"></a>
# **ezsignbulksendsignermappingDeleteObjectV1**
> EzsignbulksendsignermappingDeleteObjectV1Response ezsignbulksendsignermappingDeleteObjectV1(pkiEzsignbulksendsignermappingID)

Delete an existing Ezsignbulksendsignermapping



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsignbulksendsignermappingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsignbulksendsignermappingApi apiInstance = new ObjectEzsignbulksendsignermappingApi(defaultClient);
    Integer pkiEzsignbulksendsignermappingID = 56; // Integer | 
    try {
      EzsignbulksendsignermappingDeleteObjectV1Response result = apiInstance.ezsignbulksendsignermappingDeleteObjectV1(pkiEzsignbulksendsignermappingID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsignbulksendsignermappingApi#ezsignbulksendsignermappingDeleteObjectV1");
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
| **pkiEzsignbulksendsignermappingID** | **Integer**|  | |

### Return type

[**EzsignbulksendsignermappingDeleteObjectV1Response**](EzsignbulksendsignermappingDeleteObjectV1Response.md)

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

<a name="ezsignbulksendsignermappingGetObjectV1"></a>
# **ezsignbulksendsignermappingGetObjectV1**
> EzsignbulksendsignermappingGetObjectV1Response ezsignbulksendsignermappingGetObjectV1(pkiEzsignbulksendsignermappingID)

Retrieve an existing Ezsignbulksendsignermapping



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsignbulksendsignermappingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsignbulksendsignermappingApi apiInstance = new ObjectEzsignbulksendsignermappingApi(defaultClient);
    Integer pkiEzsignbulksendsignermappingID = 56; // Integer | 
    try {
      EzsignbulksendsignermappingGetObjectV1Response result = apiInstance.ezsignbulksendsignermappingGetObjectV1(pkiEzsignbulksendsignermappingID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsignbulksendsignermappingApi#ezsignbulksendsignermappingGetObjectV1");
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
| **pkiEzsignbulksendsignermappingID** | **Integer**|  | |

### Return type

[**EzsignbulksendsignermappingGetObjectV1Response**](EzsignbulksendsignermappingGetObjectV1Response.md)

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

