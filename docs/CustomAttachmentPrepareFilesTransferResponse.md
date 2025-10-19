

# CustomAttachmentPrepareFilesTransferResponse

A AttachmentPrepareFilesTransfer object

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**sAttachmentName** | **String** | The name of the Attachment |  |
|**sAttachmentMD5** | **String** | The MD5 of the Attachment |  |
|**eAttachmentAction** | [**EAttachmentActionEnum**](#EAttachmentActionEnum) | Returns the action required for the attachment |  |



## Enum: EAttachmentActionEnum

| Name | Value |
|---- | -----|
| ACCEPT | &quot;Accept&quot; |
| DISCARD | &quot;Discard&quot; |
| OVERWRITE | &quot;Overwrite&quot; |
| REJECT | &quot;Reject&quot; |
| RESTORE | &quot;Restore&quot; |



