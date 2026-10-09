package com.aula.carteirinhaprofessor.feature.unidadecurriculares.presentation

import com.aula.carteirinhaprofessor.feature.unidadecurriculares.domain.model.UnidadeCurricular

data class UnidadeCurricularUiState(
    val listaUnidadesCurriculares: List<UnidadeCurricular> = emptyList(),
    val isLoading: Boolean = false,
    val errorMessage: String? = null
) {
}