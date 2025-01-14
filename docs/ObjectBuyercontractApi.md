# ObjectBuyercontractApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**buyercontractGetCommunicationCountV1**](ObjectBuyercontractApi.md#buyercontractGetCommunicationCountV1) | **GET** /1/object/buyercontract/{pkiBuyercontractID}/getCommunicationCount | Retrieve Communication count |
| [**buyercontractGetCommunicationListV1**](ObjectBuyercontractApi.md#buyercontractGetCommunicationListV1) | **GET** /1/object/buyercontract/{pkiBuyercontractID}/getCommunicationList | Retrieve Communication list |
| [**buyercontractGetCommunicationrecipientsV1**](ObjectBuyercontractApi.md#buyercontractGetCommunicationrecipientsV1) | **GET** /1/object/buyercontract/{pkiBuyercontractID}/getCommunicationrecipients | Retrieve Buyercontract&#39;s Communicationrecipient |
| [**buyercontractGetCommunicationsendersV1**](ObjectBuyercontractApi.md#buyercontractGetCommunicationsendersV1) | **GET** /1/object/buyercontract/{pkiBuyercontractID}/getCommunicationsenders | Retrieve Buyercontract&#39;s Communicationsender |


<a id="buyercontractGetCommunicationCountV1"></a>
# **buyercontractGetCommunicationCountV1**
> BuyercontractGetCommunicationCountV1Response buyercontractGetCommunicationCountV1(pkiBuyercontractID)

Retrieve Communication count



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectBuyercontractApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectBuyercontractApi apiInstance = new ObjectBuyercontractApi(defaultClient);
    Integer pkiBuyercontractID = 56; // Integer | 
    try {
      BuyercontractGetCommunicationCountV1Response result = apiInstance.buyercontractGetCommunicationCountV1(pkiBuyercontractID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectBuyercontractApi#buyercontractGetCommunicationCountV1");
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
| **pkiBuyercontractID** | **Integer**|  | |

### Return type

[**BuyercontractGetCommunicationCountV1Response**](BuyercontractGetCommunicationCountV1Response.md)

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

<a id="buyercontractGetCommunicationListV1"></a>
# **buyercontractGetCommunicationListV1**
> BuyercontractGetCommunicationListV1Response buyercontractGetCommunicationListV1(pkiBuyercontractID)

Retrieve Communication list



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectBuyercontractApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectBuyercontractApi apiInstance = new ObjectBuyercontractApi(defaultClient);
    Integer pkiBuyercontractID = 56; // Integer | 
    try {
      BuyercontractGetCommunicationListV1Response result = apiInstance.buyercontractGetCommunicationListV1(pkiBuyercontractID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectBuyercontractApi#buyercontractGetCommunicationListV1");
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
| **pkiBuyercontractID** | **Integer**|  | |

### Return type

[**BuyercontractGetCommunicationListV1Response**](BuyercontractGetCommunicationListV1Response.md)

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

<a id="buyercontractGetCommunicationrecipientsV1"></a>
# **buyercontractGetCommunicationrecipientsV1**
> BuyercontractGetCommunicationrecipientsV1Response buyercontractGetCommunicationrecipientsV1(pkiBuyercontractID)

Retrieve Buyercontract&#39;s Communicationrecipient



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectBuyercontractApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectBuyercontractApi apiInstance = new ObjectBuyercontractApi(defaultClient);
    Integer pkiBuyercontractID = 56; // Integer | 
    try {
      BuyercontractGetCommunicationrecipientsV1Response result = apiInstance.buyercontractGetCommunicationrecipientsV1(pkiBuyercontractID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectBuyercontractApi#buyercontractGetCommunicationrecipientsV1");
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
| **pkiBuyercontractID** | **Integer**|  | |

### Return type

[**BuyercontractGetCommunicationrecipientsV1Response**](BuyercontractGetCommunicationrecipientsV1Response.md)

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

<a id="buyercontractGetCommunicationsendersV1"></a>
# **buyercontractGetCommunicationsendersV1**
> BuyercontractGetCommunicationsendersV1Response buyercontractGetCommunicationsendersV1(pkiBuyercontractID)

Retrieve Buyercontract&#39;s Communicationsender



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectBuyercontractApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectBuyercontractApi apiInstance = new ObjectBuyercontractApi(defaultClient);
    Integer pkiBuyercontractID = 56; // Integer | 
    try {
      BuyercontractGetCommunicationsendersV1Response result = apiInstance.buyercontractGetCommunicationsendersV1(pkiBuyercontractID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectBuyercontractApi#buyercontractGetCommunicationsendersV1");
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
| **pkiBuyercontractID** | **Integer**|  | |

### Return type

[**BuyercontractGetCommunicationsendersV1Response**](BuyercontractGetCommunicationsendersV1Response.md)

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

