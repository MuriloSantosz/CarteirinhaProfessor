package com.aula.carteirinhaprofessor.app.navigation.professor

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.aula.carteirinhaprofessor.app.navigation.GraphRoutes
import com.aula.carteirinhaprofessor.app.navigation.ProfileGuard
import com.aula.carteirinhaprofessor.app.ui.AppShell
import com.aula.carteirinhaprofessor.feature.login.domain.model.PerfilAcesso
import com.aula.carteirinhaprofessor.feature.login.domain.model.UsuarioLogado
import com.aula.carteirinhaprofessor.feature.professor.home.presentation.screen.HomeProfessorScreen
import com.aula.carteirinhaprofessor.feature.professor.turmas.domain.repository.TurmaRepository
import com.aula.carteirinhaprofessor.feature.professor.turmas.presentation.TurmaViewModel
import com.aula.carteirinhaprofessor.feature.professor.turmas.presentation.factory.TurmaViewModelFactory
import com.aula.carteirinhaprofessor.feature.professor.turmas.presentation.screen.TurmaScreen
import com.aula.carteirinhaprofessor.feature.professor.unidadescurriculares.domain.repository.UnidadeCurricularProfessorRepository
import com.aula.carteirinhaprofessor.feature.professor.unidadescurriculares.presentation.UnidadeCurricularProfessorViewModel
import com.aula.carteirinhaprofessor.feature.professor.unidadescurriculares.presentation.factory.UnidadeCurricularProfessorViewModelFactory
import com.aula.carteirinhaprofessor.feature.professor.unidadescurriculares.presentation.screen.UnidadeCurricularProfessorScreen
import kotlinx.coroutines.flow.StateFlow

fun NavGraphBuilder.professorNavGraph(
    navController: NavHostController,
    usuarioLogadoFlow: StateFlow<UsuarioLogado?>,
    turmaRepository: TurmaRepository,
    unidadeCurricularProfessorRepository: UnidadeCurricularProfessorRepository,
    darkTheme: Boolean,
    onDarkThemeChange: (Boolean) -> Unit,
    onLogout: () -> Unit,
    onSessaoAusente: () -> Unit,
    onPerfilInvalido: (PerfilAcesso) -> Unit
) {
    navigation(
        startDestination = ProfessorRoutes.HOME,
        route = GraphRoutes.PROFESSOR
    ) {
        composable(route = ProfessorRoutes.HOME) {
            ProfileGuard(
                usuarioFlow = usuarioLogadoFlow,
                perfilEsperado = PerfilAcesso.PROFESSOR,
                onSessaoAusente = onSessaoAusente,
                onPerfilInvalido = onPerfilInvalido
            ) { usuario ->
                AppShell(
                    title = "Início",
                    usuarioLogado = usuario,
                    canNavigateBack = false,
                    darkTheme = darkTheme,
                    onDarkThemeChange = onDarkThemeChange,
                    onNavigateBack = {},
                    onLogout = onLogout
                ) { innerPadding ->
                    HomeProfessorScreen(
                        usuarioLogado = usuario,
                        onTurmasClick = {
                            navController.navigate(ProfessorRoutes.TURMAS)
                        },
                        onUnidadesCurricularesClick = {
                            navController.navigate(ProfessorRoutes.UNIDADES_CURRICULARES)
                        },
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(innerPadding)
                    )
                }
            }
        }

        composable(route = ProfessorRoutes.TURMAS) {
            ProfileGuard(
                usuarioFlow = usuarioLogadoFlow,
                perfilEsperado = PerfilAcesso.PROFESSOR,
                onSessaoAusente = onSessaoAusente,
                onPerfilInvalido = onPerfilInvalido
            ) { usuario ->
                val factory = remember(turmaRepository) {
                    TurmaViewModelFactory(repository = turmaRepository)
                }
                val turmaViewModel: TurmaViewModel = viewModel(factory = factory)

                AppShell(
                    title = "Turmas",
                    usuarioLogado = usuario,
                    canNavigateBack = true,
                    darkTheme = darkTheme,
                    onDarkThemeChange = onDarkThemeChange,
                    onNavigateBack = {
                        navController.popBackStack()
                    },
                    onLogout = onLogout
                ) { innerPadding ->
                    TurmaScreen(
                        viewModel = turmaViewModel,
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(innerPadding)
                    )
                }
            }
        }

        composable(route = ProfessorRoutes.UNIDADES_CURRICULARES) {
            ProfileGuard(
                usuarioFlow = usuarioLogadoFlow,
                perfilEsperado = PerfilAcesso.PROFESSOR,
                onSessaoAusente = onSessaoAusente,
                onPerfilInvalido = onPerfilInvalido
            ) { usuario ->
                val factory = remember(unidadeCurricularProfessorRepository) {
                    UnidadeCurricularProfessorViewModelFactory(repository = unidadeCurricularProfessorRepository)
                }
                val viewModel: UnidadeCurricularProfessorViewModel = viewModel(factory = factory)

                AppShell(
                    title = "Unidades Curriculares",
                    usuarioLogado = usuario,
                    canNavigateBack = true,
                    darkTheme = darkTheme,
                    onDarkThemeChange = onDarkThemeChange,
                    onNavigateBack = {
                        navController.popBackStack()
                    },
                    onLogout = onLogout
                ) { innerPadding ->
                    UnidadeCurricularProfessorScreen(
                        viewModel = viewModel,
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(innerPadding)
                    )
                }
            }
        }
    }
}
