package com.example.ganesha.app.data.models

import com.google.gson.annotations.SerializedName

/**
 * https://plaid.com/docs/api/items/#item-get-response-status-last-webhook
 */
data class LastWebhook(
    @SerializedName("sent_at")
    var sentAt: String?,
    @SerializedName("code_sent")
    var codeSent: String?
)
