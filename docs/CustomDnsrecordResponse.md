

# CustomDnsrecordResponse

A Custom Dnsrecord Object

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**eDnsrecordType** | [**EDnsrecordTypeEnum**](#EDnsrecordTypeEnum) | The type of the Dnsrecord |  |
|**eDnsrecordValidation** | [**EDnsrecordValidationEnum**](#EDnsrecordValidationEnum) | The validation of the Dnsrecord |  |
|**sDnsrecordName** | **String** | The name of the Dnsrecord |  |
|**sDnsrecordValue** | **String** | The value of the Dnsrecord |  [optional] |
|**sDnsrecordExpectedvalue** | **String** | The expected value of the Dnsrecord |  [optional] |
|**bDnsrecordMustMatch** | **Boolean** | Whether the Dnsrecord must match or not |  |



## Enum: EDnsrecordTypeEnum

| Name | Value |
|---- | -----|
| CNAME | &quot;CNAME&quot; |
| MX | &quot;MX&quot; |
| TXT | &quot;TXT&quot; |



## Enum: EDnsrecordValidationEnum

| Name | Value |
|---- | -----|
| MATCH | &quot;Match&quot; |
| MISMATCH | &quot;Mismatch&quot; |
| NOT_FOUND | &quot;NotFound&quot; |



