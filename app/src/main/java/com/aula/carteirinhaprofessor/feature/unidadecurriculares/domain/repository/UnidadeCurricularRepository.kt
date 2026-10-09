package com.aula.carteirinhaprofessor.feature.unidadecurriculares.domain.repository

import com.aula.carteirinhaprofessor.feature.unidadecurriculares.domain.model.UnidadeCurricular

interface UnidadeCurricularRepository {
    suspend fun listarUnidadesCurriculares(): Result<List<UnidadeCurricular>>
}