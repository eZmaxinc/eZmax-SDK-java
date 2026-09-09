# ObjectSalaryApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**salaryBatchDownloadV1**](ObjectSalaryApi.md#salaryBatchDownloadV1) | **POST** /1/object/salary/{pkiSalaryID}/batchDownload | Download multiples attachments from a Reconciliation |
| [**salaryGetAttachmentsV1**](ObjectSalaryApi.md#salaryGetAttachmentsV1) | **GET** /1/object/salary/{pkiSalaryID}/getAttachments | Retrieve Salary&#39;s attachments |
| [**salaryImportIntoEDMV1**](ObjectSalaryApi.md#salaryImportIntoEDMV1) | **POST** /1/object/salary/{pkiSalaryID}/importIntoEDM | Import attachments into the Salary |


<a id="salaryBatchDownloadV1"></a>
# **salaryBatchDownloadV1**
> File salaryBatchDownloadV1(pkiSalaryID, salaryBatchDownloadV1Request)

Download multiples attachments from a Reconciliation

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectSalaryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectSalaryApi apiInstance = new ObjectSalaryApi(defaultClient);
    Integer pkiSalaryID = 56; // Integer | 
    SalaryBatchDownloadV1Request salaryBatchDownloadV1Request = new SalaryBatchDownloadV1Request(); // SalaryBatchDownloadV1Request | 
    try {
      File result = apiInstance.salaryBatchDownloadV1(pkiSalaryID, salaryBatchDownloadV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectSalaryApi#salaryBatchDownloadV1");
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
| **pkiSalaryID** | **Integer**|  | |
| **salaryBatchDownloadV1Request** | [**SalaryBatchDownloadV1Request**](SalaryBatchDownloadV1Request.md)|  | |

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

<a id="salaryGetAttachmentsV1"></a>
# **salaryGetAttachmentsV1**
> SalaryGetAttachmentsV1Response salaryGetAttachmentsV1(pkiSalaryID)

Retrieve Salary&#39;s attachments

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectSalaryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectSalaryApi apiInstance = new ObjectSalaryApi(defaultClient);
    Integer pkiSalaryID = 56; // Integer | 
    try {
      SalaryGetAttachmentsV1Response result = apiInstance.salaryGetAttachmentsV1(pkiSalaryID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectSalaryApi#salaryGetAttachmentsV1");
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
| **pkiSalaryID** | **Integer**|  | |

### Return type

[**SalaryGetAttachmentsV1Response**](SalaryGetAttachmentsV1Response.md)

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

<a id="salaryImportIntoEDMV1"></a>
# **salaryImportIntoEDMV1**
> SalaryImportIntoEDMV1Response salaryImportIntoEDMV1(pkiSalaryID, salaryImportIntoEDMV1Request)

Import attachments into the Salary

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectSalaryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectSalaryApi apiInstance = new ObjectSalaryApi(defaultClient);
    Integer pkiSalaryID = 56; // Integer | 
    SalaryImportIntoEDMV1Request salaryImportIntoEDMV1Request = new SalaryImportIntoEDMV1Request(); // SalaryImportIntoEDMV1Request | 
    try {
      SalaryImportIntoEDMV1Response result = apiInstance.salaryImportIntoEDMV1(pkiSalaryID, salaryImportIntoEDMV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectSalaryApi#salaryImportIntoEDMV1");
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
| **pkiSalaryID** | **Integer**|  | |
| **salaryImportIntoEDMV1Request** | [**SalaryImportIntoEDMV1Request**](SalaryImportIntoEDMV1Request.md)|  | |

### Return type

[**SalaryImportIntoEDMV1Response**](SalaryImportIntoEDMV1Response.md)

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

