fun main() {
    
    val matriz1 = arrayOf(
        intArrayOf(0, 0, 0),
        intArrayOf(0, 0, 0),
        intArrayOf(0, 0, 0)
    )

    val matriz2 = arrayOf(
        intArrayOf(0, 0, 0),
        intArrayOf(0, 0, 0),
        intArrayOf(0, 0, 0)
    )

    val resultado = arrayOf(
        intArrayOf(0, 0, 0),
        intArrayOf(0, 0, 0),
        intArrayOf(0, 0, 0)
    )

    
    println("Ingresa los valores de la Matriz 1:")
    for (i in 0..2) {
        for (j in 0..2) {
            print("Matriz 1 [$i][$j]: ")
            // readln() lee texto, .toInt() lo convierte a número
            matriz1[i][j] = readln().toInt()
        }
    }

    
    println("\nIngresa los valores de la Matriz 2:")
    for (i in 0..2) {
        for (j in 0..2) {
            print("Matriz 2 [$i][$j]: ")
            matriz2[i][j] = readln().toInt()
        }
    }

    
    for (i in 0..2) {
        for (j in 0..2) {
            resultado[i][j] = matriz1[i][j] + matriz2[i][j]
        }
    }

    
    println("\n--- Resultado de la Suma ---")
    for (fila in resultado) {
        for (valor in fila) {
            print("$valor\t")
        }
        println()
    }
}