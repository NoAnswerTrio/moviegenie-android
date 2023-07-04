package com.noanswertrio.user.repository

import com.noanswertrio.user.model.User

interface UserRepository {

    suspend fun signIn(user: User)
    suspend fun signUp(user: User)

}