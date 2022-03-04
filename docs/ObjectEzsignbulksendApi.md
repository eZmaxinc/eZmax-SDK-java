# ObjectEzsignbulksendApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ezsignbulksendGetEzsignbulksendtransmissionsV1**](ObjectEzsignbulksendApi.md#ezsignbulksendGetEzsignbulksendtransmissionsV1) | **GET** /1/object/ezsignbulksend/{pkiEzsignbulksendID}/getEzsignbulksendtransmissions | Retrieve an existing Ezsignbulksend&#39;s Ezsignbulksendtransmissions
[**ezsignbulksendGetListV1**](ObjectEzsignbulksendApi.md#ezsignbulksendGetListV1) | **GET** /1/object/ezsignbulksend/getList | Retrieve Ezsignbulksend list
[**ezsignbulksendGetObjectV1**](ObjectEzsignbulksendApi.md#ezsignbulksendGetObjectV1) | **GET** /1/object/ezsignbulksend/{pkiEzsignbulksendID} | Retrieve an existing Ezsignbulksend


<a name="ezsignbulksendGetEzsignbulksendtransmissionsV1"></a>
# **ezsignbulksendGetEzsignbulksendtransmissionsV1**
> EzsignbulksendGetEzsignbulksendtransmissionsV1Response ezsignbulksendGetEzsignbulksendtransmissionsV1(pkiEzsignbulksendID)

Retrieve an existing Ezsignbulksend&#39;s Ezsignbulksendtransmissions



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsignbulksendApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsignbulksendApi apiInstance = new ObjectEzsignbulksendApi(defaultClient);
    Integer pkiEzsignbulksendID = 56; // Integer | 
    try {
      EzsignbulksendGetEzsignbulksendtransmissionsV1Response result = apiInstance.ezsignbulksendGetEzsignbulksendtransmissionsV1(pkiEzsignbulksendID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsignbulksendApi#ezsignbulksendGetEzsignbulksendtransmissionsV1");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignbulksendID** | **Integer**|  |

### Return type

[**EzsignbulksendGetEzsignbulksendtransmissionsV1Response**](EzsignbulksendGetEzsignbulksendtransmissionsV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |
**404** | The element you are trying to work on does not exist |  -  |

<a name="ezsignbulksendGetListV1"></a>
# **ezsignbulksendGetListV1**
> EzsignbulksendGetListV1Response ezsignbulksendGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Ezsignbulksend list

Enum values that can be filtered in query parameter *sFilter*:  | Variable | Valid values | |---|---| | eEzsignfoldertypePrivacylevel | User&lt;br&gt;Usergroup |

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsignbulksendApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsignbulksendApi apiInstance = new ObjectEzsignbulksendApi(defaultClient);
    String eOrderBy = "pkiEzsignbulksendID_ASC"; // String | Specify how you want the results to be sorted
    Integer iRowMax = 56; // Integer | 
    Integer iRowOffset = 56; // Integer | 
    HeaderAcceptLanguage acceptLanguage = HeaderAcceptLanguage.fromValue("*"); // HeaderAcceptLanguage | 
    String sFilter = "sFilter_example"; // String | 
    try {
      EzsignbulksendGetListV1Response result = apiInstance.ezsignbulksendGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsignbulksendApi#ezsignbulksendGetListV1");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eOrderBy** | **String**| Specify how you want the results to be sorted | [optional] [enum: pkiEzsignbulksendID_ASC, pkiEzsignbulksendID_DESC, fkiEzsignfoldertypeID_ASC, fkiEzsignfoldertypeID_DESC, sEzsignbulksendDescription_ASC, sEzsignbulksendDescription_DESC, sEzsignfoldertypeNameX_ASC, sEzsignfoldertypeNameX_DESC, eEzsignfoldertypePrivacylevel_ASC, eEzsignfoldertypePrivacylevel_DESC, bEzsignbulksendIsactive_ASC, bEzsignbulksendIsactive_DESC, iEzsignbulksendtransmission_ASC, iEzsignbulksendtransmission_DESC, iEzsignfolder_ASC, iEzsignfolder_DESC, iEzsigndocument_ASC, iEzsigndocument_DESC, iEzsignsignature_ASC, iEzsignsignature_DESC, iEzsignsignatureSigned_ASC, iEzsignsignatureSigned_DESC]
 **iRowMax** | **Integer**|  | [optional]
 **iRowOffset** | **Integer**|  | [optional]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr]
 **sFilter** | **String**|  | [optional]

### Return type

[**EzsignbulksendGetListV1Response**](EzsignbulksendGetListV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/vnd.openxmlformats-officedocument.spreadsheetml.sheet

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |
**406** | One of the accept header is not defined or invalid. |  -  |

<a name="ezsignbulksendGetObjectV1"></a>
# **ezsignbulksendGetObjectV1**
> EzsignbulksendGetObjectV1Response ezsignbulksendGetObjectV1(pkiEzsignbulksendID)

Retrieve an existing Ezsignbulksend



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsignbulksendApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsignbulksendApi apiInstance = new ObjectEzsignbulksendApi(defaultClient);
    Integer pkiEzsignbulksendID = 56; // Integer | 
    try {
      EzsignbulksendGetObjectV1Response result = apiInstance.ezsignbulksendGetObjectV1(pkiEzsignbulksendID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsignbulksendApi#ezsignbulksendGetObjectV1");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignbulksendID** | **Integer**|  |

### Return type

[**EzsignbulksendGetObjectV1Response**](EzsignbulksendGetObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |
**404** | The element you are trying to work on does not exist |  -  |

