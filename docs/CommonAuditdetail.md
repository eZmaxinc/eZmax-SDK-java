

# CommonAuditdetail

Gives informations about the user that created the object or the last user to have modified it.  If the object was never modified after creation, both Created and Modified informations will be the same. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**fkiUserID** | **Integer** | The unique ID of the User |  |
|**fkiApikeyID** | **Integer** | The unique ID of the Apikey |  [optional] |
|**sUserLoginname** | **String** | The Login name of the User. |  |
|**sUserLastname** | **String** | The Last name of the user |  |
|**sUserFirstname** | **String** | The First name of the user |  |
|**sApikeyDescriptionX** | **String** | The description of the Apikey in the language of the requester |  [optional] |
|**dtAuditdetailDate** | **String** | Represent a Date Time. The timezone is the one configured in the User&#39;s profile. |  |



