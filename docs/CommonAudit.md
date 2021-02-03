

# CommonAudit

Gives informations about the user that created the object and the last user to have modified it.  If the object was never modified after creation, both Created and Modified informations will be the same.  Apikey details will only be provided if the changes were made by an API key.  
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fkiUserIDCreated** | **Integer** | The id of the User that created the object. | 
**fkiUserIDModified** | **Integer** | The id of the User that made the last modification on the object. | 
**fkiApikeyIDCreated** | **Integer** | The id of the API Key that created the object. |  [optional]
**fkiApikeyIDModified** | **Integer** | The id of the API Key that made the last modification on the object. |  [optional]
**dtCreatedDate** | **String** | Represent a Date Time. The timezone is the one configured in the User&#39;s profile. | 
**dtModifiedDate** | **String** | Represent a Date Time. The timezone is the one configured in the User&#39;s profile. | 



