# ObjectAdjustmentreminderApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**adjustmentreminderGetListV1**](ObjectAdjustmentreminderApi.md#adjustmentreminderGetListV1) | **GET** /1/object/adjustmentreminder/getList | Retrieve Adjustmentreminder list |


<a id="adjustmentreminderGetListV1"></a>
# **adjustmentreminderGetListV1**
> AdjustmentreminderGetListV1Response adjustmentreminderGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Adjustmentreminder list

Enum values that can be filtered in query parameter *sFilter*:  | Variable | Valid values | |---|---| | eAdjustmentreminderType | Inversion&lt;br&gt;Copy |

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectAdjustmentreminderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectAdjustmentreminderApi apiInstance = new ObjectAdjustmentreminderApi(defaultClient);
    String eOrderBy = "pkiAdjustmentreminderID_ASC"; // String | Specify how you want the results to be sorted
    Integer iRowMax = 56; // Integer | 
    Integer iRowOffset = 0; // Integer | 
    HeaderAcceptLanguage acceptLanguage = HeaderAcceptLanguage.fromValue("*"); // HeaderAcceptLanguage | 
    String sFilter = "sFilter_example"; // String | 
    try {
      AdjustmentreminderGetListV1Response result = apiInstance.adjustmentreminderGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectAdjustmentreminderApi#adjustmentreminderGetListV1");
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
| **eOrderBy** | **String**| Specify how you want the results to be sorted | [optional] [enum: pkiAdjustmentreminderID_ASC, pkiAdjustmentreminderID_DESC, fkiAdjustmentID_ASC, fkiAdjustmentID_DESC, fkiPeriodID_ASC, fkiPeriodID_DESC, sPeriodYYYYMM_ASC, sPeriodYYYYMM_DESC, fkiUserIDCreated_ASC, fkiUserIDCreated_DESC, sUserLoginname_ASC, sUserLoginname_DESC, eAdjustmentreminderType_ASC, eAdjustmentreminderType_DESC, sAdjustmentNumber_ASC, sAdjustmentNumber_DESC, sAdjustmentComment_ASC, sAdjustmentComment_DESC, dAdjustmentTotaldebit_ASC, dAdjustmentTotaldebit_DESC, dAdjustmentTotalcredit_ASC, dAdjustmentTotalcredit_DESC] |
| **iRowMax** | **Integer**|  | [optional] |
| **iRowOffset** | **Integer**|  | [optional] [default to 0] |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |
| **sFilter** | **String**|  | [optional] |

### Return type

[**AdjustmentreminderGetListV1Response**](AdjustmentreminderGetListV1Response.md)

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

