# ScimUsersApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**usersCreateObjectScimV2**](ScimUsersApi.md#usersCreateObjectScimV2) | **POST** /2/scim/Users | Create a new User |
| [**usersDeleteObjectScimV2**](ScimUsersApi.md#usersDeleteObjectScimV2) | **DELETE** /2/scim/Users/{userId} | Delete an existing User |
| [**usersEditObjectScimV2**](ScimUsersApi.md#usersEditObjectScimV2) | **PUT** /2/scim/Users/{userId} | Edit an existing User |
| [**usersGetListScimV2**](ScimUsersApi.md#usersGetListScimV2) | **GET** /2/scim/Users | Retrieve User list |
| [**usersGetObjectScimV2**](ScimUsersApi.md#usersGetObjectScimV2) | **GET** /2/scim/Users/{userId} | Retrieve an existing User |


<a id="usersCreateObjectScimV2"></a>
# **usersCreateObjectScimV2**
> ScimUser usersCreateObjectScimV2(scimUser)

Create a new User

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ScimUsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure HTTP bearer authorization: Bearer
    HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setBearerToken("BEARER TOKEN");

    ScimUsersApi apiInstance = new ScimUsersApi(defaultClient);
    ScimUser scimUser = new ScimUser(); // ScimUser | 
    try {
      ScimUser result = apiInstance.usersCreateObjectScimV2(scimUser);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScimUsersApi#usersCreateObjectScimV2");
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
| **scimUser** | [**ScimUser**](ScimUser.md)|  | |

### Return type

[**ScimUser**](ScimUser.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="usersDeleteObjectScimV2"></a>
# **usersDeleteObjectScimV2**
> usersDeleteObjectScimV2(userId)

Delete an existing User

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ScimUsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure HTTP bearer authorization: Bearer
    HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setBearerToken("BEARER TOKEN");

    ScimUsersApi apiInstance = new ScimUsersApi(defaultClient);
    String userId = "userId_example"; // String | 
    try {
      apiInstance.usersDeleteObjectScimV2(userId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScimUsersApi#usersDeleteObjectScimV2");
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
| **userId** | **String**|  | |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |

<a id="usersEditObjectScimV2"></a>
# **usersEditObjectScimV2**
> ScimUser usersEditObjectScimV2(userId, scimUser)

Edit an existing User

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ScimUsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure HTTP bearer authorization: Bearer
    HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setBearerToken("BEARER TOKEN");

    ScimUsersApi apiInstance = new ScimUsersApi(defaultClient);
    String userId = "userId_example"; // String | 
    ScimUser scimUser = new ScimUser(); // ScimUser | 
    try {
      ScimUser result = apiInstance.usersEditObjectScimV2(userId, scimUser);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScimUsersApi#usersEditObjectScimV2");
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
| **userId** | **String**|  | |
| **scimUser** | [**ScimUser**](ScimUser.md)|  | |

### Return type

[**ScimUser**](ScimUser.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="usersGetListScimV2"></a>
# **usersGetListScimV2**
> ScimUserList usersGetListScimV2(filter)

Retrieve User list

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ScimUsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure HTTP bearer authorization: Bearer
    HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setBearerToken("BEARER TOKEN");

    ScimUsersApi apiInstance = new ScimUsersApi(defaultClient);
    String filter = "filter_example"; // String | Filter expression for searching users
    try {
      ScimUserList result = apiInstance.usersGetListScimV2(filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScimUsersApi#usersGetListScimV2");
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
| **filter** | **String**| Filter expression for searching users | [optional] |

### Return type

[**ScimUserList**](ScimUserList.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="usersGetObjectScimV2"></a>
# **usersGetObjectScimV2**
> ScimUser usersGetObjectScimV2(userId)

Retrieve an existing User

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ScimUsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure HTTP bearer authorization: Bearer
    HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setBearerToken("BEARER TOKEN");

    ScimUsersApi apiInstance = new ScimUsersApi(defaultClient);
    String userId = "userId_example"; // String | 
    try {
      ScimUser result = apiInstance.usersGetObjectScimV2(userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScimUsersApi#usersGetObjectScimV2");
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
| **userId** | **String**|  | |

### Return type

[**ScimUser**](ScimUser.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

