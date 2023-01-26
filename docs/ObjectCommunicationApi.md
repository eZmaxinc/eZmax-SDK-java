# ObjectCommunicationApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**communicationGetListV1**](ObjectCommunicationApi.md#communicationGetListV1) | **GET** /1/object/communication/getList | Retrieve Communication list |
| [**communicationGetObjectV2**](ObjectCommunicationApi.md#communicationGetObjectV2) | **GET** /2/object/communication/{pkiCommunicationID} | Retrieve an existing Communication |


<a name="communicationGetListV1"></a>
# **communicationGetListV1**
> CommunicationGetListV1Response communicationGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Communication list

Enum values that can be filtered in query parameter *sFilter*:  | Variable | Valid values | |---|---| | eCommunicationImportance | High&lt;br&gt;Normal&lt;br&gt;Low | | eCommunicationType | Email&lt;br&gt;Fax&lt;br&gt;Sms | | eCommunicationDirection | Inbound&lt;br&gt;Outbound |

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectCommunicationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectCommunicationApi apiInstance = new ObjectCommunicationApi(defaultClient);
    String eOrderBy = "pkiCommunicationID_ASC"; // String | Specify how you want the results to be sorted
    Integer iRowMax = 56; // Integer | 
    Integer iRowOffset = 56; // Integer | 
    HeaderAcceptLanguage acceptLanguage = HeaderAcceptLanguage.fromValue("*"); // HeaderAcceptLanguage | 
    String sFilter = "sFilter_example"; // String | 
    try {
      CommunicationGetListV1Response result = apiInstance.communicationGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectCommunicationApi#communicationGetListV1");
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
| **eOrderBy** | **String**| Specify how you want the results to be sorted | [optional] [enum: pkiCommunicationID_ASC, pkiCommunicationID_DESC, fkiEzsignfolderID_ASC, fkiEzsignfolderID_DESC, dtCreatedDate_ASC, dtCreatedDate_DESC, eCommunicationDirection_ASC, eCommunicationDirection_DESC, eCommunicationImportance_ASC, eCommunicationImportance_DESC, eCommunicationType_ASC, eCommunicationType_DESC, iCommunicationrecipientCount_ASC, iCommunicationrecipientCount_DESC, sCommunicationSubject_ASC, sCommunicationSubject_DESC, sCommunicationSender_ASC, sCommunicationSender_DESC, sCommunicationRecipient_ASC, sCommunicationRecipient_DESC] |
| **iRowMax** | **Integer**|  | [optional] |
| **iRowOffset** | **Integer**|  | [optional] |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |
| **sFilter** | **String**|  | [optional] |

### Return type

[**CommunicationGetListV1Response**](CommunicationGetListV1Response.md)

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

<a name="communicationGetObjectV2"></a>
# **communicationGetObjectV2**
> CommunicationGetObjectV2Response communicationGetObjectV2(pkiCommunicationID)

Retrieve an existing Communication



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectCommunicationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectCommunicationApi apiInstance = new ObjectCommunicationApi(defaultClient);
    Integer pkiCommunicationID = 56; // Integer | 
    try {
      CommunicationGetObjectV2Response result = apiInstance.communicationGetObjectV2(pkiCommunicationID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectCommunicationApi#communicationGetObjectV2");
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
| **pkiCommunicationID** | **Integer**|  | |

### Return type

[**CommunicationGetObjectV2Response**](CommunicationGetObjectV2Response.md)

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

