# ObjectFranchiseofficeApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**franchiseofficeGetAutocompleteV1**](ObjectFranchiseofficeApi.md#franchiseofficeGetAutocompleteV1) | **GET** /1/object/franchiseoffice/getAutocomplete/{sSelector} | Retrieve Franchiseoffices and IDs


<a name="franchiseofficeGetAutocompleteV1"></a>
# **franchiseofficeGetAutocompleteV1**
> CommonGetAutocompleteV1Response franchiseofficeGetAutocompleteV1(sSelector, sQuery)

Retrieve Franchiseoffices and IDs

Get the list of Franchiseoffices to be used in a dropdown or autocomplete control.

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectFranchiseofficeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectFranchiseofficeApi apiInstance = new ObjectFranchiseofficeApi(defaultClient);
    String sSelector = "Active"; // String | The type of Franchiseoffices to return
    String sQuery = "sQuery_example"; // String | Allow to filter on the option value
    try {
      CommonGetAutocompleteV1Response result = apiInstance.franchiseofficeGetAutocompleteV1(sSelector, sQuery);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectFranchiseofficeApi#franchiseofficeGetAutocompleteV1");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sSelector** | **String**| The type of Franchiseoffices to return | [enum: Active, All]
 **sQuery** | **String**| Allow to filter on the option value | [optional]

### Return type

[**CommonGetAutocompleteV1Response**](CommonGetAutocompleteV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

