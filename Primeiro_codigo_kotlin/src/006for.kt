fun main() {
    val nomes = listOf("Ana", "Carlos", "Maria", "Pedro", "João", "José")

    // Usando um loop 'for' para percorrer a lista de nomes
    for (nome in nomes) {
        println(nome)
        // Dado a lista de nomes, imprime cada nome da lista
    }

    // Usando '.indices' para obter um intervalo de índices válidos na lista
    for (index in nomes.indices) {
        println("[$index] = ${nomes[index]}")
        // Dado a lista de nomes, imprime o índice e o nome
        // .indices retorna um range de 0 até o tamanho da lista - 1
    }

    // Usando '.withIndex()' para obter um objeto contendo o índice e o valor
    for ((index, nome) in nomes.withIndex()) {
        println("[$index] = $nome")
        // Dado a lista de nomes, imprime o índice e o nome
        // .withIndex() retorna um objeto que contém o índice e o valor
        // do elemento da lista
    }

    // Usando '.forEachIndexed()' para percorrer a lista com índice e valor
    nomes.forEachIndexed() { index, nome ->
        println("[$index] = $nome")
        // Dado a lista de nomes, imprime o índice e o nome
        // .forEachIndexed() é uma função de ordem superior que recebe
        // uma função lambda com dois parâmetros, o índice e o valor
        // do elemento da lista
    }

    // Usando '.forEach()' para percorrer a lista apenas com o valor
    nomes.forEach() { nome ->
        println(nome)
        // Dado a lista de nomes, imprime o nome
        // .forEach() é uma função de ordem superior que recebe
        // uma função lambda com um parâmetro, o valor do elemento
        // da lista
    }

    // Usando 'until' para criar um intervalo de índices válidos na lista
    for (index in 0 until nomes.size) {
        println("[$index] = ${nomes[index]}")
        // Dado a lista de nomes, imprime o índice e o nome
        // .until() retorna um range de 0 até o tamanho da lista
    }
}
