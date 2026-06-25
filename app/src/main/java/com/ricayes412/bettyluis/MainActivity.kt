package com.ricayes412.bettyluis

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.ricayes412.bettyluis.ui.theme.BettyLuisTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BettyLuisTheme {
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    Column(modifier = Modifier.padding(16.dp)) {
                        val recording = remember { mutableStateOf(false) }
                        Text(text = "Betty y Luis Potscats")
                        Button(onClick = { recording.value = !recording.value }) {
                            Text(if (recording.value) "Detener" else "Grabar")
                        }
                        Text(text = "Estado: ${'$'}{if (recording.value) "Grabando" else "Inactivo"}")
                    }
                }
            }
        }
    }
}
