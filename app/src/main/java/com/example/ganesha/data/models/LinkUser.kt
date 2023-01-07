package com.example.ganesha.data.models

import com.google.gson.annotations.SerializedName

data class LinkUser(
    @SerializedName("client_user_id")
    var clientUserId: String,
)
