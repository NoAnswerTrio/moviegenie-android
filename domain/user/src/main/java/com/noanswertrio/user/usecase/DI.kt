//package com.noanswertrio.user.usecase
//
//import com.noanswertrio.user.repository.UserRepository
//import dagger.Binds
//import dagger.Module
//import dagger.hilt.InstallIn
//import dagger.hilt.components.SingletonComponent
//import javax.inject.Singleton
//
//@Module
//@InstallIn(SingletonComponent::class)
//object DI {
//
//    @Binds
//    @Singleton
//    fun provideUseCases(repository: UserRepository) : UseCases {
//        return UseCases(
//            signInUseCase = SignInUseCase(repository),
//            signUpUseCase = SignUpUseCase(repository)
//        )
//    }
//
//
//
//}