

# ContactinformationsRequestCompoundV2

A Contactinformations Object and children to create a complete structure

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**eContactinformationsType** | **FieldEContactinformationsType** |  |  |
|**iAddressDefault** | **Integer** | The index in the a_objAddress array (zero based index) representing the Address object that should become the default one.  You can leave the value to 0 if the array is empty. |  |
|**iPhoneDefault** | **Integer** | The index in the a_objPhone array (zero based index) representing the Phone object that should become the default one.  You can leave the value to 0 if the array is empty. |  |
|**iEmailDefault** | **Integer** | The index in the a_objEmail array (zero based index) representing the Email object that should become the default one.  You can leave the value to 0 if the array is empty. |  |
|**iWebsiteDefault** | **Integer** | The index in the a_objWebsite array (zero based index) representing the Website object that should become the default one.  You can leave the value to 0 if the array is empty. |  |
|**aObjAddress** | [**List&lt;AddressRequestCompound&gt;**](AddressRequestCompound.md) |  |  |
|**aObjPhone** | [**List&lt;PhoneRequestCompound&gt;**](PhoneRequestCompound.md) |  |  |
|**aObjEmail** | [**List&lt;EmailRequestCompound&gt;**](EmailRequestCompound.md) |  |  |
|**aObjWebsite** | [**List&lt;WebsiteRequestCompound&gt;**](WebsiteRequestCompound.md) |  |  |



