//Enrique de Jesús Fregoso Gutiérrez - Programación de Dispositivos Moviles 2024B
import kotlin.math.sqrt

fun main() {
    // Generamos un conjunto de 1000 números aleatorios entre 1 y 100
    val numbers = List(1000) { (1..100).random() }

    // Calculamos la moda
    val moda = numbers.groupBy { it }.maxByOrNull { it.value.size }?.key

    // Calculamos la media
    val media = numbers.average()

    // Calculamos la mediana
    val sortedNumbers = numbers.sorted()
    val mediana = if (sortedNumbers.size % 2 == 0) {
        (sortedNumbers[sortedNumbers.size / 2 - 1] + sortedNumbers[sortedNumbers.size / 2]) / 2.0
    } else {
        sortedNumbers[sortedNumbers.size / 2].toDouble()
    }

    // Calculamos la desviación estándar
    val variance = numbers.map { (it - media) * (it - media) }.average()
    val dE = sqrt(variance)

    // Imprimimos los resultados
    println("Moda: $moda")
    println("Media: $media")
    println("Mediana: $mediana")
    println("Desviación estándar: $dE")
}