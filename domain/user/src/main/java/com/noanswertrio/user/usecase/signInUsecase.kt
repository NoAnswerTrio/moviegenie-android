package com.noanswertrio.user.usecase

import com.noanswertrio.user.model.User
import com.noanswertrio.user.repository.UserRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SignInUseCase @Inject constructor(
    private val repository: UserRepository
) {
    suspend operator fun invoke(user: User) {
        repository.signIn(user)
    }
}