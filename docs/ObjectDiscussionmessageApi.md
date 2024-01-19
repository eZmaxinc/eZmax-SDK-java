# ObjectDiscussionmessageApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**discussionmessageCreateObjectV1**](ObjectDiscussionmessageApi.md#discussionmessageCreateObjectV1) | **POST** /1/object/discussionmessage | Create a new Discussionmessage |
| [**discussionmessageDeleteObjectV1**](ObjectDiscussionmessageApi.md#discussionmessageDeleteObjectV1) | **DELETE** /1/object/discussionmessage/{pkiDiscussionmessageID} | Delete an existing Discussionmessage |
| [**discussionmessagePatchObjectV1**](ObjectDiscussionmessageApi.md#discussionmessagePatchObjectV1) | **PATCH** /1/object/discussionmessage/{pkiDiscussionmessageID} | Patch an existing Discussionmessage |


<a id="discussionmessageCreateObjectV1"></a>
# **discussionmessageCreateObjectV1**
> DiscussionmessageCreateObjectV1Response discussionmessageCreateObjectV1(discussionmessageCreateObjectV1Request)

Create a new Discussionmessage

The endpoint allows to create one or many elements at once.

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectDiscussionmessageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectDiscussionmessageApi apiInstance = new ObjectDiscussionmessageApi(defaultClient);
    DiscussionmessageCreateObjectV1Request discussionmessageCreateObjectV1Request = new DiscussionmessageCreateObjectV1Request(); // DiscussionmessageCreateObjectV1Request | 
    try {
      DiscussionmessageCreateObjectV1Response result = apiInstance.discussionmessageCreateObjectV1(discussionmessageCreateObjectV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectDiscussionmessageApi#discussionmessageCreateObjectV1");
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
| **discussionmessageCreateObjectV1Request** | [**DiscussionmessageCreateObjectV1Request**](DiscussionmessageCreateObjectV1Request.md)|  | |

### Return type

[**DiscussionmessageCreateObjectV1Response**](DiscussionmessageCreateObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful response |  -  |

<a id="discussionmessageDeleteObjectV1"></a>
# **discussionmessageDeleteObjectV1**
> DiscussionmessageDeleteObjectV1Response discussionmessageDeleteObjectV1(pkiDiscussionmessageID)

Delete an existing Discussionmessage



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectDiscussionmessageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectDiscussionmessageApi apiInstance = new ObjectDiscussionmessageApi(defaultClient);
    Integer pkiDiscussionmessageID = 56; // Integer | The unique ID of the Discussionmessage
    try {
      DiscussionmessageDeleteObjectV1Response result = apiInstance.discussionmessageDeleteObjectV1(pkiDiscussionmessageID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectDiscussionmessageApi#discussionmessageDeleteObjectV1");
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
| **pkiDiscussionmessageID** | **Integer**| The unique ID of the Discussionmessage | |

### Return type

[**DiscussionmessageDeleteObjectV1Response**](DiscussionmessageDeleteObjectV1Response.md)

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
| **422** | The request was syntactically valid but failed because of an interdependance condition. Look for detail about the error in the body |  -  |

<a id="discussionmessagePatchObjectV1"></a>
# **discussionmessagePatchObjectV1**
> DiscussionmessagePatchObjectV1Response discussionmessagePatchObjectV1(pkiDiscussionmessageID, discussionmessagePatchObjectV1Request)

Patch an existing Discussionmessage



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectDiscussionmessageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectDiscussionmessageApi apiInstance = new ObjectDiscussionmessageApi(defaultClient);
    Integer pkiDiscussionmessageID = 56; // Integer | The unique ID of the Discussionmessage
    DiscussionmessagePatchObjectV1Request discussionmessagePatchObjectV1Request = new DiscussionmessagePatchObjectV1Request(); // DiscussionmessagePatchObjectV1Request | 
    try {
      DiscussionmessagePatchObjectV1Response result = apiInstance.discussionmessagePatchObjectV1(pkiDiscussionmessageID, discussionmessagePatchObjectV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectDiscussionmessageApi#discussionmessagePatchObjectV1");
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
| **pkiDiscussionmessageID** | **Integer**| The unique ID of the Discussionmessage | |
| **discussionmessagePatchObjectV1Request** | [**DiscussionmessagePatchObjectV1Request**](DiscussionmessagePatchObjectV1Request.md)|  | |

### Return type

[**DiscussionmessagePatchObjectV1Response**](DiscussionmessagePatchObjectV1Response.md)

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

