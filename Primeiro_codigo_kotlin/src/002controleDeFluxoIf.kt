/*
*/
fun main() {
    val idade = 18

    if (idade <= 18) {
        println("pode entrar")
    } else {
        println("Vaza")
    }
    // Dados os intevalos de hora:
    // [6 , 12] ; (12 , 18) ; [18 , 6)
    // responda: bom dia, tarde ou noite
    var hora: Int = 2

    if (hora >= 6) {
        println("bom dia")
    } else {
        if (hora in 13..17) {
            println("boa tarde")
        } else println("boa noite")
        /*Em Kotlin, until é usado para criar um intervalo de valores
        que inclui o valor inicial, mas exclui o valor final.
        Por exemplo, for (i in 1 until 4) fará com que i
        tenha apenas os valores 1, 2 e 3.
        Isso é diferente do operador .., que inclui ambos os valores inicial e final.
        Por exemplo, for (i in 1..4) fará com que i tenha os valores 1, 2, 3 e 4.
        Portanto, until é útil quando você quer um intervalo que não inclui o valor final*/
    }
    val a = 4
    val b = 6
    var maior = 0
    maior = if (a > b) a else b
    println(maior)
}