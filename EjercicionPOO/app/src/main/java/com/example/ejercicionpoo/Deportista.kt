package com.example.ejercicionpoo

open class Deportista(

    var nombre: String = "",
    var estatura: Float =0.0f,
    var peso: Float =0.0f,
    var edad: Int= 0

){
    open fun Saludar(): String{
        return "Hola yo soy Deposrtista "
    }
    open fun Descansar(): String{
        return "Estoy descansando :) "
    }
    open fun competir(): String{
        return  "Voy a: "
    }

}

class Runner(
    nombre: String,
    estatura: Float,
    peso: Float,
    edad: Int,
    var estilo: String= "",
    var velocidad: Float= 0.0f
): Deportista(nombre, estatura, peso, edad){

    fun correr(){
        Saludar()
        println("Mi estilo es: ${estilo}  y compito a una velocidad de: ${velocidad}")
        Descansar()
    }
    override fun competir(): String{
        return super.competir() + "Correr"
    }


}
class Ciclista(
    nombre: String,
    estatura: Float,
    peso: Float,
    edad: Int,
    var biciTipo: String= "",
    var velocidad: Float= 0.0f
): Deportista(nombre, estatura, peso, edad) {

    fun pedalear(){
        Saludar()
        println("Mi bicicleta es: ${biciTipo}  y compito a una velocidad de: ${velocidad}")
        Descansar()
    }
    override fun competir(): String{
        return super.competir() + "Pedalear"
    }
}

class Nadador(
    nombre: String,
    estatura: Float,
    peso: Float,
    edad: Int,
    var estilo: String= "",
    var velocidad: Float= 0.0f
): Deportista(nombre, estatura, peso, edad){

    fun nadar(){
        Saludar()
        println("Mi estilo es: ${estilo}  y compito a una velocidad de: ${velocidad}")
        Descansar()
    }

    override fun competir(): String{
        return super.competir() + "Nadar"
    }


}
interface corredorInterface{
    var estilo: String
    var velCorrer: Float
    fun correr():String{
        return  "Triatleta corredor:  ${estilo} y a esta velocidad: ${velCorrer}"
    }
}
interface ciclistaInterface{
    var bicilcleta: String
    var velPedaleo: Float
    fun pedalearBici():String{
        return "Triatleta ciclista con:  ${bicilcleta} y a esta velocidad: ${velPedaleo}"
    }
}
interface nadadorInterface{
    var estilo: String
    var velNadar: Float
    fun nadar():String{
        return "Triatleta nadador: ${estilo} y a esta velocidad: ${velNadar}"
    }
}
class Triatletas (
    nombre: String ,
    estatura: Float ,
    peso: Float,
    edad: Int,
    override var estilo: String,
    override var bicilcleta: String,
    override var velCorrer: Float,
    override var velPedaleo: Float,
    override var velNadar: Float
):  Deportista(nombre , estatura, peso, edad),corredorInterface,ciclistaInterface,nadadorInterface {

    override fun competir(): String{
        return super.competir() + "Correr, Correr en Bicicleta y Nadar"
    }
}



