# ObjectApikeyApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apikeyCreateObjectV2**](ObjectApikeyApi.md#apikeyCreateObjectV2) | **POST** /2/object/apikey | Create a new Apikey |
| [**apikeyEditObjectV1**](ObjectApikeyApi.md#apikeyEditObjectV1) | **PUT** /1/object/apikey/{pkiApikeyID} | Edit an existing Apikey |
| [**apikeyEditPermissionsV1**](ObjectApikeyApi.md#apikeyEditPermissionsV1) | **PUT** /1/object/apikey/{pkiApikeyID}/editPermissions | Edit multiple Permissions |
| [**apikeyGetCorsV1**](ObjectApikeyApi.md#apikeyGetCorsV1) | **GET** /1/object/apikey/{pkiApikeyID}/getCors | Retrieve an existing Apikey&#39;s cors |
| [**apikeyGetListV1**](ObjectApikeyApi.md#apikeyGetListV1) | **GET** /1/object/apikey/getList | Retrieve Apikey list |
| [**apikeyGetObjectV2**](ObjectApikeyApi.md#apikeyGetObjectV2) | **GET** /2/object/apikey/{pkiApikeyID} | Retrieve an existing Apikey |
| [**apikeyGetPermissionsV1**](ObjectApikeyApi.md#apikeyGetPermissionsV1) | **GET** /1/object/apikey/{pkiApikeyID}/getPermissions | Retrieve an existing Apikey&#39;s Permissions |
| [**apikeyGetSubnetsV1**](ObjectApikeyApi.md#apikeyGetSubnetsV1) | **GET** /1/object/apikey/{pkiApikeyID}/getSubnets | Retrieve an existing Apikey&#39;s subnets |
| [**apikeyRegenerateV1**](ObjectApikeyApi.md#apikeyRegenerateV1) | **POST** /1/object/apikey/{pkiApikeyID}/regenerate | Regenerate the Apikey |


<a id="apikeyCreateObjectV2"></a>
# **apikeyCreateObjectV2**
> ApikeyCreateObjectV2Response apikeyCreateObjectV2(apikeyCreateObjectV2Request)

Create a new Apikey

The endpoint allows to create one or many elements at once.

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectApikeyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectApikeyApi apiInstance = new ObjectApikeyApi(defaultClient);
    ApikeyCreateObjectV2Request apikeyCreateObjectV2Request = new ApikeyCreateObjectV2Request(); // ApikeyCreateObjectV2Request | 
    try {
      ApikeyCreateObjectV2Response result = apiInstance.apikeyCreateObjectV2(apikeyCreateObjectV2Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectApikeyApi#apikeyCreateObjectV2");
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
| **apikeyCreateObjectV2Request** | [**ApikeyCreateObjectV2Request**](ApikeyCreateObjectV2Request.md)|  | |

### Return type

[**ApikeyCreateObjectV2Response**](ApikeyCreateObjectV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful response |  -  |

<a id="apikeyEditObjectV1"></a>
# **apikeyEditObjectV1**
> ApikeyEditObjectV1Response apikeyEditObjectV1(pkiApikeyID, apikeyEditObjectV1Request)

Edit an existing Apikey



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectApikeyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectApikeyApi apiInstance = new ObjectApikeyApi(defaultClient);
    Integer pkiApikeyID = 56; // Integer | The unique ID of the Apikey
    ApikeyEditObjectV1Request apikeyEditObjectV1Request = new ApikeyEditObjectV1Request(); // ApikeyEditObjectV1Request | 
    try {
      ApikeyEditObjectV1Response result = apiInstance.apikeyEditObjectV1(pkiApikeyID, apikeyEditObjectV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectApikeyApi#apikeyEditObjectV1");
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
| **pkiApikeyID** | **Integer**| The unique ID of the Apikey | |
| **apikeyEditObjectV1Request** | [**ApikeyEditObjectV1Request**](ApikeyEditObjectV1Request.md)|  | |

### Return type

[**ApikeyEditObjectV1Response**](ApikeyEditObjectV1Response.md)

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

<a id="apikeyEditPermissionsV1"></a>
# **apikeyEditPermissionsV1**
> ApikeyEditPermissionsV1Response apikeyEditPermissionsV1(pkiApikeyID, apikeyEditPermissionsV1Request)

Edit multiple Permissions

Using this endpoint, you can edit multiple Permissions at the same time.

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectApikeyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectApikeyApi apiInstance = new ObjectApikeyApi(defaultClient);
    Integer pkiApikeyID = 56; // Integer | 
    ApikeyEditPermissionsV1Request apikeyEditPermissionsV1Request = new ApikeyEditPermissionsV1Request(); // ApikeyEditPermissionsV1Request | 
    try {
      ApikeyEditPermissionsV1Response result = apiInstance.apikeyEditPermissionsV1(pkiApikeyID, apikeyEditPermissionsV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectApikeyApi#apikeyEditPermissionsV1");
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
| **pkiApikeyID** | **Integer**|  | |
| **apikeyEditPermissionsV1Request** | [**ApikeyEditPermissionsV1Request**](ApikeyEditPermissionsV1Request.md)|  | |

### Return type

[**ApikeyEditPermissionsV1Response**](ApikeyEditPermissionsV1Response.md)

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

<a id="apikeyGetCorsV1"></a>
# **apikeyGetCorsV1**
> ApikeyGetCorsV1Response apikeyGetCorsV1(pkiApikeyID)

Retrieve an existing Apikey&#39;s cors

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectApikeyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectApikeyApi apiInstance = new ObjectApikeyApi(defaultClient);
    Integer pkiApikeyID = 56; // Integer | 
    try {
      ApikeyGetCorsV1Response result = apiInstance.apikeyGetCorsV1(pkiApikeyID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectApikeyApi#apikeyGetCorsV1");
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
| **pkiApikeyID** | **Integer**|  | |

### Return type

[**ApikeyGetCorsV1Response**](ApikeyGetCorsV1Response.md)

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

<a id="apikeyGetListV1"></a>
# **apikeyGetListV1**
> ApikeyGetListV1Response apikeyGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Apikey list

Enum values that can be filtered in query parameter *sFilter*:  | Variable | Valid values | |---|---|

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectApikeyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectApikeyApi apiInstance = new ObjectApikeyApi(defaultClient);
    String eOrderBy = "pkiApikeyID_ASC"; // String | Specify how you want the results to be sorted
    Integer iRowMax = 56; // Integer | 
    Integer iRowOffset = 0; // Integer | 
    HeaderAcceptLanguage acceptLanguage = HeaderAcceptLanguage.fromValue("*"); // HeaderAcceptLanguage | 
    String sFilter = "sFilter_example"; // String | 
    try {
      ApikeyGetListV1Response result = apiInstance.apikeyGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectApikeyApi#apikeyGetListV1");
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
| **eOrderBy** | **String**| Specify how you want the results to be sorted | [optional] [enum: pkiApikeyID_ASC, pkiApikeyID_DESC, sApikeyDescriptionX_ASC, sApikeyDescriptionX_DESC, bApikeyIssigned_ASC, bApikeyIssigned_DESC, bApikeyIsactive_ASC, bApikeyIsactive_DESC, sUserFirstname_ASC, sUserFirstname_DESC, sUserLastname_ASC, sUserLastname_DESC] |
| **iRowMax** | **Integer**|  | [optional] |
| **iRowOffset** | **Integer**|  | [optional] [default to 0] |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |
| **sFilter** | **String**|  | [optional] |

### Return type

[**ApikeyGetListV1Response**](ApikeyGetListV1Response.md)

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

<a id="apikeyGetObjectV2"></a>
# **apikeyGetObjectV2**
> ApikeyGetObjectV2Response apikeyGetObjectV2(pkiApikeyID)

Retrieve an existing Apikey



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectApikeyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectApikeyApi apiInstance = new ObjectApikeyApi(defaultClient);
    Integer pkiApikeyID = 56; // Integer | The unique ID of the Apikey
    try {
      ApikeyGetObjectV2Response result = apiInstance.apikeyGetObjectV2(pkiApikeyID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectApikeyApi#apikeyGetObjectV2");
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
| **pkiApikeyID** | **Integer**| The unique ID of the Apikey | |

### Return type

[**ApikeyGetObjectV2Response**](ApikeyGetObjectV2Response.md)

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

<a id="apikeyGetPermissionsV1"></a>
# **apikeyGetPermissionsV1**
> ApikeyGetPermissionsV1Response apikeyGetPermissionsV1(pkiApikeyID)

Retrieve an existing Apikey&#39;s Permissions

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectApikeyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectApikeyApi apiInstance = new ObjectApikeyApi(defaultClient);
    Integer pkiApikeyID = 56; // Integer | 
    try {
      ApikeyGetPermissionsV1Response result = apiInstance.apikeyGetPermissionsV1(pkiApikeyID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectApikeyApi#apikeyGetPermissionsV1");
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
| **pkiApikeyID** | **Integer**|  | |

### Return type

[**ApikeyGetPermissionsV1Response**](ApikeyGetPermissionsV1Response.md)

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

<a id="apikeyGetSubnetsV1"></a>
# **apikeyGetSubnetsV1**
> ApikeyGetSubnetsV1Response apikeyGetSubnetsV1(pkiApikeyID)

Retrieve an existing Apikey&#39;s subnets

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectApikeyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectApikeyApi apiInstance = new ObjectApikeyApi(defaultClient);
    Integer pkiApikeyID = 56; // Integer | 
    try {
      ApikeyGetSubnetsV1Response result = apiInstance.apikeyGetSubnetsV1(pkiApikeyID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectApikeyApi#apikeyGetSubnetsV1");
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
| **pkiApikeyID** | **Integer**|  | |

### Return type

[**ApikeyGetSubnetsV1Response**](ApikeyGetSubnetsV1Response.md)

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

<a id="apikeyRegenerateV1"></a>
# **apikeyRegenerateV1**
> ApikeyRegenerateV1Response apikeyRegenerateV1(pkiApikeyID, apikeyRegenerateV1Request)

Regenerate the Apikey



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectApikeyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectApikeyApi apiInstance = new ObjectApikeyApi(defaultClient);
    Integer pkiApikeyID = 56; // Integer | 
    ApikeyRegenerateV1Request apikeyRegenerateV1Request = new ApikeyRegenerateV1Request(); // ApikeyRegenerateV1Request | 
    try {
      ApikeyRegenerateV1Response result = apiInstance.apikeyRegenerateV1(pkiApikeyID, apikeyRegenerateV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectApikeyApi#apikeyRegenerateV1");
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
| **pkiApikeyID** | **Integer**|  | |
| **apikeyRegenerateV1Request** | [**ApikeyRegenerateV1Request**](ApikeyRegenerateV1Request.md)|  | |

### Return type

[**ApikeyRegenerateV1Response**](ApikeyRegenerateV1Response.md)

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

