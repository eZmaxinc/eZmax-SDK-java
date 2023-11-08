

# CommunicationRequestCompound

Request for POST /1/object/communication

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**pkiCommunicationID** | **Integer** | The unique ID of the Communication. |  [optional] |
|**eCommunicationImportance** | **FieldECommunicationImportance** |  |  [optional] |
|**eCommunicationType** | **FieldECommunicationType** |  |  |
|**objCommunicationsender** | [**CustomCommunicationsenderRequest**](CustomCommunicationsenderRequest.md) |  |  [optional] |
|**sCommunicationSubject** | **String** | The subject of the Communication |  [optional] |
|**tCommunicationBody** | **String** | The Body of the Communication |  |
|**bCommunicationPrivate** | **Boolean** | Whether the Communication is private or not |  |
|**eCommunicationAttachmenttype** | [**ECommunicationAttachmenttypeEnum**](#ECommunicationAttachmenttypeEnum) | How the attachment should be included in the email.   Only used if eCommunicationType is **Email** |  [optional] |
|**iCommunicationAttachmentlinkexpiration** | **Integer** | The number of days before the attachment link expired.   Only used if eCommunicationType is **Email** and eCommunicationattachmentType is **Link** |  [optional] |
|**bCommunicationReadreceipt** | **Boolean** | Whether we ask for a read receipt or not. |  [optional] |
|**aObjCommunicationattachment** | [**List&lt;CustomCommunicationattachmentRequest&gt;**](CustomCommunicationattachmentRequest.md) |  |  |
|**aObjCommunicationrecipient** | [**List&lt;CommunicationrecipientRequestCompound&gt;**](CommunicationrecipientRequestCompound.md) |  |  |
|**aObjCommunicationreference** | [**List&lt;CommunicationreferenceRequestCompound&gt;**](CommunicationreferenceRequestCompound.md) |  |  |
|**aObjCommunicationexternalrecipient** | [**List&lt;CommunicationexternalrecipientRequestCompound&gt;**](CommunicationexternalrecipientRequestCompound.md) |  |  |



## Enum: ECommunicationAttachmenttypeEnum

| Name | Value |
|---- | -----|
| ATTACHMENT | &quot;Attachment&quot; |
| URL | &quot;Url&quot; |



