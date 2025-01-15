# ObjectEzsigntemplatedocumentpagerecognitionApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**ezsigntemplatedocumentpagerecognitionCreateObjectV1**](ObjectEzsigntemplatedocumentpagerecognitionApi.md#ezsigntemplatedocumentpagerecognitionCreateObjectV1) | **POST** /1/object/ezsigntemplatedocumentpagerecognition | Create a new Ezsigntemplatedocumentpagerecognition |
| [**ezsigntemplatedocumentpagerecognitionDeleteObjectV1**](ObjectEzsigntemplatedocumentpagerecognitionApi.md#ezsigntemplatedocumentpagerecognitionDeleteObjectV1) | **DELETE** /1/object/ezsigntemplatedocumentpagerecognition/{pkiEzsigntemplatedocumentpagerecognitionID} | Delete an existing Ezsigntemplatedocumentpagerecognition |
| [**ezsigntemplatedocumentpagerecognitionEditObjectV1**](ObjectEzsigntemplatedocumentpagerecognitionApi.md#ezsigntemplatedocumentpagerecognitionEditObjectV1) | **PUT** /1/object/ezsigntemplatedocumentpagerecognition/{pkiEzsigntemplatedocumentpagerecognitionID} | Edit an existing Ezsigntemplatedocumentpagerecognition |
| [**ezsigntemplatedocumentpagerecognitionGetObjectV2**](ObjectEzsigntemplatedocumentpagerecognitionApi.md#ezsigntemplatedocumentpagerecognitionGetObjectV2) | **GET** /2/object/ezsigntemplatedocumentpagerecognition/{pkiEzsigntemplatedocumentpagerecognitionID} | Retrieve an existing Ezsigntemplatedocumentpagerecognition |


<a id="ezsigntemplatedocumentpagerecognitionCreateObjectV1"></a>
# **ezsigntemplatedocumentpagerecognitionCreateObjectV1**
> EzsigntemplatedocumentpagerecognitionCreateObjectV1Response ezsigntemplatedocumentpagerecognitionCreateObjectV1(ezsigntemplatedocumentpagerecognitionCreateObjectV1Request)

Create a new Ezsigntemplatedocumentpagerecognition

The endpoint allows to create one or many elements at once.

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsigntemplatedocumentpagerecognitionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsigntemplatedocumentpagerecognitionApi apiInstance = new ObjectEzsigntemplatedocumentpagerecognitionApi(defaultClient);
    EzsigntemplatedocumentpagerecognitionCreateObjectV1Request ezsigntemplatedocumentpagerecognitionCreateObjectV1Request = new EzsigntemplatedocumentpagerecognitionCreateObjectV1Request(); // EzsigntemplatedocumentpagerecognitionCreateObjectV1Request | 
    try {
      EzsigntemplatedocumentpagerecognitionCreateObjectV1Response result = apiInstance.ezsigntemplatedocumentpagerecognitionCreateObjectV1(ezsigntemplatedocumentpagerecognitionCreateObjectV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsigntemplatedocumentpagerecognitionApi#ezsigntemplatedocumentpagerecognitionCreateObjectV1");
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
| **ezsigntemplatedocumentpagerecognitionCreateObjectV1Request** | [**EzsigntemplatedocumentpagerecognitionCreateObjectV1Request**](EzsigntemplatedocumentpagerecognitionCreateObjectV1Request.md)|  | |

### Return type

[**EzsigntemplatedocumentpagerecognitionCreateObjectV1Response**](EzsigntemplatedocumentpagerecognitionCreateObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful response |  -  |

<a id="ezsigntemplatedocumentpagerecognitionDeleteObjectV1"></a>
# **ezsigntemplatedocumentpagerecognitionDeleteObjectV1**
> CommonResponse ezsigntemplatedocumentpagerecognitionDeleteObjectV1(pkiEzsigntemplatedocumentpagerecognitionID)

Delete an existing Ezsigntemplatedocumentpagerecognition



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsigntemplatedocumentpagerecognitionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsigntemplatedocumentpagerecognitionApi apiInstance = new ObjectEzsigntemplatedocumentpagerecognitionApi(defaultClient);
    Integer pkiEzsigntemplatedocumentpagerecognitionID = 56; // Integer | The unique ID of the Ezsigntemplatedocumentpagerecognition
    try {
      CommonResponse result = apiInstance.ezsigntemplatedocumentpagerecognitionDeleteObjectV1(pkiEzsigntemplatedocumentpagerecognitionID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsigntemplatedocumentpagerecognitionApi#ezsigntemplatedocumentpagerecognitionDeleteObjectV1");
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
| **pkiEzsigntemplatedocumentpagerecognitionID** | **Integer**| The unique ID of the Ezsigntemplatedocumentpagerecognition | |

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

<a id="ezsigntemplatedocumentpagerecognitionEditObjectV1"></a>
# **ezsigntemplatedocumentpagerecognitionEditObjectV1**
> CommonResponse ezsigntemplatedocumentpagerecognitionEditObjectV1(pkiEzsigntemplatedocumentpagerecognitionID, ezsigntemplatedocumentpagerecognitionEditObjectV1Request)

Edit an existing Ezsigntemplatedocumentpagerecognition



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsigntemplatedocumentpagerecognitionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsigntemplatedocumentpagerecognitionApi apiInstance = new ObjectEzsigntemplatedocumentpagerecognitionApi(defaultClient);
    Integer pkiEzsigntemplatedocumentpagerecognitionID = 56; // Integer | The unique ID of the Ezsigntemplatedocumentpagerecognition
    EzsigntemplatedocumentpagerecognitionEditObjectV1Request ezsigntemplatedocumentpagerecognitionEditObjectV1Request = new EzsigntemplatedocumentpagerecognitionEditObjectV1Request(); // EzsigntemplatedocumentpagerecognitionEditObjectV1Request | 
    try {
      CommonResponse result = apiInstance.ezsigntemplatedocumentpagerecognitionEditObjectV1(pkiEzsigntemplatedocumentpagerecognitionID, ezsigntemplatedocumentpagerecognitionEditObjectV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsigntemplatedocumentpagerecognitionApi#ezsigntemplatedocumentpagerecognitionEditObjectV1");
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
| **pkiEzsigntemplatedocumentpagerecognitionID** | **Integer**| The unique ID of the Ezsigntemplatedocumentpagerecognition | |
| **ezsigntemplatedocumentpagerecognitionEditObjectV1Request** | [**EzsigntemplatedocumentpagerecognitionEditObjectV1Request**](EzsigntemplatedocumentpagerecognitionEditObjectV1Request.md)|  | |

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

<a id="ezsigntemplatedocumentpagerecognitionGetObjectV2"></a>
# **ezsigntemplatedocumentpagerecognitionGetObjectV2**
> EzsigntemplatedocumentpagerecognitionGetObjectV2Response ezsigntemplatedocumentpagerecognitionGetObjectV2(pkiEzsigntemplatedocumentpagerecognitionID)

Retrieve an existing Ezsigntemplatedocumentpagerecognition



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsigntemplatedocumentpagerecognitionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsigntemplatedocumentpagerecognitionApi apiInstance = new ObjectEzsigntemplatedocumentpagerecognitionApi(defaultClient);
    Integer pkiEzsigntemplatedocumentpagerecognitionID = 56; // Integer | The unique ID of the Ezsigntemplatedocumentpagerecognition
    try {
      EzsigntemplatedocumentpagerecognitionGetObjectV2Response result = apiInstance.ezsigntemplatedocumentpagerecognitionGetObjectV2(pkiEzsigntemplatedocumentpagerecognitionID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsigntemplatedocumentpagerecognitionApi#ezsigntemplatedocumentpagerecognitionGetObjectV2");
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
| **pkiEzsigntemplatedocumentpagerecognitionID** | **Integer**| The unique ID of the Ezsigntemplatedocumentpagerecognition | |

### Return type

[**EzsigntemplatedocumentpagerecognitionGetObjectV2Response**](EzsigntemplatedocumentpagerecognitionGetObjectV2Response.md)

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

