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
    // arreglo de numeros
    val numbers = arrayOf(1,2,3,4,5,6,7,8,9,10)
    //isEven(numbers)
    println(getDay(8))
    val person=person("Manuel",21)
    person.displayInformation()
    println(person.name)
    println(person.age)
}
fun add():Int{
    val x = 10
    val y = 5
    return (x+y)
}

fun producto(x:Int,y:Int):Int{
  return (x*y)
}

fun PrintArray(names:Array<String>) {
    println(names)
    for (name in names) {
        println("hola $name")
    }
    //funcion que resibe un arreglo de numeros e identifica par o impar
    fun isEven(numbers: Array<Int>) {
        for (number in numbers) {  // Itera sobre cada número en el arreglo
            if (number % 2 == 0) {  // Verifica si el número es par
                println("The number $number is even")  // Imprime si el número es par
            } else {  // Si no es par
                println("The number $number is odd")  // Imprime si el número es impar
            }
        }

    }
}
fun getDay(day:Int): String{
   var name = ""
    when (day){
        1 -> name="Monday"
        2 -> name="Tuesday"
        3 -> name="Wednesday"
        4 -> name="Thursday"
        5 -> name="Friday"
        6 -> name="Saturday"
        7 -> name="Sunday"
        else -> name="incorrect name"
    }
    return name
}
class person(val name:String, val age:Int){
    fun displayInformation(){
        println("name: $name age $age")

    }
}