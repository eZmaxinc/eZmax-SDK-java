

# ContactRequestCompoundV2

A Contact Object and children to create a complete structure

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**fkiContacttitleID** | **Integer** | The unique ID of the Contacttitle.  Valid values:  |Value|Description| |-|-| |1|Ms.| |2|Mr.| |4|(Blank)| |5|Me (For Notaries)| |  |
|**fkiLanguageID** | **Integer** | The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English| |  |
|**eContactType** | **FieldEContactType** |  |  |
|**sContactFirstname** | **String** | The First name of the contact |  |
|**sContactLastname** | **String** | The Last name of the contact |  |
|**sContactCompany** | **String** | The Company name of the contact |  [optional] |
|**dtContactBirthdate** | **String** | The Birth Date of the contact |  [optional] |
|**sContactOccupation** | **String** | The occupation of the Contact |  [optional] |
|**tContactNote** | **String** | The note of the Contact |  [optional] |
|**bContactIsactive** | **Boolean** | Whether the contact is active or not |  [optional] |
|**objContactinformations** | [**ContactinformationsRequestCompoundV2**](ContactinformationsRequestCompoundV2.md) |  |  |



