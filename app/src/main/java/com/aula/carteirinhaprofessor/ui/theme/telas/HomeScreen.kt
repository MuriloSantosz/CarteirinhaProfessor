package com.aula.carteirinhaprofessor.ui.theme.telas

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.R


@Preview
@Composable
fun HomeTela(modifier: Modifier = Modifier){
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.DarkGray),
        contentAlignment = Alignment.Center
    )
    {
        Column(modifier = Modifier) {
            Text("Professor")
            Button(onClick = {}, modifier = Modifier
                .width(150.dp).height(50.dp), colors = ButtonDefaults.buttonColors(
                contentColor = Color.Black,))
            {
                Text("Turmas")
            }

            Spacer(Modifier.height(20.dp))

            Button(onClick = {}, modifier = Modifier
                .width(150.dp).height(50.dp), colors = ButtonDefaults.buttonColors(
                contentColor = Color.Black,))
            {
                Text("Unidades")
            }

        }



    }
}