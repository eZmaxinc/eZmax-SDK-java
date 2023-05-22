# GlobalCustomerApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**globalCustomerGetEndpointV1**](GlobalCustomerApi.md#globalCustomerGetEndpointV1) | **GET** /1/customer/{pksCustomerCode}/endpoint | Get customer endpoint |


<a id="globalCustomerGetEndpointV1"></a>
# **globalCustomerGetEndpointV1**
> GlobalCustomerGetEndpointV1Response globalCustomerGetEndpointV1(pksCustomerCode, sInfrastructureproductCode)

Get customer endpoint

Retrieve the customer&#39;s specific server endpoint where to send requests. This will help locate the proper region (ie: sInfrastructureregionCode) and the proper environment (ie: sInfrastructureenvironmenttypeDescription) where the customer&#39;s data is stored.

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.GlobalCustomerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    GlobalCustomerApi apiInstance = new GlobalCustomerApi(defaultClient);
    String pksCustomerCode = "pksCustomerCode_example"; // String | 
    String sInfrastructureproductCode = "appcluster01"; // String | The infrastructure product Code  If undefined, \"appcluster01\" is assumed
    try {
      GlobalCustomerGetEndpointV1Response result = apiInstance.globalCustomerGetEndpointV1(pksCustomerCode, sInfrastructureproductCode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GlobalCustomerApi#globalCustomerGetEndpointV1");
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
| **pksCustomerCode** | **String**|  | |
| **sInfrastructureproductCode** | **String**| The infrastructure product Code  If undefined, \&quot;appcluster01\&quot; is assumed | [optional] [enum: appcluster01, ezsignuser] |

### Return type

[**GlobalCustomerGetEndpointV1Response**](GlobalCustomerGetEndpointV1Response.md)

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

