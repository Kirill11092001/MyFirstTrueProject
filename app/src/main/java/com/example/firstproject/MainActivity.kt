package com.example.firstproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.firstproject.components.VerticalSpacer

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Screen()
        }
    }
}

@Composable
fun Screen() {
    val myColor = Color(0xC92E1BF6)
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            modifier = Modifier.fillMaxSize(),
            painter = painterResource(id = R.drawable.backimage),
            contentDescription = null,
            contentScale = ContentScale.Crop
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(bottom = 100.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Button(
                modifier = Modifier.fillMaxWidth(0.75f),
                onClick = { },
                colors = ButtonDefaults.buttonColors(myColor),
            ) {
                Text(
                    text = "Training",
                    color = Color.White,
                    fontSize = 28.sp
                )
            }
            VerticalSpacer(height = 16.dp)

            Button(
                modifier = Modifier.fillMaxWidth(0.75f),
                onClick = { },
                colors = ButtonDefaults.buttonColors(myColor)
            ) {
                Text(
                    text = "Anal",
                    color = Color.White,
                    fontSize = 28.sp
                )
            }
            VerticalSpacer(height = 16.dp)

            Button(
                onClick = { },
                colors = ButtonDefaults.buttonColors(myColor),
                modifier = Modifier.fillMaxWidth(0.75f)
            ) {
                Text(
                    text = "Settings",
                    color = Color.White,
                    fontSize = 28.sp
                )
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Screen()
}