package com.phama.mygroceries.ui.theme

import android.provider.CalendarContract
import androidx.compose.material.Colors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

val Purple200 = Color(0xFFBB86FC)
val Purple500 = Color(0xFF6200EE)
val Purple700 = Color(0xFF3700B3)
val Teal200 = Color(0xFF03A9F4)

val White = Color(0xFFFFFFFF)
val DarkBlackishGray = Color(0xFF444653)
val LightBlackishGray = Color(0xFF6E707C)
val Blue = Color(0xFF3F51B5)
val LightBlue = Color(0xffd8e6ff)




val Colors.BackgroundColor : Color
    @Composable
    get() = White

val Colors.TextFieldColor : Color
    @Composable
    get() = LightBlue

val Colors.TextFieldTextColor : Color
    @Composable
    get() = LightBlackishGray

val Colors.ButtonColor : Color
    @Composable
    get() = Blue