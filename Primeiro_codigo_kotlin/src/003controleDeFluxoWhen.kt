// Controle de fluxo com When

fun main() {
    // Declaração de uma variável inteira chamada "numero" com valor -8
    var numero: Int = -8

    // Estrutura de controle "when" que verifica o valor da variável "numero"
    when {
        // Se "numero" for maior que 0, imprime "numero maior que zero" e o valor de "numero"
        numero > 0 -> {
            println("numero maior que zero")
            println(numero)
        }
        // Se "numero" for menor que 0, imprime "numero menor que zero" e o valor de "numero"
        numero < 0 -> {
            println("numero menor que zero")
            println(numero)
        }
        // Se "numero" não for nem maior nem menor que 0 (ou seja, é igual a 0), imprime "Zero"
        else -> println("Zero")
    }

    // Declaração de uma variável inteira chamada "mes" com valor 13
    var mes = 13

    // Estrutura de controle "when" que verifica o valor da variável "mes"
    when (mes) {
        // Se "mes" for igual a 1, imprime "Jan"
        1 -> println("Jan")
        // Se "mes" for igual a 2, imprime "Fev"
        2 -> println("Fev")
        // Se "mes" for igual a 3, imprime "Mar"
        3 -> println("Mar")
        // Se "mes" não for nem 1, nem 2, nem 3
        else -> {
            // Se "mes" for menor que 12, imprime "Abril e restante"
            if(mes < 12) {
                println("Abril e restante")
            }
            // Se "mes" for maior ou igual a 13, imprime "mes invalido"
            else if(mes >= 13) {
                println("mes invalido")
            }
        }
    }

    // Declaração de uma variável de string chamada "nome" com valor "raphael"
    val nome = "raphael"

    // Estrutura de controle "when" que verifica o valor da variável "nome"
    when (nome) {
        // Se "nome" for igual a "Raphael" ou "Kentha", imprime "Bom nome"
        "Raphael", "Kentha" -> println("Bom nome")
        // Se "nome" não for nem "Raphael" nem "Kentha", imprime "Mehhhh"
        else -> println("Mehhhh")
    }
}
