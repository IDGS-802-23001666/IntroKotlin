fun main() {
    val claveCorrecta = "1234"
    var intentos = 0
    var accesoConcedido = false
    
    while (intentos < 3 && !accesoConcedido) {
        print("Ingrese la clave de seguridad del PLC: ")
        val entrada = readln()
        
        if (entrada == claveCorrecta) {
            accesoConcedido = true
            println("Acceso concedido al sistema.")
        } else {
            intentos++
            println("Clave incorrecta. Intentos restantes: ${3 - intentos}")
        }
    }
    
    if (!accesoConcedido) {
        println("PLC BLOQUEADO. Contacte al administrador.")
    }
}