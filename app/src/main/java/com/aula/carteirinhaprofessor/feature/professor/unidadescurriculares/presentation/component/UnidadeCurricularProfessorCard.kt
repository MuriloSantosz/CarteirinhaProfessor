package com.aula.carteirinhaprofessor.feature.professor.unidadescurriculares.presentation.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.aula.carteirinhaprofessor.feature.professor.unidadescurriculares.domain.model.UnidadeCurricularProfessor

@Composable
fun UnidadeCurricularProfessorCard(
    modifier: Modifier = Modifier,
    unidadeCurricular: UnidadeCurricularProfessor
) {
    Card(
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(12.dp),
        border = BorderStroke(1.5.dp, Color.Black),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surface
        ),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Text(
                text = unidadeCurricular.nome,
                fontSize = 18.sp,
            )

            Text(
                text = "Turma: ${unidadeCurricular.turma}",
            )

            Text(
                text = "Carga Horária: ${unidadeCurricular.cargaHoraria}h",
            )
            Text(
                text = "Aulas: ${unidadeCurricular.aulasRealizadas}/${unidadeCurricular.quantidadeAulas}",
            )


            val dias = unidadeCurricular.diasSemana.joinToString(", ")
            Text(
                text = "Dias: $dias",
            )

            Text(
                text = "Horário: ${unidadeCurricular.horarioInicio} - ${unidadeCurricular.horarioFim}",
            )
        }
    }
}
