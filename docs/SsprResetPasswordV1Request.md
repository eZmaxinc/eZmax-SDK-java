

# SsprResetPasswordV1Request

Request for the /1/module/sspr/resetPassword API Request
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pksCustomerCode** | **String** | The customer code assigned to your account | 
**fkiLanguageID** | **Integer** | The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English| | 
**eUserTypeSSPR** | **FieldEUserTypeSSPR** |  | 
**sEmailAddress** | **String** | The email address. |  [optional]
**sUserLoginname** | **String** | The Login name of the User. |  [optional]
**binUserSSPRtoken** | **String** | Hex Encoded Secret SSPR token | 



