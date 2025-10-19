

# CustomAttachmentImportIntoEDMResponse

A AttachmentImportIntoEDM object

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**pkiAttachmentIDSource** | **Integer** | The unique ID of the Attachment. |  [optional] |
|**pkiAttachmentIDNew** | **Integer** | The unique ID of the Attachment. |  [optional] |
|**eAttachmentStatus** | [**EAttachmentStatusEnum**](#EAttachmentStatusEnum) |  |  [optional] |
|**bAllowOverwrite** | **Boolean** | Whether we allow or not the file overwrite |  [optional] |



## Enum: EAttachmentStatusEnum

| Name | Value |
|---- | -----|
| ACCEPTED | &quot;Accepted&quot; |
| FILE_EXISTS | &quot;FileExists&quot; |
| FORBIDDEN | &quot;Forbidden&quot; |
| OVERWRITE | &quot;Overwrite&quot; |



