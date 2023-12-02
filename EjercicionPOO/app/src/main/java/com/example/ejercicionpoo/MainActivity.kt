package com.example.ejercicionpoo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var Jugador: Deportista = Deportista("Jorge", 1.86f, 85.5f, 22)

        var Corredor: Runner = Runner(" Jorge Corredor",1.86f,85.6f,22,"RELEVOS",21.5F)
        println(Corredor.Saludar())
        println(Corredor.competir())
        println(Corredor.correr())
        println(Corredor.Descansar())

        var Ciclista1: Ciclista = Ciclista(" Jorge Ciclicta",1.86f,85.6f,22,"Montañes",21.5F)
        println(Ciclista1.Saludar())
        println(Ciclista1.competir())
        println(Ciclista1.pedalear())
        println(Ciclista1.Descansar())

        var Nadador1: Nadador = Nadador(" Jorge Nadador",1.86f,85.6f,22,"Montañes",21.5F)
        println(Nadador1.Saludar())
        println(Nadador1.competir())
        println(Nadador1.nadar())
        println(Nadador1.Descansar())


        var DeportistaExtremo: Triatletas = Triatletas("Jorge Triatela",1.86f,858.6f,22,"Monataña, Birdamn", "Normal",10.6f,25.6f,15.66f)
        println(DeportistaExtremo.competir())
        println(DeportistaExtremo.correr())
        println(DeportistaExtremo.nadar())
        println(DeportistaExtremo.pedalearBici())


    }
}