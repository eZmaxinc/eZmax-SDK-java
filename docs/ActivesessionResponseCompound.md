

# ActivesessionResponseCompound

Payload for GET /1/object/activesession/getCurrent

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**fkiEzsignuserID** | **Integer** | The unique ID of the Ezsignuser |  [optional] |
|**bSystemconfigurationEzsignpaidbyoffice** | **Boolean** | Whether if Ezsign is paid by the company or not |  [optional] |
|**eSystemconfigurationEzsignofficeplan** | **FieldESystemconfigurationEzsignofficeplan** |  |  [optional] |
|**eUserEzsignaccess** | **FieldEUserEzsignaccess** |  |  |
|**eUserEzsignprepaid** | **FieldEUserEzsignprepaid** |  |  [optional] |
|**bUserEzsigntrial** | **Boolean** | Whether the User&#39;s eZsign subscription is a trial |  [optional] |
|**dtUserEzsignprepaidexpiration** | **String** | The eZsign prepaid expiration date |  [optional] |
|**aPkiPermissionID** | **List&lt;Integer&gt;** | An array of permissions granted to the user or api key |  |
|**objUserReal** | [**ActivesessionResponseCompoundUser**](ActivesessionResponseCompoundUser.md) |  |  |
|**objUserCloned** | [**ActivesessionResponseCompoundUser**](ActivesessionResponseCompoundUser.md) |  |  [optional] |
|**objApikey** | [**ActivesessionResponseCompoundApikey**](ActivesessionResponseCompoundApikey.md) |  |  [optional] |
|**aEModuleInternalname** | **List&lt;String&gt;** | An Array of Registered modules.  These are the modules that are Licensed to be used by the User or the API Key. |  |



