package com.aula.carteirinhaprofessor.feature.carteirinha.presetantion.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.aula.carteirinhaprofessor.feature.carteirinha.presetantion.component.PerfilAluno
import com.aula.carteirinhaprofessor.feature.carteirinha.presetantion.component.QrCode
import com.aula.carteirinhaprofessor.R.drawable.fundohome
import com.aula.carteirinhaprofessor.R.drawable.senai

@Composable
fun CarteirinhaScreen(
    modifier: Modifier = Modifier
) {
    Box {
        Image(
            painter = painterResource(id = fundohome),
            contentDescription = "Fundo",
            modifier = Modifier
                .fillMaxSize()
                .alpha(0.5f),
            contentScale = ContentScale.Crop
        )
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceAround,
            modifier = modifier.fillMaxSize()

        ) {
            Image(
                painter = painterResource(id = senai),
                contentDescription = "Logo Senai",
                modifier = Modifier
                    .fillMaxWidth(0.8f)
            )
            PerfilAluno(
                nome = "Murilo Santos",
                curso = "Devest"
            )
            QrCode(
                conteudo = "90000000001756396163"
            )
        }

    }

}