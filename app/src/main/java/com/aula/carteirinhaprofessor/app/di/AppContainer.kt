package com.aula.carteirinhaprofessor.app.di

import com.aula.carteirinhaprofessor.core.auth.AuthTokenStore
import com.aula.carteirinhaprofessor.feature.login.data.repository.LoginRepository
import com.aula.carteirinhaprofessor.feature.unidadecurriculares.domain.repository.UnidadeCurricularRepository

interface AppContainer {

    val loginRepository: LoginRepository

    val unidadeCurricularRepository: UnidadeCurricularRepository

    val authTokenStore: AuthTokenStore
}