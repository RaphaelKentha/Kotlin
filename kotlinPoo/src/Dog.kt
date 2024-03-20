class Dog {
    var name: String? = null

    fun bark() {
        println("Au au, meu nome e: $name")
    }
    fun sayHi( ownerName: String) {
        println("Oi, meu nome é $name")
        println("Meu dono é $ownerName")
        // a funcao sayhi ou digaOi, tem um parametro ownerName/ donoNome
        // que é uma string, e ela é printada junto com o nome do cachorro
        // quando a funcao é chamada, nesse caso, no main, arquivo poo.kt
    }
}