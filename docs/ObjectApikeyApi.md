# ObjectApikeyApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apikeyCreateObjectV1**](ObjectApikeyApi.md#apikeyCreateObjectV1) | **POST** /1/object/apikey | Create a new Apikey |
| [**apikeyCreateObjectV2**](ObjectApikeyApi.md#apikeyCreateObjectV2) | **POST** /2/object/apikey | Create a new Apikey |


<a name="apikeyCreateObjectV1"></a>
# **apikeyCreateObjectV1**
> ApikeyCreateObjectV1Response apikeyCreateObjectV1(apikeyCreateObjectV1Request)

Create a new Apikey

The endpoint allows to create one or many elements at once.  The array can contain simple (Just the object) or compound (The object and its child) objects.  Creating compound elements allows to reduce the multiple requests to create all child objects.

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectApikeyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectApikeyApi apiInstance = new ObjectApikeyApi(defaultClient);
    List<ApikeyCreateObjectV1Request> apikeyCreateObjectV1Request = Arrays.asList(); // List<ApikeyCreateObjectV1Request> | 
    try {
      ApikeyCreateObjectV1Response result = apiInstance.apikeyCreateObjectV1(apikeyCreateObjectV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectApikeyApi#apikeyCreateObjectV1");
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
| **apikeyCreateObjectV1Request** | [**List&lt;ApikeyCreateObjectV1Request&gt;**](ApikeyCreateObjectV1Request.md)|  | |

### Return type

[**ApikeyCreateObjectV1Response**](ApikeyCreateObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful response |  -  |

<a name="apikeyCreateObjectV2"></a>
# **apikeyCreateObjectV2**
> ApikeyCreateObjectV2Response apikeyCreateObjectV2(apikeyCreateObjectV2Request)

Create a new Apikey

The endpoint allows to create one or many elements at once.

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectApikeyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectApikeyApi apiInstance = new ObjectApikeyApi(defaultClient);
    ApikeyCreateObjectV2Request apikeyCreateObjectV2Request = new ApikeyCreateObjectV2Request(); // ApikeyCreateObjectV2Request | 
    try {
      ApikeyCreateObjectV2Response result = apiInstance.apikeyCreateObjectV2(apikeyCreateObjectV2Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectApikeyApi#apikeyCreateObjectV2");
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
| **apikeyCreateObjectV2Request** | [**ApikeyCreateObjectV2Request**](ApikeyCreateObjectV2Request.md)|  | |

### Return type

[**ApikeyCreateObjectV2Response**](ApikeyCreateObjectV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful response |  -  |

