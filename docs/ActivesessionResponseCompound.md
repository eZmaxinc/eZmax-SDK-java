

# ActivesessionResponseCompound

Payload for GET /1/object/activesession/getCurrent

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**eActivesessionUsertype** | **FieldEActivesessionUsertype** |  |  |
|**eActivesessionOrigin** | **FieldEActivesessionOrigin** |  |  |
|**eActivesessionWeekdaystart** | **FieldEActivesessionWeekdaystart** |  |  |
|**fkiLanguageID** | **Integer** | The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English| |  |
|**sCompanyNameX** | **String** | The Name of the Company in the language of the requester |  |
|**sDepartmentNameX** | **String** | The Name of the Department in the language of the requester |  |
|**bActivesessionDebug** | **Boolean** | Whether the active session is in debug or not |  |
|**bActivesessionIssuperadmin** | **Boolean** | Whether the active session is superadmin or not |  |
|**bActivesessionAttachment** | **Boolean** | Can access attachment when we clone a user |  [optional] |
|**bActivesessionCanafe** | **Boolean** | Can access canafe when we clone a user |  [optional] |
|**bActivesessionFinancial** | **Boolean** | Can access financial element when we clone a user |  [optional] |
|**bActivesessionRealestatecompleted** | **Boolean** | Can access closed realestate folders when we clone a user |  [optional] |
|**eActivesessionEzsign** | **FieldEActivesessionEzsign** |  |  [optional] |
|**eActivesessionEzsignaccess** | **FieldEActivesessionEzsignaccess** |  |  |
|**eActivesessionEzsignprepaid** | **FieldEActivesessionEzsignprepaid** |  |  [optional] |
|**eActivesessionRealestateinprogress** | **FieldEActivesessionRealestateinprogress** |  |  [optional] |
|**pksCustomerCode** | **String** | The customer code assigned to your account |  |
|**fkiSystemconfigurationtypeID** | **Integer** | The unique ID of the Systemconfigurationtype |  |
|**fkiSignatureID** | **Integer** | The unique ID of the Signature |  [optional] |
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



