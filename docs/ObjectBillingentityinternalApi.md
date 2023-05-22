# ObjectBillingentityinternalApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**billingentityinternalCreateObjectV1**](ObjectBillingentityinternalApi.md#billingentityinternalCreateObjectV1) | **POST** /1/object/billingentityinternal | Create a new Billingentityinternal |
| [**billingentityinternalEditObjectV1**](ObjectBillingentityinternalApi.md#billingentityinternalEditObjectV1) | **PUT** /1/object/billingentityinternal/{pkiBillingentityinternalID} | Edit an existing Billingentityinternal |
| [**billingentityinternalGetAutocompleteV2**](ObjectBillingentityinternalApi.md#billingentityinternalGetAutocompleteV2) | **GET** /2/object/billingentityinternal/getAutocomplete/{sSelector} | Retrieve Billingentityinternals and IDs |
| [**billingentityinternalGetListV1**](ObjectBillingentityinternalApi.md#billingentityinternalGetListV1) | **GET** /1/object/billingentityinternal/getList | Retrieve Billingentityinternal list |
| [**billingentityinternalGetObjectV2**](ObjectBillingentityinternalApi.md#billingentityinternalGetObjectV2) | **GET** /2/object/billingentityinternal/{pkiBillingentityinternalID} | Retrieve an existing Billingentityinternal |


<a id="billingentityinternalCreateObjectV1"></a>
# **billingentityinternalCreateObjectV1**
> BillingentityinternalCreateObjectV1Response billingentityinternalCreateObjectV1(billingentityinternalCreateObjectV1Request)

Create a new Billingentityinternal

The endpoint allows to create one or many elements at once.

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectBillingentityinternalApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectBillingentityinternalApi apiInstance = new ObjectBillingentityinternalApi(defaultClient);
    BillingentityinternalCreateObjectV1Request billingentityinternalCreateObjectV1Request = new BillingentityinternalCreateObjectV1Request(); // BillingentityinternalCreateObjectV1Request | 
    try {
      BillingentityinternalCreateObjectV1Response result = apiInstance.billingentityinternalCreateObjectV1(billingentityinternalCreateObjectV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectBillingentityinternalApi#billingentityinternalCreateObjectV1");
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
| **billingentityinternalCreateObjectV1Request** | [**BillingentityinternalCreateObjectV1Request**](BillingentityinternalCreateObjectV1Request.md)|  | |

### Return type

[**BillingentityinternalCreateObjectV1Response**](BillingentityinternalCreateObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful response |  -  |

<a id="billingentityinternalEditObjectV1"></a>
# **billingentityinternalEditObjectV1**
> BillingentityinternalEditObjectV1Response billingentityinternalEditObjectV1(pkiBillingentityinternalID, billingentityinternalEditObjectV1Request)

Edit an existing Billingentityinternal



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectBillingentityinternalApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectBillingentityinternalApi apiInstance = new ObjectBillingentityinternalApi(defaultClient);
    Integer pkiBillingentityinternalID = 56; // Integer | The unique ID of the Billingentityinternal
    BillingentityinternalEditObjectV1Request billingentityinternalEditObjectV1Request = new BillingentityinternalEditObjectV1Request(); // BillingentityinternalEditObjectV1Request | 
    try {
      BillingentityinternalEditObjectV1Response result = apiInstance.billingentityinternalEditObjectV1(pkiBillingentityinternalID, billingentityinternalEditObjectV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectBillingentityinternalApi#billingentityinternalEditObjectV1");
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
| **pkiBillingentityinternalID** | **Integer**| The unique ID of the Billingentityinternal | |
| **billingentityinternalEditObjectV1Request** | [**BillingentityinternalEditObjectV1Request**](BillingentityinternalEditObjectV1Request.md)|  | |

### Return type

[**BillingentityinternalEditObjectV1Response**](BillingentityinternalEditObjectV1Response.md)

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

<a id="billingentityinternalGetAutocompleteV2"></a>
# **billingentityinternalGetAutocompleteV2**
> BillingentityinternalGetAutocompleteV2Response billingentityinternalGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)

Retrieve Billingentityinternals and IDs

Get the list of Billingentityinternal to be used in a dropdown or autocomplete control.

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectBillingentityinternalApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectBillingentityinternalApi apiInstance = new ObjectBillingentityinternalApi(defaultClient);
    String sSelector = "All"; // String | The type of Billingentityinternals to return
    String eFilterActive = "All"; // String | Specify which results we want to display.
    String sQuery = "sQuery_example"; // String | Allow to filter the returned results
    HeaderAcceptLanguage acceptLanguage = HeaderAcceptLanguage.fromValue("*"); // HeaderAcceptLanguage | 
    try {
      BillingentityinternalGetAutocompleteV2Response result = apiInstance.billingentityinternalGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectBillingentityinternalApi#billingentityinternalGetAutocompleteV2");
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
| **sSelector** | **String**| The type of Billingentityinternals to return | [enum: All] |
| **eFilterActive** | **String**| Specify which results we want to display. | [optional] [default to Active] [enum: All, Active, Inactive] |
| **sQuery** | **String**| Allow to filter the returned results | [optional] |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |

### Return type

[**BillingentityinternalGetAutocompleteV2Response**](BillingentityinternalGetAutocompleteV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="billingentityinternalGetListV1"></a>
# **billingentityinternalGetListV1**
> BillingentityinternalGetListV1Response billingentityinternalGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Billingentityinternal list



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectBillingentityinternalApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectBillingentityinternalApi apiInstance = new ObjectBillingentityinternalApi(defaultClient);
    String eOrderBy = "pkiBillingentityinternalID_ASC"; // String | Specify how you want the results to be sorted
    Integer iRowMax = 10000; // Integer | 
    Integer iRowOffset = 0; // Integer | 
    HeaderAcceptLanguage acceptLanguage = HeaderAcceptLanguage.fromValue("*"); // HeaderAcceptLanguage | 
    String sFilter = "sFilter_example"; // String | 
    try {
      BillingentityinternalGetListV1Response result = apiInstance.billingentityinternalGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectBillingentityinternalApi#billingentityinternalGetListV1");
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
| **eOrderBy** | **String**| Specify how you want the results to be sorted | [optional] [enum: pkiBillingentityinternalID_ASC, pkiBillingentityinternalID_DESC, sBillingentityinternalDescriptionX_ASC, sBillingentityinternalDescriptionX_DESC] |
| **iRowMax** | **Integer**|  | [optional] [default to 10000] |
| **iRowOffset** | **Integer**|  | [optional] [default to 0] |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |
| **sFilter** | **String**|  | [optional] |

### Return type

[**BillingentityinternalGetListV1Response**](BillingentityinternalGetListV1Response.md)

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

<a id="billingentityinternalGetObjectV2"></a>
# **billingentityinternalGetObjectV2**
> BillingentityinternalGetObjectV2Response billingentityinternalGetObjectV2(pkiBillingentityinternalID)

Retrieve an existing Billingentityinternal



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectBillingentityinternalApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectBillingentityinternalApi apiInstance = new ObjectBillingentityinternalApi(defaultClient);
    Integer pkiBillingentityinternalID = 56; // Integer | The unique ID of the Billingentityinternal
    try {
      BillingentityinternalGetObjectV2Response result = apiInstance.billingentityinternalGetObjectV2(pkiBillingentityinternalID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectBillingentityinternalApi#billingentityinternalGetObjectV2");
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
| **pkiBillingentityinternalID** | **Integer**| The unique ID of the Billingentityinternal | |

### Return type

[**BillingentityinternalGetObjectV2Response**](BillingentityinternalGetObjectV2Response.md)

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

