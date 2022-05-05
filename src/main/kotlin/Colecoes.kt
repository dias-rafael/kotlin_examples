fun main() {
    //Array classe
    val frutas1 = ArrayList<String>()
    frutas1.add("Maca")
    frutas1.add("Banana")
    frutas1.add("Morango")
    println(frutas1)

    //Array Função
    val frutas2 = arrayListOf<String>("Maca", "Banana", "Morango")
    println(frutas2.last())

    val numeros = setOf(1, 14, 2)
    println(numeros.maxOrNull())
}