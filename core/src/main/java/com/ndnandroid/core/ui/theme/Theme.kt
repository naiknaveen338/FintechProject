package com.ndnandroid.core.ui.theme

import android.util.Log
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorScheme = darkColorScheme(
    primary = DarkModePrimary,
    secondary = DarkModeSecondary,
    background = DarkModeBackground,
    onBackground = Color.White,
)

private val LightColorScheme = lightColorScheme(
    primary = LightModePrimary,
    secondary = LightModeSecondary,
    background = LightModeBackground,
    onBackground = Color.Black

    /* Other default colors to override
    background = Color(0xFFFFFBFE),
    surface = Color(0xFFFFFBFE),
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.White,
    onBackground = Color(0xFF1C1B1F),
    onSurface = Color(0xFF1C1B1F),
    */
)


@Composable
fun FintechTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        darkTheme -> {
            Log.d("FintechTheme", "Dark Theme applied")
            DarkColorScheme
        }
        else -> {
            Log.d("FintechTheme", "Light Theme applied")
            LightColorScheme
        }
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}