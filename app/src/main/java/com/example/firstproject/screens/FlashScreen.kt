package com.example.firstproject.screens

import android.os.CountDownTimer
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import com.example.firstproject.R
import com.example.firstproject.ScreensNamesForNav
import kotlin.concurrent.timer

private var timer: CountDownTimer? = null

@Composable
fun FlashScreen(navController: NavController) {
    startTimer(navController = navController)
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            modifier = Modifier.fillMaxSize(),
            painter = painterResource(id = R.drawable.flashimg),
            contentDescription = null,
            contentScale = ContentScale.Crop
        )
    }
}
private fun startTimer(navController: NavController) {
    timer = object : CountDownTimer(
        3000L,
        1000L
    ) {
        override fun onTick(millisUntilFinished: Long) {
        }

        override fun onFinish() {
            navController.popBackStack()
            navController.navigate(
                route = ScreensNamesForNav.MenuScreen.route
            )
        }

    }
    timer?.start()
}