# ObjectAttachmentApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**attachmentDownloadV1**](ObjectAttachmentApi.md#attachmentDownloadV1) | **GET** /1/object/attachment/{pkiAttachmentID}/download | Retrieve the content |
| [**attachmentGetAttachmentlogsV1**](ObjectAttachmentApi.md#attachmentGetAttachmentlogsV1) | **GET** /1/object/attachment/{pkiAttachmentID}/getAttachmentlogs | Retrieve the Attachmentlogs |


<a id="attachmentDownloadV1"></a>
# **attachmentDownloadV1**
> attachmentDownloadV1(pkiAttachmentID)

Retrieve the content

Using this endpoint, you can retrieve the content of an attachment.

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectAttachmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    // Configure API key authorization: Presigned
    ApiKeyAuth Presigned = (ApiKeyAuth) defaultClient.getAuthentication("Presigned");
    Presigned.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Presigned.setApiKeyPrefix("Token");

    ObjectAttachmentApi apiInstance = new ObjectAttachmentApi(defaultClient);
    Integer pkiAttachmentID = 56; // Integer | 
    try {
      apiInstance.attachmentDownloadV1(pkiAttachmentID);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectAttachmentApi#attachmentDownloadV1");
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
| **pkiAttachmentID** | **Integer**|  | |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization), [Presigned](../README.md#Presigned)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **302** | The user has been redirected |  -  |
| **404** | The request failed. The element on which you were trying to work does not exists. Look for detail about the error in the body |  -  |

<a id="attachmentGetAttachmentlogsV1"></a>
# **attachmentGetAttachmentlogsV1**
> AttachmentGetAttachmentlogsV1Response attachmentGetAttachmentlogsV1(pkiAttachmentID)

Retrieve the Attachmentlogs

Using this endpoint, you can retrieve the Attachmentlogs of an attachment.

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectAttachmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectAttachmentApi apiInstance = new ObjectAttachmentApi(defaultClient);
    Integer pkiAttachmentID = 56; // Integer | 
    try {
      AttachmentGetAttachmentlogsV1Response result = apiInstance.attachmentGetAttachmentlogsV1(pkiAttachmentID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectAttachmentApi#attachmentGetAttachmentlogsV1");
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
| **pkiAttachmentID** | **Integer**|  | |

### Return type

[**AttachmentGetAttachmentlogsV1Response**](AttachmentGetAttachmentlogsV1Response.md)

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

