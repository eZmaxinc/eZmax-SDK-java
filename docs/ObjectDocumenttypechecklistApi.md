# ObjectDocumenttypechecklistApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**documenttypechecklistDeleteObjectV1**](ObjectDocumenttypechecklistApi.md#documenttypechecklistDeleteObjectV1) | **DELETE** /1/object/documenttypechecklist/{pkiDocumenttypechecklistID} | Delete an existing Documenttypechecklist |
| [**documenttypechecklistPatchObjectV1**](ObjectDocumenttypechecklistApi.md#documenttypechecklistPatchObjectV1) | **PATCH** /1/object/documenttypechecklist/{pkiDocumenttypechecklistID} | Patch an existing Documenttypechecklist |


<a id="documenttypechecklistDeleteObjectV1"></a>
# **documenttypechecklistDeleteObjectV1**
> DocumenttypechecklistDeleteObjectV1Response documenttypechecklistDeleteObjectV1(pkiDocumenttypechecklistID)

Delete an existing Documenttypechecklist



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectDocumenttypechecklistApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectDocumenttypechecklistApi apiInstance = new ObjectDocumenttypechecklistApi(defaultClient);
    Integer pkiDocumenttypechecklistID = 56; // Integer | The unique ID of the Documenttypechecklist
    try {
      DocumenttypechecklistDeleteObjectV1Response result = apiInstance.documenttypechecklistDeleteObjectV1(pkiDocumenttypechecklistID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectDocumenttypechecklistApi#documenttypechecklistDeleteObjectV1");
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
| **pkiDocumenttypechecklistID** | **Integer**| The unique ID of the Documenttypechecklist | |

### Return type

[**DocumenttypechecklistDeleteObjectV1Response**](DocumenttypechecklistDeleteObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **404** | The request failed. The element on which you were trying to work does not exists. Look for detail about the error in the body. |  -  |

<a id="documenttypechecklistPatchObjectV1"></a>
# **documenttypechecklistPatchObjectV1**
> DocumenttypechecklistPatchObjectV1Response documenttypechecklistPatchObjectV1(pkiDocumenttypechecklistID, documenttypechecklistPatchObjectV1Request)

Patch an existing Documenttypechecklist



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectDocumenttypechecklistApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectDocumenttypechecklistApi apiInstance = new ObjectDocumenttypechecklistApi(defaultClient);
    Integer pkiDocumenttypechecklistID = 56; // Integer | The unique ID of the Documenttypechecklist
    DocumenttypechecklistPatchObjectV1Request documenttypechecklistPatchObjectV1Request = new DocumenttypechecklistPatchObjectV1Request(); // DocumenttypechecklistPatchObjectV1Request | 
    try {
      DocumenttypechecklistPatchObjectV1Response result = apiInstance.documenttypechecklistPatchObjectV1(pkiDocumenttypechecklistID, documenttypechecklistPatchObjectV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectDocumenttypechecklistApi#documenttypechecklistPatchObjectV1");
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
| **pkiDocumenttypechecklistID** | **Integer**| The unique ID of the Documenttypechecklist | |
| **documenttypechecklistPatchObjectV1Request** | [**DocumenttypechecklistPatchObjectV1Request**](DocumenttypechecklistPatchObjectV1Request.md)|  | |

### Return type

[**DocumenttypechecklistPatchObjectV1Response**](DocumenttypechecklistPatchObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **404** | The request failed. The element on which you were trying to work does not exists. Look for detail about the error in the body. |  -  |
| **422** | The request was syntactically valid but failed because of an interdependance condition. Look for detail about the error in the body. |  -  |

