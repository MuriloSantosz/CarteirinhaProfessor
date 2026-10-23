package com.aula.carteirinhaprofessor.app

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.navigation.compose.rememberNavController
import com.aula.carteirinhaprofessor.app.di.AppContainer
import com.aula.carteirinhaprofessor.app.navigation.AppNavHost
import com.aula.carteirinhaprofessor.core.designsystem.theme.CarteirinhaProfessorTheme

@Composable
fun App(container: AppContainer) {

    val systemDarkTheme = isSystemInDarkTheme()
    var darkTheme by rememberSaveable { mutableStateOf(systemDarkTheme) }

    CarteirinhaProfessorTheme(
        darkTheme = darkTheme
    ) {
        val navController = rememberNavController()

        AppNavHost(
            navController = navController,
            container = container
        )
    }
}