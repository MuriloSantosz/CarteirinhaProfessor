package com.aula.carteirinhaprofessor.core.designsystem.theme
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color


private val AzulPrincipal = Color(0xFF2457C5)
private val AzulPrincipalTexto = Color(0xFFFFFFFF)
private val AzulContainer = Color(0xFFDCE6FF)
private val AzulContainerTexto = Color(0xFF102F70)

private val RoxoSecundario = Color(0xFF6254A5)
private val RoxoContainer = Color(0xFFE8DFFF)

private val VerdeTerciario = Color(0xFF286B57)
private val VerdeContainer = Color(0xFFB8EBD7)

private val FundoClaro = Color(0xFFF7F8FC)
private val SuperficieClara = Color(0xFFFFFFFF)
private val TextoClaro = Color(0xFF191C24)
private val TextoSecundarioClaro = Color(0xFF454955)
private val BordaClara = Color(0xFF747985)

private val ErroClaro = Color(0xFFBA1A1A)
private val ErroContainerClaro = Color(0xFFFFDAD6)

// Paleta do tema escuro
private val AzulPrincipalEscuro = Color(0xFFB4C5FF)
private val AzulContainerEscuro = Color(0xFF193B83)
private val AzulContainerTextoEscuro = Color(0xFFDCE6FF)

private val RoxoSecundarioEscuro = Color(0xFFCEC2FF)
private val RoxoContainerEscuro = Color(0xFF493D86)

private val VerdeTerciarioEscuro = Color(0xFF9DD6C1)
private val VerdeContainerEscuro = Color(0xFF174D3D)

private val FundoEscuro = Color(0xFF111318)
private val SuperficieEscura = Color(0xFF191C22)
private val TextoEscuro = Color(0xFFE2E2EB)
private val TextoSecundarioEscuro = Color(0xFFC3C6D0)
private val BordaEscura = Color(0xFF8D909B)

private val ErroEscuro = Color(0xFFFFB4AB)
private val ErroContainerEscuro = Color(0xFF93000A)

// Esquema claro
private val lightScheme = lightColorScheme(
    primary = AzulPrincipal,
    onPrimary = AzulPrincipalTexto,
    primaryContainer = AzulContainer,
    onPrimaryContainer = AzulContainerTexto,

    secondary = RoxoSecundario,
    onSecondary = Color.White,
    secondaryContainer = RoxoContainer,
    onSecondaryContainer = Color(0xFF21144F),

    tertiary = VerdeTerciario,
    onTertiary = Color.White,
    tertiaryContainer = VerdeContainer,
    onTertiaryContainer = Color(0xFF002117),

    error = ErroClaro,
    onError = Color.White,
    errorContainer = ErroContainerClaro,
    onErrorContainer = Color(0xFF410002),

    background = FundoClaro,
    onBackground = TextoClaro,

    surface = SuperficieClara,
    onSurface = TextoClaro,
    surfaceVariant = Color(0xFFE3E5ED),
    onSurfaceVariant = TextoSecundarioClaro,

    outline = BordaClara,
    outlineVariant = Color(0xFFC4C6D0),
    scrim = Color.Black,

    inverseSurface = Color(0xFF2E3038),
    inverseOnSurface = Color(0xFFF0F0F7),
    inversePrimary = AzulPrincipalEscuro,

    surfaceDim = Color(0xFFD8DAE2),
    surfaceBright = Color(0xFFFFFFFF),
    surfaceContainerLowest = Color(0xFFFFFFFF),
    surfaceContainerLow = Color(0xFFF1F2F8),
    surfaceContainer = Color(0xFFECEEF4),
    surfaceContainerHigh = Color(0xFFE6E8EF),
    surfaceContainerHighest = Color(0xFFE0E2E9)
)


private val darkScheme = darkColorScheme(
    primary = AzulPrincipalEscuro,
    onPrimary = Color(0xFF002B73),
    primaryContainer = AzulContainerEscuro,
    onPrimaryContainer = AzulContainerTextoEscuro,

    secondary = RoxoSecundarioEscuro,
    onSecondary = Color(0xFF342768),
    secondaryContainer = RoxoContainerEscuro,
    onSecondaryContainer = Color(0xFFE8DFFF),

    tertiary = VerdeTerciarioEscuro,
    onTertiary = Color(0xFF00382B),
    tertiaryContainer = VerdeContainerEscuro,
    onTertiaryContainer = Color(0xFFB8EBD7),

    error = ErroEscuro,
    onError = Color(0xFF690005),
    errorContainer = ErroContainerEscuro,
    onErrorContainer = Color(0xFFFFDAD6),

    background = FundoEscuro,
    onBackground = TextoEscuro,

    surface = SuperficieEscura,
    onSurface = TextoEscuro,
    surfaceVariant = Color(0xFF424550),
    onSurfaceVariant = TextoSecundarioEscuro,

    outline = BordaEscura,
    outlineVariant = Color(0xFF424550),
    scrim = Color.Black,

    inverseSurface = Color(0xFFE2E2EB),
    inverseOnSurface = Color(0xFF2E3038),
    inversePrimary = AzulPrincipal,

    surfaceDim = Color(0xFF111318),
    surfaceBright = Color(0xFF353840),
    surfaceContainerLowest = Color(0xFF0C0E13),
    surfaceContainerLow = Color(0xFF191C22),
    surfaceContainer = Color(0xFF1D2026),
    surfaceContainerHigh = Color(0xFF272A31),
    surfaceContainerHighest = Color(0xFF32353D)
)

@Composable
fun CarteirinhaDigital2DEVEST_BTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) {
        darkScheme
    } else {
        lightScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        content = content
    )
}