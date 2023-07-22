# ObjectSubnetApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**subnetCreateObjectV1**](ObjectSubnetApi.md#subnetCreateObjectV1) | **POST** /1/object/subnet | Create a new Subnet |
| [**subnetDeleteObjectV1**](ObjectSubnetApi.md#subnetDeleteObjectV1) | **DELETE** /1/object/subnet/{pkiSubnetID} | Delete an existing Subnet |
| [**subnetEditObjectV1**](ObjectSubnetApi.md#subnetEditObjectV1) | **PUT** /1/object/subnet/{pkiSubnetID} | Edit an existing Subnet |
| [**subnetGetObjectV2**](ObjectSubnetApi.md#subnetGetObjectV2) | **GET** /2/object/subnet/{pkiSubnetID} | Retrieve an existing Subnet |


<a id="subnetCreateObjectV1"></a>
# **subnetCreateObjectV1**
> SubnetCreateObjectV1Response subnetCreateObjectV1(subnetCreateObjectV1Request)

Create a new Subnet

The endpoint allows to create one or many elements at once.

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectSubnetApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectSubnetApi apiInstance = new ObjectSubnetApi(defaultClient);
    SubnetCreateObjectV1Request subnetCreateObjectV1Request = new SubnetCreateObjectV1Request(); // SubnetCreateObjectV1Request | 
    try {
      SubnetCreateObjectV1Response result = apiInstance.subnetCreateObjectV1(subnetCreateObjectV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectSubnetApi#subnetCreateObjectV1");
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
| **subnetCreateObjectV1Request** | [**SubnetCreateObjectV1Request**](SubnetCreateObjectV1Request.md)|  | |

### Return type

[**SubnetCreateObjectV1Response**](SubnetCreateObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful response |  -  |
| **422** | The request was syntactically valid but failed because of an interdependance condition. Look for detail about the error in the body |  -  |

<a id="subnetDeleteObjectV1"></a>
# **subnetDeleteObjectV1**
> SubnetDeleteObjectV1Response subnetDeleteObjectV1(pkiSubnetID)

Delete an existing Subnet



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectSubnetApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectSubnetApi apiInstance = new ObjectSubnetApi(defaultClient);
    Integer pkiSubnetID = 56; // Integer | The unique ID of the Subnet
    try {
      SubnetDeleteObjectV1Response result = apiInstance.subnetDeleteObjectV1(pkiSubnetID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectSubnetApi#subnetDeleteObjectV1");
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
| **pkiSubnetID** | **Integer**| The unique ID of the Subnet | |

### Return type

[**SubnetDeleteObjectV1Response**](SubnetDeleteObjectV1Response.md)

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
| **422** | The request was syntactically valid but failed because of an interdependance condition. Look for detail about the error in the body |  -  |

<a id="subnetEditObjectV1"></a>
# **subnetEditObjectV1**
> SubnetEditObjectV1Response subnetEditObjectV1(pkiSubnetID, subnetEditObjectV1Request)

Edit an existing Subnet



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectSubnetApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectSubnetApi apiInstance = new ObjectSubnetApi(defaultClient);
    Integer pkiSubnetID = 56; // Integer | The unique ID of the Subnet
    SubnetEditObjectV1Request subnetEditObjectV1Request = new SubnetEditObjectV1Request(); // SubnetEditObjectV1Request | 
    try {
      SubnetEditObjectV1Response result = apiInstance.subnetEditObjectV1(pkiSubnetID, subnetEditObjectV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectSubnetApi#subnetEditObjectV1");
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
| **pkiSubnetID** | **Integer**| The unique ID of the Subnet | |
| **subnetEditObjectV1Request** | [**SubnetEditObjectV1Request**](SubnetEditObjectV1Request.md)|  | |

### Return type

[**SubnetEditObjectV1Response**](SubnetEditObjectV1Response.md)

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

<a id="subnetGetObjectV2"></a>
# **subnetGetObjectV2**
> SubnetGetObjectV2Response subnetGetObjectV2(pkiSubnetID)

Retrieve an existing Subnet



### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectSubnetApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectSubnetApi apiInstance = new ObjectSubnetApi(defaultClient);
    Integer pkiSubnetID = 56; // Integer | The unique ID of the Subnet
    try {
      SubnetGetObjectV2Response result = apiInstance.subnetGetObjectV2(pkiSubnetID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectSubnetApi#subnetGetObjectV2");
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
| **pkiSubnetID** | **Integer**| The unique ID of the Subnet | |

### Return type

[**SubnetGetObjectV2Response**](SubnetGetObjectV2Response.md)

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

