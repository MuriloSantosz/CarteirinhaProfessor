package com.aula.carteirinhaprofessor.app

import android.app.Application
import com.aula.carteirinhaprofessor.app.di.AppContainer
import com.aula.carteirinhaprofessor.app.di.DefaultAppContainer

class CarteirinhaApplication : Application() {
    val container: AppContainer by lazy {
        DefaultAppContainer()
    }
}