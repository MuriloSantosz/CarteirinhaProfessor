package com.aula.carteirinhaprofessor.feature.unidadecurriculares.data

import com.aula.carteirinhaprofessor.feature.unidadecurriculares.domain.model.UnidadeCurricular

fun dataSource (): List<UnidadeCurricular> {
    return listOf(
        UnidadeCurricular(id = "1",nome = "Matemática",professor = "Marcelo",nota1 = 6.5,nota2 = 7.0,media = 7.75,faltas = 2),
        UnidadeCurricular(id = "2",nome = "Portugues",professor = "Patrício",nota1 = 7.0,nota2 = 7.0,media = 7.75,faltas = 2),
        UnidadeCurricular(id = "3",nome = "Banco de Dados",professor = "Rogério",nota1 = 8.5,nota2 = 7.0,media = 7.75,faltas = 2),
        UnidadeCurricular(id = "4",nome = "Ciências",professor = "Marcos",nota1 = 10.0,nota2 = 7.0,media = 7.75,faltas = 2),
        UnidadeCurricular(id = "5",nome = "Fisica",professor = "José",nota1 = 9.5,nota2 = 7.0,media = 7.75,faltas = 2),
        UnidadeCurricular(id = "6",nome = "Biologia",professor = "Lino",nota1 = 8.1,nota2 = 7.0,media = 7.75,faltas = 2),
        UnidadeCurricular(id = "7",nome = "Matemática 2",professor = "Kino",nota1 = 8.9,nota2 = 7.0,media = 7.75,faltas = 2),
        UnidadeCurricular(id = "8",nome = "Matemática 3",professor = "Alex",nota1 = 8.0,nota2 = 7.0,media = 7.75,faltas = 2),
    )
}