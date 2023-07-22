

# CommonFile

Object representing a file used in a request or response context 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**sFileName** | **String** | The name of the file |  |
|**sFileUrl** | **String** | The URL used to reach the File |  [optional] |
|**sFileBase64** | **byte[]** | The Base64 encoded binary content of the File |  [optional] |
|**eFileSource** | [**EFileSourceEnum**](#EFileSourceEnum) | The source of the File |  |



## Enum: EFileSourceEnum

| Name | Value |
|---- | -----|
| BASE64 | &quot;Base64&quot; |
| URL | &quot;Url&quot; |



