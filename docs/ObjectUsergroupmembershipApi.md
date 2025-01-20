# ObjectUsergroupmembershipApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**usergroupmembershipCreateObjectV1**](ObjectUsergroupmembershipApi.md#usergroupmembershipCreateObjectV1) | **POST** /1/object/usergroupmembership | Create a new Usergroupmembership |
| [**usergroupmembershipDeleteObjectV1**](ObjectUsergroupmembershipApi.md#usergroupmembershipDeleteObjectV1) | **DELETE** /1/object/usergroupmembership/{pkiUsergroupmembershipID} | Delete an existing Usergroupmembership |
| [**usergroupmembershipEditObjectV1**](ObjectUsergroupmembershipApi.md#usergroupmembershipEditObjectV1) | **PUT** /1/object/usergroupmembership/{pkiUsergroupmembershipID} | Edit an existing Usergroupmembership |
| [**usergroupmembershipGetObjectV2**](ObjectUsergroupmembershipApi.md#usergroupmembershipGetObjectV2) | **GET** /2/object/usergroupmembership/{pkiUsergroupmembershipID} | Retrieve an existing Usergroupmembership |


<a id="usergroupmembershipCreateObjectV1"></a>
# **usergroupmembershipCreateObjectV1**
> UsergroupmembershipCreateObjectV1Response usergroupmembershipCreateObjectV1(usergroupmembershipCreateObjectV1Request)

Create a new Usergroupmembership

The endpoint allows to create one or many elements at once.

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectUsergroupmembershipApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectUsergroupmembershipApi apiInstance = new ObjectUsergroupmembershipApi(defaultClient);
    UsergroupmembershipCreateObjectV1Request usergroupmembershipCreateObjectV1Request = new UsergroupmembershipCreateObjectV1Request(); // UsergroupmembershipCreateObjectV1Request | 
    try {
      UsergroupmembershipCreateObjectV1Response result = apiInstance.usergroupmembershipCreateObjectV1(usergroupmembershipCreateObjectV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectUsergroupmembershipApi#usergroupmembershipCreateObjectV1");
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
| **usergroupmembershipCreateObjectV1Request** | [**UsergroupmembershipCreateObjectV1Request**](UsergroupmembershipCreateObjectV1Request.md)|  | |

### Return type

[**UsergroupmembershipCreateObjectV1Response**](UsergroupmembershipCreateObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful response |  -  |

<a id="usergroupmembershipDeleteObjectV1"></a>
# **usergroupmembershipDeleteObjectV1**
> UsergroupmembershipDeleteObjectV1Response usergroupmembershipDeleteObjectV1(pkiUsergroupmembershipID)

Delete an existing Usergroupmembership



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectUsergroupmembershipApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectUsergroupmembershipApi apiInstance = new ObjectUsergroupmembershipApi(defaultClient);
    Integer pkiUsergroupmembershipID = 56; // Integer | 
    try {
      UsergroupmembershipDeleteObjectV1Response result = apiInstance.usergroupmembershipDeleteObjectV1(pkiUsergroupmembershipID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectUsergroupmembershipApi#usergroupmembershipDeleteObjectV1");
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
| **pkiUsergroupmembershipID** | **Integer**|  | |

### Return type

[**UsergroupmembershipDeleteObjectV1Response**](UsergroupmembershipDeleteObjectV1Response.md)

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

<a id="usergroupmembershipEditObjectV1"></a>
# **usergroupmembershipEditObjectV1**
> UsergroupmembershipEditObjectV1Response usergroupmembershipEditObjectV1(pkiUsergroupmembershipID, usergroupmembershipEditObjectV1Request)

Edit an existing Usergroupmembership



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectUsergroupmembershipApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectUsergroupmembershipApi apiInstance = new ObjectUsergroupmembershipApi(defaultClient);
    Integer pkiUsergroupmembershipID = 56; // Integer | 
    UsergroupmembershipEditObjectV1Request usergroupmembershipEditObjectV1Request = new UsergroupmembershipEditObjectV1Request(); // UsergroupmembershipEditObjectV1Request | 
    try {
      UsergroupmembershipEditObjectV1Response result = apiInstance.usergroupmembershipEditObjectV1(pkiUsergroupmembershipID, usergroupmembershipEditObjectV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectUsergroupmembershipApi#usergroupmembershipEditObjectV1");
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
| **pkiUsergroupmembershipID** | **Integer**|  | |
| **usergroupmembershipEditObjectV1Request** | [**UsergroupmembershipEditObjectV1Request**](UsergroupmembershipEditObjectV1Request.md)|  | |

### Return type

[**UsergroupmembershipEditObjectV1Response**](UsergroupmembershipEditObjectV1Response.md)

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

<a id="usergroupmembershipGetObjectV2"></a>
# **usergroupmembershipGetObjectV2**
> UsergroupmembershipGetObjectV2Response usergroupmembershipGetObjectV2(pkiUsergroupmembershipID)

Retrieve an existing Usergroupmembership



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectUsergroupmembershipApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectUsergroupmembershipApi apiInstance = new ObjectUsergroupmembershipApi(defaultClient);
    Integer pkiUsergroupmembershipID = 56; // Integer | 
    try {
      UsergroupmembershipGetObjectV2Response result = apiInstance.usergroupmembershipGetObjectV2(pkiUsergroupmembershipID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectUsergroupmembershipApi#usergroupmembershipGetObjectV2");
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
| **pkiUsergroupmembershipID** | **Integer**|  | |

### Return type

[**UsergroupmembershipGetObjectV2Response**](UsergroupmembershipGetObjectV2Response.md)

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

