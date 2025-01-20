# ObjectCreditcardclientApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**creditcardclientCreateObjectV1**](ObjectCreditcardclientApi.md#creditcardclientCreateObjectV1) | **POST** /1/object/creditcardclient | Create a new Creditcardclient |
| [**creditcardclientDeleteObjectV1**](ObjectCreditcardclientApi.md#creditcardclientDeleteObjectV1) | **DELETE** /1/object/creditcardclient/{pkiCreditcardclientID} | Delete an existing Creditcardclient |
| [**creditcardclientEditObjectV1**](ObjectCreditcardclientApi.md#creditcardclientEditObjectV1) | **PUT** /1/object/creditcardclient/{pkiCreditcardclientID} | Edit an existing Creditcardclient |
| [**creditcardclientGetAutocompleteV2**](ObjectCreditcardclientApi.md#creditcardclientGetAutocompleteV2) | **GET** /2/object/creditcardclient/getAutocomplete/{sSelector} | Retrieve Creditcardclients and IDs |
| [**creditcardclientGetListV1**](ObjectCreditcardclientApi.md#creditcardclientGetListV1) | **GET** /1/object/creditcardclient/getList | Retrieve Creditcardclient list |
| [**creditcardclientGetObjectV2**](ObjectCreditcardclientApi.md#creditcardclientGetObjectV2) | **GET** /2/object/creditcardclient/{pkiCreditcardclientID} | Retrieve an existing Creditcardclient |
| [**creditcardclientPatchObjectV1**](ObjectCreditcardclientApi.md#creditcardclientPatchObjectV1) | **PATCH** /1/object/creditcardclient/{pkiCreditcardclientID} | Patch an existing Creditcardclient |


<a id="creditcardclientCreateObjectV1"></a>
# **creditcardclientCreateObjectV1**
> CreditcardclientCreateObjectV1Response creditcardclientCreateObjectV1(creditcardclientCreateObjectV1Request)

Create a new Creditcardclient

The endpoint allows to create one or many elements at once.

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectCreditcardclientApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectCreditcardclientApi apiInstance = new ObjectCreditcardclientApi(defaultClient);
    CreditcardclientCreateObjectV1Request creditcardclientCreateObjectV1Request = new CreditcardclientCreateObjectV1Request(); // CreditcardclientCreateObjectV1Request | 
    try {
      CreditcardclientCreateObjectV1Response result = apiInstance.creditcardclientCreateObjectV1(creditcardclientCreateObjectV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectCreditcardclientApi#creditcardclientCreateObjectV1");
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
| **creditcardclientCreateObjectV1Request** | [**CreditcardclientCreateObjectV1Request**](CreditcardclientCreateObjectV1Request.md)|  | |

### Return type

[**CreditcardclientCreateObjectV1Response**](CreditcardclientCreateObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful response |  -  |
| **422** | The request was syntactically valid but failed because of an interdependance condition. Look for detail about the error in the body. |  -  |

<a id="creditcardclientDeleteObjectV1"></a>
# **creditcardclientDeleteObjectV1**
> CommonResponse creditcardclientDeleteObjectV1(pkiCreditcardclientID)

Delete an existing Creditcardclient



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectCreditcardclientApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectCreditcardclientApi apiInstance = new ObjectCreditcardclientApi(defaultClient);
    Integer pkiCreditcardclientID = 56; // Integer | The unique ID of the Creditcardclient
    try {
      CommonResponse result = apiInstance.creditcardclientDeleteObjectV1(pkiCreditcardclientID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectCreditcardclientApi#creditcardclientDeleteObjectV1");
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
| **pkiCreditcardclientID** | **Integer**| The unique ID of the Creditcardclient | |

### Return type

[**CommonResponse**](CommonResponse.md)

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

<a id="creditcardclientEditObjectV1"></a>
# **creditcardclientEditObjectV1**
> CommonResponse creditcardclientEditObjectV1(pkiCreditcardclientID, creditcardclientEditObjectV1Request)

Edit an existing Creditcardclient



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectCreditcardclientApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectCreditcardclientApi apiInstance = new ObjectCreditcardclientApi(defaultClient);
    Integer pkiCreditcardclientID = 56; // Integer | The unique ID of the Creditcardclient
    CreditcardclientEditObjectV1Request creditcardclientEditObjectV1Request = new CreditcardclientEditObjectV1Request(); // CreditcardclientEditObjectV1Request | 
    try {
      CommonResponse result = apiInstance.creditcardclientEditObjectV1(pkiCreditcardclientID, creditcardclientEditObjectV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectCreditcardclientApi#creditcardclientEditObjectV1");
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
| **pkiCreditcardclientID** | **Integer**| The unique ID of the Creditcardclient | |
| **creditcardclientEditObjectV1Request** | [**CreditcardclientEditObjectV1Request**](CreditcardclientEditObjectV1Request.md)|  | |

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
| **422** | The request was syntactically valid but failed because of an interdependance condition. Look for detail about the error in the body. |  -  |

<a id="creditcardclientGetAutocompleteV2"></a>
# **creditcardclientGetAutocompleteV2**
> CreditcardclientGetAutocompleteV2Response creditcardclientGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)

Retrieve Creditcardclients and IDs

Get the list of Creditcardclient to be used in a dropdown or autocomplete control.

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectCreditcardclientApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectCreditcardclientApi apiInstance = new ObjectCreditcardclientApi(defaultClient);
    String sSelector = "All"; // String | The type of Creditcardclients to return
    String eFilterActive = "All"; // String | Specify which results we want to display.
    String sQuery = "sQuery_example"; // String | Allow to filter the returned results
    HeaderAcceptLanguage acceptLanguage = HeaderAcceptLanguage.fromValue("*"); // HeaderAcceptLanguage | 
    try {
      CreditcardclientGetAutocompleteV2Response result = apiInstance.creditcardclientGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectCreditcardclientApi#creditcardclientGetAutocompleteV2");
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
| **sSelector** | **String**| The type of Creditcardclients to return | [enum: All] |
| **eFilterActive** | **String**| Specify which results we want to display. | [optional] [default to Active] [enum: All, Active, Inactive] |
| **sQuery** | **String**| Allow to filter the returned results | [optional] |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |

### Return type

[**CreditcardclientGetAutocompleteV2Response**](CreditcardclientGetAutocompleteV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="creditcardclientGetListV1"></a>
# **creditcardclientGetListV1**
> CreditcardclientGetListV1Response creditcardclientGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Creditcardclient list



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectCreditcardclientApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectCreditcardclientApi apiInstance = new ObjectCreditcardclientApi(defaultClient);
    String eOrderBy = "pkiCreditcardclientID_ASC"; // String | Specify how you want the results to be sorted
    Integer iRowMax = 56; // Integer | 
    Integer iRowOffset = 0; // Integer | 
    HeaderAcceptLanguage acceptLanguage = HeaderAcceptLanguage.fromValue("*"); // HeaderAcceptLanguage | 
    String sFilter = "sFilter_example"; // String | 
    try {
      CreditcardclientGetListV1Response result = apiInstance.creditcardclientGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectCreditcardclientApi#creditcardclientGetListV1");
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
| **eOrderBy** | **String**| Specify how you want the results to be sorted | [optional] [enum: pkiCreditcardclientID_ASC, pkiCreditcardclientID_DESC, fkiCreditcarddetailID_ASC, fkiCreditcarddetailID_DESC, fkiCreditcardtypeID_ASC, fkiCreditcardtypeID_DESC, bCreditcardclientrelationIsdefault_ASC, bCreditcardclientrelationIsdefault_DESC, sCreditcardclientDescription_ASC, sCreditcardclientDescription_DESC, bCreditcardclientIsactive_ASC, bCreditcardclientIsactive_DESC, bCreditcardclientAllowedagencypayment_ASC, bCreditcardclientAllowedagencypayment_DESC, bCreditcardclientAllowedtranquillit_ASC, bCreditcardclientAllowedtranquillit_DESC, iCreditcarddetailExpirationmonth_ASC, iCreditcarddetailExpirationmonth_DESC, iCreditcarddetailExpirationyear_ASC, iCreditcarddetailExpirationyear_DESC] |
| **iRowMax** | **Integer**|  | [optional] |
| **iRowOffset** | **Integer**|  | [optional] [default to 0] |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |
| **sFilter** | **String**|  | [optional] |

### Return type

[**CreditcardclientGetListV1Response**](CreditcardclientGetListV1Response.md)

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

<a id="creditcardclientGetObjectV2"></a>
# **creditcardclientGetObjectV2**
> CreditcardclientGetObjectV2Response creditcardclientGetObjectV2(pkiCreditcardclientID)

Retrieve an existing Creditcardclient



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectCreditcardclientApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectCreditcardclientApi apiInstance = new ObjectCreditcardclientApi(defaultClient);
    Integer pkiCreditcardclientID = 56; // Integer | The unique ID of the Creditcardclient
    try {
      CreditcardclientGetObjectV2Response result = apiInstance.creditcardclientGetObjectV2(pkiCreditcardclientID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectCreditcardclientApi#creditcardclientGetObjectV2");
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
| **pkiCreditcardclientID** | **Integer**| The unique ID of the Creditcardclient | |

### Return type

[**CreditcardclientGetObjectV2Response**](CreditcardclientGetObjectV2Response.md)

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

<a id="creditcardclientPatchObjectV1"></a>
# **creditcardclientPatchObjectV1**
> CommonResponse creditcardclientPatchObjectV1(pkiCreditcardclientID, creditcardclientPatchObjectV1Request)

Patch an existing Creditcardclient



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectCreditcardclientApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectCreditcardclientApi apiInstance = new ObjectCreditcardclientApi(defaultClient);
    Integer pkiCreditcardclientID = 56; // Integer | The unique ID of the Creditcardclient
    CreditcardclientPatchObjectV1Request creditcardclientPatchObjectV1Request = new CreditcardclientPatchObjectV1Request(); // CreditcardclientPatchObjectV1Request | 
    try {
      CommonResponse result = apiInstance.creditcardclientPatchObjectV1(pkiCreditcardclientID, creditcardclientPatchObjectV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectCreditcardclientApi#creditcardclientPatchObjectV1");
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
| **pkiCreditcardclientID** | **Integer**| The unique ID of the Creditcardclient | |
| **creditcardclientPatchObjectV1Request** | [**CreditcardclientPatchObjectV1Request**](CreditcardclientPatchObjectV1Request.md)|  | |

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

