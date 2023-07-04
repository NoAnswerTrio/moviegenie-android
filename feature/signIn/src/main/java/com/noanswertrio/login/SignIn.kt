package com.noanswertrio.login

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun SignIn(
    viewModel: SignInViewModel = hiltViewModel()
){
    val state by viewModel.state

}