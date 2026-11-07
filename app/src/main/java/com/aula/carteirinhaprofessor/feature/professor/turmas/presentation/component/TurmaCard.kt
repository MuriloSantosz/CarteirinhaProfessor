package com.aula.carteirinhaprofessor.feature.professor.turmas.presentation.component

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
import com.aula.carteirinhaprofessor.feature.professor.turmas.domain.model.Turma

@Composable
fun TurmaCard(
    modifier: Modifier = Modifier,
    turma: Turma
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
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = turma.codigo,
                )
                Text(
                    text = "Semestre: ${turma.semestre}",
                )
            }

            Text(
                text = "Curso: ${turma.curso}",
            )

            Text(
                text = "Alunos: ${turma.quantidadeAlunos}",
            )

            val dias = turma.diasSemana.joinToString(", ")
            Text(
                text = "Dias: $dias",
            )

            Text(
                text = "Horário: ${turma.horarioInicio} - ${turma.horarioFim}",
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun TurmaCardPreview() {
    TurmaCard(
        turma = Turma(
            id = "1",
            codigo = "2DEVEST-A",
            curso = "Desenvolvimento de Sistemas",
            semestre = "2026.2",
            quantidadeAlunos = 28,
            diasSemana = listOf("QUARTA", "QUINTA"),
            horarioInicio = "20:00",
            horarioFim = "23:00"
        )
    )
}
