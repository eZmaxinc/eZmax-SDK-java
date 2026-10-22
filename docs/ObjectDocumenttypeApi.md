# ObjectDocumenttypeApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**documenttypeCreateObjectV1**](ObjectDocumenttypeApi.md#documenttypeCreateObjectV1) | **POST** /1/object/documenttype | Create a new Documenttype |
| [**documenttypeDeleteObjectV1**](ObjectDocumenttypeApi.md#documenttypeDeleteObjectV1) | **DELETE** /1/object/documenttype/{pkiDocumenttypeID} | Delete an existing Documenttype |
| [**documenttypeEditObjectV1**](ObjectDocumenttypeApi.md#documenttypeEditObjectV1) | **PUT** /1/object/documenttype/{pkiDocumenttypeID} | Edit an existing Documenttype |
| [**documenttypeGetAutocompleteV2**](ObjectDocumenttypeApi.md#documenttypeGetAutocompleteV2) | **GET** /2/object/documenttype/getAutocomplete/{sSelector} | Retrieve Documenttypes and IDs |
| [**documenttypeGetListV1**](ObjectDocumenttypeApi.md#documenttypeGetListV1) | **GET** /1/object/documenttype/getList | Retrieve Documenttype list |
| [**documenttypeGetObjectV2**](ObjectDocumenttypeApi.md#documenttypeGetObjectV2) | **GET** /2/object/documenttype/{pkiDocumenttypeID} | Retrieve an existing Documenttype |


<a id="documenttypeCreateObjectV1"></a>
# **documenttypeCreateObjectV1**
> DocumenttypeCreateObjectV1Response documenttypeCreateObjectV1(documenttypeCreateObjectV1Request)

Create a new Documenttype

The endpoint allows to create one or many elements at once.

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectDocumenttypeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectDocumenttypeApi apiInstance = new ObjectDocumenttypeApi(defaultClient);
    DocumenttypeCreateObjectV1Request documenttypeCreateObjectV1Request = new DocumenttypeCreateObjectV1Request(); // DocumenttypeCreateObjectV1Request | 
    try {
      DocumenttypeCreateObjectV1Response result = apiInstance.documenttypeCreateObjectV1(documenttypeCreateObjectV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectDocumenttypeApi#documenttypeCreateObjectV1");
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
| **documenttypeCreateObjectV1Request** | [**DocumenttypeCreateObjectV1Request**](DocumenttypeCreateObjectV1Request.md)|  | |

### Return type

[**DocumenttypeCreateObjectV1Response**](DocumenttypeCreateObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful response |  -  |

<a id="documenttypeDeleteObjectV1"></a>
# **documenttypeDeleteObjectV1**
> DocumenttypeDeleteObjectV1Response documenttypeDeleteObjectV1(pkiDocumenttypeID)

Delete an existing Documenttype



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectDocumenttypeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectDocumenttypeApi apiInstance = new ObjectDocumenttypeApi(defaultClient);
    Integer pkiDocumenttypeID = 56; // Integer | The unique ID of the Documenttype
    try {
      DocumenttypeDeleteObjectV1Response result = apiInstance.documenttypeDeleteObjectV1(pkiDocumenttypeID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectDocumenttypeApi#documenttypeDeleteObjectV1");
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
| **pkiDocumenttypeID** | **Integer**| The unique ID of the Documenttype | |

### Return type

[**DocumenttypeDeleteObjectV1Response**](DocumenttypeDeleteObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **404** | The request failed. The element on which you were trying to work does not exists. Look for detail about the error in the body. |  -  |

<a id="documenttypeEditObjectV1"></a>
# **documenttypeEditObjectV1**
> DocumenttypeEditObjectV1Response documenttypeEditObjectV1(pkiDocumenttypeID, documenttypeEditObjectV1Request)

Edit an existing Documenttype



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectDocumenttypeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectDocumenttypeApi apiInstance = new ObjectDocumenttypeApi(defaultClient);
    Integer pkiDocumenttypeID = 56; // Integer | The unique ID of the Documenttype
    DocumenttypeEditObjectV1Request documenttypeEditObjectV1Request = new DocumenttypeEditObjectV1Request(); // DocumenttypeEditObjectV1Request | 
    try {
      DocumenttypeEditObjectV1Response result = apiInstance.documenttypeEditObjectV1(pkiDocumenttypeID, documenttypeEditObjectV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectDocumenttypeApi#documenttypeEditObjectV1");
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
| **pkiDocumenttypeID** | **Integer**| The unique ID of the Documenttype | |
| **documenttypeEditObjectV1Request** | [**DocumenttypeEditObjectV1Request**](DocumenttypeEditObjectV1Request.md)|  | |

### Return type

[**DocumenttypeEditObjectV1Response**](DocumenttypeEditObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **404** | The request failed. The element on which you were trying to work does not exists. Look for detail about the error in the body. |  -  |
| **422** | The request was syntactically valid but failed because of an interdependance condition. Look for detail about the error in the body. |  -  |

<a id="documenttypeGetAutocompleteV2"></a>
# **documenttypeGetAutocompleteV2**
> DocumenttypeGetAutocompleteV2Response documenttypeGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)

Retrieve Documenttypes and IDs

Get the list of Documenttype to be used in a dropdown or autocomplete control.

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectDocumenttypeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectDocumenttypeApi apiInstance = new ObjectDocumenttypeApi(defaultClient);
    String sSelector = "All"; // String | The type of Documenttypes to return
    String eFilterActive = "All"; // String | Specify which results we want to display.
    String sQuery = "sQuery_example"; // String | Allow to filter the returned results
    HeaderAcceptLanguage acceptLanguage = HeaderAcceptLanguage.fromValue("*"); // HeaderAcceptLanguage | 
    try {
      DocumenttypeGetAutocompleteV2Response result = apiInstance.documenttypeGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectDocumenttypeApi#documenttypeGetAutocompleteV2");
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
| **sSelector** | **String**| The type of Documenttypes to return | [enum: All] |
| **eFilterActive** | **String**| Specify which results we want to display. | [optional] [default to Active] [enum: All, Active, Inactive] |
| **sQuery** | **String**| Allow to filter the returned results | [optional] |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |

### Return type

[**DocumenttypeGetAutocompleteV2Response**](DocumenttypeGetAutocompleteV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="documenttypeGetListV1"></a>
# **documenttypeGetListV1**
> DocumenttypeGetListV1Response documenttypeGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Documenttype list

Enum values that can be filtered in query parameter *sFilter*:  | Variable | Valid values | |---|---|  | Agentbroker&lt;br&gt;Buyercontract&lt;br&gt;Inscription&lt;br&gt;NotAuthenticated&lt;br&gt;Otherincome&lt;br&gt;RejectedOfferToPurchase | | eDocumenttypeEzcom | PromiseToPurchase&lt;br&gt;Annex&lt;br&gt;Modification&lt;br&gt;CounterOffer&lt;br&gt;Conditions&lt;br&gt;BankApproval&lt;br&gt;Other | | eDocumenttypePrivacydefault | Administration&lt;br&gt;Administrator&lt;br&gt;All&lt;br&gt;Creator&lt;br&gt;Inscriptor&lt;br&gt;Myself&lt;br&gt;Seller | | eDocumenttypeStatusdefault | Not required&lt;br&gt;Required | | eDocumenttypeSalebyowner | All&lt;br&gt;Yes&lt;br&gt;No | | eDocumenttypeSaledisplaybyrole | InscriptorSeller&lt;br&gt;Inscriptor&lt;br&gt;Seller | | eDocumenttypeTransactiontype | All&lt;br&gt;Inscriptor&lt;br&gt;InscriptorOnly&lt;br&gt;Seller&lt;br&gt;SellerOnly&lt;br&gt;InscriptorSeller | | eDocumenttypeRepossession | All&lt;br&gt;No&lt;br&gt;Yes |

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectDocumenttypeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectDocumenttypeApi apiInstance = new ObjectDocumenttypeApi(defaultClient);
    String eOrderBy = "pkiDocumenttypeID_ASC"; // String | Specify how you want the results to be sorted
    Integer iRowMax = 56; // Integer | 
    Integer iRowOffset = 0; // Integer | 
    HeaderAcceptLanguage acceptLanguage = HeaderAcceptLanguage.fromValue("*"); // HeaderAcceptLanguage | 
    String sFilter = "sFilter_example"; // String | 
    try {
      DocumenttypeGetListV1Response result = apiInstance.documenttypeGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectDocumenttypeApi#documenttypeGetListV1");
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
| **eOrderBy** | **String**| Specify how you want the results to be sorted | [optional] [enum: pkiDocumenttypeID_ASC, pkiDocumenttypeID_DESC, sDocumenttypeNameX_ASC, sDocumenttypeNameX_DESC, sDocumenttypeDefaultfilename_ASC, sDocumenttypeDefaultfilename_DESC, bDocumenttypeShowagent_ASC, bDocumenttypeShowagent_DESC, bDocumenttypeIsactive_ASC, bDocumenttypeIsactive_DESC, bDocumenttypeIsrequired_ASC, bDocumenttypeIsrequired_DESC, bDocumenttypeSale_ASC, bDocumenttypeSale_DESC, bDocumenttypeRental_ASC, bDocumenttypeRental_DESC, bDocumenttypeReference_ASC, bDocumenttypeReference_DESC, bDocumenttypeMortgagereference_ASC, bDocumenttypeMortgagereference_DESC, bDocumenttypeEvaluation_ASC, bDocumenttypeEvaluation_DESC, bDocumenttypeConsultation_ASC, bDocumenttypeConsultation_DESC, bDocumenttypeOtherservices_ASC, bDocumenttypeOtherservices_DESC, bDocumenttypeForeclosedsale_ASC, bDocumenttypeForeclosedsale_DESC, bDocumenttypeCommercialfunding_ASC, bDocumenttypeCommercialfunding_DESC, bDocumenttypeCanafe_ASC, bDocumenttypeCanafe_DESC, eDocumenttypeEzcom_ASC, eDocumenttypeEzcom_DESC, eDocumenttypePrivacydefault_ASC, eDocumenttypePrivacydefault_DESC, eDocumenttypeStatusdefault_ASC, eDocumenttypeStatusdefault_DESC, eDocumenttypeSalebyowner_ASC, eDocumenttypeSalebyowner_DESC, eDocumenttypeSaledisplaybyrole_ASC, eDocumenttypeSaledisplaybyrole_DESC, eDocumenttypeTransactiontype_ASC, eDocumenttypeTransactiontype_DESC, eDocumenttypeRepossession_ASC, eDocumenttypeRepossession_DESC] |
| **iRowMax** | **Integer**|  | [optional] |
| **iRowOffset** | **Integer**|  | [optional] [default to 0] |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |
| **sFilter** | **String**|  | [optional] |

### Return type

[**DocumenttypeGetListV1Response**](DocumenttypeGetListV1Response.md)

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

<a id="documenttypeGetObjectV2"></a>
# **documenttypeGetObjectV2**
> DocumenttypeGetObjectV2Response documenttypeGetObjectV2(pkiDocumenttypeID)

Retrieve an existing Documenttype



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectDocumenttypeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectDocumenttypeApi apiInstance = new ObjectDocumenttypeApi(defaultClient);
    Integer pkiDocumenttypeID = 56; // Integer | The unique ID of the Documenttype
    try {
      DocumenttypeGetObjectV2Response result = apiInstance.documenttypeGetObjectV2(pkiDocumenttypeID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectDocumenttypeApi#documenttypeGetObjectV2");
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
| **pkiDocumenttypeID** | **Integer**| The unique ID of the Documenttype | |

### Return type

[**DocumenttypeGetObjectV2Response**](DocumenttypeGetObjectV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **404** | The request failed. The element on which you were trying to work does not exists. Look for detail about the error in the body. |  -  |

