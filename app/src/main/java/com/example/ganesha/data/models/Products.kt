package com.example.ganesha.data.models

import com.google.gson.annotations.SerializedName

/**
 * https://plaid.com/docs/api/items/#item-get-response-item-products
 */
enum class Products {
    ASSETS,
    AUTH,
    BALANCE,
    IDENTITY,
    INVESTMENTS,
    LIABILITIES,
    PAYMENT_INITIATION,
    IDENTITY_VERIFICATION,
    TRANSACTIONS,
    CREDIT_DETAILS,
    INCOME,
    INCOME_VERIFICATION,
    DEPOSIT_SWITCH,
    STANDING_ORDERS,
    TRANSFER,
    EMPLOYMENT,
    RECURRING_TRANSACTIONS
}