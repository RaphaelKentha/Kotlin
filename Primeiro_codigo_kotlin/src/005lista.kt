fun main() {
    listOf(1, 2, 3, 4, 5).forEach { println(it) }
    // o .forEach é um método de lista que recebe uma função lambda como argumento
    // a função lambda é chamada para cada elemento da lista
    // o it é o argumento da função lambda, que é o elemento da lista
    val lista = listOf(1, 2, 3, 4, 6, 12)
    println(lista)
    /* Note que ambos tem como saida a lista definida por listOf
       no primeiro metodo e impresso um item de cada vez
       no segunto e impresso a lita toda entre [] */
    val num0 = lista[0]
    val num1 = lista.get(1)
    println("primeiro numero da lista e:  $num0")
    println("segundo numero da lista e:  $num1")
    // o get é um método de lista que retorna o elemento no índice especificado
    // o índice do primeiro elemento é 0
    val listaVazioImutavel: List<Int> = listOf() // lista vazia imutavel
    val listaVaziaMutavel: MutableList<Int> = mutableListOf() // lista vazia mutavel
    // faca uma analogia ao val e var
    listaVaziaMutavel.add(9)
    println(listaVaziaMutavel)
    listaVaziaMutavel.add(8)
    println("lista vazia mutavel apos dois '.add': $listaVaziaMutavel")
    // add é um método de MutableList que adiciona um elemento ao final da lista
    listaVaziaMutavel.removeAt(0)
    println("lista vazia mutavel apos '.removeAt': $listaVaziaMutavel")
    // removeAt é um método de MutableList que remove o elemento no índice especificado
    val nomes = mutableListOf("Alice", "Bob", "Charlie")
    // dado o proposito ter uma lista criada por listOf ou mutableListOf e possivel fazer
    // a chamada de metodos de MutableList ou focar no desempemho de List deixando a lista fixa
    println(nomes.count())
    println(nomes.size)
    println(nomes.isEmpty())
    println(nomes.first())
    println(nomes.contains("Alice"))
    println(nomes. asReversed())
    nomes.add("Aaniel")
    println(nomes)
    println("nomes ordenados com '.sorted: " + nomes.sorted())
    // ambos retornam o tamanho da lista que e 3
    // isEmpty retorna true se a lista estiver vazia
    // first retorna o primeiro elemento da lista
    // last retorna o ultimo elemento da lista
    // assim como .get(0) e nomes[0] retorna o primeiro elemento da lista
    // contains retorna true se a lista contiver o elemento especificado
    // asReversed retorna uma lista com os elementos na ordem inversa
    // sorted retorna uma lista com os elementos ordenados em ordem crescente
}