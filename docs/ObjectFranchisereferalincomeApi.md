# ObjectFranchisereferalincomeApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**franchisereferalincomeCreateObjectV1**](ObjectFranchisereferalincomeApi.md#franchisereferalincomeCreateObjectV1) | **POST** /1/object/franchisereferalincome | Create a new Franchisereferalincome


<a name="franchisereferalincomeCreateObjectV1"></a>
# **franchisereferalincomeCreateObjectV1**
> FranchisereferalincomeCreateObjectV1Response franchisereferalincomeCreateObjectV1(franchisereferalincomeCreateObjectV1Request)

Create a new Franchisereferalincome

The endpoint allows to create one or many elements at once.  The array can contain simple (Just the object) or compound (The object and its child) objects.  Creating compound elements allows to reduce the multiple requests to create all child objects.

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectFranchisereferalincomeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectFranchisereferalincomeApi apiInstance = new ObjectFranchisereferalincomeApi(defaultClient);
    List<FranchisereferalincomeCreateObjectV1Request> franchisereferalincomeCreateObjectV1Request = Arrays.asList(); // List<FranchisereferalincomeCreateObjectV1Request> | 
    try {
      FranchisereferalincomeCreateObjectV1Response result = apiInstance.franchisereferalincomeCreateObjectV1(franchisereferalincomeCreateObjectV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectFranchisereferalincomeApi#franchisereferalincomeCreateObjectV1");
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
 **franchisereferalincomeCreateObjectV1Request** | [**List&lt;FranchisereferalincomeCreateObjectV1Request&gt;**](FranchisereferalincomeCreateObjectV1Request.md)|  |

### Return type

[**FranchisereferalincomeCreateObjectV1Response**](FranchisereferalincomeCreateObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Successful response |  -  |

