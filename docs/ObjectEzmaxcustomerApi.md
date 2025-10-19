# ObjectEzmaxcustomerApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**ezmaxcustomerPatchObjectV1**](ObjectEzmaxcustomerApi.md#ezmaxcustomerPatchObjectV1) | **PATCH** /1/object/ezmaxcustomer/{pkiEzmaxcustomerID} | Patch an existing Ezmaxcustomer |


<a id="ezmaxcustomerPatchObjectV1"></a>
# **ezmaxcustomerPatchObjectV1**
> EzmaxcustomerPatchObjectV1Response ezmaxcustomerPatchObjectV1(pkiEzmaxcustomerID, ezmaxcustomerPatchObjectV1Request)

Patch an existing Ezmaxcustomer



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzmaxcustomerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzmaxcustomerApi apiInstance = new ObjectEzmaxcustomerApi(defaultClient);
    Integer pkiEzmaxcustomerID = 56; // Integer | The unique ID of the Ezmaxcustomer
    EzmaxcustomerPatchObjectV1Request ezmaxcustomerPatchObjectV1Request = new EzmaxcustomerPatchObjectV1Request(); // EzmaxcustomerPatchObjectV1Request | 
    try {
      EzmaxcustomerPatchObjectV1Response result = apiInstance.ezmaxcustomerPatchObjectV1(pkiEzmaxcustomerID, ezmaxcustomerPatchObjectV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzmaxcustomerApi#ezmaxcustomerPatchObjectV1");
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
| **pkiEzmaxcustomerID** | **Integer**| The unique ID of the Ezmaxcustomer | |
| **ezmaxcustomerPatchObjectV1Request** | [**EzmaxcustomerPatchObjectV1Request**](EzmaxcustomerPatchObjectV1Request.md)|  | |

### Return type

[**EzmaxcustomerPatchObjectV1Response**](EzmaxcustomerPatchObjectV1Response.md)

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

