package com.example.ganesha.app.data.models

import com.google.gson.annotations.SerializedName

/**
 * https://plaid.com/docs/api/items/#item-get-response-item
 */
data class Item(
    @SerializedName("available_products")
    var availableProducts: ArrayList<Products>,
    @SerializedName("billed_products")
    var billedProducts: ArrayList<Products>,
    @SerializedName("error")
    var error: Error?,
    @SerializedName("institution_id")
    var institutionId: String?,
    @SerializedName("item_id")
    var itemId: String,
    @SerializedName("update_type")
    var updateType: UpdateTypes,
    @SerializedName("webhook")
    var webhook: String?,
    @SerializedName("consent_expiration_time")
    var consentExpirationTime: String?
)
