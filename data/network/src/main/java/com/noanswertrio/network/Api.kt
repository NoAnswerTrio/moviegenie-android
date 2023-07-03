package com.noanswertrio.network

import retrofit2.http.POST

interface Api {

    @POST("")
    suspend fun signIn()

    @POST("")
    suspend fun signUp()


}