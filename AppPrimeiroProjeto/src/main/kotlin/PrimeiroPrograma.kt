fun main() {

    //Meu primeiro programa

    println("Qual o seu nome? ")

    //Adicionar o metodo para entrada de dados (.toString), se for numero inteiro usar o (.toInt)
    var nome : String = readLine()!!.toString()

    println("Olá, $nome. Muito Prazer....")

    println ("Quanl sua idade? ")

    var idade:Int = readLine() !!.toInt()

    print("Sua idade é $idade")

}