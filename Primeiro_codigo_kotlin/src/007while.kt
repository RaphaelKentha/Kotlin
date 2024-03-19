fun main() {

    /*
    while (true) {
        println("Infinite loop")
    // Este é um loop infinito que imprime a frase "Infinite loop" infinitamente
    // Está comentado para evitar que o programa fique preso neste loop
    }
    */

    var contador_aux = 0
    while (contador_aux < 10) {
        println("Contador: $contador_aux")
        contador_aux++
        // Este loop imprime a frase "Contador: $contador_aux" 10 vezes
        // contador_aux++ é o mesmo que contador_aux = contador_aux + 1
        // o contador sempre começa em 0
    }

    var opcao = 0
    while (opcao != 2) {
        println("1 para iniciar, 2 para sair")
        opcao = readLine()!!.toInt()
        // readLine() lê a entrada do usuário
        // !!.toInt() converte a entrada para inteiro
        // opcao = readLine()!!.toInt() é o mesmo que opcao = Integer.parseInt(readLine())

        if (opcao == 1) {
            println("Iniciando...")
            for(aux in 1..10)
                println("Contador: Jogando $aux")
            // Este loop imprime a frase "Contador: Jogando $aux" 10 vezes
            // quando o usuário digitar 1
        } else if (opcao == 2) {
            println("Saindo...")
            // Se o usuário digitar 2, o programa imprime "Saindo..."
        } else {
            println("Opção inválida")
            // Se o usuário digitar qualquer outro número, o programa imprime "Opção inválida"
        }

        var opcao2 = 0
        while (true) {
            println("1 para continuar, 2 para sair")
            opcao2 = readLine()!!.toInt()
            if (opcao2 == 1) {
                break
                // Se o usuário digitar 1, o programa sai deste loop
            } else if (opcao2 == 2) {
                opcao = 2
                break
                // Se o usuário digitar 2, o programa define 'opcao' como 2 e sai deste loop
            } else {
                println("Opção inválida")
                // Se o usuário digitar qualquer outro número, o programa imprime "Opção inválida"
            }
        }

        while (false) {
            println("Inalcançável")
            // Este bloco de código nunca será executado porque a condição do loop while é 'false'
        }

        do {
            println("Inalcançável uma vez")
        } while (false)
        // Este bloco de código será executado uma vez porque é um loop do-while
        // A condição 'false' no final do loop impede que ele seja executado novamente
    }
}
