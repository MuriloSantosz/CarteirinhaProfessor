package com.aula.carteirinhaprofessor.app

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.aula.carteirinhaprofessor.app.di.AppContainer
import com.aula.carteirinhaprofessor.app.navigation.AppNavHost
import com.aula.carteirinhaprofessor.core.designsystem.theme.CarteirinhaProfessorTheme

@Composable
fun App(container: AppContainer) {
    CarteirinhaProfessorTheme() {
        val navController = rememberNavController()
        AppNavHost(
            navController = navController,
            container=container
        )
    }
}