# ObjectEzmaxcustomeruserApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**ezmaxcustomeruserPatchObjectV1**](ObjectEzmaxcustomeruserApi.md#ezmaxcustomeruserPatchObjectV1) | **PATCH** /1/object/ezmaxcustomeruser/{pkiEzmaxcustomeruserID} | Patch an existing Ezmaxcustomeruser |


<a id="ezmaxcustomeruserPatchObjectV1"></a>
# **ezmaxcustomeruserPatchObjectV1**
> EzmaxcustomeruserPatchObjectV1Response ezmaxcustomeruserPatchObjectV1(pkiEzmaxcustomeruserID, ezmaxcustomeruserPatchObjectV1Request)

Patch an existing Ezmaxcustomeruser



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzmaxcustomeruserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzmaxcustomeruserApi apiInstance = new ObjectEzmaxcustomeruserApi(defaultClient);
    Integer pkiEzmaxcustomeruserID = 56; // Integer | The unique ID of the Ezmaxcustomeruser
    EzmaxcustomeruserPatchObjectV1Request ezmaxcustomeruserPatchObjectV1Request = new EzmaxcustomeruserPatchObjectV1Request(); // EzmaxcustomeruserPatchObjectV1Request | 
    try {
      EzmaxcustomeruserPatchObjectV1Response result = apiInstance.ezmaxcustomeruserPatchObjectV1(pkiEzmaxcustomeruserID, ezmaxcustomeruserPatchObjectV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzmaxcustomeruserApi#ezmaxcustomeruserPatchObjectV1");
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
| **pkiEzmaxcustomeruserID** | **Integer**| The unique ID of the Ezmaxcustomeruser | |
| **ezmaxcustomeruserPatchObjectV1Request** | [**EzmaxcustomeruserPatchObjectV1Request**](EzmaxcustomeruserPatchObjectV1Request.md)|  | |

### Return type

[**EzmaxcustomeruserPatchObjectV1Response**](EzmaxcustomeruserPatchObjectV1Response.md)

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

