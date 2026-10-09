package com.aula.carteirinhaprofessor.feature.login.data.repository

import com.aula.carteirinhaprofessor.feature.login.domain.model.UsuarioLogado

interface LoginRepository {
    suspend fun login( usuario:String, senha:String): Result<UsuarioLogado>
}