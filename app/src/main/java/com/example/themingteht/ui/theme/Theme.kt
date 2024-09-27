package com.example.themingteht.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

val DarkColorScheme = darkColorScheme(
    primary = CustomPrimaryColor,
    secondary = Color(0xFF03DAC5)
)

val LightColorScheme = lightColorScheme(
    primary = CustomPrimaryColor,
    secondary = Color(0xFF03DAC5)
)

@Composable
fun MyTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) DarkColorScheme else LightColorScheme
    MaterialTheme(
        colorScheme = colors,
        typography = CustomTypography,
        shapes = Shapes,
        content = content
    )
}