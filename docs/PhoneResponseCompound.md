

# PhoneResponseCompound

A Phone Object and children to create a complete structure

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**pkiPhoneID** | **Integer** | The unique ID of the Phone. |  |
|**fkiPhonetypeID** | **Integer** | The unique ID of the Phonetype.  Valid values:  |Value|Description| |-|-| |1|Office| |2|Home| |3|Mobile| |4|Fax| |5|Pager| |6|Toll Free| |  |
|**ePhoneType** | **FieldEPhoneType** |  |  [optional] |
|**sPhoneE164** | **String** | A phone number in E.164 Format |  [optional] |
|**sPhoneExtension** | **String** | The extension of the phone number.  The extension is the \&quot;123\&quot; section in this sample phone number: (514) 990-1516 x123.  It can also be used with international phone numbers |  [optional] |
|**bPhoneInternational** | **Boolean** | Indicate the phone number is an international phone number. |  [optional] |



