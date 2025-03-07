# ObjectEzsignimportfolderApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**ezsignimportfolderDeleteObjectV1**](ObjectEzsignimportfolderApi.md#ezsignimportfolderDeleteObjectV1) | **DELETE** /1/object/ezsignimportfolder/{pkiEzsignimportfolderID} | Delete an existing Ezsignimportfolder |
| [**ezsignimportfolderGetListV1**](ObjectEzsignimportfolderApi.md#ezsignimportfolderGetListV1) | **GET** /1/object/ezsignimportfolder/getList | Retrieve Ezsignimportfolder list |
| [**ezsignimportfolderGetObjectV2**](ObjectEzsignimportfolderApi.md#ezsignimportfolderGetObjectV2) | **GET** /2/object/ezsignimportfolder/{pkiEzsignimportfolderID} | Retrieve an existing Ezsignimportfolder |


<a id="ezsignimportfolderDeleteObjectV1"></a>
# **ezsignimportfolderDeleteObjectV1**
> EzsignimportfolderDeleteObjectV1Response ezsignimportfolderDeleteObjectV1(pkiEzsignimportfolderID)

Delete an existing Ezsignimportfolder



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsignimportfolderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsignimportfolderApi apiInstance = new ObjectEzsignimportfolderApi(defaultClient);
    Integer pkiEzsignimportfolderID = 56; // Integer | The unique ID of the Ezsignimportfolder
    try {
      EzsignimportfolderDeleteObjectV1Response result = apiInstance.ezsignimportfolderDeleteObjectV1(pkiEzsignimportfolderID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsignimportfolderApi#ezsignimportfolderDeleteObjectV1");
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
| **pkiEzsignimportfolderID** | **Integer**| The unique ID of the Ezsignimportfolder | |

### Return type

[**EzsignimportfolderDeleteObjectV1Response**](EzsignimportfolderDeleteObjectV1Response.md)

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

<a id="ezsignimportfolderGetListV1"></a>
# **ezsignimportfolderGetListV1**
> EzsignimportfolderGetListV1Response ezsignimportfolderGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Ezsignimportfolder list



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsignimportfolderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsignimportfolderApi apiInstance = new ObjectEzsignimportfolderApi(defaultClient);
    String eOrderBy = "pkiEzsignimportfolderID_ASC"; // String | Specify how you want the results to be sorted
    Integer iRowMax = 56; // Integer | 
    Integer iRowOffset = 0; // Integer | 
    HeaderAcceptLanguage acceptLanguage = HeaderAcceptLanguage.fromValue("*"); // HeaderAcceptLanguage | 
    String sFilter = "sFilter_example"; // String | 
    try {
      EzsignimportfolderGetListV1Response result = apiInstance.ezsignimportfolderGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsignimportfolderApi#ezsignimportfolderGetListV1");
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
| **eOrderBy** | **String**| Specify how you want the results to be sorted | [optional] [enum: pkiEzsignimportfolderID_ASC, pkiEzsignimportfolderID_DESC, sEzsignimportfolderName_ASC, sEzsignimportfolderName_DESC] |
| **iRowMax** | **Integer**|  | [optional] |
| **iRowOffset** | **Integer**|  | [optional] [default to 0] |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |
| **sFilter** | **String**|  | [optional] |

### Return type

[**EzsignimportfolderGetListV1Response**](EzsignimportfolderGetListV1Response.md)

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

<a id="ezsignimportfolderGetObjectV2"></a>
# **ezsignimportfolderGetObjectV2**
> EzsignimportfolderGetObjectV2Response ezsignimportfolderGetObjectV2(pkiEzsignimportfolderID)

Retrieve an existing Ezsignimportfolder



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsignimportfolderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsignimportfolderApi apiInstance = new ObjectEzsignimportfolderApi(defaultClient);
    Integer pkiEzsignimportfolderID = 56; // Integer | The unique ID of the Ezsignimportfolder
    try {
      EzsignimportfolderGetObjectV2Response result = apiInstance.ezsignimportfolderGetObjectV2(pkiEzsignimportfolderID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsignimportfolderApi#ezsignimportfolderGetObjectV2");
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
| **pkiEzsignimportfolderID** | **Integer**| The unique ID of the Ezsignimportfolder | |

### Return type

[**EzsignimportfolderGetObjectV2Response**](EzsignimportfolderGetObjectV2Response.md)

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

