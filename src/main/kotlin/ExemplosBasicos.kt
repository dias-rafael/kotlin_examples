fun main() {

    val message: String = "World"
    val param1 = 1 //VAL => valor imutável (final)
    var param2: Int = 2 //VAR => valor mutável
    var param3: Int
    param3 = 3

    println("Hello $message!") //String template
    println("Hello \$message!") //String template
    println(maxCorpoBloco(param1, param2))
    println(maxCorpoExpressao(param3, param2))
    println("A soma é: ${soma(15, 20)}") //String template expressão
}


fun maxCorpoBloco(a: Int, b: Int): Int {
    return if (a > b) a else b
}


fun maxCorpoExpressao(a: Int, b: Int): Int = if (a > b) a else b
//fun maxCorpoExpressao(a: Int, b: Int) = if (a>b) a else b


fun soma(a: Int, b: Int): Int {
    return a + b
}