import kotlin.math.pow

fun mostrarMayor(v1: Int, v2: Int, v3: Int){
    print("Mayor:")
    if (v1 > v2 && v1 > v3)
        println(v1)
    else 
        if (v2 > v3)
            print(v2)
        else
            print(v3)
}

fun limpiarPantalla(){
    ProcessBuilder("cmd", "/c", "cls")
        .inheritIO()
        .start()
        .waitFor()
}

fun main(){
    limpiarPantalla()
    print("Ingrese primer valor:")
    val valor1 = readln().toInt()
    println("Ingrese el segundo valor:")
    val valor2 = readln().toInt()
    println("Ingrese el tercer valor:")
    val valor3 = readln().toInt()
    
    mostrarMayor(valor1, valor2, valor3)
}

/*
Problema
Crea un programa que permita calcular el area de 4 figuras, mostrar un menu para elegir la figura a calcular, pedira los valores necesarios
y mostrara el resultado, a continuacion mostrara nuevamente el menu, terminara al elegir opcion 5
*/