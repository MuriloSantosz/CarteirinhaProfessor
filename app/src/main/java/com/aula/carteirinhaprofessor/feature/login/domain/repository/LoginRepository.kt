package com.aula.carteirinhaprofessor.feature.login.domain.repository

import com.aula.carteirinhaprofessor.feature.login.domain.model.UsuarioLogado

interface LoginRepository {
    suspend fun login(login: String, senha: String): Result<UsuarioLogado>
}