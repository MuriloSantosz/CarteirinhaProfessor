package com.aula.carteirinhaprofessor.feature.aluno.unidadescurriculares.presentation

import com.aula.carteirinhaprofessor.feature.unidadecurriculares.domain.model.UnidadeCurricular

data class UnidadeCurricularUiState(
    val isLoading: Boolean = false,
    val unidades: List<UnidadeCurricular> = emptyList(),
    val errorMessage: String? = null
)