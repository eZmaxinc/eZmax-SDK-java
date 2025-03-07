# ObjectEzmaxcaseApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**ezmaxcasePatchObjectV1**](ObjectEzmaxcaseApi.md#ezmaxcasePatchObjectV1) | **PATCH** /1/object/ezmaxcase/{pkiEzmaxcaseID} | Patch an existing Ezmaxcase |


<a id="ezmaxcasePatchObjectV1"></a>
# **ezmaxcasePatchObjectV1**
> EzmaxcasePatchObjectV1Response ezmaxcasePatchObjectV1(pkiEzmaxcaseID, ezmaxcasePatchObjectV1Request)

Patch an existing Ezmaxcase



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzmaxcaseApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzmaxcaseApi apiInstance = new ObjectEzmaxcaseApi(defaultClient);
    Integer pkiEzmaxcaseID = 56; // Integer | The unique ID of the Ezmaxcase
    EzmaxcasePatchObjectV1Request ezmaxcasePatchObjectV1Request = new EzmaxcasePatchObjectV1Request(); // EzmaxcasePatchObjectV1Request | 
    try {
      EzmaxcasePatchObjectV1Response result = apiInstance.ezmaxcasePatchObjectV1(pkiEzmaxcaseID, ezmaxcasePatchObjectV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzmaxcaseApi#ezmaxcasePatchObjectV1");
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
| **pkiEzmaxcaseID** | **Integer**| The unique ID of the Ezmaxcase | |
| **ezmaxcasePatchObjectV1Request** | [**EzmaxcasePatchObjectV1Request**](EzmaxcasePatchObjectV1Request.md)|  | |

### Return type

[**EzmaxcasePatchObjectV1Response**](EzmaxcasePatchObjectV1Response.md)

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

