# ObjectExternalbrokerApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**externalbrokerBatchDownloadV1**](ObjectExternalbrokerApi.md#externalbrokerBatchDownloadV1) | **POST** /1/object/externalbroker/{pkiExternalbrokerID}/batchDownload | Download multiples attachments from an Externalbroker |
| [**externalbrokerGetAttachmentsV1**](ObjectExternalbrokerApi.md#externalbrokerGetAttachmentsV1) | **GET** /1/object/externalbroker/{pkiExternalbrokerID}/getAttachments | Retrieve Externalbroker&#39;s attachments |
| [**externalbrokerImportIntoEDMV1**](ObjectExternalbrokerApi.md#externalbrokerImportIntoEDMV1) | **POST** /1/object/externalbroker/{pkiExternalbrokerID}/importIntoEDM | Import attachments into the Externalbroker |


<a id="externalbrokerBatchDownloadV1"></a>
# **externalbrokerBatchDownloadV1**
> File externalbrokerBatchDownloadV1(pkiExternalbrokerID, externalbrokerBatchDownloadV1Request)

Download multiples attachments from an Externalbroker

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectExternalbrokerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectExternalbrokerApi apiInstance = new ObjectExternalbrokerApi(defaultClient);
    Integer pkiExternalbrokerID = 56; // Integer | 
    ExternalbrokerBatchDownloadV1Request externalbrokerBatchDownloadV1Request = new ExternalbrokerBatchDownloadV1Request(); // ExternalbrokerBatchDownloadV1Request | 
    try {
      File result = apiInstance.externalbrokerBatchDownloadV1(pkiExternalbrokerID, externalbrokerBatchDownloadV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectExternalbrokerApi#externalbrokerBatchDownloadV1");
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
| **pkiExternalbrokerID** | **Integer**|  | |
| **externalbrokerBatchDownloadV1Request** | [**ExternalbrokerBatchDownloadV1Request**](ExternalbrokerBatchDownloadV1Request.md)|  | |

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

<a id="externalbrokerGetAttachmentsV1"></a>
# **externalbrokerGetAttachmentsV1**
> ExternalbrokerGetAttachmentsV1Response externalbrokerGetAttachmentsV1(pkiExternalbrokerID)

Retrieve Externalbroker&#39;s attachments

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectExternalbrokerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectExternalbrokerApi apiInstance = new ObjectExternalbrokerApi(defaultClient);
    Integer pkiExternalbrokerID = 56; // Integer | 
    try {
      ExternalbrokerGetAttachmentsV1Response result = apiInstance.externalbrokerGetAttachmentsV1(pkiExternalbrokerID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectExternalbrokerApi#externalbrokerGetAttachmentsV1");
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
| **pkiExternalbrokerID** | **Integer**|  | |

### Return type

[**ExternalbrokerGetAttachmentsV1Response**](ExternalbrokerGetAttachmentsV1Response.md)

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

<a id="externalbrokerImportIntoEDMV1"></a>
# **externalbrokerImportIntoEDMV1**
> ExternalbrokerImportIntoEDMV1Response externalbrokerImportIntoEDMV1(pkiExternalbrokerID, externalbrokerImportIntoEDMV1Request)

Import attachments into the Externalbroker



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectExternalbrokerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectExternalbrokerApi apiInstance = new ObjectExternalbrokerApi(defaultClient);
    Integer pkiExternalbrokerID = 56; // Integer | 
    ExternalbrokerImportIntoEDMV1Request externalbrokerImportIntoEDMV1Request = new ExternalbrokerImportIntoEDMV1Request(); // ExternalbrokerImportIntoEDMV1Request | 
    try {
      ExternalbrokerImportIntoEDMV1Response result = apiInstance.externalbrokerImportIntoEDMV1(pkiExternalbrokerID, externalbrokerImportIntoEDMV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectExternalbrokerApi#externalbrokerImportIntoEDMV1");
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
| **pkiExternalbrokerID** | **Integer**|  | |
| **externalbrokerImportIntoEDMV1Request** | [**ExternalbrokerImportIntoEDMV1Request**](ExternalbrokerImportIntoEDMV1Request.md)|  | |

### Return type

[**ExternalbrokerImportIntoEDMV1Response**](ExternalbrokerImportIntoEDMV1Response.md)

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

