package com.aula.carteirinhaprofessor.feature.professor.unidadescurriculares.domain.repository

import com.aula.carteirinhaprofessor.feature.professor.unidadescurriculares.domain.model.UnidadeCurricularProfessor

interface UnidadeCurricularProfessorRepository {
    suspend fun listar(): Result<List<UnidadeCurricularProfessor>>
}
