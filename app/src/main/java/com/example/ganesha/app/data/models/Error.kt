package com.example.ganesha.app.data.models

import com.google.gson.annotations.SerializedName

/**
 * https://plaid.com/docs/api/items/#item-get-response-item-error
 */
data class Error(
    @SerializedName("error_type")
    var errorType: ErrorTypes,
    @SerializedName("error_code")
    var errorCode: String,
    @SerializedName("error_message")
    var errorMessage: String,
    @SerializedName("display_message")
    var displayMessage: String,
    @SerializedName("request_id")
    var requestId: String,
    @SerializedName("causes")
    var causes: ArrayList<Any>?,
    @SerializedName("status")
    var status: Int?,
    @SerializedName("documentation_url")
    var documentationUrl: String,
    @SerializedName("suggested_action")
    var suggestedAction: String?
)
