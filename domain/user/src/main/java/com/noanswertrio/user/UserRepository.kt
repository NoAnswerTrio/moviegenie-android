package com.noanswertrio.user

import com.noanswertrio.model.User

interface UserRepository {

    suspend fun signIn(user: User) : Boolean
    suspend fun signUp(user: User) : Boolean

}