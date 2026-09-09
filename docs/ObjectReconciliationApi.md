# ObjectReconciliationApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**reconciliationBatchDownloadV1**](ObjectReconciliationApi.md#reconciliationBatchDownloadV1) | **POST** /1/object/reconciliation/{pkiReconciliationID}/batchDownload | Download multiples attachments from a Reconciliation |
| [**reconciliationGetAttachmentsV1**](ObjectReconciliationApi.md#reconciliationGetAttachmentsV1) | **GET** /1/object/reconciliation/{pkiReconciliationID}/getAttachments | Retrieve Reconciliation&#39;s attachments |
| [**reconciliationImportIntoEDMV1**](ObjectReconciliationApi.md#reconciliationImportIntoEDMV1) | **POST** /1/object/reconciliation/{pkiReconciliationID}/importIntoEDM | Import attachments into the Reconciliation |


<a id="reconciliationBatchDownloadV1"></a>
# **reconciliationBatchDownloadV1**
> File reconciliationBatchDownloadV1(pkiReconciliationID, reconciliationBatchDownloadV1Request)

Download multiples attachments from a Reconciliation

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectReconciliationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectReconciliationApi apiInstance = new ObjectReconciliationApi(defaultClient);
    Integer pkiReconciliationID = 56; // Integer | 
    ReconciliationBatchDownloadV1Request reconciliationBatchDownloadV1Request = new ReconciliationBatchDownloadV1Request(); // ReconciliationBatchDownloadV1Request | 
    try {
      File result = apiInstance.reconciliationBatchDownloadV1(pkiReconciliationID, reconciliationBatchDownloadV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectReconciliationApi#reconciliationBatchDownloadV1");
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
| **pkiReconciliationID** | **Integer**|  | |
| **reconciliationBatchDownloadV1Request** | [**ReconciliationBatchDownloadV1Request**](ReconciliationBatchDownloadV1Request.md)|  | |

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

<a id="reconciliationGetAttachmentsV1"></a>
# **reconciliationGetAttachmentsV1**
> ReconciliationGetAttachmentsV1Response reconciliationGetAttachmentsV1(pkiReconciliationID)

Retrieve Reconciliation&#39;s attachments

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectReconciliationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectReconciliationApi apiInstance = new ObjectReconciliationApi(defaultClient);
    Integer pkiReconciliationID = 56; // Integer | 
    try {
      ReconciliationGetAttachmentsV1Response result = apiInstance.reconciliationGetAttachmentsV1(pkiReconciliationID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectReconciliationApi#reconciliationGetAttachmentsV1");
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
| **pkiReconciliationID** | **Integer**|  | |

### Return type

[**ReconciliationGetAttachmentsV1Response**](ReconciliationGetAttachmentsV1Response.md)

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

<a id="reconciliationImportIntoEDMV1"></a>
# **reconciliationImportIntoEDMV1**
> ReconciliationImportIntoEDMV1Response reconciliationImportIntoEDMV1(pkiReconciliationID, reconciliationImportIntoEDMV1Request)

Import attachments into the Reconciliation

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectReconciliationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectReconciliationApi apiInstance = new ObjectReconciliationApi(defaultClient);
    Integer pkiReconciliationID = 56; // Integer | 
    ReconciliationImportIntoEDMV1Request reconciliationImportIntoEDMV1Request = new ReconciliationImportIntoEDMV1Request(); // ReconciliationImportIntoEDMV1Request | 
    try {
      ReconciliationImportIntoEDMV1Response result = apiInstance.reconciliationImportIntoEDMV1(pkiReconciliationID, reconciliationImportIntoEDMV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectReconciliationApi#reconciliationImportIntoEDMV1");
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
| **pkiReconciliationID** | **Integer**|  | |
| **reconciliationImportIntoEDMV1Request** | [**ReconciliationImportIntoEDMV1Request**](ReconciliationImportIntoEDMV1Request.md)|  | |

### Return type

[**ReconciliationImportIntoEDMV1Response**](ReconciliationImportIntoEDMV1Response.md)

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

