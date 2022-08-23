

# WebhookRequest

A Webhook Object

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**pkiWebhookID** | **Integer** | The unique ID of the Webhook |  [optional] |
|**fkiEzsignfoldertypeID** | **Integer** | The unique ID of the Ezsignfoldertype. |  [optional] |
|**sWebhookDescription** | **String** | The description of the Webhook |  |
|**eWebhookModule** | **FieldEWebhookModule** |  |  |
|**eWebhookEzsignevent** | **FieldEWebhookEzsignevent** |  |  [optional] |
|**eWebhookManagementevent** | **FieldEWebhookManagementevent** |  |  [optional] |
|**sWebhookUrl** | **String** | The URL of the Webhook callback |  |
|**sWebhookEmailfailed** | **String** | The email that will receive the Webhook in case all attempts fail |  |
|**bWebhookIsactive** | **Boolean** | Whether the Webhook is active or not |  |
|**bWebhookSkipsslvalidation** | **Boolean** | Wheter the server&#39;s SSL certificate should be validated or not. Not recommended to skip for production use |  |



