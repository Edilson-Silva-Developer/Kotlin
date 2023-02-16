fun main() {

    println("Adicione seus dados abaixo, qual o seu nome: ")

    var nome: String = readLine()!!.toString()
    println("Olá, $nome, qual seu sobrenome ?")

    var sobrenome: String = readLine()!!.toString()
    println("Olá, $nome $sobrenome. Muito prazer.... ")

    println("Qual a sua idade? ")
    var idade: Int = readLine()!!.toInt()

    println("sua idade é $idade, prabéns")

    println("Qla o seu endereço ?")
    var ende: String = readLine()!!.toString()
    print("Sua localização: $ende")


}