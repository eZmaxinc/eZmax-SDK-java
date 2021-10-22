# ModuleListApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listGetListpresentationV1**](ModuleListApi.md#listGetListpresentationV1) | **GET** /1/module/list/listpresentation/{sListName} | Get all Listpresentation for a specific list
[**listSaveListpresentationV1**](ModuleListApi.md#listSaveListpresentationV1) | **POST** /1/module/list/listpresentation/{sListName} | Save all Listpresentation for a specific list


<a name="listGetListpresentationV1"></a>
# **listGetListpresentationV1**
> ListGetListpresentationV1Response listGetListpresentationV1(sListName)

Get all Listpresentation for a specific list

Retrive previously saved Listpresentation

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ModuleListApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ModuleListApi apiInstance = new ModuleListApi(defaultClient);
    String sListName = "sListName_example"; // String | The list Name
    try {
      ListGetListpresentationV1Response result = apiInstance.listGetListpresentationV1(sListName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModuleListApi#listGetListpresentationV1");
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
 **sListName** | **String**| The list Name |

### Return type

[**ListGetListpresentationV1Response**](ListGetListpresentationV1Response.md)

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

<a name="listSaveListpresentationV1"></a>
# **listSaveListpresentationV1**
> ListSaveListpresentationV1Response listSaveListpresentationV1(sListName, listSaveListpresentationV1Request)

Save all Listpresentation for a specific list

Users can create many Listpresentations for lists in the system. They can customize orber by, filters, numbers of rows, etc.

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ModuleListApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ModuleListApi apiInstance = new ModuleListApi(defaultClient);
    String sListName = "sListName_example"; // String | The list Name
    ListSaveListpresentationV1Request listSaveListpresentationV1Request = new ListSaveListpresentationV1Request(); // ListSaveListpresentationV1Request | 
    try {
      ListSaveListpresentationV1Response result = apiInstance.listSaveListpresentationV1(sListName, listSaveListpresentationV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModuleListApi#listSaveListpresentationV1");
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
 **sListName** | **String**| The list Name |
 **listSaveListpresentationV1Request** | [**ListSaveListpresentationV1Request**](ListSaveListpresentationV1Request.md)|  |

### Return type

[**ListSaveListpresentationV1Response**](ListSaveListpresentationV1Response.md)

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

