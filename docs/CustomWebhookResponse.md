

# CustomWebhookResponse

A custom Webhook object

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**pksCustomerCode** | **String** | The customer code assigned to your account |  |
|**bWebhookTest** | **Boolean** | Wheter the webhook received is a manual test or a real event |  |
|**eWebhookEmittype** | [**EWebhookEmittypeEnum**](#EWebhookEmittypeEnum) | Wheter the webhook received is a manual test or a real event |  [optional] |



## Enum: EWebhookEmittypeEnum

| Name | Value |
|---- | -----|
| AUTOMATIC | &quot;Automatic&quot; |
| MANUAL | &quot;Manual&quot; |
| TEST | &quot;Test&quot; |



