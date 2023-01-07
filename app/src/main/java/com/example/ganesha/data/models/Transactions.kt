package com.example.ganesha.data.models

import com.google.gson.annotations.SerializedName

/**
 * https://plaid.com/docs/api/items/#item-get-response-status-transactions
 */
data class Transactions(
    @SerializedName("last_successful_update")
    var lastSuccessfulUpdate: String?,
    @SerializedName("last_failed_update")
    var lastFailedUpdate: String?
)
