package com.aula.carteirinhaprofessor.feature.aluno.carteirinha.presentation.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.aula.carteirinhaprofessor.R
import com.aula.carteirinhaprofessor.feature.aluno.carteirinha.presentation.component.PerfilAluno
import com.aula.carteirinhaprofessor.feature.aluno.carteirinha.presentation.component.QrCode
import com.aula.carteirinhaprofessor.feature.login.domain.model.UsuarioLogado

@Composable
fun CarteirinhaScreen(
    usuarioLogado: UsuarioLogado,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color.Gray)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier
                .fillMaxSize()
                .padding(vertical = 22.dp, horizontal = 20.dp)
        ) {

            PerfilAluno(
                nome = "Murilo Santos",
                matricula = usuarioLogado.matricula,
                curso = usuarioLogado.curso
            )

            QrCode(
                conteudo = usuarioLogado.matricula
            )
        }
    }
}
