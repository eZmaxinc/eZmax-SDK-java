

# CustomCommunicationsenderResponse

Generic Communicationsender Response

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**fkiAgentID** | **Integer** | The unique ID of the Agent. |  [optional] |
|**fkiBrokerID** | **Integer** | The unique ID of the Broker. |  [optional] |
|**fkiUserID** | **Integer** | The unique ID of the User |  [optional] |
|**fkiMailboxsharedID** | **Integer** | The unique ID of the Mailboxshared |  [optional] |
|**fkiPhonelinesharedID** | **Integer** | The unique ID of the Phonelineshared |  [optional] |
|**eCommunicationsenderObjecttype** | [**ECommunicationsenderObjecttypeEnum**](#ECommunicationsenderObjecttypeEnum) |  |  |
|**objContactName** | [**CustomContactNameResponse**](CustomContactNameResponse.md) |  |  |
|**objEmail** | [**EmailResponseCompound**](EmailResponseCompound.md) |  |  [optional] |
|**objPhoneFax** | [**PhoneResponseCompound**](PhoneResponseCompound.md) |  |  [optional] |
|**objPhoneSMS** | [**PhoneResponseCompound**](PhoneResponseCompound.md) |  |  [optional] |



## Enum: ECommunicationsenderObjecttypeEnum

| Name | Value |
|---- | -----|
| AGENT | &quot;Agent&quot; |
| BROKER | &quot;Broker&quot; |
| USER | &quot;User&quot; |
| MAILBOXSHARED | &quot;Mailboxshared&quot; |
| PHONELINESHARED | &quot;Phonelineshared&quot; |



