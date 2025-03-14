# ObjectBillingentityexternalApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**billingentityexternalGenerateFederationTokenV1**](ObjectBillingentityexternalApi.md#billingentityexternalGenerateFederationTokenV1) | **POST** /1/object/billingentityexternal/{pkiBillingentityexternalID}/generateFederationToken | Generate a federation token |
| [**billingentityexternalGetAutocompleteV2**](ObjectBillingentityexternalApi.md#billingentityexternalGetAutocompleteV2) | **GET** /2/object/billingentityexternal/getAutocomplete/{sSelector} | Retrieve Billingentityexternals and IDs |


<a id="billingentityexternalGenerateFederationTokenV1"></a>
# **billingentityexternalGenerateFederationTokenV1**
> BillingentityexternalGenerateFederationTokenV1Response billingentityexternalGenerateFederationTokenV1(pkiBillingentityexternalID, billingentityexternalGenerateFederationTokenV1Request)

Generate a federation token



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectBillingentityexternalApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectBillingentityexternalApi apiInstance = new ObjectBillingentityexternalApi(defaultClient);
    Integer pkiBillingentityexternalID = 56; // Integer | 
    BillingentityexternalGenerateFederationTokenV1Request billingentityexternalGenerateFederationTokenV1Request = new BillingentityexternalGenerateFederationTokenV1Request(); // BillingentityexternalGenerateFederationTokenV1Request | 
    try {
      BillingentityexternalGenerateFederationTokenV1Response result = apiInstance.billingentityexternalGenerateFederationTokenV1(pkiBillingentityexternalID, billingentityexternalGenerateFederationTokenV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectBillingentityexternalApi#billingentityexternalGenerateFederationTokenV1");
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
| **pkiBillingentityexternalID** | **Integer**|  | |
| **billingentityexternalGenerateFederationTokenV1Request** | [**BillingentityexternalGenerateFederationTokenV1Request**](BillingentityexternalGenerateFederationTokenV1Request.md)|  | |

### Return type

[**BillingentityexternalGenerateFederationTokenV1Response**](BillingentityexternalGenerateFederationTokenV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **422** | The request was syntactically valid but failed because of an interdependance condition. Look for detail about the error in the body |  -  |

<a id="billingentityexternalGetAutocompleteV2"></a>
# **billingentityexternalGetAutocompleteV2**
> BillingentityexternalGetAutocompleteV2Response billingentityexternalGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)

Retrieve Billingentityexternals and IDs

Get the list of Billingentityexternal to be used in a dropdown or autocomplete control.

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectBillingentityexternalApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectBillingentityexternalApi apiInstance = new ObjectBillingentityexternalApi(defaultClient);
    String sSelector = "All"; // String | The type of Billingentityexternals to return
    String eFilterActive = "All"; // String | Specify which results we want to display.
    String sQuery = "sQuery_example"; // String | Allow to filter the returned results
    HeaderAcceptLanguage acceptLanguage = HeaderAcceptLanguage.fromValue("*"); // HeaderAcceptLanguage | 
    try {
      BillingentityexternalGetAutocompleteV2Response result = apiInstance.billingentityexternalGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectBillingentityexternalApi#billingentityexternalGetAutocompleteV2");
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
| **sSelector** | **String**| The type of Billingentityexternals to return | [enum: All] |
| **eFilterActive** | **String**| Specify which results we want to display. | [optional] [default to Active] [enum: All, Active, Inactive] |
| **sQuery** | **String**| Allow to filter the returned results | [optional] |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |

### Return type

[**BillingentityexternalGetAutocompleteV2Response**](BillingentityexternalGetAutocompleteV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

