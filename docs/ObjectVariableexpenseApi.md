# ObjectVariableexpenseApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**variableexpenseCreateObjectV1**](ObjectVariableexpenseApi.md#variableexpenseCreateObjectV1) | **POST** /1/object/variableexpense | Create a new Variableexpense |
| [**variableexpenseEditObjectV1**](ObjectVariableexpenseApi.md#variableexpenseEditObjectV1) | **PUT** /1/object/variableexpense/{pkiVariableexpenseID} | Edit an existing Variableexpense |
| [**variableexpenseGetAutocompleteV2**](ObjectVariableexpenseApi.md#variableexpenseGetAutocompleteV2) | **GET** /2/object/variableexpense/getAutocomplete/{sSelector} | Retrieve Variableexpenses and IDs |
| [**variableexpenseGetListV1**](ObjectVariableexpenseApi.md#variableexpenseGetListV1) | **GET** /1/object/variableexpense/getList | Retrieve Variableexpense list |
| [**variableexpenseGetObjectV2**](ObjectVariableexpenseApi.md#variableexpenseGetObjectV2) | **GET** /2/object/variableexpense/{pkiVariableexpenseID} | Retrieve an existing Variableexpense |


<a id="variableexpenseCreateObjectV1"></a>
# **variableexpenseCreateObjectV1**
> VariableexpenseCreateObjectV1Response variableexpenseCreateObjectV1(variableexpenseCreateObjectV1Request)

Create a new Variableexpense

The endpoint allows to create one or many elements at once.

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectVariableexpenseApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectVariableexpenseApi apiInstance = new ObjectVariableexpenseApi(defaultClient);
    VariableexpenseCreateObjectV1Request variableexpenseCreateObjectV1Request = new VariableexpenseCreateObjectV1Request(); // VariableexpenseCreateObjectV1Request | 
    try {
      VariableexpenseCreateObjectV1Response result = apiInstance.variableexpenseCreateObjectV1(variableexpenseCreateObjectV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectVariableexpenseApi#variableexpenseCreateObjectV1");
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
| **variableexpenseCreateObjectV1Request** | [**VariableexpenseCreateObjectV1Request**](VariableexpenseCreateObjectV1Request.md)|  | |

### Return type

[**VariableexpenseCreateObjectV1Response**](VariableexpenseCreateObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful response |  -  |

<a id="variableexpenseEditObjectV1"></a>
# **variableexpenseEditObjectV1**
> VariableexpenseEditObjectV1Response variableexpenseEditObjectV1(pkiVariableexpenseID, variableexpenseEditObjectV1Request)

Edit an existing Variableexpense



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectVariableexpenseApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectVariableexpenseApi apiInstance = new ObjectVariableexpenseApi(defaultClient);
    Integer pkiVariableexpenseID = 56; // Integer | 
    VariableexpenseEditObjectV1Request variableexpenseEditObjectV1Request = new VariableexpenseEditObjectV1Request(); // VariableexpenseEditObjectV1Request | 
    try {
      VariableexpenseEditObjectV1Response result = apiInstance.variableexpenseEditObjectV1(pkiVariableexpenseID, variableexpenseEditObjectV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectVariableexpenseApi#variableexpenseEditObjectV1");
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
| **pkiVariableexpenseID** | **Integer**|  | |
| **variableexpenseEditObjectV1Request** | [**VariableexpenseEditObjectV1Request**](VariableexpenseEditObjectV1Request.md)|  | |

### Return type

[**VariableexpenseEditObjectV1Response**](VariableexpenseEditObjectV1Response.md)

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

<a id="variableexpenseGetAutocompleteV2"></a>
# **variableexpenseGetAutocompleteV2**
> VariableexpenseGetAutocompleteV2Response variableexpenseGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)

Retrieve Variableexpenses and IDs

Get the list of Variableexpense to be used in a dropdown or autocomplete control.

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectVariableexpenseApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectVariableexpenseApi apiInstance = new ObjectVariableexpenseApi(defaultClient);
    String sSelector = "All"; // String | The type of Variableexpenses to return
    String eFilterActive = "All"; // String | Specify which results we want to display.
    String sQuery = "sQuery_example"; // String | Allow to filter the returned results
    HeaderAcceptLanguage acceptLanguage = HeaderAcceptLanguage.fromValue("*"); // HeaderAcceptLanguage | 
    try {
      VariableexpenseGetAutocompleteV2Response result = apiInstance.variableexpenseGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectVariableexpenseApi#variableexpenseGetAutocompleteV2");
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
| **sSelector** | **String**| The type of Variableexpenses to return | [enum: All] |
| **eFilterActive** | **String**| Specify which results we want to display. | [optional] [default to Active] [enum: All, Active, Inactive] |
| **sQuery** | **String**| Allow to filter the returned results | [optional] |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |

### Return type

[**VariableexpenseGetAutocompleteV2Response**](VariableexpenseGetAutocompleteV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="variableexpenseGetListV1"></a>
# **variableexpenseGetListV1**
> VariableexpenseGetListV1Response variableexpenseGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Variableexpense list

Enum values that can be filtered in query parameter *sFilter*:  | Variable | Valid values | |---|---| | eVariableexpenseTaxable | Yes&lt;br&gt;No&lt;br&gt;Included |

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectVariableexpenseApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectVariableexpenseApi apiInstance = new ObjectVariableexpenseApi(defaultClient);
    String eOrderBy = "pkiVariableexpenseID_ASC"; // String | Specify how you want the results to be sorted
    Integer iRowMax = 56; // Integer | 
    Integer iRowOffset = 0; // Integer | 
    HeaderAcceptLanguage acceptLanguage = HeaderAcceptLanguage.fromValue("*"); // HeaderAcceptLanguage | 
    String sFilter = "sFilter_example"; // String | 
    try {
      VariableexpenseGetListV1Response result = apiInstance.variableexpenseGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectVariableexpenseApi#variableexpenseGetListV1");
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
| **eOrderBy** | **String**| Specify how you want the results to be sorted | [optional] [enum: pkiVariableexpenseID_ASC, pkiVariableexpenseID_DESC, sVariableexpenseCode_ASC, sVariableexpenseCode_DESC, sVariableexpenseDescriptionX_ASC, sVariableexpenseDescriptionX_DESC, eVariableexpenseTaxable_ASC, eVariableexpenseTaxable_DESC, bVariableexpenseIsactive_ASC, bVariableexpenseIsactive_DESC] |
| **iRowMax** | **Integer**|  | [optional] |
| **iRowOffset** | **Integer**|  | [optional] [default to 0] |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |
| **sFilter** | **String**|  | [optional] |

### Return type

[**VariableexpenseGetListV1Response**](VariableexpenseGetListV1Response.md)

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

<a id="variableexpenseGetObjectV2"></a>
# **variableexpenseGetObjectV2**
> VariableexpenseGetObjectV2Response variableexpenseGetObjectV2(pkiVariableexpenseID)

Retrieve an existing Variableexpense



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectVariableexpenseApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectVariableexpenseApi apiInstance = new ObjectVariableexpenseApi(defaultClient);
    Integer pkiVariableexpenseID = 56; // Integer | 
    try {
      VariableexpenseGetObjectV2Response result = apiInstance.variableexpenseGetObjectV2(pkiVariableexpenseID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectVariableexpenseApi#variableexpenseGetObjectV2");
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
| **pkiVariableexpenseID** | **Integer**|  | |

### Return type

[**VariableexpenseGetObjectV2Response**](VariableexpenseGetObjectV2Response.md)

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

