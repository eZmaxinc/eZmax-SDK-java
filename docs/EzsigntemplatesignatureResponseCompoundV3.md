

# EzsigntemplatesignatureResponseCompoundV3

A Ezsigntemplatesignature Object

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bEzsigntemplatesignatureCustomdate** | **Boolean** | Whether the Ezsigntemplatesignature has a custom date format or not. (Only possible when eEzsigntemplatesignatureType is **Name** or **Handwritten**) |  [optional] |
|**aObjEzsigntemplatesignaturecustomdate** | [**List&lt;EzsigntemplatesignaturecustomdateResponseV2&gt;**](EzsigntemplatesignaturecustomdateResponseV2.md) | An array of custom date blocks that will be filled at the time of signature.  Can only be used if bEzsigntemplatesignatureCustomdate is true.  Use an empty array if you don&#39;t want to have a date at all. |  [optional] |
|**aObjEzsigntemplateelementdependency** | [**List&lt;EzsigntemplateelementdependencyResponse&gt;**](EzsigntemplateelementdependencyResponse.md) |  |  [optional] |



