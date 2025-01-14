# ObjectInscriptionnotauthenticatedApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**inscriptionnotauthenticatedGetCommunicationCountV1**](ObjectInscriptionnotauthenticatedApi.md#inscriptionnotauthenticatedGetCommunicationCountV1) | **GET** /1/object/inscriptionnotauthenticated/{pkiInscriptionnotauthenticatedID}/getCommunicationCount | Retrieve Communication count |
| [**inscriptionnotauthenticatedGetCommunicationListV1**](ObjectInscriptionnotauthenticatedApi.md#inscriptionnotauthenticatedGetCommunicationListV1) | **GET** /1/object/inscriptionnotauthenticated/{pkiInscriptionnotauthenticatedID}/getCommunicationList | Retrieve Communication list |
| [**inscriptionnotauthenticatedGetCommunicationrecipientsV1**](ObjectInscriptionnotauthenticatedApi.md#inscriptionnotauthenticatedGetCommunicationrecipientsV1) | **GET** /1/object/inscriptionnotauthenticated/{pkiInscriptionnotauthenticatedID}/getCommunicationrecipients | Retrieve Inscriptionnotauthenticated&#39;s Communicationrecipient |
| [**inscriptionnotauthenticatedGetCommunicationsendersV1**](ObjectInscriptionnotauthenticatedApi.md#inscriptionnotauthenticatedGetCommunicationsendersV1) | **GET** /1/object/inscriptionnotauthenticated/{pkiInscriptionnotauthenticatedID}/getCommunicationsenders | Retrieve Inscriptionnotauthenticated&#39;s Communicationsender |


<a id="inscriptionnotauthenticatedGetCommunicationCountV1"></a>
# **inscriptionnotauthenticatedGetCommunicationCountV1**
> InscriptionnotauthenticatedGetCommunicationCountV1Response inscriptionnotauthenticatedGetCommunicationCountV1(pkiInscriptionnotauthenticatedID)

Retrieve Communication count



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectInscriptionnotauthenticatedApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectInscriptionnotauthenticatedApi apiInstance = new ObjectInscriptionnotauthenticatedApi(defaultClient);
    Integer pkiInscriptionnotauthenticatedID = 56; // Integer | 
    try {
      InscriptionnotauthenticatedGetCommunicationCountV1Response result = apiInstance.inscriptionnotauthenticatedGetCommunicationCountV1(pkiInscriptionnotauthenticatedID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectInscriptionnotauthenticatedApi#inscriptionnotauthenticatedGetCommunicationCountV1");
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
| **pkiInscriptionnotauthenticatedID** | **Integer**|  | |

### Return type

[**InscriptionnotauthenticatedGetCommunicationCountV1Response**](InscriptionnotauthenticatedGetCommunicationCountV1Response.md)

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

<a id="inscriptionnotauthenticatedGetCommunicationListV1"></a>
# **inscriptionnotauthenticatedGetCommunicationListV1**
> InscriptionnotauthenticatedGetCommunicationListV1Response inscriptionnotauthenticatedGetCommunicationListV1(pkiInscriptionnotauthenticatedID)

Retrieve Communication list



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectInscriptionnotauthenticatedApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectInscriptionnotauthenticatedApi apiInstance = new ObjectInscriptionnotauthenticatedApi(defaultClient);
    Integer pkiInscriptionnotauthenticatedID = 56; // Integer | 
    try {
      InscriptionnotauthenticatedGetCommunicationListV1Response result = apiInstance.inscriptionnotauthenticatedGetCommunicationListV1(pkiInscriptionnotauthenticatedID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectInscriptionnotauthenticatedApi#inscriptionnotauthenticatedGetCommunicationListV1");
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
| **pkiInscriptionnotauthenticatedID** | **Integer**|  | |

### Return type

[**InscriptionnotauthenticatedGetCommunicationListV1Response**](InscriptionnotauthenticatedGetCommunicationListV1Response.md)

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

<a id="inscriptionnotauthenticatedGetCommunicationrecipientsV1"></a>
# **inscriptionnotauthenticatedGetCommunicationrecipientsV1**
> InscriptionnotauthenticatedGetCommunicationrecipientsV1Response inscriptionnotauthenticatedGetCommunicationrecipientsV1(pkiInscriptionnotauthenticatedID)

Retrieve Inscriptionnotauthenticated&#39;s Communicationrecipient



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectInscriptionnotauthenticatedApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectInscriptionnotauthenticatedApi apiInstance = new ObjectInscriptionnotauthenticatedApi(defaultClient);
    Integer pkiInscriptionnotauthenticatedID = 56; // Integer | 
    try {
      InscriptionnotauthenticatedGetCommunicationrecipientsV1Response result = apiInstance.inscriptionnotauthenticatedGetCommunicationrecipientsV1(pkiInscriptionnotauthenticatedID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectInscriptionnotauthenticatedApi#inscriptionnotauthenticatedGetCommunicationrecipientsV1");
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
| **pkiInscriptionnotauthenticatedID** | **Integer**|  | |

### Return type

[**InscriptionnotauthenticatedGetCommunicationrecipientsV1Response**](InscriptionnotauthenticatedGetCommunicationrecipientsV1Response.md)

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

<a id="inscriptionnotauthenticatedGetCommunicationsendersV1"></a>
# **inscriptionnotauthenticatedGetCommunicationsendersV1**
> InscriptionnotauthenticatedGetCommunicationsendersV1Response inscriptionnotauthenticatedGetCommunicationsendersV1(pkiInscriptionnotauthenticatedID)

Retrieve Inscriptionnotauthenticated&#39;s Communicationsender



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectInscriptionnotauthenticatedApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectInscriptionnotauthenticatedApi apiInstance = new ObjectInscriptionnotauthenticatedApi(defaultClient);
    Integer pkiInscriptionnotauthenticatedID = 56; // Integer | 
    try {
      InscriptionnotauthenticatedGetCommunicationsendersV1Response result = apiInstance.inscriptionnotauthenticatedGetCommunicationsendersV1(pkiInscriptionnotauthenticatedID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectInscriptionnotauthenticatedApi#inscriptionnotauthenticatedGetCommunicationsendersV1");
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
| **pkiInscriptionnotauthenticatedID** | **Integer**|  | |

### Return type

[**InscriptionnotauthenticatedGetCommunicationsendersV1Response**](InscriptionnotauthenticatedGetCommunicationsendersV1Response.md)

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

