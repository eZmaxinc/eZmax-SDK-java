# ObjectAdjustmentApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**adjustmentBatchDownloadV1**](ObjectAdjustmentApi.md#adjustmentBatchDownloadV1) | **POST** /1/object/adjustment/{pkiAdjustmentID}/batchDownload | Download multiples attachments from an Adjustment |
| [**adjustmentGetAttachmentsV1**](ObjectAdjustmentApi.md#adjustmentGetAttachmentsV1) | **GET** /1/object/adjustment/{pkiAdjustmentID}/getAttachments | Retrieve Adjustment&#39;s attachments |
| [**adjustmentGetCommunicationCountV1**](ObjectAdjustmentApi.md#adjustmentGetCommunicationCountV1) | **GET** /1/object/adjustment/{pkiAdjustmentID}/getCommunicationCount | Retrieve Communication count |
| [**adjustmentGetCommunicationListV1**](ObjectAdjustmentApi.md#adjustmentGetCommunicationListV1) | **GET** /1/object/adjustment/{pkiAdjustmentID}/getCommunicationList | Retrieve Communication list |
| [**adjustmentGetCommunicationrecipientsV1**](ObjectAdjustmentApi.md#adjustmentGetCommunicationrecipientsV1) | **GET** /1/object/adjustment/{pkiAdjustmentID}/getCommunicationrecipients | Retrieve Communication recipients |
| [**adjustmentGetCommunicationsendersV1**](ObjectAdjustmentApi.md#adjustmentGetCommunicationsendersV1) | **GET** /1/object/adjustment/{pkiAdjustmentID}/getCommunicationsenders | Retrieve Communication senders |
| [**adjustmentImportIntoEDMV1**](ObjectAdjustmentApi.md#adjustmentImportIntoEDMV1) | **POST** /1/object/adjustment/{pkiAdjustmentID}/importIntoEDM | Import attachments into the Adjustment |


<a id="adjustmentBatchDownloadV1"></a>
# **adjustmentBatchDownloadV1**
> File adjustmentBatchDownloadV1(pkiAdjustmentID, adjustmentBatchDownloadV1Request)

Download multiples attachments from an Adjustment

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectAdjustmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectAdjustmentApi apiInstance = new ObjectAdjustmentApi(defaultClient);
    Integer pkiAdjustmentID = 56; // Integer | 
    AdjustmentBatchDownloadV1Request adjustmentBatchDownloadV1Request = new AdjustmentBatchDownloadV1Request(); // AdjustmentBatchDownloadV1Request | 
    try {
      File result = apiInstance.adjustmentBatchDownloadV1(pkiAdjustmentID, adjustmentBatchDownloadV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectAdjustmentApi#adjustmentBatchDownloadV1");
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
| **pkiAdjustmentID** | **Integer**|  | |
| **adjustmentBatchDownloadV1Request** | [**AdjustmentBatchDownloadV1Request**](AdjustmentBatchDownloadV1Request.md)|  | |

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

<a id="adjustmentGetAttachmentsV1"></a>
# **adjustmentGetAttachmentsV1**
> AdjustmentGetAttachmentsV1Response adjustmentGetAttachmentsV1(pkiAdjustmentID)

Retrieve Adjustment&#39;s attachments

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectAdjustmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectAdjustmentApi apiInstance = new ObjectAdjustmentApi(defaultClient);
    Integer pkiAdjustmentID = 56; // Integer | 
    try {
      AdjustmentGetAttachmentsV1Response result = apiInstance.adjustmentGetAttachmentsV1(pkiAdjustmentID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectAdjustmentApi#adjustmentGetAttachmentsV1");
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
| **pkiAdjustmentID** | **Integer**|  | |

### Return type

[**AdjustmentGetAttachmentsV1Response**](AdjustmentGetAttachmentsV1Response.md)

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
| **422** | The request was syntactically valid but failed because of an interdependance condition. Look for detail about the error in the body. |  -  |

<a id="adjustmentGetCommunicationCountV1"></a>
# **adjustmentGetCommunicationCountV1**
> AdjustmentGetCommunicationCountV1Response adjustmentGetCommunicationCountV1(pkiAdjustmentID)

Retrieve Communication count

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectAdjustmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectAdjustmentApi apiInstance = new ObjectAdjustmentApi(defaultClient);
    Integer pkiAdjustmentID = 56; // Integer | 
    try {
      AdjustmentGetCommunicationCountV1Response result = apiInstance.adjustmentGetCommunicationCountV1(pkiAdjustmentID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectAdjustmentApi#adjustmentGetCommunicationCountV1");
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
| **pkiAdjustmentID** | **Integer**|  | |

### Return type

[**AdjustmentGetCommunicationCountV1Response**](AdjustmentGetCommunicationCountV1Response.md)

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
| **422** | The request was syntactically valid but failed because of an interdependance condition. Look for detail about the error in the body. |  -  |

<a id="adjustmentGetCommunicationListV1"></a>
# **adjustmentGetCommunicationListV1**
> AdjustmentGetCommunicationListV1Response adjustmentGetCommunicationListV1(pkiAdjustmentID)

Retrieve Communication list

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectAdjustmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectAdjustmentApi apiInstance = new ObjectAdjustmentApi(defaultClient);
    Integer pkiAdjustmentID = 56; // Integer | 
    try {
      AdjustmentGetCommunicationListV1Response result = apiInstance.adjustmentGetCommunicationListV1(pkiAdjustmentID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectAdjustmentApi#adjustmentGetCommunicationListV1");
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
| **pkiAdjustmentID** | **Integer**|  | |

### Return type

[**AdjustmentGetCommunicationListV1Response**](AdjustmentGetCommunicationListV1Response.md)

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
| **422** | The request was syntactically valid but failed because of an interdependance condition. Look for detail about the error in the body. |  -  |

<a id="adjustmentGetCommunicationrecipientsV1"></a>
# **adjustmentGetCommunicationrecipientsV1**
> AdjustmentGetCommunicationrecipientsV1Response adjustmentGetCommunicationrecipientsV1(pkiAdjustmentID)

Retrieve Communication recipients

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectAdjustmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectAdjustmentApi apiInstance = new ObjectAdjustmentApi(defaultClient);
    Integer pkiAdjustmentID = 56; // Integer | 
    try {
      AdjustmentGetCommunicationrecipientsV1Response result = apiInstance.adjustmentGetCommunicationrecipientsV1(pkiAdjustmentID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectAdjustmentApi#adjustmentGetCommunicationrecipientsV1");
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
| **pkiAdjustmentID** | **Integer**|  | |

### Return type

[**AdjustmentGetCommunicationrecipientsV1Response**](AdjustmentGetCommunicationrecipientsV1Response.md)

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
| **422** | The request was syntactically valid but failed because of an interdependance condition. Look for detail about the error in the body. |  -  |

<a id="adjustmentGetCommunicationsendersV1"></a>
# **adjustmentGetCommunicationsendersV1**
> AdjustmentGetCommunicationsendersV1Response adjustmentGetCommunicationsendersV1(pkiAdjustmentID)

Retrieve Communication senders

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectAdjustmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectAdjustmentApi apiInstance = new ObjectAdjustmentApi(defaultClient);
    Integer pkiAdjustmentID = 56; // Integer | 
    try {
      AdjustmentGetCommunicationsendersV1Response result = apiInstance.adjustmentGetCommunicationsendersV1(pkiAdjustmentID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectAdjustmentApi#adjustmentGetCommunicationsendersV1");
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
| **pkiAdjustmentID** | **Integer**|  | |

### Return type

[**AdjustmentGetCommunicationsendersV1Response**](AdjustmentGetCommunicationsendersV1Response.md)

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
| **422** | The request was syntactically valid but failed because of an interdependance condition. Look for detail about the error in the body. |  -  |

<a id="adjustmentImportIntoEDMV1"></a>
# **adjustmentImportIntoEDMV1**
> AdjustmentImportIntoEDMV1Response adjustmentImportIntoEDMV1(pkiAdjustmentID, adjustmentImportIntoEDMV1Request)

Import attachments into the Adjustment

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectAdjustmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectAdjustmentApi apiInstance = new ObjectAdjustmentApi(defaultClient);
    Integer pkiAdjustmentID = 56; // Integer | 
    AdjustmentImportIntoEDMV1Request adjustmentImportIntoEDMV1Request = new AdjustmentImportIntoEDMV1Request(); // AdjustmentImportIntoEDMV1Request | 
    try {
      AdjustmentImportIntoEDMV1Response result = apiInstance.adjustmentImportIntoEDMV1(pkiAdjustmentID, adjustmentImportIntoEDMV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectAdjustmentApi#adjustmentImportIntoEDMV1");
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
| **pkiAdjustmentID** | **Integer**|  | |
| **adjustmentImportIntoEDMV1Request** | [**AdjustmentImportIntoEDMV1Request**](AdjustmentImportIntoEDMV1Request.md)|  | |

### Return type

[**AdjustmentImportIntoEDMV1Response**](AdjustmentImportIntoEDMV1Response.md)

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

