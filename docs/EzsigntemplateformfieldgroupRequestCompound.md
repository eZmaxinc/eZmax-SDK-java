

# EzsigntemplateformfieldgroupRequestCompound

A Ezsigntemplateformfieldgroup Object and children

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**pkiEzsigntemplateformfieldgroupID** | **Integer** | The unique ID of the Ezsigntemplateformfieldgroup |  [optional] |
|**fkiEzsigntemplatedocumentID** | **Integer** | The unique ID of the Ezsigntemplatedocument |  |
|**eEzsigntemplateformfieldgroupType** | **FieldEEzsigntemplateformfieldgroupType** |  |  |
|**eEzsigntemplateformfieldgroupSignerrequirement** | **FieldEEzsigntemplateformfieldgroupSignerrequirement** |  |  [optional] |
|**sEzsigntemplateformfieldgroupLabel** | **String** | The Label for the Ezsigntemplateformfieldgroup |  |
|**iEzsigntemplateformfieldgroupStep** | **Integer** | The step when the Ezsigntemplatesigner will be invited to fill the form fields |  |
|**sEzsigntemplateformfieldgroupDefaultvalue** | **String** | The default value for the Ezsigntemplateformfieldgroup  You can use the codes below and they will be replaced at signature time.    | Code | Description | Example | | ------------------------- | ------------ | ------------ | | {sUserFirstname} | The first name of the contact | John | | {sUserLastname} | The last name of the contact | Doe | | {sUserJobtitle} | The job title | Sales Representative | | {sEmailAddress} | The email address | email@example.com | | {sPhoneE164} | A phone number in E.164 Format | +15149901516 | | {sPhoneE164Cell} | A phone number in E.164 Format | +15149901516 | |  |
|**iEzsigntemplateformfieldgroupFilledmin** | **Integer** | The minimum number of Ezsigntemplateformfield that must be filled in the Ezsigntemplateformfieldgroup |  |
|**iEzsigntemplateformfieldgroupFilledmax** | **Integer** | The maximum number of Ezsigntemplateformfield that must be filled in the Ezsigntemplateformfieldgroup |  |
|**bEzsigntemplateformfieldgroupReadonly** | **Boolean** | Whether the Ezsigntemplateformfieldgroup is read only or not. |  |
|**iEzsigntemplateformfieldgroupMaxlength** | **Integer** | The maximum length for the value in the Ezsigntemplateformfieldgroup  This can only be set if eEzsigntemplateformfieldgroupType is **Text** or **Textarea** |  [optional] |
|**bEzsigntemplateformfieldgroupEncrypted** | **Boolean** | Whether the Ezsigntemplateformfieldgroup is encrypted in the database or not. Encrypted values are not displayed on the Ezsigndocument. This can only be set if eEzsigntemplateformfieldgroupType is **Text** or **Textarea** |  [optional] |
|**sEzsigntemplateformfieldgroupRegexp** | **String** | A regular expression to indicate what values are acceptable for the Ezsigntemplateformfieldgroup.  This can only be set if eEzsigntemplateformfieldgroupType is **Text** or **Textarea** |  [optional] |
|**sEzsigntemplateformfieldgroupTextvalidationcustommessage** | **String** | Description of validation rule. Show by signatory. |  [optional] |
|**eEzsigntemplateformfieldgroupTextvalidation** | **EnumTextvalidation** |  |  [optional] |
|**tEzsigntemplateformfieldgroupTooltip** | **String** | A tooltip that will be presented to Ezsigntemplatesigner about the Ezsigntemplateformfieldgroup |  [optional] |
|**eEzsigntemplateformfieldgroupTooltipposition** | **FieldEEzsigntemplateformfieldgroupTooltipposition** |  |  [optional] |
|**aObjEzsigntemplateformfieldgroupsigner** | [**List&lt;EzsigntemplateformfieldgroupsignerRequestCompound&gt;**](EzsigntemplateformfieldgroupsignerRequestCompound.md) |  |  |
|**aObjDropdownElement** | [**List&lt;CustomDropdownElementRequestCompound&gt;**](CustomDropdownElementRequestCompound.md) |  |  [optional] |
|**aObjEzsigntemplateformfield** | [**List&lt;EzsigntemplateformfieldRequestCompound&gt;**](EzsigntemplateformfieldRequestCompound.md) |  |  |



