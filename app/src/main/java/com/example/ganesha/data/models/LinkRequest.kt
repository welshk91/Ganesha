package com.example.ganesha.data.models

import com.google.gson.annotations.SerializedName

data class LinkRequest(
    @SerializedName("client_id")
    var clientId: String,
    @SerializedName("secret")
    var secret: String,
    @SerializedName("user")
    var user: LinkUser,
    @SerializedName("client_name")
    var clientName: String,
    @SerializedName("products")
    var products: List<Products> = listOf<Products>(Products.INVESTMENTS),
    @SerializedName("country_codes")
    var countryCodes: List<CountryCodes> = listOf<CountryCodes>(CountryCodes.US),
    @SerializedName("languages")
    var languages: String = "en",
    @SerializedName("webhook")
    var webhook: String,
    @SerializedName("android_package_name")
    var androidPackageName: String,
)
