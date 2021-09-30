# ObjectEzsignfolderApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ezsignfolderCreateObjectV1**](ObjectEzsignfolderApi.md#ezsignfolderCreateObjectV1) | **POST** /1/object/ezsignfolder | Create a new Ezsignfolder
[**ezsignfolderDeleteObjectV1**](ObjectEzsignfolderApi.md#ezsignfolderDeleteObjectV1) | **DELETE** /1/object/ezsignfolder/{pkiEzsignfolderID} | Delete an existing Ezsignfolder
[**ezsignfolderGetChildrenV1**](ObjectEzsignfolderApi.md#ezsignfolderGetChildrenV1) | **GET** /1/object/ezsignfolder/{pkiEzsignfolderID}/getChildren | Retrieve an existing Ezsignfolder&#39;s children IDs
[**ezsignfolderGetFormsDataV1**](ObjectEzsignfolderApi.md#ezsignfolderGetFormsDataV1) | **GET** /1/object/ezsignfolder/{pkiEzsignfolderID}/getFormsData | Retrieve an existing Ezsignfolder&#39;s forms data
[**ezsignfolderGetObjectV1**](ObjectEzsignfolderApi.md#ezsignfolderGetObjectV1) | **GET** /1/object/ezsignfolder/{pkiEzsignfolderID} | Retrieve an existing Ezsignfolder
[**ezsignfolderSendV1**](ObjectEzsignfolderApi.md#ezsignfolderSendV1) | **POST** /1/object/ezsignfolder/{pkiEzsignfolderID}/send | Send the Ezsignfolder to the signatories for signature


<a name="ezsignfolderCreateObjectV1"></a>
# **ezsignfolderCreateObjectV1**
> EzsignfolderCreateObjectV1Response ezsignfolderCreateObjectV1(ezsignfolderCreateObjectV1Request)

Create a new Ezsignfolder

The endpoint allows to create one or many elements at once.  The array can contain simple (Just the object) or compound (The object and its child) objects.  Creating compound elements allows to reduce the multiple requests to create all child objects.

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsignfolderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsignfolderApi apiInstance = new ObjectEzsignfolderApi(defaultClient);
    List<EzsignfolderCreateObjectV1Request> ezsignfolderCreateObjectV1Request = Arrays.asList(); // List<EzsignfolderCreateObjectV1Request> | 
    try {
      EzsignfolderCreateObjectV1Response result = apiInstance.ezsignfolderCreateObjectV1(ezsignfolderCreateObjectV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsignfolderApi#ezsignfolderCreateObjectV1");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ezsignfolderCreateObjectV1Request** | [**List&lt;EzsignfolderCreateObjectV1Request&gt;**](EzsignfolderCreateObjectV1Request.md)|  |

### Return type

[**EzsignfolderCreateObjectV1Response**](EzsignfolderCreateObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Successful response |  -  |

<a name="ezsignfolderDeleteObjectV1"></a>
# **ezsignfolderDeleteObjectV1**
> EzsignfolderDeleteObjectV1Response ezsignfolderDeleteObjectV1(pkiEzsignfolderID)

Delete an existing Ezsignfolder

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsignfolderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsignfolderApi apiInstance = new ObjectEzsignfolderApi(defaultClient);
    Integer pkiEzsignfolderID = 56; // Integer | 
    try {
      EzsignfolderDeleteObjectV1Response result = apiInstance.ezsignfolderDeleteObjectV1(pkiEzsignfolderID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsignfolderApi#ezsignfolderDeleteObjectV1");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignfolderID** | **Integer**|  |

### Return type

[**EzsignfolderDeleteObjectV1Response**](EzsignfolderDeleteObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |
**404** | The element you are trying to work on does not exist |  -  |
**422** | The syntax of the request is valid but the request cannot be completed. Look for detail in body. |  -  |

<a name="ezsignfolderGetChildrenV1"></a>
# **ezsignfolderGetChildrenV1**
> ezsignfolderGetChildrenV1(pkiEzsignfolderID)

Retrieve an existing Ezsignfolder&#39;s children IDs

## ⚠️EARLY ADOPTERS WARNING  ### This endpoint is not officially released. Its definition might still change and it might not be available in every environment and region.

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsignfolderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsignfolderApi apiInstance = new ObjectEzsignfolderApi(defaultClient);
    Integer pkiEzsignfolderID = 56; // Integer | 
    try {
      apiInstance.ezsignfolderGetChildrenV1(pkiEzsignfolderID);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsignfolderApi#ezsignfolderGetChildrenV1");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignfolderID** | **Integer**|  |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**404** | The element you are trying to work on does not exist |  -  |

<a name="ezsignfolderGetFormsDataV1"></a>
# **ezsignfolderGetFormsDataV1**
> EzsignfolderGetFormsDataV1Response ezsignfolderGetFormsDataV1(pkiEzsignfolderID)

Retrieve an existing Ezsignfolder&#39;s forms data

## ⚠️EARLY ADOPTERS WARNING  ### This endpoint is not officially released. Its definition might still change and it might not be available in every environment and region.

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsignfolderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsignfolderApi apiInstance = new ObjectEzsignfolderApi(defaultClient);
    Integer pkiEzsignfolderID = 56; // Integer | 
    try {
      EzsignfolderGetFormsDataV1Response result = apiInstance.ezsignfolderGetFormsDataV1(pkiEzsignfolderID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsignfolderApi#ezsignfolderGetFormsDataV1");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignfolderID** | **Integer**|  |

### Return type

[**EzsignfolderGetFormsDataV1Response**](EzsignfolderGetFormsDataV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/zip

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |
**404** | The element you are trying to work on does not exist |  -  |
**406** | Accept header is not defined or invalid. |  -  |
**422** | The syntax of the request is valid but the request cannot be completed. Look for detail in body. |  -  |

<a name="ezsignfolderGetObjectV1"></a>
# **ezsignfolderGetObjectV1**
> EzsignfolderGetObjectV1Response ezsignfolderGetObjectV1(pkiEzsignfolderID)

Retrieve an existing Ezsignfolder

## ⚠️EARLY ADOPTERS WARNING  ### This endpoint is not officially released. Its definition might still change and it might not be available in every environment and region.

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsignfolderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsignfolderApi apiInstance = new ObjectEzsignfolderApi(defaultClient);
    Integer pkiEzsignfolderID = 56; // Integer | 
    try {
      EzsignfolderGetObjectV1Response result = apiInstance.ezsignfolderGetObjectV1(pkiEzsignfolderID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsignfolderApi#ezsignfolderGetObjectV1");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignfolderID** | **Integer**|  |

### Return type

[**EzsignfolderGetObjectV1Response**](EzsignfolderGetObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |
**404** | The element you are trying to work on does not exist |  -  |

<a name="ezsignfolderSendV1"></a>
# **ezsignfolderSendV1**
> EzsignfolderSendV1Response ezsignfolderSendV1(pkiEzsignfolderID, ezsignfolderSendV1Request)

Send the Ezsignfolder to the signatories for signature

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsignfolderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsignfolderApi apiInstance = new ObjectEzsignfolderApi(defaultClient);
    Integer pkiEzsignfolderID = 56; // Integer | 
    EzsignfolderSendV1Request ezsignfolderSendV1Request = new EzsignfolderSendV1Request(); // EzsignfolderSendV1Request | 
    try {
      EzsignfolderSendV1Response result = apiInstance.ezsignfolderSendV1(pkiEzsignfolderID, ezsignfolderSendV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsignfolderApi#ezsignfolderSendV1");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignfolderID** | **Integer**|  |
 **ezsignfolderSendV1Request** | [**EzsignfolderSendV1Request**](EzsignfolderSendV1Request.md)|  |

### Return type

[**EzsignfolderSendV1Response**](EzsignfolderSendV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |
**404** | The element you are trying to work on does not exist |  -  |
**422** | The syntax of the request is valid but the request cannot be completed. Look for detail in body. |  -  |

