package com.cubelaundry.app.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
fun CubeLaundryTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) {
        darkColorScheme(
            primary = Navy,
            secondary = Cyan,
            tertiary = Blue,
            background = Color(0xFF0A0F1F),
            surface = Color(0xFF1A1A2E),
            onPrimary = Color.White,
            onSecondary = Color.White,
            onBackground = Color.White,
            onSurface = Color.White,
        )
    } else {
        lightColorScheme(
            primary = Navy,
            secondary = Cyan,
            tertiary = Blue,
            background = Background,
            surface = Panel,
            onPrimary = Color.White,
            onSecondary = Color.White,
            onBackground = Ink,
            onSurface = Ink,
        )
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography(
            headlineLarge = MaterialTheme.typography.headlineLarge.copy(
                fontFamily = SpaceGrotesk
            ),
            headlineMedium = MaterialTheme.typography.headlineMedium.copy(
                fontFamily = SpaceGrotesk
            ),
            titleLarge = MaterialTheme.typography.titleLarge.copy(
                fontFamily = SpaceGrotesk
            ),
            bodyLarge = MaterialTheme.typography.bodyLarge.copy(
                fontFamily = Inter
            ),
            bodyMedium = MaterialTheme.typography.bodyMedium.copy(
                fontFamily = Inter
            ),
        ),
        content = content
    )
}
