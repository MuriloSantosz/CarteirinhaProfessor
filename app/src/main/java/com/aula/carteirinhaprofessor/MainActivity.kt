package com.aula.carteirinhaprofessor

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.aula.carteirinhaprofessor.ui.theme.CarteirinhaProfessorTheme
import com.aula.carteirinhaprofessor.ui.theme.telas.HomeTela
import com.aula.carteirinhaprofessor.ui.theme.telas.turmasScreen
import com.aula.carteirinhaprofessor.ui.theme.telas.turmasScreen
import com.aula.carteirinhaprofessor.ui.theme.telas.unidadesScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CarteirinhaProfessorTheme {

                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = "home") {
                    composable(route = "home") {
                        HomeTela(navController = navController)
                    }

                    composable(route = "turmas"){
                        turmasScreen(navController = navController, modifier = Modifier)
                    }

                    composable(route = "unidades"){
                        unidadesScreen(navController = navController)
                    }
                }


            }
        }
    }
}

