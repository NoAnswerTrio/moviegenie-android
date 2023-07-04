package com.noanswertrio.signup

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.noanswertrio.user.model.User
import com.noanswertrio.user.usecase.SignUpUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SignUpViewModel @Inject constructor(
    private val signUpUseCase: SignUpUseCase
) : ViewModel() {

    var state = mutableStateOf(SignUpState())
        private set

    private val email get() = state.value.email
    private val password get() = state.value.password

    fun onEmailChanged(newEmail: String) {
        state.value = state.value.copy(email = newEmail)
    }

    fun onPasswordChanged(newPW: String) {
        state.value = state.value.copy(password = newPW)
    }

    fun signUpBtnClick() {
        val user = User(email, password)
        viewModelScope.launch(Dispatchers.IO) {
            signUpUseCase(user)
        }
    }


}