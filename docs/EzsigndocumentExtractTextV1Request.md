

# EzsigndocumentExtractTextV1Request

Request for POST /1/object/ezsigndocument/{pkiEzsigndocumentID}/extractText

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**iPage** | **Integer** | The page where the area is located |  |
|**eSection** | [**ESectionEnum**](#ESectionEnum) | The section of the page |  [optional] |
|**iX** | **Integer** | The X coordinate (Horizontal). Require when eSection &#x3D; &#39;Region&#39; or eSection is not set. |  [optional] |
|**iY** | **Integer** | The Y coordinate (Vertical). Require when eSection &#x3D; &#39;Region&#39; or eSection is not set. |  [optional] |
|**iWidth** | **Integer** | Area&#39;s width. Require when eSection &#x3D; &#39;Region&#39; or eSection is not set. |  [optional] |
|**iHeight** | **Integer** | Area&#39;s height. Require when eSection &#x3D; &#39;Region&#39; or eSection is not set. |  [optional] |



## Enum: ESectionEnum

| Name | Value |
|---- | -----|
| FIRST_LINE | &quot;FirstLine&quot; |
| LAST_LINE | &quot;LastLine&quot; |
| REGION | &quot;Region&quot; |



