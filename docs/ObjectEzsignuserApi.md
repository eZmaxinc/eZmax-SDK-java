# ObjectEzsignuserApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**ezsignuserEditObjectV1**](ObjectEzsignuserApi.md#ezsignuserEditObjectV1) | **PUT** /1/object/ezsignuser/{pkiEzsignuserID} | Edit an existing Ezsignuser |
| [**ezsignuserGetObjectV2**](ObjectEzsignuserApi.md#ezsignuserGetObjectV2) | **GET** /2/object/ezsignuser/{pkiEzsignuserID} | Retrieve an existing Ezsignuser |


<a id="ezsignuserEditObjectV1"></a>
# **ezsignuserEditObjectV1**
> EzsignuserEditObjectV1Response ezsignuserEditObjectV1(pkiEzsignuserID, ezsignuserEditObjectV1Request)

Edit an existing Ezsignuser



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsignuserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsignuserApi apiInstance = new ObjectEzsignuserApi(defaultClient);
    Integer pkiEzsignuserID = 56; // Integer | The unique ID of the Ezsignuser
    EzsignuserEditObjectV1Request ezsignuserEditObjectV1Request = new EzsignuserEditObjectV1Request(); // EzsignuserEditObjectV1Request | 
    try {
      EzsignuserEditObjectV1Response result = apiInstance.ezsignuserEditObjectV1(pkiEzsignuserID, ezsignuserEditObjectV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsignuserApi#ezsignuserEditObjectV1");
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
| **pkiEzsignuserID** | **Integer**| The unique ID of the Ezsignuser | |
| **ezsignuserEditObjectV1Request** | [**EzsignuserEditObjectV1Request**](EzsignuserEditObjectV1Request.md)|  | |

### Return type

[**EzsignuserEditObjectV1Response**](EzsignuserEditObjectV1Response.md)

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

<a id="ezsignuserGetObjectV2"></a>
# **ezsignuserGetObjectV2**
> EzsignuserGetObjectV2Response ezsignuserGetObjectV2(pkiEzsignuserID)

Retrieve an existing Ezsignuser



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsignuserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsignuserApi apiInstance = new ObjectEzsignuserApi(defaultClient);
    Integer pkiEzsignuserID = 56; // Integer | The unique ID of the Ezsignuser
    try {
      EzsignuserGetObjectV2Response result = apiInstance.ezsignuserGetObjectV2(pkiEzsignuserID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsignuserApi#ezsignuserGetObjectV2");
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
| **pkiEzsignuserID** | **Integer**| The unique ID of the Ezsignuser | |

### Return type

[**EzsignuserGetObjectV2Response**](EzsignuserGetObjectV2Response.md)

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

