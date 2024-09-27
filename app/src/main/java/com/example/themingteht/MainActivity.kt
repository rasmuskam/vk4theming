package com.example.themingteht

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.themingteht.ui.theme.MyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MyApp(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun MyApp(modifier: Modifier = Modifier) {
    val appModifier = Modifier
        .fillMaxWidth()
        .padding(8.dp)

    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "My title",
            style = MaterialTheme.typography.headlineSmall,
            modifier = appModifier
        )
        OutlinedTextField(
            value = "",
            onValueChange = {},
            modifier = appModifier
        )
        Button(onClick = { /* Handle button click */ }, modifier = appModifier) {
            Text("Submit")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyTheme {
        MyApp()
    }
}