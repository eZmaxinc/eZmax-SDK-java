# ObjectEzsigntsarequirementApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**ezsigntsarequirementGetAutocompleteV1**](ObjectEzsigntsarequirementApi.md#ezsigntsarequirementGetAutocompleteV1) | **GET** /1/object/ezsigntsarequirement/getAutocomplete/{sSelector} | Retrieve Ezsigntsarequirements and IDs |


<a name="ezsigntsarequirementGetAutocompleteV1"></a>
# **ezsigntsarequirementGetAutocompleteV1**
> CommonGetAutocompleteDisabledV1Response ezsigntsarequirementGetAutocompleteV1(sSelector, fkiEzsignfoldertypeID, sQuery, acceptLanguage)

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
    String sQuery = "sQuery_example"; // String | Allow to filter the returned results
    HeaderAcceptLanguage acceptLanguage = HeaderAcceptLanguage.fromValue("*"); // HeaderAcceptLanguage | 
    try {
      CommonGetAutocompleteDisabledV1Response result = apiInstance.ezsigntsarequirementGetAutocompleteV1(sSelector, fkiEzsignfoldertypeID, sQuery, acceptLanguage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsigntsarequirementApi#ezsigntsarequirementGetAutocompleteV1");
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
| **sQuery** | **String**| Allow to filter the returned results | [optional] |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |

### Return type

[**CommonGetAutocompleteDisabledV1Response**](CommonGetAutocompleteDisabledV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **422** | The syntax of the request is valid but the request cannot be completed. Look for detail in body. |  -  |

