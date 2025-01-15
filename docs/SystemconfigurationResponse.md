

# SystemconfigurationResponse

A Systemconfiguration Object

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**pkiSystemconfigurationID** | **Integer** | The unique ID of the Systemconfiguration |  |
|**fkiSystemconfigurationtypeID** | **Integer** | The unique ID of the Systemconfigurationtype |  |
|**fkiBrandingID** | **Integer** | The unique ID of the Branding |  [optional] |
|**sSystemconfigurationtypeDescriptionX** | **String** | The description of the Systemconfigurationtype in the language of the requester |  |
|**eSystemconfigurationNewexternaluseraction** | **FieldESystemconfigurationNewexternaluseraction** |  |  |
|**eSystemconfigurationLanguage1** | **FieldESystemconfigurationLanguage1** |  |  |
|**eSystemconfigurationLanguage2** | **FieldESystemconfigurationLanguage2** |  |  |
|**eSystemconfigurationEzsign** | **FieldESystemconfigurationEzsign** |  |  [optional] |
|**eSystemconfigurationEzsignofficeplan** | **FieldESystemconfigurationEzsignofficeplan** |  |  [optional] |
|**bSystemconfigurationEzsignpaidbyoffice** | **Boolean** | Whether if Ezsign is paid by the company or not |  [optional] |
|**bSystemconfigurationEzsignpersonnal** | **Boolean** | Whether if we allow the creation of personal files in eZsign |  |
|**bSystemconfigurationHascreditcardmerchant** | **Boolean** | Whether there is a creditcard merchant configured or not |  [optional] |
|**bSystemconfigurationIsdisposalactive** | **Boolean** | Whether is Disposal processus is active or not |  [optional] |
|**bSystemconfigurationSspr** | **Boolean** | Whether if we allow SSPR |  |
|**dtSystemconfigurationReadonlyexpirationstart** | **String** | The start date where the system will be in read only |  [optional] |
|**dtSystemconfigurationReadonlyexpirationend** | **String** | The end date where the system will be in read only |  [optional] |
|**objBranding** | [**Object**](Object.md) | A Custom Branding Object |  [optional] |



