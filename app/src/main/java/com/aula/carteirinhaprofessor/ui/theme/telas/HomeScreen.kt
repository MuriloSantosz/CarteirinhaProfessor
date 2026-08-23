package com.aula.carteirinhaprofessor.ui.theme.telas

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.R
import androidx.navigation.NavController


@Composable
fun HomeTela(modifier: Modifier = Modifier, navController: NavController){
    Box(modifier = Modifier
        .fillMaxSize(),
        contentAlignment = Alignment.Center
    )
    {
        Image(
            painter = painterResource(id = com.aula.carteirinhaprofessor.R.drawable.fundohome),
            contentDescription = "fundo",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        Column(modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center
        )
        {
            Text("Home Professor", fontSize = 35.sp, color = Color.White)
            Spacer(modifier = Modifier.padding(bottom = 25.dp))
            Button(onClick = {navController.navigate(route = "turmas")}, modifier = Modifier
                .width(150.dp)
                .height(50.dp), colors = ButtonDefaults.buttonColors(
                contentColor = Color.Black))
            {
                Text("Turmas", fontSize = 20.sp)
            }

            Spacer(Modifier.height(20.dp))

            Button(onClick = {
                navController.navigate(route = "unidades")
            }, modifier = Modifier
                .width(150.dp)
                .height(50.dp), colors = ButtonDefaults.buttonColors(
                contentColor = Color.Black))
            {
                Text("Unidades", fontSize = 20.sp)
            }

        }

    }
}