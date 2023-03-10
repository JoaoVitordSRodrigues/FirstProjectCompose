package com.example.appprojectpam

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.appprojectpam.ui.theme.AppProjectPamTheme
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainAppScreen()
        }
    }
}

@Composable
fun MainAppScreen() {
    AppProjectPamTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ){
            SaudarUsuarioLogado("Amigos")
        }

    }
}

@Composable
fun SaudarUsuarioLogado(nomeDoUsuarioLogado: String){
    Column {
        Text(text = "Bom dia, boa tarde e boa noite!!! $nomeDoUsuarioLogado!")
        Text("Vocês estão bem?")
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPrev() {
    MainAppScreen()
}