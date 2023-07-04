package com.noanswertrio.network

import retrofit2.Call
import retrofit2.http.POST
import retrofit2.http.Query

interface Api {

    @POST("/api/members/login")
    suspend fun signIn(
        @Query("email") email: String,
        @Query("password") password:String
    )

    @POST("/api/members/sign-up")
    suspend fun signUp(
        @Query("email") email: String,
        @Query("password") password:String
    )


}