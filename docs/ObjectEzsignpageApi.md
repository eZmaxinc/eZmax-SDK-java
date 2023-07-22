# ObjectEzsignpageApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**ezsignpageConsultV1**](ObjectEzsignpageApi.md#ezsignpageConsultV1) | **POST** /1/object/ezsignpage/{pkiEzsignpageID}/consult | Consult an Ezsignpage |


<a id="ezsignpageConsultV1"></a>
# **ezsignpageConsultV1**
> EzsignpageConsultV1Response ezsignpageConsultV1(pkiEzsignpageID, body)

Consult an Ezsignpage

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsignpageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsignpageApi apiInstance = new ObjectEzsignpageApi(defaultClient);
    Integer pkiEzsignpageID = 56; // Integer | 
    Object body = null; // Object | 
    try {
      EzsignpageConsultV1Response result = apiInstance.ezsignpageConsultV1(pkiEzsignpageID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsignpageApi#ezsignpageConsultV1");
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
| **pkiEzsignpageID** | **Integer**|  | |
| **body** | **Object**|  | |

### Return type

[**EzsignpageConsultV1Response**](EzsignpageConsultV1Response.md)

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

