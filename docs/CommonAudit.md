

# CommonAudit

Gives informations about the user that created the object and the last user to have modified it.  If the object was never modified after creation, both Created and Modified informations will be the same.  Apikey details will only be provided if the changes were made by an API key.  
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fkiUserIDCreated** | **Integer** | The unique ID of the User | 
**fkiUserIDModified** | **Integer** | The unique ID of the User | 
**fkiApikeyIDCreated** | **Integer** | The unique ID of the Apikey |  [optional]
**fkiApikeyIDModified** | **Integer** | The unique ID of the Apikey |  [optional]
**dtCreatedDate** | **String** | Represent a Date Time. The timezone is the one configured in the User&#39;s profile. | 
**dtModifiedDate** | **String** | Represent a Date Time. The timezone is the one configured in the User&#39;s profile. | 



