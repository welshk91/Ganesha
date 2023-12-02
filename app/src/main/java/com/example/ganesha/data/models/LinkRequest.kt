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
    var products: List<String> = listOf<String>(Products.TRANSACTIONS.toString()),
    @SerializedName("required_if_supported_products")
    var requiredIfSupportedProducts: List<String> = listOf<String>(Products.LIABILITIES.toString()),
    @SerializedName("country_codes")
    var countryCodes: List<String> = listOf<String>(CountryCodes.US.toString()),
    @SerializedName("language")
    var language: String = Languages.ENGLISH.language,
    @SerializedName("android_package_name")
    var androidPackageName: String,
)
