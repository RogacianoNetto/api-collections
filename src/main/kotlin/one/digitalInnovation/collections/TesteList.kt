package one.digitalInnovation.collections

fun main() {
    // ver data class abaixo para formação dos objetos
    val joao = Funcionario("João", 2000.0, "CLT", "30", "Técnico")
    val pedro = Funcionario("Pedro", 1500.0, "PJ", "45", "Analista")
    val maria = Funcionario("Maria", 4000.0, "PJ", "28","Gerente")
    val antonio = Funcionario("Antônio", 500.0, "CLT", "42", "Ajudante")
    val mario = Funcionario("Mário", 5450.0, "PJ", "60", "Diretor")

    val funcionarios = listOf(joao, pedro, maria, antonio, mario)

    funcionarios.forEach { println(it)}

    println("////////////////////////////////")

    println(funcionarios.find{it.nome == "Maria"})

    println("////////////////////////////////")


    // As duas implementações abaixo tê os mesmos resultados. Organiza a tabela em ordem cresecente de salário
    funcionarios
        .sortedBy{it.salario}
        .forEach{println (it)}

    println("//////////////////////////////// A")


    //funcionarios.sortedBy{it.salario}.forEach{println (it)}

    println("//////////////////////////////// A")


    funcionarios.groupBy{it.modalidContrat}.forEach{println(it)}


}

