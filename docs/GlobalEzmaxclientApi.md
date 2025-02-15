# GlobalEzmaxclientApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**globalEzmaxclientVersionV1**](GlobalEzmaxclientApi.md#globalEzmaxclientVersionV1) | **GET** /1/ezmaxclient/{pksEzmaxclientOs}/version | Retrieve the latest version of the Ezmaxclient |


<a id="globalEzmaxclientVersionV1"></a>
# **globalEzmaxclientVersionV1**
> GlobalEzmaxclientVersionV1Response globalEzmaxclientVersionV1(pksEzmaxclientOs)

Retrieve the latest version of the Ezmaxclient

Retrieve the latest version of the Ezmaxclient that is available on the store.

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.models.*;
import com.ezmax.api.GlobalEzmaxclientApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");

    GlobalEzmaxclientApi apiInstance = new GlobalEzmaxclientApi(defaultClient);
    FieldPksEzmaxclientOs pksEzmaxclientOs = FieldPksEzmaxclientOs.fromValue("Android"); // FieldPksEzmaxclientOs | 
    try {
      GlobalEzmaxclientVersionV1Response result = apiInstance.globalEzmaxclientVersionV1(pksEzmaxclientOs);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GlobalEzmaxclientApi#globalEzmaxclientVersionV1");
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
| **pksEzmaxclientOs** | [**FieldPksEzmaxclientOs**](.md)|  | [enum: Android, iOS, iPadOS, macOS, Windows] |

### Return type

[**GlobalEzmaxclientVersionV1Response**](GlobalEzmaxclientVersionV1Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **404** | The request failed. The element on which you were trying to work does not exists. Look for detail about the error in the body |  -  |

