import kotlin.math.PI
import kotlin.math.pow

fun areaCuadrado(lado: Double){
    val resultado = lado.pow(2)
    println("El area del cuadrado es $resultado")
}

fun areaTriangulo(base: Double, altura: Double){
    val resultado = (base * altura) / 2 
    println("El area del triangulo es $resultado")
}

fun areaCirculo(radio: Double){
    val resultado = (PI * radio).pow(2)
    println("El area del circulo es $resultado")
}

fun areaCuadrado(base: Double, altura: Double){
    val resultado = base * altura
    println("El area del cuadrado es $resultado")
}

fun limpiarPantalla(){
    ProcessBuilder("cmd", "/c", "cls")
        .inheritIO()
        .start()
        .waitFor()
}

fun main(){
    var opcion: Int

    do{
        println("\n--- MENÚ DE CÁLCULO DE ÁREAS ---")
        println("1. Cuadrado")
        println("2. Triángulo")
        println("3. Círculo")
        println("4. Rectángulo")
        println("5. Salir")
        print("Elija una opción: ")

        opcion = readln().toIntOrNull() ?: 0

        when(opcion) {
            1 -> {
                print("Ingrese el lado del cuadrado: ")
                val l = readln().toDouble()
                areaCuadrado(l)
            }
            2 -> {
                print("Ingrese la base del triangulo: ")
                val a = readln().toDouble()
                print("Ingrese la altura del triangulo: ")
                val b = readln().toDouble()
                areaTriangulo(a, b)
            }
            3 -> {
                print("Ingrese el radio del circulo: ")
                val a = readln().toDouble()
                areaCirculo(a)
            }
            4 -> {
                print("Ingrese la base del cuadrado: ")
                val a = readln().toDouble()
                print("Ingrese la altura del cuadrado: ")
                val b = readln().toDouble()
                areaTriangulo(a, b)
            }
            5 -> println("Saliendo del programa")
            else -> println("Opcion no valida, intente de nuevo")
        }
    }while(opcion != 5)
}