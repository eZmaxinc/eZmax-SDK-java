

# CustomCommunicationrecipientsrecipientResponse

Generic AutocompleteElement Response

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**fkiAgentID** | **Integer** | The unique ID of the Agent. |  [optional] |
|**fkiBrokerID** | **Integer** | The unique ID of the Broker. |  [optional] |
|**fkiContactID** | **Integer** | The unique ID of the Contact |  [optional] |
|**fkiCustomerID** | **Integer** | The unique ID of the Customer. |  [optional] |
|**fkiEmployeeID** | **Integer** | The unique ID of the Employee. |  [optional] |
|**fkiEzsignsignerID** | **Integer** | The unique ID of the Ezsignsigner |  [optional] |
|**fkiFranchiseofficeID** | **Integer** | The unique ID of the Franchisereoffice |  [optional] |
|**fkiUserID** | **Integer** | The unique ID of the User |  [optional] |
|**fkiAgentincorporationID** | **Integer** | The unique ID of the Agentincorporation. |  [optional] |
|**fkiAssistantID** | **Integer** | The unique ID of the Assistant. |  [optional] |
|**fkiExternalbrokerID** | **Integer** | The unique ID of the Externalbroker. |  [optional] |
|**fkiEzcomagentID** | **Integer** | The unique ID of the Ezcomagent. |  [optional] |
|**fkiNotaryID** | **Integer** | The unique ID of the Notary. |  [optional] |
|**fkiRewardmemberID** | **Integer** | The unique ID of the Rewardmember. |  [optional] |
|**fkiSupplierID** | **Integer** | The unique ID of the Supplier. |  [optional] |
|**eCommunicationrecipientsrecipientObjecttype** | [**ECommunicationrecipientsrecipientObjecttypeEnum**](#ECommunicationrecipientsrecipientObjecttypeEnum) |  |  |
|**objContactName** | [**CustomContactNameResponse**](CustomContactNameResponse.md) |  |  |
|**objEmail** | [**EmailResponseCompound**](EmailResponseCompound.md) |  |  [optional] |
|**objPhoneFax** | [**PhoneResponseCompound**](PhoneResponseCompound.md) |  |  [optional] |
|**objPhoneSMS** | [**PhoneResponseCompound**](PhoneResponseCompound.md) |  |  [optional] |



## Enum: ECommunicationrecipientsrecipientObjecttypeEnum

| Name | Value |
|---- | -----|
| AGENT | &quot;Agent&quot; |
| AGENTINCORPORATION | &quot;Agentincorporation&quot; |
| ASSISTANT | &quot;Assistant&quot; |
| BROKER | &quot;Broker&quot; |
| CONTACT | &quot;Contact&quot; |
| CUSTOMER | &quot;Customer&quot; |
| EMPLOYEE | &quot;Employee&quot; |
| EXTERNALBROKER | &quot;Externalbroker&quot; |
| EZCOMAGENT | &quot;Ezcomagent&quot; |
| EZCOMCOMPANY | &quot;Ezcomcompany&quot; |
| EZSIGNSIGNER | &quot;Ezsignsigner&quot; |
| FRANCHISEOFFICE | &quot;Franchiseoffice&quot; |
| NOTARY | &quot;Notary&quot; |
| REWARDMEMBER | &quot;Rewardmember&quot; |
| SUPPLIER | &quot;Supplier&quot; |
| USER | &quot;User&quot; |



