# ObjectUsergroupApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**usergroupGetAutocompleteV1**](ObjectUsergroupApi.md#usergroupGetAutocompleteV1) | **GET** /1/object/usergroup/getAutocomplete/{sSelector} | Retrieve Usergroups and IDs |


<a name="usergroupGetAutocompleteV1"></a>
# **usergroupGetAutocompleteV1**
> CommonGetAutocompleteV1Response usergroupGetAutocompleteV1(sSelector, sQuery, acceptLanguage)

Retrieve Usergroups and IDs

Get the list of Usergroup to be used in a dropdown or autocomplete control.

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectUsergroupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectUsergroupApi apiInstance = new ObjectUsergroupApi(defaultClient);
    String sSelector = "All"; // String | The type of Usergroups to return
    String sQuery = "sQuery_example"; // String | Allow to filter the returned results
    HeaderAcceptLanguage acceptLanguage = HeaderAcceptLanguage.fromValue("*"); // HeaderAcceptLanguage | 
    try {
      CommonGetAutocompleteV1Response result = apiInstance.usergroupGetAutocompleteV1(sSelector, sQuery, acceptLanguage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectUsergroupApi#usergroupGetAutocompleteV1");
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
| **sSelector** | **String**| The type of Usergroups to return | [enum: All] |
| **sQuery** | **String**| Allow to filter the returned results | [optional] |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |

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
| **200** | Successful response |  -  |
