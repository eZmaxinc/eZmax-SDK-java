

# EzsignformfieldRequest

A Ezsignformfield Object

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**pkiEzsignformfieldID** | **Integer** | The unique ID of the Ezsignformfield |  [optional] |
|**iEzsignpagePagenumber** | **Integer** | The page number in the Ezsigndocument |  |
|**sEzsignformfieldLabel** | **String** | The Label for the Ezsignformfield |  |
|**sEzsignformfieldValue** | **String** | The value for the Ezsignformfield  This can only be set if eEzsignformfieldgroupType is Checkbox or Radio |  [optional] |
|**iEzsignformfieldX** | **Integer** | The X coordinate (Horizontal) where to put the Ezsignformfield on the Ezsignpage.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsignformfield 2 inches from the left border of the page, you would use \&quot;200\&quot; for the X coordinate. |  |
|**iEzsignformfieldY** | **Integer** | The Y coordinate (Vertical) where to put the Ezsignformfield on the Ezsignpage.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsignformfield 3 inches from the top border of the page, you would use \&quot;300\&quot; for the Y coordinate. |  |
|**iEzsignformfieldWidth** | **Integer** | The Width of the Ezsignformfield in pixels calculated at 100 DPI |  |
|**iEzsignformfieldHeight** | **Integer** | The Height of the Ezsignformfield in pixels calculated at 100 DPI  |  |
|**bEzsignformfieldAutocomplete** | **Boolean** | Whether the Ezsignformfield allows the use of the autocomplete of the browser.  This can only be set if eEzsignformfieldgroupType is **Text** |  [optional] |
|**bEzsignformfieldSelected** | **Boolean** | Whether the Ezsignformfield is selected or not by default.  This can only be set if eEzsignformfieldgroupType is **Checkbox** or **Radio** |  [optional] |
|**sEzsignformfieldEnteredvalue** | **String** | This is the value enterred for the Ezsignformfield  This can only be set if eEzsignformfieldgroupType is **Dropdown**, **Text** or **Textarea** |  [optional] |
|**eEzsignformfieldDependencyrequirement** | **FieldEEzsignformfieldDependencyrequirement** |  |  [optional] |
|**eEzsignformfieldHorizontalalignment** | **EnumHorizontalalignment** |  |  [optional] |
|**objTextstylestatic** | [**TextstylestaticRequestCompound**](TextstylestaticRequestCompound.md) |  |  [optional] |



