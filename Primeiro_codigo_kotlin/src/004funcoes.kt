fun main() {
    // Função para somar dois números inteiros
    fun somar(a: Int, b: Int): Int {
        return a + b // Retorna a soma de a e b
    }

    // Função para subtrair dois números inteiros
    fun subtrair(a: Int, b: Int): Int {
        return a - b // Retorna a subtração de a por b
    }

    // Função para multiplicar dois números inteiros
    fun multiplicar(a: Int, b: Int): Int {
        return a * b // Retorna a multiplicação de a por b
    }

    // Função para dividir dois números inteiros
    fun dividir(a: Int, b: Int): Int {
        return a / b // Retorna a divisão de a por b
    }

    val x = 10
    val y = 20
    val soma = somar(x, y)
    val soma2 = somar(a = x, b = y) // passando os parametros nomeados, caso a ordem importe
    val subtracao = subtrair(x, y)
    val multiplicacao = multiplicar(x, y)
    val divisao = dividir(x, y) // retorna 0, pois a função é do tipo Int
    println("A soma de $x e $y é $soma")
    println("A soma de $x e $y é $soma2")
    println("A subtração de $x e $y é $subtracao")
    println("A multiplicação de $x e $y é $multiplicacao")
    println("A divisão de $x e $y é $divisao")

    /* Relembrando o uso de When do codigo 003controleDeFluxoWhen*/


    fun nomeDoMes(numeroDoMes: Int): String {
        return when (numeroDoMes) {
            1 -> "Janeiro"
            2 -> "Fevereiro"
            3 -> "Março"
            4 -> "Abril"
            5 -> "Maio"
            6 -> "Junho"
            7 -> "Julho"
            8 -> "Agosto"
            9 -> "Setembro"
            10 -> "Outubro"
            11 -> "Novembro"
            12 -> "Dezembro"
            else -> "Mês inválido"

        }
    }
    val mes = nomeDoMes(numeroDoMes = 2)
    println(mes)
    // obeser que ao chamar a função nomeDoMes, passamos o parametro nomeado numeroDoMes
    // e a função retorna o nome do mês correspondente ao número passado como parametro
    // podemos chamar a função passando o parametro nomeado ou não, pois o parametro é opcional

}