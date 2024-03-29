

# EzsigntemplatesignatureRequestCompound

A Ezsigntemplatesignature Object and children

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**pkiEzsigntemplatesignatureID** | **Integer** | The unique ID of the Ezsigntemplatesignature |  [optional] |
|**fkiEzsigntemplatedocumentID** | **Integer** | The unique ID of the Ezsigntemplatedocument |  |
|**fkiEzsigntemplatesignerID** | **Integer** | The unique ID of the Ezsigntemplatesigner |  |
|**fkiEzsigntemplatesignerIDValidation** | **Integer** | The unique ID of the Ezsigntemplatesigner |  [optional] |
|**iEzsigntemplatedocumentpagePagenumber** | **Integer** | The page number in the Ezsigntemplatedocument |  |
|**iEzsigntemplatesignatureX** | **Integer** | The X coordinate (Horizontal) where to put the Ezsigntemplatesignature on the page.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsigntemplatesignature 2 inches from the left border of the page, you would use \&quot;200\&quot; for the X coordinate. |  |
|**iEzsigntemplatesignatureY** | **Integer** | The Y coordinate (Vertical) where to put the Ezsigntemplatesignature on the page.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsigntemplatesignature 3 inches from the top border of the page, you would use \&quot;300\&quot; for the Y coordinate. |  |
|**iEzsigntemplatesignatureStep** | **Integer** | The step when the Ezsigntemplatesigner will be invited to sign |  |
|**eEzsigntemplatesignatureType** | **FieldEEzsigntemplatesignatureType** |  |  |
|**tEzsigntemplatesignatureTooltip** | **String** | A tooltip that will be presented to Ezsigntemplatesigner about the Ezsigntemplatesignature |  [optional] |
|**eEzsigntemplatesignatureTooltipposition** | **FieldEEzsigntemplatesignatureTooltipposition** |  |  [optional] |
|**eEzsigntemplatesignatureFont** | **FieldEEzsigntemplatesignatureFont** |  |  [optional] |
|**bEzsigntemplatesignatureRequired** | **Boolean** | Whether the Ezsigntemplatesignature is required or not. This field is relevant only with Ezsigntemplatesignature with eEzsigntemplatesignatureType &#x3D; Attachments. |  [optional] |
|**eEzsigntemplatesignatureAttachmentnamesource** | **FieldEEzsigntemplatesignatureAttachmentnamesource** |  |  [optional] |
|**sEzsigntemplatesignatureAttachmentdescription** | **String** | The description attached to the attachment name added in Ezsigntemplatesignature of eEzsigntemplatesignatureType Attachments |  [optional] |
|**iEzsigntemplatesignatureValidationstep** | **Integer** | The step when the Ezsigntemplatesigner will be invited to validate the Ezsigntemplatesignature of eEzsigntemplatesignatureType Attachments |  [optional] |
|**bEzsigntemplatesignatureCustomdate** | **Boolean** | Whether the Ezsigntemplatesignature has a custom date format or not. (Only possible when eEzsigntemplatesignatureType is **Name** or **Handwritten**) |  [optional] |
|**aObjEzsigntemplatesignaturecustomdate** | [**List&lt;EzsigntemplatesignaturecustomdateRequestCompound&gt;**](EzsigntemplatesignaturecustomdateRequestCompound.md) | An array of custom date blocks that will be filled at the time of signature.  Can only be used if bEzsigntemplatesignatureCustomdate is true.  Use an empty array if you don&#39;t want to have a date at all. |  [optional] |



