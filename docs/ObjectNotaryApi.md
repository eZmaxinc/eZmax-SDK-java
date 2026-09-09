# ObjectNotaryApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**notaryBatchDownloadV1**](ObjectNotaryApi.md#notaryBatchDownloadV1) | **POST** /1/object/notary/{pkiNotaryID}/batchDownload | Download multiples attachments from a Notary |
| [**notaryGetAttachmentsV1**](ObjectNotaryApi.md#notaryGetAttachmentsV1) | **GET** /1/object/notary/{pkiNotaryID}/getAttachments | Retrieve Notary&#39;s attachments |
| [**notaryImportIntoEDMV1**](ObjectNotaryApi.md#notaryImportIntoEDMV1) | **POST** /1/object/notary/{pkiNotaryID}/importIntoEDM | Import attachments into the Notary |


<a id="notaryBatchDownloadV1"></a>
# **notaryBatchDownloadV1**
> File notaryBatchDownloadV1(pkiNotaryID, notaryBatchDownloadV1Request)

Download multiples attachments from a Notary

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectNotaryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectNotaryApi apiInstance = new ObjectNotaryApi(defaultClient);
    Integer pkiNotaryID = 56; // Integer | 
    NotaryBatchDownloadV1Request notaryBatchDownloadV1Request = new NotaryBatchDownloadV1Request(); // NotaryBatchDownloadV1Request | 
    try {
      File result = apiInstance.notaryBatchDownloadV1(pkiNotaryID, notaryBatchDownloadV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectNotaryApi#notaryBatchDownloadV1");
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
| **pkiNotaryID** | **Integer**|  | |
| **notaryBatchDownloadV1Request** | [**NotaryBatchDownloadV1Request**](NotaryBatchDownloadV1Request.md)|  | |

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

<a id="notaryGetAttachmentsV1"></a>
# **notaryGetAttachmentsV1**
> NotaryGetAttachmentsV1Response notaryGetAttachmentsV1(pkiNotaryID)

Retrieve Notary&#39;s attachments

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectNotaryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectNotaryApi apiInstance = new ObjectNotaryApi(defaultClient);
    Integer pkiNotaryID = 56; // Integer | 
    try {
      NotaryGetAttachmentsV1Response result = apiInstance.notaryGetAttachmentsV1(pkiNotaryID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectNotaryApi#notaryGetAttachmentsV1");
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
| **pkiNotaryID** | **Integer**|  | |

### Return type

[**NotaryGetAttachmentsV1Response**](NotaryGetAttachmentsV1Response.md)

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

<a id="notaryImportIntoEDMV1"></a>
# **notaryImportIntoEDMV1**
> NotaryImportIntoEDMV1Response notaryImportIntoEDMV1(pkiNotaryID, notaryImportIntoEDMV1Request)

Import attachments into the Notary

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectNotaryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectNotaryApi apiInstance = new ObjectNotaryApi(defaultClient);
    Integer pkiNotaryID = 56; // Integer | 
    NotaryImportIntoEDMV1Request notaryImportIntoEDMV1Request = new NotaryImportIntoEDMV1Request(); // NotaryImportIntoEDMV1Request | 
    try {
      NotaryImportIntoEDMV1Response result = apiInstance.notaryImportIntoEDMV1(pkiNotaryID, notaryImportIntoEDMV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectNotaryApi#notaryImportIntoEDMV1");
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
| **pkiNotaryID** | **Integer**|  | |
| **notaryImportIntoEDMV1Request** | [**NotaryImportIntoEDMV1Request**](NotaryImportIntoEDMV1Request.md)|  | |

### Return type

[**NotaryImportIntoEDMV1Response**](NotaryImportIntoEDMV1Response.md)

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

