

# FranchisereferalincomeRequestCompound

A Franchisereferalincome Object and children to create a complete structure

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**pkiFranchisereferalincomeID** | **Integer** | The unique ID of the Franchisereferalincome |  [optional] |
|**fkiFranchisebrokerID** | **Integer** | The unique ID of the Franchisebroker |  |
|**fkiFranchisereferalincomeprogramID** | **Integer** | The unique ID of the Franchisereferalincomeprogram |  |
|**fkiPeriodID** | **Integer** | The unique ID of the Period |  |
|**dFranchisereferalincomeLoan** | **String** | The loan amount |  |
|**dFranchisereferalincomeFranchiseamount** | **String** | The amount that will be given to the franchise |  |
|**dFranchisereferalincomeFranchisoramount** | **String** | The amount that will be kept by the franchisor |  |
|**dFranchisereferalincomeAgentamount** | **String** | The amount that will be given to the agent |  |
|**dtFranchisereferalincomeDisbursed** | **String** | The date the amounts were disbursed |  |
|**tFranchisereferalincomeComment** | **String** | Comment about the transaction |  |
|**fkiFranchiseofficeID** | **Integer** | The unique ID of the Franchisereoffice |  |
|**sFranchisereferalincomeRemoteid** | **String** |  |  |
|**objAddress** | [**AddressRequest**](AddressRequest.md) |  |  [optional] |
|**aObjContact** | [**List&lt;ContactRequestCompound&gt;**](ContactRequestCompound.md) |  |  |



