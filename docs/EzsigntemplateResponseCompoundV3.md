

# EzsigntemplateResponseCompoundV3

A Ezsigntemplate Object

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**pkiEzsigntemplateID** | **Integer** | The unique ID of the Ezsigntemplate |  |
|**fkiEzsigntemplatedocumentID** | **Integer** | The unique ID of the Ezsigntemplatedocument |  [optional] |
|**fkiEzsignfoldertypeID** | **Integer** | The unique ID of the Ezsignfoldertype. |  [optional] |
|**objEzsignfoldertype** | [**CustomEzsignfoldertypeTemplateResponse**](CustomEzsignfoldertypeTemplateResponse.md) |  |  [optional] |
|**fkiLanguageID** | **Integer** | The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English| |  |
|**fkiEzdoctemplatedocumentID** | **Integer** | The unique ID of the Ezdoctemplatedocument |  [optional] |
|**sEzdoctemplatedocumentNameX** | **String** | The name of the Ezdoctemplatedocument in the language of the requester |  [optional] |
|**sLanguageNameX** | **String** | The Name of the Language in the language of the requester |  |
|**sEzsigntemplateDescription** | **String** | The description of the Ezsigntemplate |  |
|**sEzsigntemplateExternaldescription** | **String** | The external description of the Ezsigntemplate |  [optional] |
|**tEzsigntemplateComment** | **String** | The comment of the Ezsigntemplate |  [optional] |
|**eEzsigntemplateRecognition** | **FieldEEzsigntemplateRecognition** |  |  [optional] |
|**sEzsigntemplateFilenameregexp** | **String** | The filename regexp of the Ezsigntemplate. |  [optional] |
|**bEzsigntemplateAdminonly** | **Boolean** | Whether the Ezsigntemplate can be accessed by admin users only (eUserType&#x3D;Normal) |  |
|**sEzsignfoldertypeNameX** | **String** | The name of the Ezsignfoldertype in the language of the requester |  [optional] |
|**objAudit** | [**CommonAudit**](CommonAudit.md) |  |  |
|**bEzsigntemplateEditallowed** | **Boolean** | Whether the Ezsigntemplate if allowed to edit or not |  |
|**eEzsigntemplateType** | **FieldEEzsigntemplateType** |  |  [optional] |
|**objEzsigntemplatedocument** | [**EzsigntemplatedocumentResponse**](EzsigntemplatedocumentResponse.md) |  |  [optional] |
|**aObjEzsigntemplatesigner** | [**List&lt;EzsigntemplatesignerResponseCompound&gt;**](EzsigntemplatesignerResponseCompound.md) |  |  |



