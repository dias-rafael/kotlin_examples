fun main() {
    println(isLetter('A'))

    println(isNotDigit('x'))

    println(isLetter('7'))

    println(isNotDigit('5'))
}

fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'

fun isNotDigit(c: Char) = c !in '0'..'9'