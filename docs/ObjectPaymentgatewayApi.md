# ObjectPaymentgatewayApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**paymentgatewayCreateObjectV1**](ObjectPaymentgatewayApi.md#paymentgatewayCreateObjectV1) | **POST** /1/object/paymentgateway | Create a new Paymentgateway |
| [**paymentgatewayEditObjectV1**](ObjectPaymentgatewayApi.md#paymentgatewayEditObjectV1) | **PUT** /1/object/paymentgateway/{pkiPaymentgatewayID} | Edit an existing Paymentgateway |
| [**paymentgatewayGetAutocompleteV2**](ObjectPaymentgatewayApi.md#paymentgatewayGetAutocompleteV2) | **GET** /2/object/paymentgateway/getAutocomplete/{sSelector} | Retrieve Paymentgateways and IDs |
| [**paymentgatewayGetListV1**](ObjectPaymentgatewayApi.md#paymentgatewayGetListV1) | **GET** /1/object/paymentgateway/getList | Retrieve Paymentgateway list |
| [**paymentgatewayGetObjectV2**](ObjectPaymentgatewayApi.md#paymentgatewayGetObjectV2) | **GET** /2/object/paymentgateway/{pkiPaymentgatewayID} | Retrieve an existing Paymentgateway |


<a id="paymentgatewayCreateObjectV1"></a>
# **paymentgatewayCreateObjectV1**
> PaymentgatewayCreateObjectV1Response paymentgatewayCreateObjectV1(paymentgatewayCreateObjectV1Request)

Create a new Paymentgateway

The endpoint allows to create one or many elements at once.

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectPaymentgatewayApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectPaymentgatewayApi apiInstance = new ObjectPaymentgatewayApi(defaultClient);
    PaymentgatewayCreateObjectV1Request paymentgatewayCreateObjectV1Request = new PaymentgatewayCreateObjectV1Request(); // PaymentgatewayCreateObjectV1Request | 
    try {
      PaymentgatewayCreateObjectV1Response result = apiInstance.paymentgatewayCreateObjectV1(paymentgatewayCreateObjectV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectPaymentgatewayApi#paymentgatewayCreateObjectV1");
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
| **paymentgatewayCreateObjectV1Request** | [**PaymentgatewayCreateObjectV1Request**](PaymentgatewayCreateObjectV1Request.md)|  | |

### Return type

[**PaymentgatewayCreateObjectV1Response**](PaymentgatewayCreateObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful response |  -  |

<a id="paymentgatewayEditObjectV1"></a>
# **paymentgatewayEditObjectV1**
> PaymentgatewayEditObjectV1Response paymentgatewayEditObjectV1(pkiPaymentgatewayID, paymentgatewayEditObjectV1Request)

Edit an existing Paymentgateway



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectPaymentgatewayApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectPaymentgatewayApi apiInstance = new ObjectPaymentgatewayApi(defaultClient);
    Integer pkiPaymentgatewayID = 56; // Integer | The unique ID of the Paymentgateway
    PaymentgatewayEditObjectV1Request paymentgatewayEditObjectV1Request = new PaymentgatewayEditObjectV1Request(); // PaymentgatewayEditObjectV1Request | 
    try {
      PaymentgatewayEditObjectV1Response result = apiInstance.paymentgatewayEditObjectV1(pkiPaymentgatewayID, paymentgatewayEditObjectV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectPaymentgatewayApi#paymentgatewayEditObjectV1");
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
| **pkiPaymentgatewayID** | **Integer**| The unique ID of the Paymentgateway | |
| **paymentgatewayEditObjectV1Request** | [**PaymentgatewayEditObjectV1Request**](PaymentgatewayEditObjectV1Request.md)|  | |

### Return type

[**PaymentgatewayEditObjectV1Response**](PaymentgatewayEditObjectV1Response.md)

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

<a id="paymentgatewayGetAutocompleteV2"></a>
# **paymentgatewayGetAutocompleteV2**
> PaymentgatewayGetAutocompleteV2Response paymentgatewayGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)

Retrieve Paymentgateways and IDs

Get the list of Paymentgateway to be used in a dropdown or autocomplete control.

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectPaymentgatewayApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectPaymentgatewayApi apiInstance = new ObjectPaymentgatewayApi(defaultClient);
    String sSelector = "All"; // String | The type of Paymentgateways to return
    String eFilterActive = "All"; // String | Specify which results we want to display.
    String sQuery = "sQuery_example"; // String | Allow to filter the returned results
    HeaderAcceptLanguage acceptLanguage = HeaderAcceptLanguage.fromValue("*"); // HeaderAcceptLanguage | 
    try {
      PaymentgatewayGetAutocompleteV2Response result = apiInstance.paymentgatewayGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectPaymentgatewayApi#paymentgatewayGetAutocompleteV2");
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
| **sSelector** | **String**| The type of Paymentgateways to return | [enum: All] |
| **eFilterActive** | **String**| Specify which results we want to display. | [optional] [default to Active] [enum: All, Active, Inactive] |
| **sQuery** | **String**| Allow to filter the returned results | [optional] |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |

### Return type

[**PaymentgatewayGetAutocompleteV2Response**](PaymentgatewayGetAutocompleteV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="paymentgatewayGetListV1"></a>
# **paymentgatewayGetListV1**
> PaymentgatewayGetListV1Response paymentgatewayGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Paymentgateway list

Enum values that can be filtered in query parameter *sFilter*:  | Variable | Valid values | |---|---| | ePaymentgatewayProcessor | Moneris |

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectPaymentgatewayApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectPaymentgatewayApi apiInstance = new ObjectPaymentgatewayApi(defaultClient);
    String eOrderBy = "pkiPaymentgatewayID_ASC"; // String | Specify how you want the results to be sorted
    Integer iRowMax = 56; // Integer | 
    Integer iRowOffset = 0; // Integer | 
    HeaderAcceptLanguage acceptLanguage = HeaderAcceptLanguage.fromValue("*"); // HeaderAcceptLanguage | 
    String sFilter = "sFilter_example"; // String | 
    try {
      PaymentgatewayGetListV1Response result = apiInstance.paymentgatewayGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectPaymentgatewayApi#paymentgatewayGetListV1");
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
| **eOrderBy** | **String**| Specify how you want the results to be sorted | [optional] [enum: pkiPaymentgatewayID_ASC, pkiPaymentgatewayID_DESC, fkiCreditcardmerchantID_ASC, fkiCreditcardmerchantID_DESC, ePaymentgatewayProcessor_ASC, ePaymentgatewayProcessor_DESC] |
| **iRowMax** | **Integer**|  | [optional] |
| **iRowOffset** | **Integer**|  | [optional] [default to 0] |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |
| **sFilter** | **String**|  | [optional] |

### Return type

[**PaymentgatewayGetListV1Response**](PaymentgatewayGetListV1Response.md)

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

<a id="paymentgatewayGetObjectV2"></a>
# **paymentgatewayGetObjectV2**
> PaymentgatewayGetObjectV2Response paymentgatewayGetObjectV2(pkiPaymentgatewayID)

Retrieve an existing Paymentgateway



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectPaymentgatewayApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectPaymentgatewayApi apiInstance = new ObjectPaymentgatewayApi(defaultClient);
    Integer pkiPaymentgatewayID = 56; // Integer | The unique ID of the Paymentgateway
    try {
      PaymentgatewayGetObjectV2Response result = apiInstance.paymentgatewayGetObjectV2(pkiPaymentgatewayID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectPaymentgatewayApi#paymentgatewayGetObjectV2");
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
| **pkiPaymentgatewayID** | **Integer**| The unique ID of the Paymentgateway | |

### Return type

[**PaymentgatewayGetObjectV2Response**](PaymentgatewayGetObjectV2Response.md)

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

