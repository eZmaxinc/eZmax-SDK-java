# ObjectPaymentpreparationApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**paymentpreparationBatchDownloadV1**](ObjectPaymentpreparationApi.md#paymentpreparationBatchDownloadV1) | **POST** /1/object/paymentpreparation/{pkiPaymentpreparationID}/batchDownload | Download multiples attachments from an Paymentpreparation |
| [**paymentpreparationGetAttachmentsV1**](ObjectPaymentpreparationApi.md#paymentpreparationGetAttachmentsV1) | **GET** /1/object/paymentpreparation/{pkiPaymentpreparationID}/getAttachments | Retrieve Paymentpreparation&#39;s attachments |
| [**paymentpreparationImportIntoEDMV1**](ObjectPaymentpreparationApi.md#paymentpreparationImportIntoEDMV1) | **POST** /1/object/paymentpreparation/{pkiPaymentpreparationID}/importIntoEDM | Import attachments into the Paymentpreparation |


<a id="paymentpreparationBatchDownloadV1"></a>
# **paymentpreparationBatchDownloadV1**
> File paymentpreparationBatchDownloadV1(pkiPaymentpreparationID, paymentpreparationBatchDownloadV1Request)

Download multiples attachments from an Paymentpreparation

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectPaymentpreparationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectPaymentpreparationApi apiInstance = new ObjectPaymentpreparationApi(defaultClient);
    Integer pkiPaymentpreparationID = 56; // Integer | 
    PaymentpreparationBatchDownloadV1Request paymentpreparationBatchDownloadV1Request = new PaymentpreparationBatchDownloadV1Request(); // PaymentpreparationBatchDownloadV1Request | 
    try {
      File result = apiInstance.paymentpreparationBatchDownloadV1(pkiPaymentpreparationID, paymentpreparationBatchDownloadV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectPaymentpreparationApi#paymentpreparationBatchDownloadV1");
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
| **pkiPaymentpreparationID** | **Integer**|  | |
| **paymentpreparationBatchDownloadV1Request** | [**PaymentpreparationBatchDownloadV1Request**](PaymentpreparationBatchDownloadV1Request.md)|  | |

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

<a id="paymentpreparationGetAttachmentsV1"></a>
# **paymentpreparationGetAttachmentsV1**
> PaymentpreparationGetAttachmentsV1Response paymentpreparationGetAttachmentsV1(pkiPaymentpreparationID)

Retrieve Paymentpreparation&#39;s attachments

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectPaymentpreparationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectPaymentpreparationApi apiInstance = new ObjectPaymentpreparationApi(defaultClient);
    Integer pkiPaymentpreparationID = 56; // Integer | 
    try {
      PaymentpreparationGetAttachmentsV1Response result = apiInstance.paymentpreparationGetAttachmentsV1(pkiPaymentpreparationID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectPaymentpreparationApi#paymentpreparationGetAttachmentsV1");
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
| **pkiPaymentpreparationID** | **Integer**|  | |

### Return type

[**PaymentpreparationGetAttachmentsV1Response**](PaymentpreparationGetAttachmentsV1Response.md)

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

<a id="paymentpreparationImportIntoEDMV1"></a>
# **paymentpreparationImportIntoEDMV1**
> PaymentpreparationImportIntoEDMV1Response paymentpreparationImportIntoEDMV1(pkiPaymentpreparationID, paymentpreparationImportIntoEDMV1Request)

Import attachments into the Paymentpreparation

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectPaymentpreparationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectPaymentpreparationApi apiInstance = new ObjectPaymentpreparationApi(defaultClient);
    Integer pkiPaymentpreparationID = 56; // Integer | 
    PaymentpreparationImportIntoEDMV1Request paymentpreparationImportIntoEDMV1Request = new PaymentpreparationImportIntoEDMV1Request(); // PaymentpreparationImportIntoEDMV1Request | 
    try {
      PaymentpreparationImportIntoEDMV1Response result = apiInstance.paymentpreparationImportIntoEDMV1(pkiPaymentpreparationID, paymentpreparationImportIntoEDMV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectPaymentpreparationApi#paymentpreparationImportIntoEDMV1");
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
| **pkiPaymentpreparationID** | **Integer**|  | |
| **paymentpreparationImportIntoEDMV1Request** | [**PaymentpreparationImportIntoEDMV1Request**](PaymentpreparationImportIntoEDMV1Request.md)|  | |

### Return type

[**PaymentpreparationImportIntoEDMV1Response**](PaymentpreparationImportIntoEDMV1Response.md)

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

