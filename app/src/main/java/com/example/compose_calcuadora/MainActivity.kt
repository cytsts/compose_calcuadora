package com.example.compose_calcuadora

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose_calcuadora.ui.theme.Compose_calcuadoraTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Compose_calcuadoraTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {

    Column {
        Display(name)

        Linha("MC", "MR", "M-", "M+", "+/-")
        Linha("7", "8", "9", "c", "-")
        Linha("4", "5", "6", "X", "÷")
        Linha("1", "2", "3", "+")
        Linha("0", "00", ",", "=")
    }


}

@Composable
private fun Display(name: String) {
    Text(

        text = "Hello $name!", modifier = Modifier
            .background(Color.Green)
            .height(100.dp)
            .fillMaxWidth()

    )
}

@Composable
fun Linha(vararg textos: String) {
    Row(
        modifier = Modifier
            .padding(horizontal = 10.dp)
            .fillMaxWidth()
    ) {

        val qtElements = textos.size

        val lastPositionElements = qtElements - 1

        textos.forEachIndexed { index, texto ->

            val hasLastElement = (index == lastPositionElements)

            ButtonCalculadora(hasLastElement, texto)
            Spacer(modifier = Modifier.width(8.dp))
        }
    }
}

@Composable
private fun ButtonCalculadora(
    hasLastElement: Boolean,
    texto: String
) {
    Button(onClick = { /*TODO*/ }) {
        if (hasLastElement) {
            Text(
                text = texto,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                color = Color.Red
            )
        } else {
            Text(
                text = texto,
                color = Color.White
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Compose_calcuadoraTheme {
        Greeting("Android")
    }
}


// criar abstração para elemtos do button
/*

 */