

# CommunicationResponse

A Communication Object

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**pkiCommunicationID** | **Integer** | The unique ID of the Communication. |  |
|**eCommunicationImportance** | **FieldECommunicationImportance** |  |  |
|**eCommunicationType** | **FieldECommunicationType** |  |  |
|**sCommunicationSubject** | **String** | The subject of the Communication |  |
|**sCommunicationBodyurl** | **String** | The url of the body used as body in the Communication |  [optional] |
|**eCommunicationDirection** | **ComputedECommunicationDirection** |  |  |
|**iCommunicationrecipientCount** | **Integer** | The count of Communicationrecipient |  |
|**objDescriptionstaticSender** | [**DescriptionstaticResponse**](DescriptionstaticResponse.md) |  |  [optional] |
|**objEmailstaticSender** | [**EmailstaticResponse**](EmailstaticResponse.md) |  |  [optional] |
|**objPhonestaticSender** | [**PhonestaticResponse**](PhonestaticResponse.md) |  |  [optional] |
|**objAudit** | [**CommonAudit**](CommonAudit.md) |  |  |



