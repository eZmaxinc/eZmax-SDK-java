

# CustomEzsignsignaturestatusResponse

A Ezsignsignaturestatus Object and children to create a complete structure

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**eEzsignsignaturestatusSteptype** | [**EEzsignsignaturestatusSteptypeEnum**](#EEzsignsignaturestatusSteptypeEnum) | Type of step |  |
|**iEzsignsignaturestatusStep** | **Integer** | The step at which the Ezsignsigner will be invited to sign or fill the form fields |  |
|**iEzsignsignaturestatusTotal** | **Integer** | The total number of signature or form fields the Ezsignsigner must process at the current step |  |
|**iEzsignsignaturestatusSigned** | **Integer** | The number of signature or form fields the Ezsignsigner has already processed at the current step |  |
|**iEzsignsignaturestatusConditional** | **Integer** | The number of signature or form fields the Ezsignsigner need to sign or fill under current conditions. |  |



## Enum: EEzsignsignaturestatusSteptypeEnum

| Name | Value |
|---- | -----|
| FORM | &quot;Form&quot; |
| SIGNATURE | &quot;Signature&quot; |



