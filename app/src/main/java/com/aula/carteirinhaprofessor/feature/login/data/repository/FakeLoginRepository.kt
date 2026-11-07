package com.aula.carteirinhaprofessor.feature.login.data.repository

import com.aula.carteirinhaprofessor.feature.login.domain.model.PerfilAcesso
import com.aula.carteirinhaprofessor.feature.login.domain.model.UsuarioLogado
import com.aula.carteirinhaprofessor.feature.login.domain.repository.LoginRepository
import kotlinx.coroutines.delay

class FakeAuthRepository : LoginRepository {

    override suspend fun login(
        login: String,
        senha: String
    ): Result<UsuarioLogado> {

        delay(1500)

        if (senha != "123") {

            return Result.failure(
                IllegalArgumentException(
                    "Login ou senha inválidos"
                )
            )
        }

        return when {

            login.equals(
                "aluno",
                ignoreCase = true
            ) -> {

                Result.success(
                    UsuarioLogado(
                        id = "1",
                        nome = "Murilo Santos",
                        matricula = "7635281761",
                        perfil = PerfilAcesso.ALUNO,
                        curso = "Devest",
                        turma = "2DEVEST-B",
                        token = "token-fake-aluno"
                    )
                )
            }

            login.equals(
                "professor",
                ignoreCase = true
            ) -> {

                Result.success(
                    UsuarioLogado(
                        id = "2",
                        nome = "Professor Robson",
                        matricula = "P123456789",
                        perfil = PerfilAcesso.PROFESSOR,
                        curso = "",
                        turma = "",
                        token = "token-fake-professor"
                    )
                )
            }

            else -> {

                Result.failure(
                    IllegalArgumentException(
                        "Login ou senha inválidos"
                    )
                )
            }
        }
    }
}