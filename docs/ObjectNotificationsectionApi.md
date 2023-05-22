# ObjectNotificationsectionApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**notificationsectionGetNotificationtestsV1**](ObjectNotificationsectionApi.md#notificationsectionGetNotificationtestsV1) | **GET** /1/object/notificationsection/{pkiNotificationsectionID}/getNotificationtests | Retrieve an existing Notificationsection&#39;s Notificationtests |


<a id="notificationsectionGetNotificationtestsV1"></a>
# **notificationsectionGetNotificationtestsV1**
> NotificationsectionGetNotificationtestsV1Response notificationsectionGetNotificationtestsV1(pkiNotificationsectionID, bShowHidden)

Retrieve an existing Notificationsection&#39;s Notificationtests



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectNotificationsectionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectNotificationsectionApi apiInstance = new ObjectNotificationsectionApi(defaultClient);
    Integer pkiNotificationsectionID = 56; // Integer | 
    Boolean bShowHidden = true; // Boolean | Whether or not to return the hidden Notificationtests
    try {
      NotificationsectionGetNotificationtestsV1Response result = apiInstance.notificationsectionGetNotificationtestsV1(pkiNotificationsectionID, bShowHidden);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectNotificationsectionApi#notificationsectionGetNotificationtestsV1");
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
| **pkiNotificationsectionID** | **Integer**|  | |
| **bShowHidden** | **Boolean**| Whether or not to return the hidden Notificationtests | |

### Return type

[**NotificationsectionGetNotificationtestsV1Response**](NotificationsectionGetNotificationtestsV1Response.md)

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

