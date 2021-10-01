

# EzsigndocumentGetWordsPositionsV1Request

Request for the /1/object/ezsigndocument/{pkiEzsigndocumentID}/getWordsPositions API Request

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eGet** | [**EGetEnum**](#EGetEnum) | Specify if you want to retrieve *All* words or specific *Words* from the document. If you specify *Words*, you must send the list of words to search in *a_sWord*. |  [optional]
**aSWord** | **List&lt;String&gt;** | Array of words to find in the document |  [optional]



## Enum: EGetEnum

Name | Value
---- | -----
ALL | &quot;All&quot;
WORDS | &quot;Words&quot;



