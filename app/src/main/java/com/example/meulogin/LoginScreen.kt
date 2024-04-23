package com.example.meulogin

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LoginScreen(){

    var email by remember {
        mutableStateOf("")
    }

    var senha by remember {
        mutableStateOf("")
    }



    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(painter = painterResource(id = R.drawable.pngegg), contentDescription = "Login image",
            modifier = Modifier.size(150.dp))

        Text(text = "Bem Vindo de Volta", fontSize = 28.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(4.dp))

        Text(text = "Entre com a sua conta")

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(value = email, onValueChange = {
            email = it
        }, label = {
            Text(text = "E-mail")
        })

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(value = senha, onValueChange = {
            senha = it
        }, label = {
            Text(text = "Senha")
        }, visualTransformation = PasswordVisualTransformation())

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {
            Log.i("credential", "Email : $email Password : $senha")
        }) {
            Text(text = "Entrar")
        }

        Spacer(modifier = Modifier.height(32.dp))

        Text(text = "Esqueceu a Senha?", modifier = Modifier.clickable {

        })

        Spacer(modifier = Modifier.height(32.dp))
    } // fim da coluna
}// fim da função