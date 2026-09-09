# ObjectFolderApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**folderBatchDownloadV1**](ObjectFolderApi.md#folderBatchDownloadV1) | **POST** /1/object/folder/{pkiFolderID}/batchDownload | Download multiples attachments from an Folder |
| [**folderGetAttachmentsV1**](ObjectFolderApi.md#folderGetAttachmentsV1) | **GET** /1/object/folder/{pkiFolderID}/getAttachments | Retrieve Folder&#39;s attachments |
| [**folderImportIntoEDMV1**](ObjectFolderApi.md#folderImportIntoEDMV1) | **POST** /1/object/folder/{pkiFolderID}/importIntoEDM | Import attachments into the Folder |


<a id="folderBatchDownloadV1"></a>
# **folderBatchDownloadV1**
> File folderBatchDownloadV1(pkiFolderID, folderBatchDownloadV1Request)

Download multiples attachments from an Folder

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectFolderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectFolderApi apiInstance = new ObjectFolderApi(defaultClient);
    Integer pkiFolderID = 56; // Integer | 
    FolderBatchDownloadV1Request folderBatchDownloadV1Request = new FolderBatchDownloadV1Request(); // FolderBatchDownloadV1Request | 
    try {
      File result = apiInstance.folderBatchDownloadV1(pkiFolderID, folderBatchDownloadV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectFolderApi#folderBatchDownloadV1");
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
| **pkiFolderID** | **Integer**|  | |
| **folderBatchDownloadV1Request** | [**FolderBatchDownloadV1Request**](FolderBatchDownloadV1Request.md)|  | |

### Return type

[**File**](File.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/zip, text/xml, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **404** | The request failed. The element on which you were trying to work does not exists. Look for detail about the error in the body. |  -  |
| **406** | The URL is valid, but one of the Accept header is not defined or invalid. For example, you set the header \&quot;Accept: application/json\&quot; but the function can only return \&quot;Content-type: image/png\&quot; |  -  |
| **422** | The request was syntactically valid but failed because of an interdependance condition. Look for detail about the error in the body. |  -  |

<a id="folderGetAttachmentsV1"></a>
# **folderGetAttachmentsV1**
> FolderGetAttachmentsV1Response folderGetAttachmentsV1(pkiFolderID)

Retrieve Folder&#39;s attachments

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectFolderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectFolderApi apiInstance = new ObjectFolderApi(defaultClient);
    Integer pkiFolderID = 56; // Integer | 
    try {
      FolderGetAttachmentsV1Response result = apiInstance.folderGetAttachmentsV1(pkiFolderID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectFolderApi#folderGetAttachmentsV1");
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
| **pkiFolderID** | **Integer**|  | |

### Return type

[**FolderGetAttachmentsV1Response**](FolderGetAttachmentsV1Response.md)

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

<a id="folderImportIntoEDMV1"></a>
# **folderImportIntoEDMV1**
> FolderImportIntoEDMV1Response folderImportIntoEDMV1(pkiFolderID, folderImportIntoEDMV1Request)

Import attachments into the Folder

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectFolderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectFolderApi apiInstance = new ObjectFolderApi(defaultClient);
    Integer pkiFolderID = 56; // Integer | 
    FolderImportIntoEDMV1Request folderImportIntoEDMV1Request = new FolderImportIntoEDMV1Request(); // FolderImportIntoEDMV1Request | 
    try {
      FolderImportIntoEDMV1Response result = apiInstance.folderImportIntoEDMV1(pkiFolderID, folderImportIntoEDMV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectFolderApi#folderImportIntoEDMV1");
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
| **pkiFolderID** | **Integer**|  | |
| **folderImportIntoEDMV1Request** | [**FolderImportIntoEDMV1Request**](FolderImportIntoEDMV1Request.md)|  | |

### Return type

[**FolderImportIntoEDMV1Response**](FolderImportIntoEDMV1Response.md)

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

