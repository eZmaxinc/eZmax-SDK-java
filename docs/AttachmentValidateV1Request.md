

# AttachmentValidateV1Request

Request for POST /1/object/attachment/{pkiAttachmentID}/validate

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**fkiAttachmentrejectreasonID** | **Integer** | The unique ID of the Attachmentrejectreason |  [optional] |
|**eAttachmentVerified** | **FieldEAttachmentVerified** |  |  |
|**tAttachmentRejectioncomment** | **String** | The rejectioncomment of the Attachment |  [optional] |
|**aSNotificationEmailAddress** | **Set&lt;String&gt;** | A list of email addresses to send a rejection notification to. |  [optional] |
|**tNotificationMessage** | **String** | The email body to send to the notification recipients. |  [optional] |
|**bNotificationIncludeAttachment** | **Boolean** | Should a copy of the attachment be included in the email. |  [optional] |



