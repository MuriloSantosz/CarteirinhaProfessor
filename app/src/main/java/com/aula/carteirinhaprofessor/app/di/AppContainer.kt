package com.aula.carteirinhaprofessor.app.di

import com.aula.carteirinhaprofessor.core.auth.SessionTokenStore
import com.aula.carteirinhaprofessor.feature.aluno.unidadescurriculares.domain.repository.UnidadeCurricularRepository
import com.aula.carteirinhaprofessor.feature.login.domain.repository.LoginRepository
import com.aula.carteirinhaprofessor.feature.professor.turmas.domain.repository.TurmaRepository
import com.aula.carteirinhaprofessor.feature.professor.unidadescurriculares.domain.repository.UnidadeCurricularProfessorRepository

interface AppContainer {
    val sessionTokenStore: SessionTokenStore
    val loginRepository: LoginRepository
    val unidadeCurricularRepository: UnidadeCurricularRepository
    val turmaRepository: TurmaRepository
    val unidadeCurricularProfessorRepository: UnidadeCurricularProfessorRepository
}
