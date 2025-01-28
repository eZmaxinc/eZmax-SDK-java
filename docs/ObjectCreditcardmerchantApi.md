# ObjectCreditcardmerchantApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**creditcardmerchantCreateObjectV1**](ObjectCreditcardmerchantApi.md#creditcardmerchantCreateObjectV1) | **POST** /1/object/creditcardmerchant | Create a new Creditcardmerchant |
| [**creditcardmerchantDeleteObjectV1**](ObjectCreditcardmerchantApi.md#creditcardmerchantDeleteObjectV1) | **DELETE** /1/object/creditcardmerchant/{pkiCreditcardmerchantID} | Delete an existing Creditcardmerchant |
| [**creditcardmerchantEditObjectV1**](ObjectCreditcardmerchantApi.md#creditcardmerchantEditObjectV1) | **PUT** /1/object/creditcardmerchant/{pkiCreditcardmerchantID} | Edit an existing Creditcardmerchant |
| [**creditcardmerchantGetAutocompleteV2**](ObjectCreditcardmerchantApi.md#creditcardmerchantGetAutocompleteV2) | **GET** /2/object/creditcardmerchant/getAutocomplete/{sSelector} | Retrieve Creditcardmerchants and IDs |
| [**creditcardmerchantGetListV1**](ObjectCreditcardmerchantApi.md#creditcardmerchantGetListV1) | **GET** /1/object/creditcardmerchant/getList | Retrieve Creditcardmerchant list |
| [**creditcardmerchantGetObjectV2**](ObjectCreditcardmerchantApi.md#creditcardmerchantGetObjectV2) | **GET** /2/object/creditcardmerchant/{pkiCreditcardmerchantID} | Retrieve an existing Creditcardmerchant |


<a id="creditcardmerchantCreateObjectV1"></a>
# **creditcardmerchantCreateObjectV1**
> CreditcardmerchantCreateObjectV1Response creditcardmerchantCreateObjectV1(creditcardmerchantCreateObjectV1Request)

Create a new Creditcardmerchant

The endpoint allows to create one or many elements at once.

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectCreditcardmerchantApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectCreditcardmerchantApi apiInstance = new ObjectCreditcardmerchantApi(defaultClient);
    CreditcardmerchantCreateObjectV1Request creditcardmerchantCreateObjectV1Request = new CreditcardmerchantCreateObjectV1Request(); // CreditcardmerchantCreateObjectV1Request | 
    try {
      CreditcardmerchantCreateObjectV1Response result = apiInstance.creditcardmerchantCreateObjectV1(creditcardmerchantCreateObjectV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectCreditcardmerchantApi#creditcardmerchantCreateObjectV1");
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
| **creditcardmerchantCreateObjectV1Request** | [**CreditcardmerchantCreateObjectV1Request**](CreditcardmerchantCreateObjectV1Request.md)|  | |

### Return type

[**CreditcardmerchantCreateObjectV1Response**](CreditcardmerchantCreateObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful response |  -  |

<a id="creditcardmerchantDeleteObjectV1"></a>
# **creditcardmerchantDeleteObjectV1**
> CreditcardmerchantDeleteObjectV1Response creditcardmerchantDeleteObjectV1(pkiCreditcardmerchantID)

Delete an existing Creditcardmerchant



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectCreditcardmerchantApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectCreditcardmerchantApi apiInstance = new ObjectCreditcardmerchantApi(defaultClient);
    Integer pkiCreditcardmerchantID = 56; // Integer | The unique ID of the Creditcardmerchant
    try {
      CreditcardmerchantDeleteObjectV1Response result = apiInstance.creditcardmerchantDeleteObjectV1(pkiCreditcardmerchantID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectCreditcardmerchantApi#creditcardmerchantDeleteObjectV1");
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
| **pkiCreditcardmerchantID** | **Integer**| The unique ID of the Creditcardmerchant | |

### Return type

[**CreditcardmerchantDeleteObjectV1Response**](CreditcardmerchantDeleteObjectV1Response.md)

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

<a id="creditcardmerchantEditObjectV1"></a>
# **creditcardmerchantEditObjectV1**
> CreditcardmerchantEditObjectV1Response creditcardmerchantEditObjectV1(pkiCreditcardmerchantID, creditcardmerchantEditObjectV1Request)

Edit an existing Creditcardmerchant



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectCreditcardmerchantApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectCreditcardmerchantApi apiInstance = new ObjectCreditcardmerchantApi(defaultClient);
    Integer pkiCreditcardmerchantID = 56; // Integer | The unique ID of the Creditcardmerchant
    CreditcardmerchantEditObjectV1Request creditcardmerchantEditObjectV1Request = new CreditcardmerchantEditObjectV1Request(); // CreditcardmerchantEditObjectV1Request | 
    try {
      CreditcardmerchantEditObjectV1Response result = apiInstance.creditcardmerchantEditObjectV1(pkiCreditcardmerchantID, creditcardmerchantEditObjectV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectCreditcardmerchantApi#creditcardmerchantEditObjectV1");
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
| **pkiCreditcardmerchantID** | **Integer**| The unique ID of the Creditcardmerchant | |
| **creditcardmerchantEditObjectV1Request** | [**CreditcardmerchantEditObjectV1Request**](CreditcardmerchantEditObjectV1Request.md)|  | |

### Return type

[**CreditcardmerchantEditObjectV1Response**](CreditcardmerchantEditObjectV1Response.md)

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

<a id="creditcardmerchantGetAutocompleteV2"></a>
# **creditcardmerchantGetAutocompleteV2**
> CreditcardmerchantGetAutocompleteV2Response creditcardmerchantGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)

Retrieve Creditcardmerchants and IDs

Get the list of Creditcardmerchant to be used in a dropdown or autocomplete control.

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectCreditcardmerchantApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectCreditcardmerchantApi apiInstance = new ObjectCreditcardmerchantApi(defaultClient);
    String sSelector = "All"; // String | The type of Creditcardmerchants to return
    String eFilterActive = "All"; // String | Specify which results we want to display.
    String sQuery = "sQuery_example"; // String | Allow to filter the returned results
    HeaderAcceptLanguage acceptLanguage = HeaderAcceptLanguage.fromValue("*"); // HeaderAcceptLanguage | 
    try {
      CreditcardmerchantGetAutocompleteV2Response result = apiInstance.creditcardmerchantGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectCreditcardmerchantApi#creditcardmerchantGetAutocompleteV2");
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
| **sSelector** | **String**| The type of Creditcardmerchants to return | [enum: All] |
| **eFilterActive** | **String**| Specify which results we want to display. | [optional] [default to Active] [enum: All, Active, Inactive] |
| **sQuery** | **String**| Allow to filter the returned results | [optional] |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |

### Return type

[**CreditcardmerchantGetAutocompleteV2Response**](CreditcardmerchantGetAutocompleteV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="creditcardmerchantGetListV1"></a>
# **creditcardmerchantGetListV1**
> CreditcardmerchantGetListV1Response creditcardmerchantGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Creditcardmerchant list



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectCreditcardmerchantApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectCreditcardmerchantApi apiInstance = new ObjectCreditcardmerchantApi(defaultClient);
    String eOrderBy = "pkiCreditcardmerchantID_ASC"; // String | Specify how you want the results to be sorted
    Integer iRowMax = 56; // Integer | 
    Integer iRowOffset = 0; // Integer | 
    HeaderAcceptLanguage acceptLanguage = HeaderAcceptLanguage.fromValue("*"); // HeaderAcceptLanguage | 
    String sFilter = "sFilter_example"; // String | 
    try {
      CreditcardmerchantGetListV1Response result = apiInstance.creditcardmerchantGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectCreditcardmerchantApi#creditcardmerchantGetListV1");
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
| **eOrderBy** | **String**| Specify how you want the results to be sorted | [optional] [enum: pkiCreditcardmerchantID_ASC, pkiCreditcardmerchantID_DESC, fkiBankaccountID_ASC, fkiBankaccountID_DESC, fkiLanguageID_ASC, fkiLanguageID_DESC, bCreditcardmerchantDenyvisa_ASC, bCreditcardmerchantDenyvisa_DESC, bCreditcardmerchantDenymastercard_ASC, bCreditcardmerchantDenymastercard_DESC, bCreditcardmerchantDenyamex_ASC, bCreditcardmerchantDenyamex_DESC, bCreditcardmerchantIsactive_ASC, bCreditcardmerchantIsactive_DESC, sCreditcardmerchantDescription_ASC, sCreditcardmerchantDescription_DESC, sCreditcardmerchantStoreid_ASC, sCreditcardmerchantStoreid_DESC] |
| **iRowMax** | **Integer**|  | [optional] |
| **iRowOffset** | **Integer**|  | [optional] [default to 0] |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |
| **sFilter** | **String**|  | [optional] |

### Return type

[**CreditcardmerchantGetListV1Response**](CreditcardmerchantGetListV1Response.md)

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

<a id="creditcardmerchantGetObjectV2"></a>
# **creditcardmerchantGetObjectV2**
> CreditcardmerchantGetObjectV2Response creditcardmerchantGetObjectV2(pkiCreditcardmerchantID)

Retrieve an existing Creditcardmerchant



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectCreditcardmerchantApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectCreditcardmerchantApi apiInstance = new ObjectCreditcardmerchantApi(defaultClient);
    Integer pkiCreditcardmerchantID = 56; // Integer | The unique ID of the Creditcardmerchant
    try {
      CreditcardmerchantGetObjectV2Response result = apiInstance.creditcardmerchantGetObjectV2(pkiCreditcardmerchantID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectCreditcardmerchantApi#creditcardmerchantGetObjectV2");
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
| **pkiCreditcardmerchantID** | **Integer**| The unique ID of the Creditcardmerchant | |

### Return type

[**CreditcardmerchantGetObjectV2Response**](CreditcardmerchantGetObjectV2Response.md)

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

