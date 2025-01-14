# ObjectTranqcontractApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**tranqcontractGetCommunicationCountV1**](ObjectTranqcontractApi.md#tranqcontractGetCommunicationCountV1) | **GET** /1/object/tranqcontract/{pkiTranqcontractID}/getCommunicationCount | Retrieve Communication count |
| [**tranqcontractGetCommunicationListV1**](ObjectTranqcontractApi.md#tranqcontractGetCommunicationListV1) | **GET** /1/object/tranqcontract/{pkiTranqcontractID}/getCommunicationList | Retrieve Communication list |
| [**tranqcontractGetCommunicationrecipientsV1**](ObjectTranqcontractApi.md#tranqcontractGetCommunicationrecipientsV1) | **GET** /1/object/tranqcontract/{pkiTranqcontractID}/getCommunicationrecipients | Retrieve Tranqcontract&#39;s Communicationrecipient |
| [**tranqcontractGetCommunicationsendersV1**](ObjectTranqcontractApi.md#tranqcontractGetCommunicationsendersV1) | **GET** /1/object/tranqcontract/{pkiTranqcontractID}/getCommunicationsenders | Retrieve Tranqcontract&#39;s Communicationsender |


<a id="tranqcontractGetCommunicationCountV1"></a>
# **tranqcontractGetCommunicationCountV1**
> TranqcontractGetCommunicationCountV1Response tranqcontractGetCommunicationCountV1(pkiTranqcontractID)

Retrieve Communication count



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectTranqcontractApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectTranqcontractApi apiInstance = new ObjectTranqcontractApi(defaultClient);
    Integer pkiTranqcontractID = 56; // Integer | 
    try {
      TranqcontractGetCommunicationCountV1Response result = apiInstance.tranqcontractGetCommunicationCountV1(pkiTranqcontractID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectTranqcontractApi#tranqcontractGetCommunicationCountV1");
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
| **pkiTranqcontractID** | **Integer**|  | |

### Return type

[**TranqcontractGetCommunicationCountV1Response**](TranqcontractGetCommunicationCountV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **404** | The request failed. The element on which you were trying to work does not exists. Look for detail about the error in the body |  -  |

<a id="tranqcontractGetCommunicationListV1"></a>
# **tranqcontractGetCommunicationListV1**
> TranqcontractGetCommunicationListV1Response tranqcontractGetCommunicationListV1(pkiTranqcontractID)

Retrieve Communication list



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectTranqcontractApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectTranqcontractApi apiInstance = new ObjectTranqcontractApi(defaultClient);
    Integer pkiTranqcontractID = 56; // Integer | 
    try {
      TranqcontractGetCommunicationListV1Response result = apiInstance.tranqcontractGetCommunicationListV1(pkiTranqcontractID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectTranqcontractApi#tranqcontractGetCommunicationListV1");
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
| **pkiTranqcontractID** | **Integer**|  | |

### Return type

[**TranqcontractGetCommunicationListV1Response**](TranqcontractGetCommunicationListV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **404** | The request failed. The element on which you were trying to work does not exists. Look for detail about the error in the body |  -  |

<a id="tranqcontractGetCommunicationrecipientsV1"></a>
# **tranqcontractGetCommunicationrecipientsV1**
> TranqcontractGetCommunicationrecipientsV1Response tranqcontractGetCommunicationrecipientsV1(pkiTranqcontractID)

Retrieve Tranqcontract&#39;s Communicationrecipient



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectTranqcontractApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectTranqcontractApi apiInstance = new ObjectTranqcontractApi(defaultClient);
    Integer pkiTranqcontractID = 56; // Integer | 
    try {
      TranqcontractGetCommunicationrecipientsV1Response result = apiInstance.tranqcontractGetCommunicationrecipientsV1(pkiTranqcontractID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectTranqcontractApi#tranqcontractGetCommunicationrecipientsV1");
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
| **pkiTranqcontractID** | **Integer**|  | |

### Return type

[**TranqcontractGetCommunicationrecipientsV1Response**](TranqcontractGetCommunicationrecipientsV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **404** | The request failed. The element on which you were trying to work does not exists. Look for detail about the error in the body |  -  |

<a id="tranqcontractGetCommunicationsendersV1"></a>
# **tranqcontractGetCommunicationsendersV1**
> TranqcontractGetCommunicationsendersV1Response tranqcontractGetCommunicationsendersV1(pkiTranqcontractID)

Retrieve Tranqcontract&#39;s Communicationsender



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectTranqcontractApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectTranqcontractApi apiInstance = new ObjectTranqcontractApi(defaultClient);
    Integer pkiTranqcontractID = 56; // Integer | 
    try {
      TranqcontractGetCommunicationsendersV1Response result = apiInstance.tranqcontractGetCommunicationsendersV1(pkiTranqcontractID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectTranqcontractApi#tranqcontractGetCommunicationsendersV1");
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
| **pkiTranqcontractID** | **Integer**|  | |

### Return type

[**TranqcontractGetCommunicationsendersV1Response**](TranqcontractGetCommunicationsendersV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **404** | The request failed. The element on which you were trying to work does not exists. Look for detail about the error in the body |  -  |

