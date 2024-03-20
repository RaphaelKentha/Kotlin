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
 }
 //tempo de video 35:15