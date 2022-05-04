class Pessoa (
    val nome: String,
    val idade: Int
        )

fun main() {
    val pessoa1: Pessoa = Pessoa("Rafael", 41)
    val pessoa2: Pessoa = Pessoa("Patricia", 35)

    println("Pessoa 1: ${pessoa1.nome}")
    println("Pessoa 2: ${pessoa2.nome}")
}