package com.noanswertrio.user

import com.noanswertrio.network.Api
import com.noanswertrio.user.repository.UserRepository
import com.noanswertrio.user.repository.UserRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {
    @Provides
    @Singleton
    fun provideRepository(api: Api) : UserRepository {
        return UserRepositoryImpl(api)
    }
}