import java.io.BufferedReader
import java.io.File
import java.io.FileReader

fun main() {
    try {
        val porcentagem = porcentagem(1000)
        println(porcentagem)
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }

    val idade = lerIdade()
    println(idade)
}

fun porcentagem(numero: Int): String {
    return if (numero in 1..100) {
        "$numero%"
    } else {
        throw IllegalArgumentException("numero deve estar entre 1 e 100")
    }
}

fun lerIdade(): Int? { //retorna Int ou null
    val reader = FileReader(File("src/main/kotlin/Idades.txt"))
    val buffer = BufferedReader(reader)

    try {
        val numero = buffer.readLine()
        return Integer.parseInt(numero)
    //} catch (e: Exception) //genérico
    } catch (e: java.lang.NumberFormatException) {
        return null
    } finally { //sempre executa independente de exceção ou sucesso
        buffer.close()
    }
}