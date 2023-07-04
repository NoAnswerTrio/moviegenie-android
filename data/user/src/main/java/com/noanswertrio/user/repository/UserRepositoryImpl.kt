package com.noanswertrio.user.repository

import com.noanswertrio.network.Api
import com.noanswertrio.user.model.User
import javax.inject.Inject

class UserRepositoryImpl @Inject constructor(
    private val api: Api
) : UserRepository {

    override suspend fun signIn(user: User) {
        api.signIn(user.email, user.password)
    }

    override suspend fun signUp(user: User) {
        api.signUp(user.email, user.password)
    }

}