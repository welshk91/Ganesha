package com.example.ganesha.app.data.models

import com.google.gson.annotations.SerializedName

/**
 * https://plaid.com/docs/api/items/#itemget
 */
data class ItemResponse(
    @SerializedName("item")
    var item: Item,
    @SerializedName("status")
    var status: Status?,
    @SerializedName("request_id")
    var requestId: String
)
