package com.example.ganesha.network

import com.example.ganesha.data.models.ItemResponse
import com.example.ganesha.data.models.LinkRequest
import com.example.ganesha.data.models.LinkResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST
import retrofit2.http.Query

interface RestService {

    @Headers("Content-Type: application/json")
    @POST("/link/token/create")
    suspend fun createLinkToken(
        @Body request: LinkRequest,
    ): Response<LinkResponse>

    @GET("/item/get")
    suspend fun getItem(
        @Query("client_id") clientId: String,
        @Query("secret") secret: String,
        @Query("access_token") accessToken: String
    ): Response<ItemResponse>

}