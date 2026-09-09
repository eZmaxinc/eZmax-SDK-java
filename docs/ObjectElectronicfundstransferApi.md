# ObjectElectronicfundstransferApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**electronicfundstransferBatchDownloadV1**](ObjectElectronicfundstransferApi.md#electronicfundstransferBatchDownloadV1) | **POST** /1/object/electronicfundstransfer/{pkiElectronicfundstransferID}/batchDownload | Download multiples attachments from an Electronicfundstransfer |
| [**electronicfundstransferGetAttachmentsV1**](ObjectElectronicfundstransferApi.md#electronicfundstransferGetAttachmentsV1) | **GET** /1/object/electronicfundstransfer/{pkiElectronicfundstransferID}/getAttachments | Retrieve Electronicfundstransfer&#39;s attachments |
| [**electronicfundstransferGetCommunicationCountV1**](ObjectElectronicfundstransferApi.md#electronicfundstransferGetCommunicationCountV1) | **GET** /1/object/electronicfundstransfer/{pkiElectronicfundstransferID}/getCommunicationCount | Retrieve Communication count |
| [**electronicfundstransferGetCommunicationListV1**](ObjectElectronicfundstransferApi.md#electronicfundstransferGetCommunicationListV1) | **GET** /1/object/electronicfundstransfer/{pkiElectronicfundstransferID}/getCommunicationList | Retrieve Communication list |
| [**electronicfundstransferGetCommunicationrecipientsV1**](ObjectElectronicfundstransferApi.md#electronicfundstransferGetCommunicationrecipientsV1) | **GET** /1/object/electronicfundstransfer/{pkiElectronicfundstransferID}/getCommunicationrecipients | Retrieve Electronicfundstransfer&#39;s Communicationrecipient |
| [**electronicfundstransferGetCommunicationsendersV1**](ObjectElectronicfundstransferApi.md#electronicfundstransferGetCommunicationsendersV1) | **GET** /1/object/electronicfundstransfer/{pkiElectronicfundstransferID}/getCommunicationsenders | Retrieve Electronicfundstransfer&#39;s Communicationsender |
| [**electronicfundstransferImportIntoEDMV1**](ObjectElectronicfundstransferApi.md#electronicfundstransferImportIntoEDMV1) | **POST** /1/object/electronicfundstransfer/{pkiElectronicfundstransferID}/importIntoEDM | Import attachments into the Electronicfundstransfer |


<a id="electronicfundstransferBatchDownloadV1"></a>
# **electronicfundstransferBatchDownloadV1**
> File electronicfundstransferBatchDownloadV1(pkiElectronicfundstransferID, electronicfundstransferBatchDownloadV1Request)

Download multiples attachments from an Electronicfundstransfer

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectElectronicfundstransferApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectElectronicfundstransferApi apiInstance = new ObjectElectronicfundstransferApi(defaultClient);
    Integer pkiElectronicfundstransferID = 56; // Integer | 
    ElectronicfundstransferBatchDownloadV1Request electronicfundstransferBatchDownloadV1Request = new ElectronicfundstransferBatchDownloadV1Request(); // ElectronicfundstransferBatchDownloadV1Request | 
    try {
      File result = apiInstance.electronicfundstransferBatchDownloadV1(pkiElectronicfundstransferID, electronicfundstransferBatchDownloadV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectElectronicfundstransferApi#electronicfundstransferBatchDownloadV1");
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
| **pkiElectronicfundstransferID** | **Integer**|  | |
| **electronicfundstransferBatchDownloadV1Request** | [**ElectronicfundstransferBatchDownloadV1Request**](ElectronicfundstransferBatchDownloadV1Request.md)|  | |

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

<a id="electronicfundstransferGetAttachmentsV1"></a>
# **electronicfundstransferGetAttachmentsV1**
> ElectronicfundstransferGetAttachmentsV1Response electronicfundstransferGetAttachmentsV1(pkiElectronicfundstransferID)

Retrieve Electronicfundstransfer&#39;s attachments

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectElectronicfundstransferApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectElectronicfundstransferApi apiInstance = new ObjectElectronicfundstransferApi(defaultClient);
    Integer pkiElectronicfundstransferID = 56; // Integer | 
    try {
      ElectronicfundstransferGetAttachmentsV1Response result = apiInstance.electronicfundstransferGetAttachmentsV1(pkiElectronicfundstransferID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectElectronicfundstransferApi#electronicfundstransferGetAttachmentsV1");
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
| **pkiElectronicfundstransferID** | **Integer**|  | |

### Return type

[**ElectronicfundstransferGetAttachmentsV1Response**](ElectronicfundstransferGetAttachmentsV1Response.md)

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

<a id="electronicfundstransferGetCommunicationCountV1"></a>
# **electronicfundstransferGetCommunicationCountV1**
> ElectronicfundstransferGetCommunicationCountV1Response electronicfundstransferGetCommunicationCountV1(pkiElectronicfundstransferID)

Retrieve Communication count



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectElectronicfundstransferApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectElectronicfundstransferApi apiInstance = new ObjectElectronicfundstransferApi(defaultClient);
    Integer pkiElectronicfundstransferID = 56; // Integer | 
    try {
      ElectronicfundstransferGetCommunicationCountV1Response result = apiInstance.electronicfundstransferGetCommunicationCountV1(pkiElectronicfundstransferID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectElectronicfundstransferApi#electronicfundstransferGetCommunicationCountV1");
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
| **pkiElectronicfundstransferID** | **Integer**|  | |

### Return type

[**ElectronicfundstransferGetCommunicationCountV1Response**](ElectronicfundstransferGetCommunicationCountV1Response.md)

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

<a id="electronicfundstransferGetCommunicationListV1"></a>
# **electronicfundstransferGetCommunicationListV1**
> ElectronicfundstransferGetCommunicationListV1Response electronicfundstransferGetCommunicationListV1(pkiElectronicfundstransferID)

Retrieve Communication list



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectElectronicfundstransferApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectElectronicfundstransferApi apiInstance = new ObjectElectronicfundstransferApi(defaultClient);
    Integer pkiElectronicfundstransferID = 56; // Integer | 
    try {
      ElectronicfundstransferGetCommunicationListV1Response result = apiInstance.electronicfundstransferGetCommunicationListV1(pkiElectronicfundstransferID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectElectronicfundstransferApi#electronicfundstransferGetCommunicationListV1");
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
| **pkiElectronicfundstransferID** | **Integer**|  | |

### Return type

[**ElectronicfundstransferGetCommunicationListV1Response**](ElectronicfundstransferGetCommunicationListV1Response.md)

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

<a id="electronicfundstransferGetCommunicationrecipientsV1"></a>
# **electronicfundstransferGetCommunicationrecipientsV1**
> ElectronicfundstransferGetCommunicationrecipientsV1Response electronicfundstransferGetCommunicationrecipientsV1(pkiElectronicfundstransferID)

Retrieve Electronicfundstransfer&#39;s Communicationrecipient



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectElectronicfundstransferApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectElectronicfundstransferApi apiInstance = new ObjectElectronicfundstransferApi(defaultClient);
    Integer pkiElectronicfundstransferID = 56; // Integer | 
    try {
      ElectronicfundstransferGetCommunicationrecipientsV1Response result = apiInstance.electronicfundstransferGetCommunicationrecipientsV1(pkiElectronicfundstransferID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectElectronicfundstransferApi#electronicfundstransferGetCommunicationrecipientsV1");
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
| **pkiElectronicfundstransferID** | **Integer**|  | |

### Return type

[**ElectronicfundstransferGetCommunicationrecipientsV1Response**](ElectronicfundstransferGetCommunicationrecipientsV1Response.md)

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

<a id="electronicfundstransferGetCommunicationsendersV1"></a>
# **electronicfundstransferGetCommunicationsendersV1**
> ElectronicfundstransferGetCommunicationsendersV1Response electronicfundstransferGetCommunicationsendersV1(pkiElectronicfundstransferID)

Retrieve Electronicfundstransfer&#39;s Communicationsender



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectElectronicfundstransferApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectElectronicfundstransferApi apiInstance = new ObjectElectronicfundstransferApi(defaultClient);
    Integer pkiElectronicfundstransferID = 56; // Integer | 
    try {
      ElectronicfundstransferGetCommunicationsendersV1Response result = apiInstance.electronicfundstransferGetCommunicationsendersV1(pkiElectronicfundstransferID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectElectronicfundstransferApi#electronicfundstransferGetCommunicationsendersV1");
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
| **pkiElectronicfundstransferID** | **Integer**|  | |

### Return type

[**ElectronicfundstransferGetCommunicationsendersV1Response**](ElectronicfundstransferGetCommunicationsendersV1Response.md)

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

<a id="electronicfundstransferImportIntoEDMV1"></a>
# **electronicfundstransferImportIntoEDMV1**
> ElectronicfundstransferImportIntoEDMV1Response electronicfundstransferImportIntoEDMV1(pkiElectronicfundstransferID, electronicfundstransferImportIntoEDMV1Request)

Import attachments into the Electronicfundstransfer



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectElectronicfundstransferApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectElectronicfundstransferApi apiInstance = new ObjectElectronicfundstransferApi(defaultClient);
    Integer pkiElectronicfundstransferID = 56; // Integer | 
    ElectronicfundstransferImportIntoEDMV1Request electronicfundstransferImportIntoEDMV1Request = new ElectronicfundstransferImportIntoEDMV1Request(); // ElectronicfundstransferImportIntoEDMV1Request | 
    try {
      ElectronicfundstransferImportIntoEDMV1Response result = apiInstance.electronicfundstransferImportIntoEDMV1(pkiElectronicfundstransferID, electronicfundstransferImportIntoEDMV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectElectronicfundstransferApi#electronicfundstransferImportIntoEDMV1");
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
| **pkiElectronicfundstransferID** | **Integer**|  | |
| **electronicfundstransferImportIntoEDMV1Request** | [**ElectronicfundstransferImportIntoEDMV1Request**](ElectronicfundstransferImportIntoEDMV1Request.md)|  | |

### Return type

[**ElectronicfundstransferImportIntoEDMV1Response**](ElectronicfundstransferImportIntoEDMV1Response.md)

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

