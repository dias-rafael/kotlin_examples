//Exibir resultado da média de temperaturas informadas pelo usuário

fun main() {
    var temperatura: Int = 0
    var somatoria: Int = 0
    var quantidade: Int = 0

    do { //executa ao menos uma vez
        println("Digite uma temperatura ou 999 para sair:")
        temperatura = readLine()!!.toInt() //ideal é tratar o nulo e número

        if (temperatura != 999) {
            somatoria += temperatura
            quantidade++
        }
    } while (temperatura != 999)

    /*
    while (temperatura != 999) { //executa somentee se a condição for verdadeira
        println("Digite uma temperatura ou 999 para sair:")
        temperatura = readLine()!!.toInt() //ideal é tratar o nulo e número

        if (temperatura != 999) {
            somatoria += temperatura
            quantidade++
        }
    }

     */

    println("A média das temperaturas é = ${somatoria/quantidade}")
}