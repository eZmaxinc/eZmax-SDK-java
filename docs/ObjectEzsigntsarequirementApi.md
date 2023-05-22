# ObjectEzsigntsarequirementApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**ezsigntsarequirementGetAutocompleteV2**](ObjectEzsigntsarequirementApi.md#ezsigntsarequirementGetAutocompleteV2) | **GET** /2/object/ezsigntsarequirement/getAutocomplete/{sSelector} | Retrieve Ezsigntsarequirements and IDs |


<a id="ezsigntsarequirementGetAutocompleteV2"></a>
# **ezsigntsarequirementGetAutocompleteV2**
> EzsigntsarequirementGetAutocompleteV2Response ezsigntsarequirementGetAutocompleteV2(sSelector, fkiEzsignfoldertypeID, eFilterActive, sQuery, acceptLanguage)

Retrieve Ezsigntsarequirements and IDs

Get the list of Ezsigntsarequirement to be used in a dropdown or autocomplete control.

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsigntsarequirementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsigntsarequirementApi apiInstance = new ObjectEzsigntsarequirementApi(defaultClient);
    String sSelector = "User"; // String | The type of Ezsigntsarequirements to return
    Integer fkiEzsignfoldertypeID = 56; // Integer | 
    String eFilterActive = "All"; // String | Specify which results we want to display.
    String sQuery = "sQuery_example"; // String | Allow to filter the returned results
    HeaderAcceptLanguage acceptLanguage = HeaderAcceptLanguage.fromValue("*"); // HeaderAcceptLanguage | 
    try {
      EzsigntsarequirementGetAutocompleteV2Response result = apiInstance.ezsigntsarequirementGetAutocompleteV2(sSelector, fkiEzsignfoldertypeID, eFilterActive, sQuery, acceptLanguage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsigntsarequirementApi#ezsigntsarequirementGetAutocompleteV2");
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
| **sSelector** | **String**| The type of Ezsigntsarequirements to return | [enum: User, Usergroup] |
| **fkiEzsignfoldertypeID** | **Integer**|  | [optional] |
| **eFilterActive** | **String**| Specify which results we want to display. | [optional] [default to Active] [enum: All, Active, Inactive] |
| **sQuery** | **String**| Allow to filter the returned results | [optional] |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |

### Return type

[**EzsigntsarequirementGetAutocompleteV2Response**](EzsigntsarequirementGetAutocompleteV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

