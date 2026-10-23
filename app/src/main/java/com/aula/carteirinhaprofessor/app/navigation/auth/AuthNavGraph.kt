package com.aula.carteirinhaprofessor.app.navigation.auth



import androidx.compose.runtime.remember
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.aula.carteirinhaprofessor.app.navigation.GraphRoutes
import com.aula.carteirinhaprofessor.feature.login.data.repository.LoginRepository
import com.aula.carteirinhaprofessor.feature.login.domain.model.UsuarioLogado
import com.aula.carteirinhaprofessor.feature.login.domain.repository.LoginRepository
import com.aula.carteirinhaprofessor.feature.login.presentation.LoginViewModel
import com.aula.carteirinhaprofessor.feature.login.presentation.factory.LoginViewModelFactory
import com.aula.carteirinhaprofessor.feature.login.presentation.screen.LoginScreen

fun NavGraphBuilder.authNavGraph(
    loginRepository: LoginRepository,
    onLoginSucesso: (UsuarioLogado) -> Unit
) {
    navigation(
        startDestination = AuthRoutes.LOGIN,
        route = GraphRoutes.AUTH
    ) {
        composable(route = AuthRoutes.LOGIN) {
            val factory = remember(loginRepository) {
                LoginViewModelFactory(
                    repository = loginRepository
                )
            }

            val loginViewModel: LoginViewModel = viewModel(
                factory = factory
            )

            LoginScreen(
                viewModel = loginViewModel,
                onLoginSucesso = onLoginSucesso
            )
        }
    }
}