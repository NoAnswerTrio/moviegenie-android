package com.noanswertrio.user

import com.noanswertrio.model.User
import com.noanswertrio.network.Api
import javax.inject.Inject

class UserRepositoryImpl @Inject constructor(
    private val api: Api
) : UserRepository {

    override suspend fun signIn(user: User): Boolean {
        TODO("Not yet implemented")
    }

    override suspend fun signUp(user: User): Boolean {
        TODO("Not yet implemented")
    }

}