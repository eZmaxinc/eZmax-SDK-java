# ObjectSignatureApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**signatureCreateObjectV1**](ObjectSignatureApi.md#signatureCreateObjectV1) | **POST** /1/object/signature | Create a new Signature |
| [**signatureDeleteObjectV1**](ObjectSignatureApi.md#signatureDeleteObjectV1) | **DELETE** /1/object/signature/{pkiSignatureID} | Delete an existing Signature |
| [**signatureEditObjectV1**](ObjectSignatureApi.md#signatureEditObjectV1) | **PUT** /1/object/signature/{pkiSignatureID} | Edit an existing Signature |
| [**signatureGetObjectV2**](ObjectSignatureApi.md#signatureGetObjectV2) | **GET** /2/object/signature/{pkiSignatureID} | Retrieve an existing Signature |
| [**signatureGetObjectV3**](ObjectSignatureApi.md#signatureGetObjectV3) | **GET** /3/object/signature/{pkiSignatureID} | Retrieve an existing Signature |
| [**signatureGetSVGInitialsV1**](ObjectSignatureApi.md#signatureGetSVGInitialsV1) | **GET** /1/object/signature/{pkiSignatureID}/getSVGInitials | Retrieve an existing Signature initial SVG |
| [**signatureGetSVGSignatureV1**](ObjectSignatureApi.md#signatureGetSVGSignatureV1) | **GET** /1/object/signature/{pkiSignatureID}/getSVGSignature | Retrieve an existing Signature SVG |


<a id="signatureCreateObjectV1"></a>
# **signatureCreateObjectV1**
> SignatureCreateObjectV1Response signatureCreateObjectV1(signatureCreateObjectV1Request)

Create a new Signature

The endpoint allows to create one or many elements at once.

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectSignatureApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectSignatureApi apiInstance = new ObjectSignatureApi(defaultClient);
    SignatureCreateObjectV1Request signatureCreateObjectV1Request = new SignatureCreateObjectV1Request(); // SignatureCreateObjectV1Request | 
    try {
      SignatureCreateObjectV1Response result = apiInstance.signatureCreateObjectV1(signatureCreateObjectV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectSignatureApi#signatureCreateObjectV1");
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
| **signatureCreateObjectV1Request** | [**SignatureCreateObjectV1Request**](SignatureCreateObjectV1Request.md)|  | |

### Return type

[**SignatureCreateObjectV1Response**](SignatureCreateObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful response |  -  |

<a id="signatureDeleteObjectV1"></a>
# **signatureDeleteObjectV1**
> SignatureDeleteObjectV1Response signatureDeleteObjectV1(pkiSignatureID)

Delete an existing Signature



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectSignatureApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectSignatureApi apiInstance = new ObjectSignatureApi(defaultClient);
    Integer pkiSignatureID = 56; // Integer | The unique ID of the Signature
    try {
      SignatureDeleteObjectV1Response result = apiInstance.signatureDeleteObjectV1(pkiSignatureID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectSignatureApi#signatureDeleteObjectV1");
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
| **pkiSignatureID** | **Integer**| The unique ID of the Signature | |

### Return type

[**SignatureDeleteObjectV1Response**](SignatureDeleteObjectV1Response.md)

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

<a id="signatureEditObjectV1"></a>
# **signatureEditObjectV1**
> SignatureEditObjectV1Response signatureEditObjectV1(pkiSignatureID, signatureEditObjectV1Request)

Edit an existing Signature



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectSignatureApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectSignatureApi apiInstance = new ObjectSignatureApi(defaultClient);
    Integer pkiSignatureID = 56; // Integer | The unique ID of the Signature
    SignatureEditObjectV1Request signatureEditObjectV1Request = new SignatureEditObjectV1Request(); // SignatureEditObjectV1Request | 
    try {
      SignatureEditObjectV1Response result = apiInstance.signatureEditObjectV1(pkiSignatureID, signatureEditObjectV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectSignatureApi#signatureEditObjectV1");
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
| **pkiSignatureID** | **Integer**| The unique ID of the Signature | |
| **signatureEditObjectV1Request** | [**SignatureEditObjectV1Request**](SignatureEditObjectV1Request.md)|  | |

### Return type

[**SignatureEditObjectV1Response**](SignatureEditObjectV1Response.md)

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

<a id="signatureGetObjectV2"></a>
# **signatureGetObjectV2**
> SignatureGetObjectV2Response signatureGetObjectV2(pkiSignatureID)

Retrieve an existing Signature



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectSignatureApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectSignatureApi apiInstance = new ObjectSignatureApi(defaultClient);
    Integer pkiSignatureID = 56; // Integer | The unique ID of the Signature
    try {
      SignatureGetObjectV2Response result = apiInstance.signatureGetObjectV2(pkiSignatureID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectSignatureApi#signatureGetObjectV2");
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
| **pkiSignatureID** | **Integer**| The unique ID of the Signature | |

### Return type

[**SignatureGetObjectV2Response**](SignatureGetObjectV2Response.md)

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

<a id="signatureGetObjectV3"></a>
# **signatureGetObjectV3**
> SignatureGetObjectV3Response signatureGetObjectV3(pkiSignatureID)

Retrieve an existing Signature



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectSignatureApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectSignatureApi apiInstance = new ObjectSignatureApi(defaultClient);
    Integer pkiSignatureID = 56; // Integer | The unique ID of the Signature
    try {
      SignatureGetObjectV3Response result = apiInstance.signatureGetObjectV3(pkiSignatureID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectSignatureApi#signatureGetObjectV3");
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
| **pkiSignatureID** | **Integer**| The unique ID of the Signature | |

### Return type

[**SignatureGetObjectV3Response**](SignatureGetObjectV3Response.md)

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

<a id="signatureGetSVGInitialsV1"></a>
# **signatureGetSVGInitialsV1**
> signatureGetSVGInitialsV1(pkiSignatureID)

Retrieve an existing Signature initial SVG



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectSignatureApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectSignatureApi apiInstance = new ObjectSignatureApi(defaultClient);
    Integer pkiSignatureID = 56; // Integer | The unique ID of the Signature
    try {
      apiInstance.signatureGetSVGInitialsV1(pkiSignatureID);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectSignatureApi#signatureGetSVGInitialsV1");
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
| **pkiSignatureID** | **Integer**| The unique ID of the Signature | |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **302** | The user has been redirected |  -  |
| **404** | The request failed. The element on which you were trying to work does not exists. Look for detail about the error in the body |  -  |

<a id="signatureGetSVGSignatureV1"></a>
# **signatureGetSVGSignatureV1**
> signatureGetSVGSignatureV1(pkiSignatureID)

Retrieve an existing Signature SVG



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectSignatureApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectSignatureApi apiInstance = new ObjectSignatureApi(defaultClient);
    Integer pkiSignatureID = 56; // Integer | The unique ID of the Signature
    try {
      apiInstance.signatureGetSVGSignatureV1(pkiSignatureID);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectSignatureApi#signatureGetSVGSignatureV1");
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
| **pkiSignatureID** | **Integer**| The unique ID of the Signature | |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **302** | The user has been redirected |  -  |
| **404** | The request failed. The element on which you were trying to work does not exists. Look for detail about the error in the body |  -  |

