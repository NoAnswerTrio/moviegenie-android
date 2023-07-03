package com.noanswertrio.user

import com.noanswertrio.network.Api
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
    fun provideRepository(
        api: Api
    ) : UserRepository {
        return UserRepositoryImpl(api)
    }
}