package com.example.userslist.data.api

import com.example.userslist.model.network.BaseResponse
import com.example.userslist.model.network.UserNetwork
import retrofit2.Response
import retrofit2.http.GET

interface UserApiService {

    @GET("api/?results=20")
    suspend fun getUsers(): Response<BaseResponse<UserNetwork>>

}