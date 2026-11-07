package com.aula.carteirinhaprofessor.feature.aluno.unidadescurriculares.domain.repository

import com.aula.carteirinhaprofessor.feature.aluno.unidadescurriculares.domain.model.UnidadeCurricular

interface UnidadeCurricularRepository {
    suspend fun listar():Result<List<UnidadeCurricular>>
}