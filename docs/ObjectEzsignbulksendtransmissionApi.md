# ObjectEzsignbulksendtransmissionApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**ezsignbulksendtransmissionGetCsvErrorsV1**](ObjectEzsignbulksendtransmissionApi.md#ezsignbulksendtransmissionGetCsvErrorsV1) | **GET** /1/object/ezsignbulksendtransmission/{pkiEzsignbulksendtransmissionID}/getCsvErrors | Retrieve an existing Ezsignbulksendtransmission&#39;s Csv containing errors |
| [**ezsignbulksendtransmissionGetFormsDataV1**](ObjectEzsignbulksendtransmissionApi.md#ezsignbulksendtransmissionGetFormsDataV1) | **GET** /1/object/ezsignbulksendtransmission/{pkiEzsignbulksendtransmissionID}/getFormsData | Retrieve an existing Ezsignbulksendtransmission&#39;s forms data |
| [**ezsignbulksendtransmissionGetObjectV1**](ObjectEzsignbulksendtransmissionApi.md#ezsignbulksendtransmissionGetObjectV1) | **GET** /1/object/ezsignbulksendtransmission/{pkiEzsignbulksendtransmissionID} | Retrieve an existing Ezsignbulksendtransmission |


<a name="ezsignbulksendtransmissionGetCsvErrorsV1"></a>
# **ezsignbulksendtransmissionGetCsvErrorsV1**
> String ezsignbulksendtransmissionGetCsvErrorsV1(pkiEzsignbulksendtransmissionID)

Retrieve an existing Ezsignbulksendtransmission&#39;s Csv containing errors



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsignbulksendtransmissionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsignbulksendtransmissionApi apiInstance = new ObjectEzsignbulksendtransmissionApi(defaultClient);
    Integer pkiEzsignbulksendtransmissionID = 56; // Integer | 
    try {
      String result = apiInstance.ezsignbulksendtransmissionGetCsvErrorsV1(pkiEzsignbulksendtransmissionID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsignbulksendtransmissionApi#ezsignbulksendtransmissionGetCsvErrorsV1");
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
| **pkiEzsignbulksendtransmissionID** | **Integer**|  | |

### Return type

**String**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/csv, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **404** | The element you are trying to work on does not exist |  -  |
| **406** | One of the accept header is not defined or invalid. |  -  |
| **422** | The syntax of the request is valid but the request cannot be completed. Look for detail in body. |  -  |

<a name="ezsignbulksendtransmissionGetFormsDataV1"></a>
# **ezsignbulksendtransmissionGetFormsDataV1**
> EzsignbulksendtransmissionGetFormsDataV1Response ezsignbulksendtransmissionGetFormsDataV1(pkiEzsignbulksendtransmissionID)

Retrieve an existing Ezsignbulksendtransmission&#39;s forms data



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsignbulksendtransmissionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsignbulksendtransmissionApi apiInstance = new ObjectEzsignbulksendtransmissionApi(defaultClient);
    Integer pkiEzsignbulksendtransmissionID = 56; // Integer | 
    try {
      EzsignbulksendtransmissionGetFormsDataV1Response result = apiInstance.ezsignbulksendtransmissionGetFormsDataV1(pkiEzsignbulksendtransmissionID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsignbulksendtransmissionApi#ezsignbulksendtransmissionGetFormsDataV1");
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
| **pkiEzsignbulksendtransmissionID** | **Integer**|  | |

### Return type

[**EzsignbulksendtransmissionGetFormsDataV1Response**](EzsignbulksendtransmissionGetFormsDataV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/zip

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **404** | The element you are trying to work on does not exist |  -  |
| **406** | One of the accept header is not defined or invalid. |  -  |
| **422** | The syntax of the request is valid but the request cannot be completed. Look for detail in body. |  -  |

<a name="ezsignbulksendtransmissionGetObjectV1"></a>
# **ezsignbulksendtransmissionGetObjectV1**
> EzsignbulksendtransmissionGetObjectV1Response ezsignbulksendtransmissionGetObjectV1(pkiEzsignbulksendtransmissionID)

Retrieve an existing Ezsignbulksendtransmission



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsignbulksendtransmissionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsignbulksendtransmissionApi apiInstance = new ObjectEzsignbulksendtransmissionApi(defaultClient);
    Integer pkiEzsignbulksendtransmissionID = 56; // Integer | 
    try {
      EzsignbulksendtransmissionGetObjectV1Response result = apiInstance.ezsignbulksendtransmissionGetObjectV1(pkiEzsignbulksendtransmissionID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsignbulksendtransmissionApi#ezsignbulksendtransmissionGetObjectV1");
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
| **pkiEzsignbulksendtransmissionID** | **Integer**|  | |

### Return type

[**EzsignbulksendtransmissionGetObjectV1Response**](EzsignbulksendtransmissionGetObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **404** | The element you are trying to work on does not exist |  -  |
