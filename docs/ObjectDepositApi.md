# ObjectDepositApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**depositBatchDownloadV1**](ObjectDepositApi.md#depositBatchDownloadV1) | **POST** /1/object/deposit/{pkiDepositID}/batchDownload | Download multiples attachments from a Deposit |
| [**depositGetAttachmentsV1**](ObjectDepositApi.md#depositGetAttachmentsV1) | **GET** /1/object/deposit/{pkiDepositID}/getAttachments | Retrieve Deposit&#39;s attachments |
| [**depositImportIntoEDMV1**](ObjectDepositApi.md#depositImportIntoEDMV1) | **POST** /1/object/deposit/{pkiDepositID}/importIntoEDM | Import attachments into the Deposit |


<a id="depositBatchDownloadV1"></a>
# **depositBatchDownloadV1**
> File depositBatchDownloadV1(pkiDepositID, depositBatchDownloadV1Request)

Download multiples attachments from a Deposit

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectDepositApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectDepositApi apiInstance = new ObjectDepositApi(defaultClient);
    Integer pkiDepositID = 56; // Integer | 
    DepositBatchDownloadV1Request depositBatchDownloadV1Request = new DepositBatchDownloadV1Request(); // DepositBatchDownloadV1Request | 
    try {
      File result = apiInstance.depositBatchDownloadV1(pkiDepositID, depositBatchDownloadV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectDepositApi#depositBatchDownloadV1");
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
| **pkiDepositID** | **Integer**|  | |
| **depositBatchDownloadV1Request** | [**DepositBatchDownloadV1Request**](DepositBatchDownloadV1Request.md)|  | |

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

<a id="depositGetAttachmentsV1"></a>
# **depositGetAttachmentsV1**
> DepositGetAttachmentsV1Response depositGetAttachmentsV1(pkiDepositID)

Retrieve Deposit&#39;s attachments

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectDepositApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectDepositApi apiInstance = new ObjectDepositApi(defaultClient);
    Integer pkiDepositID = 56; // Integer | 
    try {
      DepositGetAttachmentsV1Response result = apiInstance.depositGetAttachmentsV1(pkiDepositID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectDepositApi#depositGetAttachmentsV1");
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
| **pkiDepositID** | **Integer**|  | |

### Return type

[**DepositGetAttachmentsV1Response**](DepositGetAttachmentsV1Response.md)

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

<a id="depositImportIntoEDMV1"></a>
# **depositImportIntoEDMV1**
> DepositImportIntoEDMV1Response depositImportIntoEDMV1(pkiDepositID, depositImportIntoEDMV1Request)

Import attachments into the Deposit

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectDepositApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectDepositApi apiInstance = new ObjectDepositApi(defaultClient);
    Integer pkiDepositID = 56; // Integer | 
    DepositImportIntoEDMV1Request depositImportIntoEDMV1Request = new DepositImportIntoEDMV1Request(); // DepositImportIntoEDMV1Request | 
    try {
      DepositImportIntoEDMV1Response result = apiInstance.depositImportIntoEDMV1(pkiDepositID, depositImportIntoEDMV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectDepositApi#depositImportIntoEDMV1");
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
| **pkiDepositID** | **Integer**|  | |
| **depositImportIntoEDMV1Request** | [**DepositImportIntoEDMV1Request**](DepositImportIntoEDMV1Request.md)|  | |

### Return type

[**DepositImportIntoEDMV1Response**](DepositImportIntoEDMV1Response.md)

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

