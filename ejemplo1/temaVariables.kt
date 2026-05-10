fun main(){
    val saludo = "Hola" //Inmutable
    var nombre: String = "Kotlin" //Mutable

    println("$saludo $nombre")
    println("Ingrese el primer numero")
    val num1 = readln().toInt()
    println("Ingrese el segundo numero")
    val num2 = readln().toInt()
    var res = num1 + num2
    println("La suma es: $res")
}
