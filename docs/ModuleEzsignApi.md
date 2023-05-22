# ModuleEzsignApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**ezsignSuggestSignersV1**](ModuleEzsignApi.md#ezsignSuggestSignersV1) | **GET** /1/module/ezsign/suggestSigners | Suggest signers |
| [**ezsignSuggestTemplatesV1**](ModuleEzsignApi.md#ezsignSuggestTemplatesV1) | **GET** /1/module/ezsign/suggestTemplates | Suggest templates |


<a id="ezsignSuggestSignersV1"></a>
# **ezsignSuggestSignersV1**
> EzsignSuggestSignersV1Response ezsignSuggestSignersV1()

Suggest signers

Retrieve previously used Ezsignsigners and all users from the system

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ModuleEzsignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ModuleEzsignApi apiInstance = new ModuleEzsignApi(defaultClient);
    try {
      EzsignSuggestSignersV1Response result = apiInstance.ezsignSuggestSignersV1();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModuleEzsignApi#ezsignSuggestSignersV1");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**EzsignSuggestSignersV1Response**](EzsignSuggestSignersV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="ezsignSuggestTemplatesV1"></a>
# **ezsignSuggestTemplatesV1**
> EzsignSuggestTemplatesV1Response ezsignSuggestTemplatesV1(fkiEzsignfoldertypeID)

Suggest templates

Retrieve Ezsigntemplates and Ezsigntemplatepackages that can be imported in a Ezsignfolder

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ModuleEzsignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ModuleEzsignApi apiInstance = new ModuleEzsignApi(defaultClient);
    Integer fkiEzsignfoldertypeID = 56; // Integer | 
    try {
      EzsignSuggestTemplatesV1Response result = apiInstance.ezsignSuggestTemplatesV1(fkiEzsignfoldertypeID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModuleEzsignApi#ezsignSuggestTemplatesV1");
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
| **fkiEzsignfoldertypeID** | **Integer**|  | [optional] |

### Return type

[**EzsignSuggestTemplatesV1Response**](EzsignSuggestTemplatesV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

