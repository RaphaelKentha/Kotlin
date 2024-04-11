// Definição da classe Carro
class Carro {

    // Propriedades da classe Carro
    var cor: String? = null
    var modelo: String? = null

    // Método para simular o carro andando
    fun anda() {
        println("Carro andando: Vrum vrum")
    }

    // Método para simular a buzina do carro
    fun buzina() {
        println("Beep beep")
    }

    // Método para simular o carro freiando
    fun frei() {
        println("Carro parando: Screech")
    }

    // Método para simular a partida do carro
    fun partida() {
        var opcao: Int
        println(" Digite:\n 1 para ligar o carro\n 2 para desligar o carro")
        opcao = readLine()!!.toInt()
        if (opcao == 1) {
            val motor = Motor()
            motor.ligando = true
            println("Carro ligado: Tec Tec tec tec")
        } else if (opcao == 2) {
            val motor = Motor()
            motor.desligando = true
            println("Carro desligado: !!!!!")
        } else {
            println("Opção inválida")
        }
        println("Carro ligando: Tec Tec tec tec")
    }
}