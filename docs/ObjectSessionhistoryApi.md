# ObjectSessionhistoryApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**sessionhistoryGetListV1**](ObjectSessionhistoryApi.md#sessionhistoryGetListV1) | **GET** /1/object/sessionhistory/getList | Retrieve Sessionhistory list |


<a id="sessionhistoryGetListV1"></a>
# **sessionhistoryGetListV1**
> SessionhistoryGetListV1Response sessionhistoryGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Sessionhistory list

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectSessionhistoryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectSessionhistoryApi apiInstance = new ObjectSessionhistoryApi(defaultClient);
    String eOrderBy = "pkiSessionhistoryID_ASC"; // String | Specify how you want the results to be sorted
    Integer iRowMax = 10000; // Integer | 
    Integer iRowOffset = 0; // Integer | 
    HeaderAcceptLanguage acceptLanguage = HeaderAcceptLanguage.fromValue("*"); // HeaderAcceptLanguage | 
    String sFilter = "sFilter_example"; // String | 
    try {
      SessionhistoryGetListV1Response result = apiInstance.sessionhistoryGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectSessionhistoryApi#sessionhistoryGetListV1");
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
| **eOrderBy** | **String**| Specify how you want the results to be sorted | [optional] [enum: pkiSessionhistoryID_ASC, pkiSessionhistoryID_DESC, fkiComputerID_ASC, fkiComputerID_DESC, fkiUserID_ASC, fkiUserID_DESC, dtSessionhistoryFirsthit_ASC, dtSessionhistoryFirsthit_DESC, dtSessionhistoryLasthit_ASC, dtSessionhistoryLasthit_DESC, eSessionhistoryEndby_ASC, eSessionhistoryEndby_DESC, sComputerDescription_ASC, sComputerDescription_DESC, sSessionhistoryDuration_ASC, sSessionhistoryDuration_DESC, sSessionhistoryIP_ASC, sSessionhistoryIP_DESC, sUserLoginname_ASC, sUserLoginname_DESC] |
| **iRowMax** | **Integer**|  | [optional] [default to 10000] |
| **iRowOffset** | **Integer**|  | [optional] [default to 0] |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |
| **sFilter** | **String**|  | [optional] |

### Return type

[**SessionhistoryGetListV1Response**](SessionhistoryGetListV1Response.md)

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

