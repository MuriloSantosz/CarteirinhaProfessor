package com.aula.carteirinhaprofessor.core.designsystem.theme
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color

private val lightScheme = lightColorScheme(
)

private val darkScheme = darkColorScheme(






)

@Composable
fun CarteirinhaDigital2DEVEST_BTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
) {
    }

    MaterialTheme(
        colorScheme = colorScheme,
        content = content
    )
}