interface Expressao
class Numero(val valor: Int): Expressao
class Soma(val esquerdo: Expressao, val direito: Expressao): Expressao

//smart cast
/*
fun avaliacao(expressao: Expressao): Int {

if (expressao is Numero) {
    return expressao.valor //fundo verde informa que o smart cast ocorreu
}

if (expressao is Soma) {
    return avaliacao(expressao.esquerdo) + avaliacao(expressao.direito)
}

throw IllegalArgumentException("Expressão é desconhecida")

}
 */

//bloco com ramificação
fun avaliacao(expressao: Expressao): Int =
    when(expressao) {
        is Numero -> {
            println("Expressão com número: ${expressao.valor}")
            expressao.valor
        }
        is Soma -> avaliacao(expressao.esquerdo) + avaliacao(expressao.direito)
        else -> throw IllegalArgumentException("Expressão é desconhecida")
    }

fun main() {
    val resultado = avaliacao(Soma(Soma(Numero(1), Numero(2)), Numero(4)))
    println(resultado)
}