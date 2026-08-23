package com.aula.carteirinhaprofessor.ui.theme.telas

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController


@Composable
fun turmasScreen(modifier: Modifier = Modifier, navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    )
    {
        Image(
            painter = painterResource(com.aula.carteirinhaprofessor.R.drawable.bequiground),
            contentDescription = ("Fundo"),
            modifier = Modifier.fillMaxSize()

        )
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        )
        {
            Card(
                colors = CardDefaults.cardColors(containerColor = Color.White),
                modifier = Modifier
                    .height(175.dp)
                    .size(255.dp)

            )
            {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                )
                {
                    Text("Turma: DEV", color = Color.Black, fontSize = 25.sp)
                    Text("Devest", color = Color.Black, fontSize = 25.sp)
                    Text("35 alunos", color = Color.Black, fontSize = 25.sp)
                    Text("8:00", color = Color.Black, fontSize = 25.sp)

                }

            }
            Spacer(modifier = Modifier.height(15.dp))
            Card(
                colors = CardDefaults.cardColors(containerColor = Color.White),
                modifier = Modifier
                    .height(175.dp)
                    .size(255.dp)

            )
            {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                )
                {
                    Text("Turma: ELE ", color = Color.Black, fontSize = 25.sp)
                    Text("Eletrônica", color = Color.Black, fontSize = 25.sp)
                    Text("34 alunos", color = Color.Black, fontSize = 25.sp)
                    Text("13:00", color = Color.Black, fontSize = 25.sp)

                }

            }
            Spacer(modifier = Modifier.height(15.dp))
            Card(
                colors = CardDefaults.cardColors(containerColor = Color.White),
                modifier = Modifier
                    .height(175.dp)
                    .size(255.dp)

            )
            {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                )
                {
                    Text("Turma: MEC", color = Color.Black, fontSize = 25.sp)
                    Text("Mecatrônica", color = Color.Black, fontSize = 25.sp)
                    Text("37 alunos", color = Color.Black, fontSize = 25.sp)
                    Text("17:00", color = Color.Black, fontSize = 25.sp)

                }
            }
            Spacer(modifier = Modifier.height(15.dp))
            Button(
                onClick = { navController.navigate(route = "home") },
                modifier = Modifier
                    .height(50.dp)
                    .width(105.dp)
            )
            {
                Text("Voltar", fontSize = 20.sp)
            }
        }


    }

}