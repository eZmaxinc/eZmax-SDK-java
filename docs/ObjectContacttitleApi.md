# ObjectContacttitleApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**contacttitleGetAutocompleteV2**](ObjectContacttitleApi.md#contacttitleGetAutocompleteV2) | **GET** /2/object/contacttitle/getAutocomplete/{sSelector} | Retrieve Contacttitles and IDs |


<a id="contacttitleGetAutocompleteV2"></a>
# **contacttitleGetAutocompleteV2**
> ContacttitleGetAutocompleteV2Response contacttitleGetAutocompleteV2(sSelector, sQuery, acceptLanguage)

Retrieve Contacttitles and IDs

Get the list of Contacttitle to be used in a dropdown or autocomplete control.

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectContacttitleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectContacttitleApi apiInstance = new ObjectContacttitleApi(defaultClient);
    String sSelector = "All"; // String | The type of Contacttitles to return
    String sQuery = "sQuery_example"; // String | Allow to filter the returned results
    HeaderAcceptLanguage acceptLanguage = HeaderAcceptLanguage.fromValue("*"); // HeaderAcceptLanguage | 
    try {
      ContacttitleGetAutocompleteV2Response result = apiInstance.contacttitleGetAutocompleteV2(sSelector, sQuery, acceptLanguage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectContacttitleApi#contacttitleGetAutocompleteV2");
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
| **sSelector** | **String**| The type of Contacttitles to return | [enum: All] |
| **sQuery** | **String**| Allow to filter the returned results | [optional] |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |

### Return type

[**ContacttitleGetAutocompleteV2Response**](ContacttitleGetAutocompleteV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

