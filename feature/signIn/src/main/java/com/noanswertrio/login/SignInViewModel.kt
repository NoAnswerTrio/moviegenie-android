package com.noanswertrio.login

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.noanswertrio.user.usecase.SignInUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SignInViewModel @Inject constructor(
    private val signInUseCase: SignInUseCase
) : ViewModel() {
    var state = mutableStateOf(SignInState())
        private set

}