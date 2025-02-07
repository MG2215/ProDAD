package com.example.prueba2.Class

/*class Variable {
}*/

fun main() {
    //variables numericas
    val age:Int =20
    val long_number:Long = 928891222222044
    val temperatura:Float = 27.33f
    val weight:Double = 64.1267

    //variables tipo string

    val genero:Char = 'M'
    val name:String = "Manuel Villalobos"

    //boot variable
    val isgreater:Boolean = false

    //collection variables
    val names = arrayOf("Erick", "Sofia", "Javier", "Veronica")

    println(age)

    println("Bienvenido $name,a tu primer proyecto de kotlin")
    println(add())
    println(producto(5,8))
    PrintArray(names)
}
fun add():Int{
    val x = 10
    val y = 5
    return (x+y)
}

fun producto(x:Int,y:Int):Int{
  return (x*y)
}

fun PrintArray(names:Array<String>){
    println(names)
    for (name in names){
        println("hola $name")
    }
}