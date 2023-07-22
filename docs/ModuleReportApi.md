# ModuleReportApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**reportGetReportFromCacheV1**](ModuleReportApi.md#reportGetReportFromCacheV1) | **GET** /1/module/report/getReportFromCache/{sReportgroupCacheID} | Retrieve report from cache |


<a id="reportGetReportFromCacheV1"></a>
# **reportGetReportFromCacheV1**
> CommonGetReportV1Response reportGetReportFromCacheV1(sReportgroupCacheID)

Retrieve report from cache

Retrieve a report that was previously generated and cached

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ModuleReportApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    // Configure API key authorization: Presigned
    ApiKeyAuth Presigned = (ApiKeyAuth) defaultClient.getAuthentication("Presigned");
    Presigned.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Presigned.setApiKeyPrefix("Token");

    ModuleReportApi apiInstance = new ModuleReportApi(defaultClient);
    String sReportgroupCacheID = "sReportgroupCacheID_example"; // String | 
    try {
      CommonGetReportV1Response result = apiInstance.reportGetReportFromCacheV1(sReportgroupCacheID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModuleReportApi#reportGetReportFromCacheV1");
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
| **sReportgroupCacheID** | **String**|  | |

### Return type

[**CommonGetReportV1Response**](CommonGetReportV1Response.md)

### Authorization

[Authorization](../README.md#Authorization), [Presigned](../README.md#Presigned)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/pdf, application/vnd.openxmlformats-officedocument.spreadsheetml.sheet, application/zip, text/html

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **406** | The URL is valid, but one of the Accept header is not defined or invalid. For example, you set the header \&quot;Accept: application/json\&quot; but the function can only return \&quot;Content-type: image/png\&quot; |  -  |

