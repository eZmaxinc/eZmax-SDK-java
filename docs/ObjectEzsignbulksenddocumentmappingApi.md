# ObjectEzsignbulksenddocumentmappingApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**ezsignbulksenddocumentmappingCreateObjectV1**](ObjectEzsignbulksenddocumentmappingApi.md#ezsignbulksenddocumentmappingCreateObjectV1) | **POST** /1/object/ezsignbulksenddocumentmapping | Create a new Ezsignbulksenddocumentmapping |
| [**ezsignbulksenddocumentmappingDeleteObjectV1**](ObjectEzsignbulksenddocumentmappingApi.md#ezsignbulksenddocumentmappingDeleteObjectV1) | **DELETE** /1/object/ezsignbulksenddocumentmapping/{pkiEzsignbulksenddocumentmappingID} | Delete an existing Ezsignbulksenddocumentmapping |
| [**ezsignbulksenddocumentmappingGetObjectV1**](ObjectEzsignbulksenddocumentmappingApi.md#ezsignbulksenddocumentmappingGetObjectV1) | **GET** /1/object/ezsignbulksenddocumentmapping/{pkiEzsignbulksenddocumentmappingID} | Retrieve an existing Ezsignbulksenddocumentmapping |


<a name="ezsignbulksenddocumentmappingCreateObjectV1"></a>
# **ezsignbulksenddocumentmappingCreateObjectV1**
> EzsignbulksenddocumentmappingCreateObjectV1Response ezsignbulksenddocumentmappingCreateObjectV1(ezsignbulksenddocumentmappingCreateObjectV1Request)

Create a new Ezsignbulksenddocumentmapping

The endpoint allows to create one or many elements at once.

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsignbulksenddocumentmappingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsignbulksenddocumentmappingApi apiInstance = new ObjectEzsignbulksenddocumentmappingApi(defaultClient);
    EzsignbulksenddocumentmappingCreateObjectV1Request ezsignbulksenddocumentmappingCreateObjectV1Request = new EzsignbulksenddocumentmappingCreateObjectV1Request(); // EzsignbulksenddocumentmappingCreateObjectV1Request | 
    try {
      EzsignbulksenddocumentmappingCreateObjectV1Response result = apiInstance.ezsignbulksenddocumentmappingCreateObjectV1(ezsignbulksenddocumentmappingCreateObjectV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsignbulksenddocumentmappingApi#ezsignbulksenddocumentmappingCreateObjectV1");
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
| **ezsignbulksenddocumentmappingCreateObjectV1Request** | [**EzsignbulksenddocumentmappingCreateObjectV1Request**](EzsignbulksenddocumentmappingCreateObjectV1Request.md)|  | |

### Return type

[**EzsignbulksenddocumentmappingCreateObjectV1Response**](EzsignbulksenddocumentmappingCreateObjectV1Response.md)

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

<a name="ezsignbulksenddocumentmappingDeleteObjectV1"></a>
# **ezsignbulksenddocumentmappingDeleteObjectV1**
> EzsignbulksenddocumentmappingDeleteObjectV1Response ezsignbulksenddocumentmappingDeleteObjectV1(pkiEzsignbulksenddocumentmappingID)

Delete an existing Ezsignbulksenddocumentmapping



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsignbulksenddocumentmappingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsignbulksenddocumentmappingApi apiInstance = new ObjectEzsignbulksenddocumentmappingApi(defaultClient);
    Integer pkiEzsignbulksenddocumentmappingID = 56; // Integer | 
    try {
      EzsignbulksenddocumentmappingDeleteObjectV1Response result = apiInstance.ezsignbulksenddocumentmappingDeleteObjectV1(pkiEzsignbulksenddocumentmappingID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsignbulksenddocumentmappingApi#ezsignbulksenddocumentmappingDeleteObjectV1");
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
| **pkiEzsignbulksenddocumentmappingID** | **Integer**|  | |

### Return type

[**EzsignbulksenddocumentmappingDeleteObjectV1Response**](EzsignbulksenddocumentmappingDeleteObjectV1Response.md)

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

<a name="ezsignbulksenddocumentmappingGetObjectV1"></a>
# **ezsignbulksenddocumentmappingGetObjectV1**
> EzsignbulksenddocumentmappingGetObjectV1Response ezsignbulksenddocumentmappingGetObjectV1(pkiEzsignbulksenddocumentmappingID)

Retrieve an existing Ezsignbulksenddocumentmapping



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsignbulksenddocumentmappingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsignbulksenddocumentmappingApi apiInstance = new ObjectEzsignbulksenddocumentmappingApi(defaultClient);
    Integer pkiEzsignbulksenddocumentmappingID = 56; // Integer | 
    try {
      EzsignbulksenddocumentmappingGetObjectV1Response result = apiInstance.ezsignbulksenddocumentmappingGetObjectV1(pkiEzsignbulksenddocumentmappingID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsignbulksenddocumentmappingApi#ezsignbulksenddocumentmappingGetObjectV1");
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
| **pkiEzsignbulksenddocumentmappingID** | **Integer**|  | |

### Return type

[**EzsignbulksenddocumentmappingGetObjectV1Response**](EzsignbulksenddocumentmappingGetObjectV1Response.md)

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

