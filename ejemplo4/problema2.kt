fun main(){
    var carga = 0
    var minutos = 0

    println("Estado inicial de la bateria: $carga%")

    while(carga < 100){
        carga += 15
        minutos ++

        val cargaActual = if (carga > 100) 100 else carga
        println("Minutos $minutos: Carga al $cargaActual%")
    }
    println("Carga completada en $minutos minutos")
}