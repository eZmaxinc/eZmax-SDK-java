# ObjectPermissionApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**permissionCreateObjectV1**](ObjectPermissionApi.md#permissionCreateObjectV1) | **POST** /1/object/permission | Create a new Permission |
| [**permissionDeleteObjectV1**](ObjectPermissionApi.md#permissionDeleteObjectV1) | **DELETE** /1/object/permission/{pkiPermissionID} | Delete an existing Permission |
| [**permissionEditObjectV1**](ObjectPermissionApi.md#permissionEditObjectV1) | **PUT** /1/object/permission/{pkiPermissionID} | Edit an existing Permission |
| [**permissionGetObjectV2**](ObjectPermissionApi.md#permissionGetObjectV2) | **GET** /2/object/permission/{pkiPermissionID} | Retrieve an existing Permission |


<a id="permissionCreateObjectV1"></a>
# **permissionCreateObjectV1**
> PermissionCreateObjectV1Response permissionCreateObjectV1(permissionCreateObjectV1Request)

Create a new Permission

The endpoint allows to create one or many elements at once.

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectPermissionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectPermissionApi apiInstance = new ObjectPermissionApi(defaultClient);
    PermissionCreateObjectV1Request permissionCreateObjectV1Request = new PermissionCreateObjectV1Request(); // PermissionCreateObjectV1Request | 
    try {
      PermissionCreateObjectV1Response result = apiInstance.permissionCreateObjectV1(permissionCreateObjectV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectPermissionApi#permissionCreateObjectV1");
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
| **permissionCreateObjectV1Request** | [**PermissionCreateObjectV1Request**](PermissionCreateObjectV1Request.md)|  | |

### Return type

[**PermissionCreateObjectV1Response**](PermissionCreateObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful response |  -  |
| **422** | The request was syntactically valid but failed because of an interdependance condition. Look for detail about the error in the body |  -  |

<a id="permissionDeleteObjectV1"></a>
# **permissionDeleteObjectV1**
> CommonResponse permissionDeleteObjectV1(pkiPermissionID)

Delete an existing Permission



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectPermissionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectPermissionApi apiInstance = new ObjectPermissionApi(defaultClient);
    Integer pkiPermissionID = 56; // Integer | The unique ID of the Permission
    try {
      CommonResponse result = apiInstance.permissionDeleteObjectV1(pkiPermissionID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectPermissionApi#permissionDeleteObjectV1");
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
| **pkiPermissionID** | **Integer**| The unique ID of the Permission | |

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

<a id="permissionEditObjectV1"></a>
# **permissionEditObjectV1**
> CommonResponse permissionEditObjectV1(pkiPermissionID, permissionEditObjectV1Request)

Edit an existing Permission



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectPermissionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectPermissionApi apiInstance = new ObjectPermissionApi(defaultClient);
    Integer pkiPermissionID = 56; // Integer | The unique ID of the Permission
    PermissionEditObjectV1Request permissionEditObjectV1Request = new PermissionEditObjectV1Request(); // PermissionEditObjectV1Request | 
    try {
      CommonResponse result = apiInstance.permissionEditObjectV1(pkiPermissionID, permissionEditObjectV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectPermissionApi#permissionEditObjectV1");
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
| **pkiPermissionID** | **Integer**| The unique ID of the Permission | |
| **permissionEditObjectV1Request** | [**PermissionEditObjectV1Request**](PermissionEditObjectV1Request.md)|  | |

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

<a id="permissionGetObjectV2"></a>
# **permissionGetObjectV2**
> PermissionGetObjectV2Response permissionGetObjectV2(pkiPermissionID)

Retrieve an existing Permission



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectPermissionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectPermissionApi apiInstance = new ObjectPermissionApi(defaultClient);
    Integer pkiPermissionID = 56; // Integer | The unique ID of the Permission
    try {
      PermissionGetObjectV2Response result = apiInstance.permissionGetObjectV2(pkiPermissionID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectPermissionApi#permissionGetObjectV2");
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
| **pkiPermissionID** | **Integer**| The unique ID of the Permission | |

### Return type

[**PermissionGetObjectV2Response**](PermissionGetObjectV2Response.md)

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

