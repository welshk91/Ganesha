package com.example.ganesha.data

import com.example.ganesha.data.models.*
import com.example.ganesha.network.RestService
import com.example.ganesha.network.RetrofitClient
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response
import javax.inject.Singleton

@Singleton
class DataRepository {

    /**
     * https://plaid.com/docs/api/tokens/#linktokencreate
     */
    suspend fun getLinkToken(): Response<LinkResponse> = withContext(Dispatchers.IO) {
        val retrofit = RetrofitClient.getInstance()
        val apiInterface = retrofit.create(RestService::class.java)
        var linkRequest = LinkRequest(
            clientId = "",
            secret = "",
            user = LinkUser(""),
            clientName = "",
            webhook = "",
            androidPackageName = ""
        )

        val response = apiInterface.getLinkToken(linkRequest)
        response
    }

//    /**
//     * https://plaid.com/docs/api/items/#itemget
//     */
//    suspend fun getItem(): Response<ItemResponse> = withContext(Dispatchers.IO) {
//        val retrofit = RetrofitClient.getInstance()
//        val apiInterface = retrofit.create(RestService::class.java)
//        val response = apiInterface.getItem(accessToken = "")
//        response
//    }

}