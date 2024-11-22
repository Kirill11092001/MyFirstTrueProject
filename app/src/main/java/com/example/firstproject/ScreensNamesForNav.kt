package com.example.firstproject

sealed class ScreensNamesForNav(val route: String) {
    object MenuScreen : ScreensNamesForNav("menuScreen")
    object SettingScreen : ScreensNamesForNav("settingScreen")
    object AnalyticScreen : ScreensNamesForNav("analyticScreen")
    object TrainingScreen : ScreensNamesForNav("trainingScreen")
    object FlashScreen : ScreensNamesForNav("flashScreen")

}