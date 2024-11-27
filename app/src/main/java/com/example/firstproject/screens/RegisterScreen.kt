package com.example.firstproject.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.firstproject.R
import com.example.firstproject.components.VerticalSpacer


@Composable
fun RegisterScreen() {
    val winOrange = Color(0xFFD05708)
    val winBlue = Color(0xFF098DD0)
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            modifier = Modifier.fillMaxSize(),
            painter = painterResource(id = R.drawable.imageforsettingsscreen),
            contentDescription = null,
            contentScale = ContentScale.Crop
        )

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.64f),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                modifier = Modifier.padding(end = 220.dp)
            ) {
                Text(
                    modifier = Modifier.padding(top = 10.dp),
                    text = "WIN",
                    color = Color.White,
                    fontSize = 26.sp,
                    fontStyle = FontStyle.Italic,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    modifier = Modifier.padding(top = 10.dp),
                    text = "SPORT",
                    color = winOrange,
                    fontSize = 26.sp,
                    fontStyle = FontStyle.Italic,
                    fontWeight = FontWeight.Bold
                )
            }

            VerticalSpacer(height = 60.dp)
            Text(
                text = "НАЧАЛО",
                color = Color.White,
                fontSize = 30.sp,
                fontStyle = FontStyle.Italic,
                fontWeight = FontWeight.Bold
            )

            Text(
                text = "ТРЕНИРОВКИ",
                color = Color.White,
                fontSize = 30.sp,
                fontStyle = FontStyle.Italic,
                fontWeight = FontWeight.Bold
            )

            VerticalSpacer(height = 40.dp)

            val name = remember { mutableStateOf("") }
            val height = remember { mutableStateOf("") }
            val weight = remember { mutableStateOf("") }

            OutlinedTextField(
                value = name.value,
                onValueChange = { value ->
                    name.value = value.filter { it.isLetter() }
                },
                label = {
                    Text(
                        text = "ИМЯ",
                        fontSize = 24.sp,
                        fontStyle = FontStyle.Italic,
                        fontWeight = FontWeight.Bold
                    )
                },
                textStyle = LocalTextStyle.current.copy(
                    fontSize = 20.sp,
                    color = Color.White
                ),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedTextColor = Color.White,
                    unfocusedTextColor = Color.White,
                    focusedBorderColor = Color.White,
                    unfocusedBorderColor = Color.White,
                    focusedLabelColor = Color.White,
                    unfocusedLabelColor = Color.White
                ),
                shape = RoundedCornerShape(30.dp),
                keyboardOptions = KeyboardOptions.Default.copy(
                    keyboardType = KeyboardType.Text
                )
            )

            VerticalSpacer(height = 14.dp)
            OutlinedTextField(
                value = height.value,
                onValueChange = { value ->
                    height.value = value.filter { it.isDigit() }
                },
                label = {
                    Text(
                        text = "РОСТ",
                        fontSize = 24.sp,
                        fontStyle = FontStyle.Italic,
                        fontWeight = FontWeight.Bold
                    )
                },
                textStyle = LocalTextStyle.current.copy(
                    fontSize = 20.sp,
                    color = Color.White
                ),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedTextColor = Color.White,
                    unfocusedTextColor = Color.White,
                    focusedBorderColor = Color.White,
                    unfocusedBorderColor = Color.White,
                    focusedLabelColor = Color.White,
                    unfocusedLabelColor = Color.White
                ),
                shape = RoundedCornerShape(30.dp),
                keyboardOptions = KeyboardOptions.Default.copy(
                    keyboardType = KeyboardType.Number
                )
            )

            VerticalSpacer(height = 14.dp)
            OutlinedTextField(
                value = weight.value,
                onValueChange = { value ->
                    weight.value = value.filter { it.isDigit() }
                },
                label = {
                    Text(
                        text = "ВЕС",
                        fontSize = 24.sp,
                        fontStyle = FontStyle.Italic,
                        fontWeight = FontWeight.Bold
                    )
                },
                textStyle = LocalTextStyle.current.copy(
                    fontSize = 20.sp,
                    color = Color.White
                ),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedTextColor = Color.White,
                    unfocusedTextColor = Color.White,
                    focusedBorderColor = Color.White,
                    unfocusedBorderColor = Color.White,
                    focusedLabelColor = Color.White,
                    unfocusedLabelColor = Color.White
                ),
                shape = RoundedCornerShape(30.dp),
                keyboardOptions = KeyboardOptions.Default.copy(
                    keyboardType = KeyboardType.Number
                )
            )

            VerticalSpacer(height = 40.dp)
            Button(
                modifier = Modifier.fillMaxWidth(0.5f),
                onClick = { },
                colors = ButtonDefaults.buttonColors(winBlue)
            ) {
                Text(
                    text = "НАЧАТЬ",
                    color = Color.White,
                    fontSize = 28.sp,
                    fontStyle = FontStyle.Italic,
                    fontWeight = FontWeight.Bold
                )
            }

        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingRegisterPreview() {
    RegisterScreen()
}