 // No POO (Programação Orientada a Objetos)
 // temos a herança, polimorfismo, encapsulamento e abstração

 fun main() {
     val nome: String = "João"
     println(" Ola, $nome!")

     val dog = Dog()
     dog.name = "ReXia"
     println("O nome do cachorro é ${dog.name}")
     //como a variavel dog vem da classe Dog, ela tem acesso
     //a todas as propriedades e metodos da classe Dog
     //por isso se printar dog.name, ele vai printar o nome do cachorro
     dog.bark()
     // o .bark() é um metodo da classe Dog, criada por uma funcao
     // que esta dentro da classe Dog
     dog.sayHi("João")
     // outra funcao criada dentro da classe Dog, que tem um parametro ownerName
     // que é uma string, e ela é printada junto com o nome do cachorro

     val dog2 = Dog()
     dog2.name = "Rex"
     dog2.bark()
     dog2.sayHi("Maria")
     // repetindo o processo, mas com um cachorro diferente

     //val cat = Cat("Miau", 2)

     //val cat2 = Cat(owner = "Marira")
     //a linha acima nao funciona, pois o dono do gato nao é uma string, nao mais
     //o dono do gato é um objeto da classe Human
     val raphael = Human()
     raphael.name = "Raphael"
     val cat2 = Cat(raphael)
     cat2.nome = "Mic"
     cat2.idade = 2
     cat2.meow()

     val kenthara = Human()
        kenthara.name = "Kenthara"
        val cat3 = Cat(kenthara)
        cat3.nome = "Miau"
        cat3.idade = 3
        cat3.meow()
     kenthara.sayHi()
     // note que owner é um objeto da classe Human, e nao mais uma string
     // entao o cat2 e o cat3 tem um dono, que é um objeto da classe Human
     // mais ambos poderiam ser o mesmo dono, ou donos diferentes

     // Criação de uma instância da classe Carro
     val carro = Carro()
     // Definindo a cor do carro
     carro.cor = "Vermelho"
     // Chamando os métodos da classe Carro
     carro.anda()
     carro.buzina()
     carro.frei()
     carro.partida()

 }
