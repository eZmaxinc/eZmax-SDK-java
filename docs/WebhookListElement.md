

# WebhookListElement

A Webhook List Element

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**pkiWebhookID** | **Integer** | The unique ID of the Webhook |  |
|**sWebhookDescription** | **String** | The description of the Webhook |  |
|**sWebhookUrl** | **String** | The URL of the Webhook callback |  |
|**sWebhookEvent** | **String** | The concatenated string to describe the Webhook event |  |
|**sWebhookEmailfailed** | **String** | The email that will receive the Webhook in case all attempts fail |  |
|**eWebhookModule** | **FieldEWebhookModule** |  |  |
|**eWebhookEzsignevent** | **FieldEWebhookEzsignevent** |  |  [optional] |
|**eWebhookManagementevent** | **FieldEWebhookManagementevent** |  |  [optional] |
|**bWebhookIsactive** | **Boolean** | Whether the Webhook is active or not |  |
|**bWebhookIssigned** | **Boolean** | Whether the requests will be signed or not |  |



