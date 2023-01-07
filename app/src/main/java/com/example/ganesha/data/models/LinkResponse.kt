package com.example.ganesha.data.models

import com.google.gson.annotations.SerializedName

data class LinkResponse(
    @SerializedName("link_token")
    var linkToken: String,
    @SerializedName("expiration")
    var expiration: String,
    @SerializedName("request_id")
    var requestId: String
)