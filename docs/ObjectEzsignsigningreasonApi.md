# ObjectEzsignsigningreasonApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**ezsignsigningreasonCreateObjectV1**](ObjectEzsignsigningreasonApi.md#ezsignsigningreasonCreateObjectV1) | **POST** /1/object/ezsignsigningreason | Create a new Ezsignsigningreason |
| [**ezsignsigningreasonEditObjectV1**](ObjectEzsignsigningreasonApi.md#ezsignsigningreasonEditObjectV1) | **PUT** /1/object/ezsignsigningreason/{pkiEzsignsigningreasonID} | Edit an existing Ezsignsigningreason |
| [**ezsignsigningreasonGetAutocompleteV2**](ObjectEzsignsigningreasonApi.md#ezsignsigningreasonGetAutocompleteV2) | **GET** /2/object/ezsignsigningreason/getAutocomplete/{sSelector} | Retrieve Ezsignsigningreasons and IDs |
| [**ezsignsigningreasonGetListV1**](ObjectEzsignsigningreasonApi.md#ezsignsigningreasonGetListV1) | **GET** /1/object/ezsignsigningreason/getList | Retrieve Ezsignsigningreason list |
| [**ezsignsigningreasonGetObjectV2**](ObjectEzsignsigningreasonApi.md#ezsignsigningreasonGetObjectV2) | **GET** /2/object/ezsignsigningreason/{pkiEzsignsigningreasonID} | Retrieve an existing Ezsignsigningreason |


<a id="ezsignsigningreasonCreateObjectV1"></a>
# **ezsignsigningreasonCreateObjectV1**
> EzsignsigningreasonCreateObjectV1Response ezsignsigningreasonCreateObjectV1(ezsignsigningreasonCreateObjectV1Request)

Create a new Ezsignsigningreason

The endpoint allows to create one or many elements at once.

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsignsigningreasonApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsignsigningreasonApi apiInstance = new ObjectEzsignsigningreasonApi(defaultClient);
    EzsignsigningreasonCreateObjectV1Request ezsignsigningreasonCreateObjectV1Request = new EzsignsigningreasonCreateObjectV1Request(); // EzsignsigningreasonCreateObjectV1Request | 
    try {
      EzsignsigningreasonCreateObjectV1Response result = apiInstance.ezsignsigningreasonCreateObjectV1(ezsignsigningreasonCreateObjectV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsignsigningreasonApi#ezsignsigningreasonCreateObjectV1");
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
| **ezsignsigningreasonCreateObjectV1Request** | [**EzsignsigningreasonCreateObjectV1Request**](EzsignsigningreasonCreateObjectV1Request.md)|  | |

### Return type

[**EzsignsigningreasonCreateObjectV1Response**](EzsignsigningreasonCreateObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful response |  -  |

<a id="ezsignsigningreasonEditObjectV1"></a>
# **ezsignsigningreasonEditObjectV1**
> CommonResponse ezsignsigningreasonEditObjectV1(pkiEzsignsigningreasonID, ezsignsigningreasonEditObjectV1Request)

Edit an existing Ezsignsigningreason



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsignsigningreasonApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsignsigningreasonApi apiInstance = new ObjectEzsignsigningreasonApi(defaultClient);
    Integer pkiEzsignsigningreasonID = 56; // Integer | The unique ID of the Ezsignsigningreason
    EzsignsigningreasonEditObjectV1Request ezsignsigningreasonEditObjectV1Request = new EzsignsigningreasonEditObjectV1Request(); // EzsignsigningreasonEditObjectV1Request | 
    try {
      CommonResponse result = apiInstance.ezsignsigningreasonEditObjectV1(pkiEzsignsigningreasonID, ezsignsigningreasonEditObjectV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsignsigningreasonApi#ezsignsigningreasonEditObjectV1");
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
| **pkiEzsignsigningreasonID** | **Integer**| The unique ID of the Ezsignsigningreason | |
| **ezsignsigningreasonEditObjectV1Request** | [**EzsignsigningreasonEditObjectV1Request**](EzsignsigningreasonEditObjectV1Request.md)|  | |

### Return type

[**CommonResponse**](CommonResponse.md)

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

<a id="ezsignsigningreasonGetAutocompleteV2"></a>
# **ezsignsigningreasonGetAutocompleteV2**
> EzsignsigningreasonGetAutocompleteV2Response ezsignsigningreasonGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)

Retrieve Ezsignsigningreasons and IDs

Get the list of Ezsignsigningreason to be used in a dropdown or autocomplete control.

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsignsigningreasonApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsignsigningreasonApi apiInstance = new ObjectEzsignsigningreasonApi(defaultClient);
    String sSelector = "All"; // String | The type of Ezsignsigningreasons to return
    String eFilterActive = "All"; // String | Specify which results we want to display.
    String sQuery = "sQuery_example"; // String | Allow to filter the returned results
    HeaderAcceptLanguage acceptLanguage = HeaderAcceptLanguage.fromValue("*"); // HeaderAcceptLanguage | 
    try {
      EzsignsigningreasonGetAutocompleteV2Response result = apiInstance.ezsignsigningreasonGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsignsigningreasonApi#ezsignsigningreasonGetAutocompleteV2");
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
| **sSelector** | **String**| The type of Ezsignsigningreasons to return | [enum: All, Active] |
| **eFilterActive** | **String**| Specify which results we want to display. | [optional] [default to Active] [enum: All, Active, Inactive] |
| **sQuery** | **String**| Allow to filter the returned results | [optional] |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |

### Return type

[**EzsignsigningreasonGetAutocompleteV2Response**](EzsignsigningreasonGetAutocompleteV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="ezsignsigningreasonGetListV1"></a>
# **ezsignsigningreasonGetListV1**
> EzsignsigningreasonGetListV1Response ezsignsigningreasonGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Ezsignsigningreason list



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsignsigningreasonApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsignsigningreasonApi apiInstance = new ObjectEzsignsigningreasonApi(defaultClient);
    String eOrderBy = "pkiEzsignsigningreasonID_ASC"; // String | Specify how you want the results to be sorted
    Integer iRowMax = 56; // Integer | 
    Integer iRowOffset = 0; // Integer | 
    HeaderAcceptLanguage acceptLanguage = HeaderAcceptLanguage.fromValue("*"); // HeaderAcceptLanguage | 
    String sFilter = "sFilter_example"; // String | 
    try {
      EzsignsigningreasonGetListV1Response result = apiInstance.ezsignsigningreasonGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsignsigningreasonApi#ezsignsigningreasonGetListV1");
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
| **eOrderBy** | **String**| Specify how you want the results to be sorted | [optional] [enum: pkiEzsignsigningreasonID_ASC, pkiEzsignsigningreasonID_DESC, sEzsignsigningreasonDescriptionX_ASC, sEzsignsigningreasonDescriptionX_DESC, bEzsignsigningreasonIsactive_ASC, bEzsignsigningreasonIsactive_DESC] |
| **iRowMax** | **Integer**|  | [optional] |
| **iRowOffset** | **Integer**|  | [optional] [default to 0] |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |
| **sFilter** | **String**|  | [optional] |

### Return type

[**EzsignsigningreasonGetListV1Response**](EzsignsigningreasonGetListV1Response.md)

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

<a id="ezsignsigningreasonGetObjectV2"></a>
# **ezsignsigningreasonGetObjectV2**
> EzsignsigningreasonGetObjectV2Response ezsignsigningreasonGetObjectV2(pkiEzsignsigningreasonID)

Retrieve an existing Ezsignsigningreason



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsignsigningreasonApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsignsigningreasonApi apiInstance = new ObjectEzsignsigningreasonApi(defaultClient);
    Integer pkiEzsignsigningreasonID = 56; // Integer | The unique ID of the Ezsignsigningreason
    try {
      EzsignsigningreasonGetObjectV2Response result = apiInstance.ezsignsigningreasonGetObjectV2(pkiEzsignsigningreasonID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsignsigningreasonApi#ezsignsigningreasonGetObjectV2");
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
| **pkiEzsignsigningreasonID** | **Integer**| The unique ID of the Ezsignsigningreason | |

### Return type

[**EzsignsigningreasonGetObjectV2Response**](EzsignsigningreasonGetObjectV2Response.md)

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

