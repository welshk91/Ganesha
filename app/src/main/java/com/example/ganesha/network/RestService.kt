package com.example.ganesha.network

import com.example.ganesha.data.models.ItemResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface RestService {

    @GET("/item/get")
    suspend fun getItem(
        @Query("client_id") clientId: String,
        @Query("secret") secret: String,
        @Query("access_token") accessToken: String
    ): Response<ItemResponse>

}