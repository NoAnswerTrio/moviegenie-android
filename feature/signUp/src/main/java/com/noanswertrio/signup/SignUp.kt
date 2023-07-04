package com.noanswertrio.signup

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignUp(
    viewModel: SignUpViewModel = hiltViewModel()
) {
    val state by viewModel.state

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Sign Up")
        TextField(value = state.email, onValueChange = viewModel::onEmailChanged)
        TextField(value = state.password, onValueChange = viewModel::onPasswordChanged)
        Button(onClick = { viewModel.signUpBtnClick() }) {
            Text(text = "Sign Up")
        }
    }
}