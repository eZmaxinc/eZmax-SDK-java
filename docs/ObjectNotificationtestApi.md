# ObjectNotificationtestApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**notificationtestGetElementsV2**](ObjectNotificationtestApi.md#notificationtestGetElementsV2) | **GET** /2/object/notificationtest/{pkiNotificationtestID}/getElements | Retrieve an existing Notificationtest&#39;s Elements |


<a id="notificationtestGetElementsV2"></a>
# **notificationtestGetElementsV2**
> NotificationtestGetElementsV2Response notificationtestGetElementsV2(pkiNotificationtestID)

Retrieve an existing Notificationtest&#39;s Elements



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectNotificationtestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectNotificationtestApi apiInstance = new ObjectNotificationtestApi(defaultClient);
    Integer pkiNotificationtestID = 56; // Integer | 
    try {
      NotificationtestGetElementsV2Response result = apiInstance.notificationtestGetElementsV2(pkiNotificationtestID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectNotificationtestApi#notificationtestGetElementsV2");
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
| **pkiNotificationtestID** | **Integer**|  | |

### Return type

[**NotificationtestGetElementsV2Response**](NotificationtestGetElementsV2Response.md)

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

