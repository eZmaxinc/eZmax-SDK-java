# GlobalEzmaxcustomerApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**globalEzmaxcustomerGetConfigurationV1**](GlobalEzmaxcustomerApi.md#globalEzmaxcustomerGetConfigurationV1) | **GET** /1/ezmaxcustomer/{pksEzmaxcustomerCode}/getConfiguration | Get ezmaxcustomer configuration |


<a id="globalEzmaxcustomerGetConfigurationV1"></a>
# **globalEzmaxcustomerGetConfigurationV1**
> GlobalEzmaxcustomerGetConfigurationV1Response globalEzmaxcustomerGetConfigurationV1(pksEzmaxcustomerCode)

Get ezmaxcustomer configuration

Retrieve the ezmaxcustomer&#39;s specific configuration. This will help locate the proper region (ie: sInfrastructureregionCode) and the proper environment (ie: sInfrastructureenvironmenttypeDescription) where the customer&#39;s data is stored.

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.models.*;
import com.ezmax.api.GlobalEzmaxcustomerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");

    GlobalEzmaxcustomerApi apiInstance = new GlobalEzmaxcustomerApi(defaultClient);
    String pksEzmaxcustomerCode = "pksEzmaxcustomerCode_example"; // String | 
    try {
      GlobalEzmaxcustomerGetConfigurationV1Response result = apiInstance.globalEzmaxcustomerGetConfigurationV1(pksEzmaxcustomerCode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GlobalEzmaxcustomerApi#globalEzmaxcustomerGetConfigurationV1");
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
| **pksEzmaxcustomerCode** | **String**|  | |

### Return type

[**GlobalEzmaxcustomerGetConfigurationV1Response**](GlobalEzmaxcustomerGetConfigurationV1Response.md)

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

