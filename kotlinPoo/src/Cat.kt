class Cat(
    //private val owner: String
    //antes de criar a classe, o dono do gato era uma string
    //agora, o dono do gato é um objeto da classe Human
    private val owner: Human
) {

    var nome: String? = null
    var idade: Int? = null

    fun meow() {
        println("Miau, meu nome é: $nome e meu dono é ${owner.name}")
    }
    //funcao meow, que printa uma string, e o nome do gato e o dono
    // nesta classe, o dono é uma variavel privada, que é passada como parametro
    // na criacao do objeto, e o nome do gato e a idade sao variaveis publicas
}