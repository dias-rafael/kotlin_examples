class ExemploAssessorCustomizado(val altura: Int, val largura: Int) {
    val isQuadrado1: Boolean
    get() { //assessor customizado
        return altura == largura
    }

    val isQuadrado2
    get() = altura == largura //assessor customizado
}


fun main() {
    val quadrado: ExemploAssessorCustomizado = ExemploAssessorCustomizado(10, 10)
    val retangulo: ExemploAssessorCustomizado = ExemploAssessorCustomizado(10, 20)
    println(retangulo.isQuadrado1)
    println(quadrado.isQuadrado2)
}