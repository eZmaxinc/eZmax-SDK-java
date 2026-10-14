# ObjectElectronicfundstransfertransactionApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**electronicfundstransfertransactionGetListV1**](ObjectElectronicfundstransfertransactionApi.md#electronicfundstransfertransactionGetListV1) | **GET** /1/object/electronicfundstransfertransaction/getList | Retrieve Electronicfundstransfertransaction list |


<a id="electronicfundstransfertransactionGetListV1"></a>
# **electronicfundstransfertransactionGetListV1**
> ElectronicfundstransfertransactionGetListV1Response electronicfundstransfertransactionGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Electronicfundstransfertransaction list



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectElectronicfundstransfertransactionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectElectronicfundstransfertransactionApi apiInstance = new ObjectElectronicfundstransfertransactionApi(defaultClient);
    String eOrderBy = "pkiElectronicfundstransfertransactionID_ASC"; // String | Specify how you want the results to be sorted
    Integer iRowMax = 56; // Integer | 
    Integer iRowOffset = 0; // Integer | 
    HeaderAcceptLanguage acceptLanguage = HeaderAcceptLanguage.fromValue("*"); // HeaderAcceptLanguage | 
    String sFilter = "sFilter_example"; // String | 
    try {
      ElectronicfundstransfertransactionGetListV1Response result = apiInstance.electronicfundstransfertransactionGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectElectronicfundstransfertransactionApi#electronicfundstransfertransactionGetListV1");
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
| **eOrderBy** | **String**| Specify how you want the results to be sorted | [optional] [enum: pkiElectronicfundstransfertransactionID_ASC, pkiElectronicfundstransfertransactionID_DESC, dElectronicfundstransfertransactionAmount_ASC, dElectronicfundstransfertransactionAmount_DESC, dtElectronicfundstransfertransactionDate_ASC, dtElectronicfundstransfertransactionDate_DESC, iElectronicfundstransferNumber_ASC, iElectronicfundstransferNumber_DESC] |
| **iRowMax** | **Integer**|  | [optional] |
| **iRowOffset** | **Integer**|  | [optional] [default to 0] |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |
| **sFilter** | **String**|  | [optional] |

### Return type

[**ElectronicfundstransfertransactionGetListV1Response**](ElectronicfundstransfertransactionGetListV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/vnd.openxmlformats-officedocument.spreadsheetml.sheet

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **406** | The URL is valid, but one of the Accept header is not defined or invalid. For example, you set the header \&quot;Accept: application/json\&quot; but the function can only return \&quot;Content-type: image/png\&quot; |  -  |

