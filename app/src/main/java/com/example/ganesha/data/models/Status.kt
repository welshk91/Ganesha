package com.example.ganesha.data.models

import com.google.gson.annotations.SerializedName

/**
 * https://plaid.com/docs/api/items/#item-get-response-status
 */
data class Status(
    @SerializedName("investments")
    var investments: Investments?,
    @SerializedName("transactions")
    var transactions: Transactions?,
    @SerializedName("last_webhook")
    var lastWebhook: LastWebhook?
)
