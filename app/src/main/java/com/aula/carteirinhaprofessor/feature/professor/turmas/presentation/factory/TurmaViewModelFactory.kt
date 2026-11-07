package com.aula.carteirinhaprofessor.feature.professor.turmas.presentation.factory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.aula.carteirinhaprofessor.feature.professor.turmas.domain.repository.TurmaRepository
import com.aula.carteirinhaprofessor.feature.professor.turmas.presentation.TurmaViewModel

class TurmaViewModelFactory(
    private val repository: TurmaRepository
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(TurmaViewModel::class.java)) {
            return TurmaViewModel(repository) as T
        }
        throw IllegalArgumentException("ViewModel desconhecido")
    }
}
