fun main() {
    // Não é possível usar variáveis sem inicializá-las
    // println(name) // Erro, pois name não foi inicializado

    var name: String? = null
    println(name)
    // Geralmente, o null safety é usado para evitar null pointer exception
    // e não pode ser usado para inicializar variáveis, exceto se for especificado
    // que a variável pode ser nula
    // var name: String? = null , o ? indica que a variável pode ser nula

    var userName: String? = ""
    userName = getUserName()
    // A função getUserName() retorna um valor nulo, então userName será nulo

    if (userName != null) {
        println("ola, $userName")
        // Se userName não for nulo, imprime "ola, $userName"
    } else {
        println("userName is null")
        // Se userName for nulo, imprime "userName is null"
    }
    // Usando if para verificar se a variável é nula

    userName.let { println(it) }
    // A função let é chamada no objeto userName. Se userName for nulo,
    // a função let não será executada e nada será impresso. Se userName não for nulo,
    // a função let será executada e o valor de userName será impresso.
}

fun getUserName(): String? {
    // Esta função retorna um valor nulo
    return null
}
