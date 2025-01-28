# ObjectEzsigndiscussionApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**ezsigndiscussionCreateObjectV1**](ObjectEzsigndiscussionApi.md#ezsigndiscussionCreateObjectV1) | **POST** /1/object/ezsigndiscussion | Create a new Ezsigndiscussion |
| [**ezsigndiscussionDeleteObjectV1**](ObjectEzsigndiscussionApi.md#ezsigndiscussionDeleteObjectV1) | **DELETE** /1/object/ezsigndiscussion/{pkiEzsigndiscussionID} | Delete an existing Ezsigndiscussion |
| [**ezsigndiscussionGetObjectV2**](ObjectEzsigndiscussionApi.md#ezsigndiscussionGetObjectV2) | **GET** /2/object/ezsigndiscussion/{pkiEzsigndiscussionID} | Retrieve an existing Ezsigndiscussion |


<a id="ezsigndiscussionCreateObjectV1"></a>
# **ezsigndiscussionCreateObjectV1**
> EzsigndiscussionCreateObjectV1Response ezsigndiscussionCreateObjectV1(ezsigndiscussionCreateObjectV1Request)

Create a new Ezsigndiscussion

The endpoint allows to create one or many elements at once.

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsigndiscussionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsigndiscussionApi apiInstance = new ObjectEzsigndiscussionApi(defaultClient);
    EzsigndiscussionCreateObjectV1Request ezsigndiscussionCreateObjectV1Request = new EzsigndiscussionCreateObjectV1Request(); // EzsigndiscussionCreateObjectV1Request | 
    try {
      EzsigndiscussionCreateObjectV1Response result = apiInstance.ezsigndiscussionCreateObjectV1(ezsigndiscussionCreateObjectV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsigndiscussionApi#ezsigndiscussionCreateObjectV1");
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
| **ezsigndiscussionCreateObjectV1Request** | [**EzsigndiscussionCreateObjectV1Request**](EzsigndiscussionCreateObjectV1Request.md)|  | |

### Return type

[**EzsigndiscussionCreateObjectV1Response**](EzsigndiscussionCreateObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful response |  -  |

<a id="ezsigndiscussionDeleteObjectV1"></a>
# **ezsigndiscussionDeleteObjectV1**
> EzsigndiscussionDeleteObjectV1Response ezsigndiscussionDeleteObjectV1(pkiEzsigndiscussionID)

Delete an existing Ezsigndiscussion



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsigndiscussionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsigndiscussionApi apiInstance = new ObjectEzsigndiscussionApi(defaultClient);
    Integer pkiEzsigndiscussionID = 56; // Integer | The unique ID of the Ezsigndiscussion
    try {
      EzsigndiscussionDeleteObjectV1Response result = apiInstance.ezsigndiscussionDeleteObjectV1(pkiEzsigndiscussionID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsigndiscussionApi#ezsigndiscussionDeleteObjectV1");
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
| **pkiEzsigndiscussionID** | **Integer**| The unique ID of the Ezsigndiscussion | |

### Return type

[**EzsigndiscussionDeleteObjectV1Response**](EzsigndiscussionDeleteObjectV1Response.md)

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

<a id="ezsigndiscussionGetObjectV2"></a>
# **ezsigndiscussionGetObjectV2**
> EzsigndiscussionGetObjectV2Response ezsigndiscussionGetObjectV2(pkiEzsigndiscussionID)

Retrieve an existing Ezsigndiscussion



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsigndiscussionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsigndiscussionApi apiInstance = new ObjectEzsigndiscussionApi(defaultClient);
    Integer pkiEzsigndiscussionID = 56; // Integer | The unique ID of the Ezsigndiscussion
    try {
      EzsigndiscussionGetObjectV2Response result = apiInstance.ezsigndiscussionGetObjectV2(pkiEzsigndiscussionID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsigndiscussionApi#ezsigndiscussionGetObjectV2");
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
| **pkiEzsigndiscussionID** | **Integer**| The unique ID of the Ezsigndiscussion | |

### Return type

[**EzsigndiscussionGetObjectV2Response**](EzsigndiscussionGetObjectV2Response.md)

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

