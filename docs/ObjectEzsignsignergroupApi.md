# ObjectEzsignsignergroupApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**ezsignsignergroupCreateObjectV1**](ObjectEzsignsignergroupApi.md#ezsignsignergroupCreateObjectV1) | **POST** /1/object/ezsignsignergroup | Create a new Ezsignsignergroup |
| [**ezsignsignergroupDeleteObjectV1**](ObjectEzsignsignergroupApi.md#ezsignsignergroupDeleteObjectV1) | **DELETE** /1/object/ezsignsignergroup/{pkiEzsignsignergroupID} | Delete an existing Ezsignsignergroup |
| [**ezsignsignergroupEditEzsignsignergroupmembershipsV1**](ObjectEzsignsignergroupApi.md#ezsignsignergroupEditEzsignsignergroupmembershipsV1) | **PUT** /1/object/ezsignsignergroup/{pkiEzsignsignergroupID}/editEzsignsignergroupmemberships | Edit multiple Ezsignsignergroupmemberships |
| [**ezsignsignergroupEditObjectV1**](ObjectEzsignsignergroupApi.md#ezsignsignergroupEditObjectV1) | **PUT** /1/object/ezsignsignergroup/{pkiEzsignsignergroupID} | Edit an existing Ezsignsignergroup |
| [**ezsignsignergroupGetEzsignsignergroupmembershipsV1**](ObjectEzsignsignergroupApi.md#ezsignsignergroupGetEzsignsignergroupmembershipsV1) | **GET** /1/object/ezsignsignergroup/{pkiEzsignsignergroupID}/getEzsignsignergroupmemberships | Retrieve an existing Ezsignsignergroup&#39;s Ezsignsignergroupmemberships |
| [**ezsignsignergroupGetObjectV2**](ObjectEzsignsignergroupApi.md#ezsignsignergroupGetObjectV2) | **GET** /2/object/ezsignsignergroup/{pkiEzsignsignergroupID} | Retrieve an existing Ezsignsignergroup |


<a id="ezsignsignergroupCreateObjectV1"></a>
# **ezsignsignergroupCreateObjectV1**
> EzsignsignergroupCreateObjectV1Response ezsignsignergroupCreateObjectV1(ezsignsignergroupCreateObjectV1Request)

Create a new Ezsignsignergroup

The endpoint allows to create one or many elements at once.

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsignsignergroupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsignsignergroupApi apiInstance = new ObjectEzsignsignergroupApi(defaultClient);
    EzsignsignergroupCreateObjectV1Request ezsignsignergroupCreateObjectV1Request = new EzsignsignergroupCreateObjectV1Request(); // EzsignsignergroupCreateObjectV1Request | 
    try {
      EzsignsignergroupCreateObjectV1Response result = apiInstance.ezsignsignergroupCreateObjectV1(ezsignsignergroupCreateObjectV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsignsignergroupApi#ezsignsignergroupCreateObjectV1");
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
| **ezsignsignergroupCreateObjectV1Request** | [**EzsignsignergroupCreateObjectV1Request**](EzsignsignergroupCreateObjectV1Request.md)|  | |

### Return type

[**EzsignsignergroupCreateObjectV1Response**](EzsignsignergroupCreateObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful response |  -  |

<a id="ezsignsignergroupDeleteObjectV1"></a>
# **ezsignsignergroupDeleteObjectV1**
> EzsignsignergroupDeleteObjectV1Response ezsignsignergroupDeleteObjectV1(pkiEzsignsignergroupID)

Delete an existing Ezsignsignergroup



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsignsignergroupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsignsignergroupApi apiInstance = new ObjectEzsignsignergroupApi(defaultClient);
    Integer pkiEzsignsignergroupID = 56; // Integer | The unique ID of the Ezsignsignergroup
    try {
      EzsignsignergroupDeleteObjectV1Response result = apiInstance.ezsignsignergroupDeleteObjectV1(pkiEzsignsignergroupID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsignsignergroupApi#ezsignsignergroupDeleteObjectV1");
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
| **pkiEzsignsignergroupID** | **Integer**| The unique ID of the Ezsignsignergroup | |

### Return type

[**EzsignsignergroupDeleteObjectV1Response**](EzsignsignergroupDeleteObjectV1Response.md)

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

<a id="ezsignsignergroupEditEzsignsignergroupmembershipsV1"></a>
# **ezsignsignergroupEditEzsignsignergroupmembershipsV1**
> EzsignsignergroupEditEzsignsignergroupmembershipsV1Response ezsignsignergroupEditEzsignsignergroupmembershipsV1(pkiEzsignsignergroupID, ezsignsignergroupEditEzsignsignergroupmembershipsV1Request)

Edit multiple Ezsignsignergroupmemberships

Using this endpoint, you can edit multiple Ezsignsignergroupmemberships at the same time.

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsignsignergroupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsignsignergroupApi apiInstance = new ObjectEzsignsignergroupApi(defaultClient);
    Integer pkiEzsignsignergroupID = 56; // Integer | 
    EzsignsignergroupEditEzsignsignergroupmembershipsV1Request ezsignsignergroupEditEzsignsignergroupmembershipsV1Request = new EzsignsignergroupEditEzsignsignergroupmembershipsV1Request(); // EzsignsignergroupEditEzsignsignergroupmembershipsV1Request | 
    try {
      EzsignsignergroupEditEzsignsignergroupmembershipsV1Response result = apiInstance.ezsignsignergroupEditEzsignsignergroupmembershipsV1(pkiEzsignsignergroupID, ezsignsignergroupEditEzsignsignergroupmembershipsV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsignsignergroupApi#ezsignsignergroupEditEzsignsignergroupmembershipsV1");
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
| **pkiEzsignsignergroupID** | **Integer**|  | |
| **ezsignsignergroupEditEzsignsignergroupmembershipsV1Request** | [**EzsignsignergroupEditEzsignsignergroupmembershipsV1Request**](EzsignsignergroupEditEzsignsignergroupmembershipsV1Request.md)|  | |

### Return type

[**EzsignsignergroupEditEzsignsignergroupmembershipsV1Response**](EzsignsignergroupEditEzsignsignergroupmembershipsV1Response.md)

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

<a id="ezsignsignergroupEditObjectV1"></a>
# **ezsignsignergroupEditObjectV1**
> EzsignsignergroupEditObjectV1Response ezsignsignergroupEditObjectV1(pkiEzsignsignergroupID, ezsignsignergroupEditObjectV1Request)

Edit an existing Ezsignsignergroup



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsignsignergroupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsignsignergroupApi apiInstance = new ObjectEzsignsignergroupApi(defaultClient);
    Integer pkiEzsignsignergroupID = 56; // Integer | The unique ID of the Ezsignsignergroup
    EzsignsignergroupEditObjectV1Request ezsignsignergroupEditObjectV1Request = new EzsignsignergroupEditObjectV1Request(); // EzsignsignergroupEditObjectV1Request | 
    try {
      EzsignsignergroupEditObjectV1Response result = apiInstance.ezsignsignergroupEditObjectV1(pkiEzsignsignergroupID, ezsignsignergroupEditObjectV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsignsignergroupApi#ezsignsignergroupEditObjectV1");
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
| **pkiEzsignsignergroupID** | **Integer**| The unique ID of the Ezsignsignergroup | |
| **ezsignsignergroupEditObjectV1Request** | [**EzsignsignergroupEditObjectV1Request**](EzsignsignergroupEditObjectV1Request.md)|  | |

### Return type

[**EzsignsignergroupEditObjectV1Response**](EzsignsignergroupEditObjectV1Response.md)

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

<a id="ezsignsignergroupGetEzsignsignergroupmembershipsV1"></a>
# **ezsignsignergroupGetEzsignsignergroupmembershipsV1**
> EzsignsignergroupGetEzsignsignergroupmembershipsV1Response ezsignsignergroupGetEzsignsignergroupmembershipsV1(pkiEzsignsignergroupID)

Retrieve an existing Ezsignsignergroup&#39;s Ezsignsignergroupmemberships

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsignsignergroupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsignsignergroupApi apiInstance = new ObjectEzsignsignergroupApi(defaultClient);
    Integer pkiEzsignsignergroupID = 56; // Integer | 
    try {
      EzsignsignergroupGetEzsignsignergroupmembershipsV1Response result = apiInstance.ezsignsignergroupGetEzsignsignergroupmembershipsV1(pkiEzsignsignergroupID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsignsignergroupApi#ezsignsignergroupGetEzsignsignergroupmembershipsV1");
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
| **pkiEzsignsignergroupID** | **Integer**|  | |

### Return type

[**EzsignsignergroupGetEzsignsignergroupmembershipsV1Response**](EzsignsignergroupGetEzsignsignergroupmembershipsV1Response.md)

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

<a id="ezsignsignergroupGetObjectV2"></a>
# **ezsignsignergroupGetObjectV2**
> EzsignsignergroupGetObjectV2Response ezsignsignergroupGetObjectV2(pkiEzsignsignergroupID)

Retrieve an existing Ezsignsignergroup



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsignsignergroupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsignsignergroupApi apiInstance = new ObjectEzsignsignergroupApi(defaultClient);
    Integer pkiEzsignsignergroupID = 56; // Integer | The unique ID of the Ezsignsignergroup
    try {
      EzsignsignergroupGetObjectV2Response result = apiInstance.ezsignsignergroupGetObjectV2(pkiEzsignsignergroupID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsignsignergroupApi#ezsignsignergroupGetObjectV2");
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
| **pkiEzsignsignergroupID** | **Integer**| The unique ID of the Ezsignsignergroup | |

### Return type

[**EzsignsignergroupGetObjectV2Response**](EzsignsignergroupGetObjectV2Response.md)

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

