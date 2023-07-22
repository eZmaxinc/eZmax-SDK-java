# ScimGroupsApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**groupsCreateObjectScimV2**](ScimGroupsApi.md#groupsCreateObjectScimV2) | **POST** /2/scim/Groups | Create a new Usergroup |
| [**groupsDeleteObjectScimV2**](ScimGroupsApi.md#groupsDeleteObjectScimV2) | **DELETE** /2/scim/Groups/{groupId} | Delete an existing Usergroup |
| [**groupsEditObjectScimV2**](ScimGroupsApi.md#groupsEditObjectScimV2) | **PUT** /2/scim/Groups/{groupId} | Edit an existing Usergroup |
| [**groupsGetListScimV2**](ScimGroupsApi.md#groupsGetListScimV2) | **GET** /2/scim/Groups | Retrieve Usergroup list |
| [**groupsGetObjectScimV2**](ScimGroupsApi.md#groupsGetObjectScimV2) | **GET** /2/scim/Groups/{groupId} | Retrieve an existing Usergroup |


<a id="groupsCreateObjectScimV2"></a>
# **groupsCreateObjectScimV2**
> ScimGroup groupsCreateObjectScimV2(scimGroup)

Create a new Usergroup

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ScimGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure HTTP bearer authorization: Bearer
    HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setBearerToken("BEARER TOKEN");

    ScimGroupsApi apiInstance = new ScimGroupsApi(defaultClient);
    ScimGroup scimGroup = new ScimGroup(); // ScimGroup | 
    try {
      ScimGroup result = apiInstance.groupsCreateObjectScimV2(scimGroup);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScimGroupsApi#groupsCreateObjectScimV2");
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
| **scimGroup** | [**ScimGroup**](ScimGroup.md)|  | |

### Return type

[**ScimGroup**](ScimGroup.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="groupsDeleteObjectScimV2"></a>
# **groupsDeleteObjectScimV2**
> groupsDeleteObjectScimV2(groupId)

Delete an existing Usergroup

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ScimGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure HTTP bearer authorization: Bearer
    HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setBearerToken("BEARER TOKEN");

    ScimGroupsApi apiInstance = new ScimGroupsApi(defaultClient);
    String groupId = "groupId_example"; // String | 
    try {
      apiInstance.groupsDeleteObjectScimV2(groupId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScimGroupsApi#groupsDeleteObjectScimV2");
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
| **groupId** | **String**|  | |

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

<a id="groupsEditObjectScimV2"></a>
# **groupsEditObjectScimV2**
> ScimGroup groupsEditObjectScimV2(groupId, scimGroup)

Edit an existing Usergroup

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ScimGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure HTTP bearer authorization: Bearer
    HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setBearerToken("BEARER TOKEN");

    ScimGroupsApi apiInstance = new ScimGroupsApi(defaultClient);
    String groupId = "groupId_example"; // String | 
    ScimGroup scimGroup = new ScimGroup(); // ScimGroup | 
    try {
      ScimGroup result = apiInstance.groupsEditObjectScimV2(groupId, scimGroup);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScimGroupsApi#groupsEditObjectScimV2");
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
| **groupId** | **String**|  | |
| **scimGroup** | [**ScimGroup**](ScimGroup.md)|  | |

### Return type

[**ScimGroup**](ScimGroup.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="groupsGetListScimV2"></a>
# **groupsGetListScimV2**
> ScimGroup groupsGetListScimV2(filter)

Retrieve Usergroup list

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ScimGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure HTTP bearer authorization: Bearer
    HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setBearerToken("BEARER TOKEN");

    ScimGroupsApi apiInstance = new ScimGroupsApi(defaultClient);
    String filter = "filter_example"; // String | Filter expression for searching groups
    try {
      ScimGroup result = apiInstance.groupsGetListScimV2(filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScimGroupsApi#groupsGetListScimV2");
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
| **filter** | **String**| Filter expression for searching groups | [optional] |

### Return type

[**ScimGroup**](ScimGroup.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="groupsGetObjectScimV2"></a>
# **groupsGetObjectScimV2**
> ScimGroup groupsGetObjectScimV2(groupId)

Retrieve an existing Usergroup

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ScimGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure HTTP bearer authorization: Bearer
    HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setBearerToken("BEARER TOKEN");

    ScimGroupsApi apiInstance = new ScimGroupsApi(defaultClient);
    String groupId = "groupId_example"; // String | 
    try {
      ScimGroup result = apiInstance.groupsGetObjectScimV2(groupId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScimGroupsApi#groupsGetObjectScimV2");
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
| **groupId** | **String**|  | |

### Return type

[**ScimGroup**](ScimGroup.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

