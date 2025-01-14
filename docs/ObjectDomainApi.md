# ObjectDomainApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**domainCreateObjectV1**](ObjectDomainApi.md#domainCreateObjectV1) | **POST** /1/object/domain | Create a new Domain |
| [**domainDeleteObjectV1**](ObjectDomainApi.md#domainDeleteObjectV1) | **DELETE** /1/object/domain/{pkiDomainID} | Delete an existing Domain |
| [**domainGetListV1**](ObjectDomainApi.md#domainGetListV1) | **GET** /1/object/domain/getList | Retrieve Domain list |
| [**domainGetObjectV2**](ObjectDomainApi.md#domainGetObjectV2) | **GET** /2/object/domain/{pkiDomainID} | Retrieve an existing Domain |


<a id="domainCreateObjectV1"></a>
# **domainCreateObjectV1**
> DomainCreateObjectV1Response domainCreateObjectV1(domainCreateObjectV1Request)

Create a new Domain

The endpoint allows to create one or many elements at once.

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectDomainApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectDomainApi apiInstance = new ObjectDomainApi(defaultClient);
    DomainCreateObjectV1Request domainCreateObjectV1Request = new DomainCreateObjectV1Request(); // DomainCreateObjectV1Request | 
    try {
      DomainCreateObjectV1Response result = apiInstance.domainCreateObjectV1(domainCreateObjectV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectDomainApi#domainCreateObjectV1");
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
| **domainCreateObjectV1Request** | [**DomainCreateObjectV1Request**](DomainCreateObjectV1Request.md)|  | |

### Return type

[**DomainCreateObjectV1Response**](DomainCreateObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful response |  -  |

<a id="domainDeleteObjectV1"></a>
# **domainDeleteObjectV1**
> DomainDeleteObjectV1Response domainDeleteObjectV1(pkiDomainID)

Delete an existing Domain



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectDomainApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectDomainApi apiInstance = new ObjectDomainApi(defaultClient);
    Integer pkiDomainID = 56; // Integer | The unique ID of the Domain
    try {
      DomainDeleteObjectV1Response result = apiInstance.domainDeleteObjectV1(pkiDomainID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectDomainApi#domainDeleteObjectV1");
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
| **pkiDomainID** | **Integer**| The unique ID of the Domain | |

### Return type

[**DomainDeleteObjectV1Response**](DomainDeleteObjectV1Response.md)

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

<a id="domainGetListV1"></a>
# **domainGetListV1**
> DomainGetListV1Response domainGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Domain list



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectDomainApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectDomainApi apiInstance = new ObjectDomainApi(defaultClient);
    String eOrderBy = "pkiDomainID_ASC"; // String | Specify how you want the results to be sorted
    Integer iRowMax = 56; // Integer | 
    Integer iRowOffset = 0; // Integer | 
    HeaderAcceptLanguage acceptLanguage = HeaderAcceptLanguage.fromValue("*"); // HeaderAcceptLanguage | 
    String sFilter = "sFilter_example"; // String | 
    try {
      DomainGetListV1Response result = apiInstance.domainGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectDomainApi#domainGetListV1");
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
| **eOrderBy** | **String**| Specify how you want the results to be sorted | [optional] [enum: pkiDomainID_ASC, pkiDomainID_DESC, sDomainName_ASC, sDomainName_DESC] |
| **iRowMax** | **Integer**|  | [optional] |
| **iRowOffset** | **Integer**|  | [optional] [default to 0] |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |
| **sFilter** | **String**|  | [optional] |

### Return type

[**DomainGetListV1Response**](DomainGetListV1Response.md)

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

<a id="domainGetObjectV2"></a>
# **domainGetObjectV2**
> DomainGetObjectV2Response domainGetObjectV2(pkiDomainID)

Retrieve an existing Domain



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectDomainApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectDomainApi apiInstance = new ObjectDomainApi(defaultClient);
    Integer pkiDomainID = 56; // Integer | The unique ID of the Domain
    try {
      DomainGetObjectV2Response result = apiInstance.domainGetObjectV2(pkiDomainID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectDomainApi#domainGetObjectV2");
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
| **pkiDomainID** | **Integer**| The unique ID of the Domain | |

### Return type

[**DomainGetObjectV2Response**](DomainGetObjectV2Response.md)

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

