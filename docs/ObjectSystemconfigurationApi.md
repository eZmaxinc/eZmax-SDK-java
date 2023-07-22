# ObjectSystemconfigurationApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**systemconfigurationEditObjectV1**](ObjectSystemconfigurationApi.md#systemconfigurationEditObjectV1) | **PUT** /1/object/systemconfiguration/{pkiSystemconfigurationID} | Edit an existing Systemconfiguration |
| [**systemconfigurationGetObjectV2**](ObjectSystemconfigurationApi.md#systemconfigurationGetObjectV2) | **GET** /2/object/systemconfiguration/{pkiSystemconfigurationID} | Retrieve an existing Systemconfiguration |


<a id="systemconfigurationEditObjectV1"></a>
# **systemconfigurationEditObjectV1**
> SystemconfigurationEditObjectV1Response systemconfigurationEditObjectV1(pkiSystemconfigurationID, systemconfigurationEditObjectV1Request)

Edit an existing Systemconfiguration



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectSystemconfigurationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectSystemconfigurationApi apiInstance = new ObjectSystemconfigurationApi(defaultClient);
    Integer pkiSystemconfigurationID = 56; // Integer | The unique ID of the Systemconfiguration
    SystemconfigurationEditObjectV1Request systemconfigurationEditObjectV1Request = new SystemconfigurationEditObjectV1Request(); // SystemconfigurationEditObjectV1Request | 
    try {
      SystemconfigurationEditObjectV1Response result = apiInstance.systemconfigurationEditObjectV1(pkiSystemconfigurationID, systemconfigurationEditObjectV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectSystemconfigurationApi#systemconfigurationEditObjectV1");
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
| **pkiSystemconfigurationID** | **Integer**| The unique ID of the Systemconfiguration | |
| **systemconfigurationEditObjectV1Request** | [**SystemconfigurationEditObjectV1Request**](SystemconfigurationEditObjectV1Request.md)|  | |

### Return type

[**SystemconfigurationEditObjectV1Response**](SystemconfigurationEditObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **404** | The request failed. The element on which you were trying to work does not exists. Look for detail about the error in the body |  -  |
| **422** | The request was syntactically valid but failed because of an interdependance condition. Look for detail about the error in the body |  -  |

<a id="systemconfigurationGetObjectV2"></a>
# **systemconfigurationGetObjectV2**
> SystemconfigurationGetObjectV2Response systemconfigurationGetObjectV2(pkiSystemconfigurationID)

Retrieve an existing Systemconfiguration



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectSystemconfigurationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectSystemconfigurationApi apiInstance = new ObjectSystemconfigurationApi(defaultClient);
    Integer pkiSystemconfigurationID = 56; // Integer | The unique ID of the Systemconfiguration
    try {
      SystemconfigurationGetObjectV2Response result = apiInstance.systemconfigurationGetObjectV2(pkiSystemconfigurationID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectSystemconfigurationApi#systemconfigurationGetObjectV2");
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
| **pkiSystemconfigurationID** | **Integer**| The unique ID of the Systemconfiguration | |

### Return type

[**SystemconfigurationGetObjectV2Response**](SystemconfigurationGetObjectV2Response.md)

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

