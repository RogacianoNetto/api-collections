package one.digitalInnovation.collections

fun main() {
    val joao = Funcionario("João", 2000.0, "CLT", "30", "Técnico")
    val pedro = Funcionario("Pedro", 1500.0, "PJ", "45", "Analista")
    val maria = Funcionario("Maria", 4000.0, "PJ", "28", "Gerente")
    val antonio = Funcionario("Antônio", 500.0, "CLT", "42", "Ajudante")
    val mario = Funcionario("Mário", 5450.0, "PJ", "60", "Diretor")

    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach{println(it)}

    println("----")
    funcionarios.add(pedro)
    funcionarios.forEach{println(it)}

    println("----")
    funcionarios.remove(joao)
    funcionarios.forEach{println(it)}

    println("----")
    val funcionariosSet = mutableSetOf(joao)
    funcionariosSet.forEach{println(it)}

    println("----A")

    funcionarios.add(mario)
    funcionarios.add(antonio)
    funcionarios.forEach{println(it)}

}