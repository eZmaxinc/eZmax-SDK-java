# ObjectRealestateboardApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**realestateboardGetAutocompleteV2**](ObjectRealestateboardApi.md#realestateboardGetAutocompleteV2) | **GET** /2/object/realestateboard/getAutocomplete/{sSelector} | Retrieve Realestateboards and IDs |


<a id="realestateboardGetAutocompleteV2"></a>
# **realestateboardGetAutocompleteV2**
> RealestateboardGetAutocompleteV2Response realestateboardGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage, fkiProvinceID)

Retrieve Realestateboards and IDs

Get the list of realestateboard to be used in a dropdown or autocomplete control.

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectRealestateboardApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectRealestateboardApi apiInstance = new ObjectRealestateboardApi(defaultClient);
    String sSelector = "All"; // String | The type of Realestateboards to return
    String eFilterActive = "All"; // String | Specify which results we want to display.
    String sQuery = "sQuery_example"; // String | Allow to filter the returned results
    HeaderAcceptLanguage acceptLanguage = HeaderAcceptLanguage.fromValue("*"); // HeaderAcceptLanguage | 
    String fkiProvinceID = "fkiProvinceID_example"; // String | The province ID to filter the results expected
    try {
      RealestateboardGetAutocompleteV2Response result = apiInstance.realestateboardGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage, fkiProvinceID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectRealestateboardApi#realestateboardGetAutocompleteV2");
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
| **sSelector** | **String**| The type of Realestateboards to return | [enum: All] |
| **eFilterActive** | **String**| Specify which results we want to display. | [optional] [default to Active] [enum: All, Active, Inactive] |
| **sQuery** | **String**| Allow to filter the returned results | [optional] |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |
| **fkiProvinceID** | **String**| The province ID to filter the results expected | [optional] |

### Return type

[**RealestateboardGetAutocompleteV2Response**](RealestateboardGetAutocompleteV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

