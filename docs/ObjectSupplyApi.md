# ObjectSupplyApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**supplyCreateObjectV1**](ObjectSupplyApi.md#supplyCreateObjectV1) | **POST** /1/object/supply | Create a new Supply |
| [**supplyDeleteObjectV1**](ObjectSupplyApi.md#supplyDeleteObjectV1) | **DELETE** /1/object/supply/{pkiSupplyID} | Delete an existing Supply |
| [**supplyEditObjectV1**](ObjectSupplyApi.md#supplyEditObjectV1) | **PUT** /1/object/supply/{pkiSupplyID} | Edit an existing Supply |
| [**supplyGetAutocompleteV2**](ObjectSupplyApi.md#supplyGetAutocompleteV2) | **GET** /2/object/supply/getAutocomplete/{sSelector} | Retrieve Supplys and IDs |
| [**supplyGetListV1**](ObjectSupplyApi.md#supplyGetListV1) | **GET** /1/object/supply/getList | Retrieve Supply list |
| [**supplyGetObjectV2**](ObjectSupplyApi.md#supplyGetObjectV2) | **GET** /2/object/supply/{pkiSupplyID} | Retrieve an existing Supply |


<a id="supplyCreateObjectV1"></a>
# **supplyCreateObjectV1**
> SupplyCreateObjectV1Response supplyCreateObjectV1(supplyCreateObjectV1Request)

Create a new Supply

The endpoint allows to create one or many elements at once.

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectSupplyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectSupplyApi apiInstance = new ObjectSupplyApi(defaultClient);
    SupplyCreateObjectV1Request supplyCreateObjectV1Request = new SupplyCreateObjectV1Request(); // SupplyCreateObjectV1Request | 
    try {
      SupplyCreateObjectV1Response result = apiInstance.supplyCreateObjectV1(supplyCreateObjectV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectSupplyApi#supplyCreateObjectV1");
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
| **supplyCreateObjectV1Request** | [**SupplyCreateObjectV1Request**](SupplyCreateObjectV1Request.md)|  | |

### Return type

[**SupplyCreateObjectV1Response**](SupplyCreateObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful response |  -  |

<a id="supplyDeleteObjectV1"></a>
# **supplyDeleteObjectV1**
> SupplyDeleteObjectV1Response supplyDeleteObjectV1(pkiSupplyID)

Delete an existing Supply



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectSupplyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectSupplyApi apiInstance = new ObjectSupplyApi(defaultClient);
    Integer pkiSupplyID = 56; // Integer | The unique ID of the Supply
    try {
      SupplyDeleteObjectV1Response result = apiInstance.supplyDeleteObjectV1(pkiSupplyID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectSupplyApi#supplyDeleteObjectV1");
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
| **pkiSupplyID** | **Integer**| The unique ID of the Supply | |

### Return type

[**SupplyDeleteObjectV1Response**](SupplyDeleteObjectV1Response.md)

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

<a id="supplyEditObjectV1"></a>
# **supplyEditObjectV1**
> SupplyEditObjectV1Response supplyEditObjectV1(pkiSupplyID, supplyEditObjectV1Request)

Edit an existing Supply



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectSupplyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectSupplyApi apiInstance = new ObjectSupplyApi(defaultClient);
    Integer pkiSupplyID = 56; // Integer | The unique ID of the Supply
    SupplyEditObjectV1Request supplyEditObjectV1Request = new SupplyEditObjectV1Request(); // SupplyEditObjectV1Request | 
    try {
      SupplyEditObjectV1Response result = apiInstance.supplyEditObjectV1(pkiSupplyID, supplyEditObjectV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectSupplyApi#supplyEditObjectV1");
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
| **pkiSupplyID** | **Integer**| The unique ID of the Supply | |
| **supplyEditObjectV1Request** | [**SupplyEditObjectV1Request**](SupplyEditObjectV1Request.md)|  | |

### Return type

[**SupplyEditObjectV1Response**](SupplyEditObjectV1Response.md)

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

<a id="supplyGetAutocompleteV2"></a>
# **supplyGetAutocompleteV2**
> SupplyGetAutocompleteV2Response supplyGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)

Retrieve Supplys and IDs

Get the list of Supply to be used in a dropdown or autocomplete control.

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectSupplyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectSupplyApi apiInstance = new ObjectSupplyApi(defaultClient);
    String sSelector = "All"; // String | The type of Supplys to return
    String eFilterActive = "All"; // String | Specify which results we want to display.
    String sQuery = "sQuery_example"; // String | Allow to filter the returned results
    HeaderAcceptLanguage acceptLanguage = HeaderAcceptLanguage.fromValue("*"); // HeaderAcceptLanguage | 
    try {
      SupplyGetAutocompleteV2Response result = apiInstance.supplyGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectSupplyApi#supplyGetAutocompleteV2");
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
| **sSelector** | **String**| The type of Supplys to return | [enum: All] |
| **eFilterActive** | **String**| Specify which results we want to display. | [optional] [default to Active] [enum: All, Active, Inactive] |
| **sQuery** | **String**| Allow to filter the returned results | [optional] |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |

### Return type

[**SupplyGetAutocompleteV2Response**](SupplyGetAutocompleteV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="supplyGetListV1"></a>
# **supplyGetListV1**
> SupplyGetListV1Response supplyGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Supply list



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectSupplyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectSupplyApi apiInstance = new ObjectSupplyApi(defaultClient);
    String eOrderBy = "pkiSupplyID_ASC"; // String | Specify how you want the results to be sorted
    Integer iRowMax = 56; // Integer | 
    Integer iRowOffset = 0; // Integer | 
    HeaderAcceptLanguage acceptLanguage = HeaderAcceptLanguage.fromValue("*"); // HeaderAcceptLanguage | 
    String sFilter = "sFilter_example"; // String | 
    try {
      SupplyGetListV1Response result = apiInstance.supplyGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectSupplyApi#supplyGetListV1");
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
| **eOrderBy** | **String**| Specify how you want the results to be sorted | [optional] [enum: pkiSupplyID_ASC, pkiSupplyID_DESC, fkiGlaccountID_ASC, fkiGlaccountID_DESC, fkiGlaccountcontainerID_ASC, fkiGlaccountcontainerID_DESC, fkiVariableexpenseID_ASC, fkiVariableexpenseID_DESC, sSupplyCode_ASC, sSupplyCode_DESC, sSupplyDescriptionX_ASC, sSupplyDescriptionX_DESC, dSupplyUnitprice_ASC, dSupplyUnitprice_DESC, bSupplyIsactive_ASC, bSupplyIsactive_DESC, bSupplyVariableprice_ASC, bSupplyVariableprice_DESC] |
| **iRowMax** | **Integer**|  | [optional] |
| **iRowOffset** | **Integer**|  | [optional] [default to 0] |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |
| **sFilter** | **String**|  | [optional] |

### Return type

[**SupplyGetListV1Response**](SupplyGetListV1Response.md)

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

<a id="supplyGetObjectV2"></a>
# **supplyGetObjectV2**
> SupplyGetObjectV2Response supplyGetObjectV2(pkiSupplyID)

Retrieve an existing Supply



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectSupplyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectSupplyApi apiInstance = new ObjectSupplyApi(defaultClient);
    Integer pkiSupplyID = 56; // Integer | The unique ID of the Supply
    try {
      SupplyGetObjectV2Response result = apiInstance.supplyGetObjectV2(pkiSupplyID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectSupplyApi#supplyGetObjectV2");
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
| **pkiSupplyID** | **Integer**| The unique ID of the Supply | |

### Return type

[**SupplyGetObjectV2Response**](SupplyGetObjectV2Response.md)

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

