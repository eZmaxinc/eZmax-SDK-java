# ObjectCommissionadvanceApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**commissionadvanceBatchDownloadV1**](ObjectCommissionadvanceApi.md#commissionadvanceBatchDownloadV1) | **POST** /1/object/commissionadvance/{pkiCommissionadvanceID}/batchDownload | Download multiples attachments from a Commission advance |
| [**commissionadvanceGetAttachmentsV1**](ObjectCommissionadvanceApi.md#commissionadvanceGetAttachmentsV1) | **GET** /1/object/commissionadvance/{pkiCommissionadvanceID}/getAttachments | Retrieve Commissionadvance&#39;s attachments |
| [**commissionadvanceGetCommunicationCountV1**](ObjectCommissionadvanceApi.md#commissionadvanceGetCommunicationCountV1) | **GET** /1/object/commissionadvance/{pkiCommissionadvanceID}/getCommunicationCount | Retrieve Communication count |
| [**commissionadvanceGetCommunicationListV1**](ObjectCommissionadvanceApi.md#commissionadvanceGetCommunicationListV1) | **GET** /1/object/commissionadvance/{pkiCommissionadvanceID}/getCommunicationList | Retrieve Communication list |
| [**commissionadvanceGetCommunicationrecipientsV1**](ObjectCommissionadvanceApi.md#commissionadvanceGetCommunicationrecipientsV1) | **GET** /1/object/commissionadvance/{pkiCommissionadvanceID}/getCommunicationrecipients | Retrieve Communication recipients |
| [**commissionadvanceGetCommunicationsendersV1**](ObjectCommissionadvanceApi.md#commissionadvanceGetCommunicationsendersV1) | **GET** /1/object/commissionadvance/{pkiCommissionadvanceID}/getCommunicationsenders | Retrieve Communication senders |
| [**commissionadvanceImportIntoEDMV1**](ObjectCommissionadvanceApi.md#commissionadvanceImportIntoEDMV1) | **POST** /1/object/commissionadvance/{pkiCommissionadvanceID}/importIntoEDM | Import attachments into the Commissionadvance |


<a id="commissionadvanceBatchDownloadV1"></a>
# **commissionadvanceBatchDownloadV1**
> File commissionadvanceBatchDownloadV1(pkiCommissionadvanceID, commissionadvanceBatchDownloadV1Request)

Download multiples attachments from a Commission advance

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectCommissionadvanceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectCommissionadvanceApi apiInstance = new ObjectCommissionadvanceApi(defaultClient);
    Integer pkiCommissionadvanceID = 56; // Integer | 
    CommissionadvanceBatchDownloadV1Request commissionadvanceBatchDownloadV1Request = new CommissionadvanceBatchDownloadV1Request(); // CommissionadvanceBatchDownloadV1Request | 
    try {
      File result = apiInstance.commissionadvanceBatchDownloadV1(pkiCommissionadvanceID, commissionadvanceBatchDownloadV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectCommissionadvanceApi#commissionadvanceBatchDownloadV1");
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
| **pkiCommissionadvanceID** | **Integer**|  | |
| **commissionadvanceBatchDownloadV1Request** | [**CommissionadvanceBatchDownloadV1Request**](CommissionadvanceBatchDownloadV1Request.md)|  | |

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

<a id="commissionadvanceGetAttachmentsV1"></a>
# **commissionadvanceGetAttachmentsV1**
> CommissionadvanceGetAttachmentsV1Response commissionadvanceGetAttachmentsV1(pkiCommissionadvanceID)

Retrieve Commissionadvance&#39;s attachments

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectCommissionadvanceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectCommissionadvanceApi apiInstance = new ObjectCommissionadvanceApi(defaultClient);
    Integer pkiCommissionadvanceID = 56; // Integer | 
    try {
      CommissionadvanceGetAttachmentsV1Response result = apiInstance.commissionadvanceGetAttachmentsV1(pkiCommissionadvanceID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectCommissionadvanceApi#commissionadvanceGetAttachmentsV1");
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
| **pkiCommissionadvanceID** | **Integer**|  | |

### Return type

[**CommissionadvanceGetAttachmentsV1Response**](CommissionadvanceGetAttachmentsV1Response.md)

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

<a id="commissionadvanceGetCommunicationCountV1"></a>
# **commissionadvanceGetCommunicationCountV1**
> CommissionadvanceGetCommunicationCountV1Response commissionadvanceGetCommunicationCountV1(pkiCommissionadvanceID)

Retrieve Communication count

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectCommissionadvanceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectCommissionadvanceApi apiInstance = new ObjectCommissionadvanceApi(defaultClient);
    Integer pkiCommissionadvanceID = 56; // Integer | 
    try {
      CommissionadvanceGetCommunicationCountV1Response result = apiInstance.commissionadvanceGetCommunicationCountV1(pkiCommissionadvanceID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectCommissionadvanceApi#commissionadvanceGetCommunicationCountV1");
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
| **pkiCommissionadvanceID** | **Integer**|  | |

### Return type

[**CommissionadvanceGetCommunicationCountV1Response**](CommissionadvanceGetCommunicationCountV1Response.md)

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

<a id="commissionadvanceGetCommunicationListV1"></a>
# **commissionadvanceGetCommunicationListV1**
> CommissionadvanceGetCommunicationListV1Response commissionadvanceGetCommunicationListV1(pkiCommissionadvanceID)

Retrieve Communication list

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectCommissionadvanceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectCommissionadvanceApi apiInstance = new ObjectCommissionadvanceApi(defaultClient);
    Integer pkiCommissionadvanceID = 56; // Integer | 
    try {
      CommissionadvanceGetCommunicationListV1Response result = apiInstance.commissionadvanceGetCommunicationListV1(pkiCommissionadvanceID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectCommissionadvanceApi#commissionadvanceGetCommunicationListV1");
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
| **pkiCommissionadvanceID** | **Integer**|  | |

### Return type

[**CommissionadvanceGetCommunicationListV1Response**](CommissionadvanceGetCommunicationListV1Response.md)

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

<a id="commissionadvanceGetCommunicationrecipientsV1"></a>
# **commissionadvanceGetCommunicationrecipientsV1**
> CommissionadvanceGetCommunicationrecipientsV1Response commissionadvanceGetCommunicationrecipientsV1(pkiCommissionadvanceID)

Retrieve Communication recipients

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectCommissionadvanceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectCommissionadvanceApi apiInstance = new ObjectCommissionadvanceApi(defaultClient);
    Integer pkiCommissionadvanceID = 56; // Integer | 
    try {
      CommissionadvanceGetCommunicationrecipientsV1Response result = apiInstance.commissionadvanceGetCommunicationrecipientsV1(pkiCommissionadvanceID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectCommissionadvanceApi#commissionadvanceGetCommunicationrecipientsV1");
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
| **pkiCommissionadvanceID** | **Integer**|  | |

### Return type

[**CommissionadvanceGetCommunicationrecipientsV1Response**](CommissionadvanceGetCommunicationrecipientsV1Response.md)

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

<a id="commissionadvanceGetCommunicationsendersV1"></a>
# **commissionadvanceGetCommunicationsendersV1**
> CommissionadvanceGetCommunicationsendersV1Response commissionadvanceGetCommunicationsendersV1(pkiCommissionadvanceID)

Retrieve Communication senders

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectCommissionadvanceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectCommissionadvanceApi apiInstance = new ObjectCommissionadvanceApi(defaultClient);
    Integer pkiCommissionadvanceID = 56; // Integer | 
    try {
      CommissionadvanceGetCommunicationsendersV1Response result = apiInstance.commissionadvanceGetCommunicationsendersV1(pkiCommissionadvanceID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectCommissionadvanceApi#commissionadvanceGetCommunicationsendersV1");
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
| **pkiCommissionadvanceID** | **Integer**|  | |

### Return type

[**CommissionadvanceGetCommunicationsendersV1Response**](CommissionadvanceGetCommunicationsendersV1Response.md)

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

<a id="commissionadvanceImportIntoEDMV1"></a>
# **commissionadvanceImportIntoEDMV1**
> CommissionadvanceImportIntoEDMV1Response commissionadvanceImportIntoEDMV1(pkiCommissionadvanceID, commissionadvanceImportIntoEDMV1Request)

Import attachments into the Commissionadvance

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectCommissionadvanceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectCommissionadvanceApi apiInstance = new ObjectCommissionadvanceApi(defaultClient);
    Integer pkiCommissionadvanceID = 56; // Integer | 
    CommissionadvanceImportIntoEDMV1Request commissionadvanceImportIntoEDMV1Request = new CommissionadvanceImportIntoEDMV1Request(); // CommissionadvanceImportIntoEDMV1Request | 
    try {
      CommissionadvanceImportIntoEDMV1Response result = apiInstance.commissionadvanceImportIntoEDMV1(pkiCommissionadvanceID, commissionadvanceImportIntoEDMV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectCommissionadvanceApi#commissionadvanceImportIntoEDMV1");
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
| **pkiCommissionadvanceID** | **Integer**|  | |
| **commissionadvanceImportIntoEDMV1Request** | [**CommissionadvanceImportIntoEDMV1Request**](CommissionadvanceImportIntoEDMV1Request.md)|  | |

### Return type

[**CommissionadvanceImportIntoEDMV1Response**](CommissionadvanceImportIntoEDMV1Response.md)

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

