fun main() {
    var anoDeNascimento = 1989 /**Entrada de dados*/
    var anoAtual = 2023

    var resultadoDoCalculo = calcularAnosDeVida(anoDeNascimento,anoAtual) /** Processamento de calculo */

    imprimirResultados(anoDeNascimento,anoAtual, resultadoDoCalculo) /**Processamento da Saida*/
}
fun calcularAnosDeVida(anoDeNascimento: Int, anoAtual: Int): Int {

    var anosDeVida = anoAtual - anoDeNascimento

    return anosDeVida
}
fun imprimirResultados(anoDeNascimento: Int, anoAtual: Int, resultadoDoCalculo: Int) {

    print("Como calcular quantos nos de vida uma pessoa tem ?\n\n")
    print("Ano de Nascimento: $anoDeNascimento\n")
    print("Ano de Atual: $anoAtual\n\n")
    print("Você tem: $resultadoDoCalculo anos de vida")
}