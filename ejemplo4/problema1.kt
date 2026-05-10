fun main(){
    var diametro: Double
    do{
        print("Ingresa el diametro de la tuberia:")
        diametro = readln().toDouble()

        if(diametro <= 0){
            println("El diametro no puede ser negativo o cero")
        }
    }while(diametro <= 0)
    println("Diametro valido registrado: $diametro")
}