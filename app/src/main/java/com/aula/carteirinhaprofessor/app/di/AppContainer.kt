package com.aula.carteirinhaprofessor.app.di

import com.aula.carteirinhaprofessor.core.auth.SessionTokenStore
import com.aula.carteirinhaprofessor.feature.login.data.repository.LoginRepository
import com.aula.carteirinhaprofessor.feature.unidadecurriculares.domain.repository.UnidadeCurricularRepository

interface AppContainer {
    val sessionTokenStore: SessionTokenStore
    val loginRepository: LoginRepository
    val unidadeCurricularRepository: UnidadeCurricularRepository
}