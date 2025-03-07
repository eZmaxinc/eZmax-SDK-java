# ObjectEzsignimportdocumentApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**ezsignimportdocumentDownloadV1**](ObjectEzsignimportdocumentApi.md#ezsignimportdocumentDownloadV1) | **GET** /1/object/ezsignimportdocument/{pkiEzsignimportdocumentID}/download | Retrieve the content |


<a id="ezsignimportdocumentDownloadV1"></a>
# **ezsignimportdocumentDownloadV1**
> EzsignimportdocumentDownloadV1Response ezsignimportdocumentDownloadV1(pkiEzsignimportdocumentID)

Retrieve the content

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsignimportdocumentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsignimportdocumentApi apiInstance = new ObjectEzsignimportdocumentApi(defaultClient);
    Integer pkiEzsignimportdocumentID = 56; // Integer | 
    try {
      EzsignimportdocumentDownloadV1Response result = apiInstance.ezsignimportdocumentDownloadV1(pkiEzsignimportdocumentID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsignimportdocumentApi#ezsignimportdocumentDownloadV1");
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
| **pkiEzsignimportdocumentID** | **Integer**|  | |

### Return type

[**EzsignimportdocumentDownloadV1Response**](EzsignimportdocumentDownloadV1Response.md)

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

