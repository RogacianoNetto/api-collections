package one.digitalInnovation.collections

fun main() {
    val joao = Funcionario("João", 2000.0, "CLT", "30", "Técnico")
    val pedro = Funcionario("Pedro", 1500.0, "PJ", "45", "Analista")
    val maria = Funcionario("Maria", 4000.0, "PJ", "28","Gerente")
    val antonio = Funcionario("Antônio", 500.0, "CLT", "42", "Ajudante")
    val mario = Funcionario("Mário", 5450.0, "PJ", "60", "Diretor")

    val funcionarios1 = setOf(joao, pedro)
    val funcionarios2 = setOf(maria, antonio, mario)

    val resultUnion = funcionarios1.union(funcionarios2)
    resultUnion.forEach {println(it)}

    println("___")

    val funcionarios3 = setOf(joao, antonio, mario, maria)
    val resultSubtract = funcionarios3.subtract(funcionarios2)
    resultSubtract.forEach {println(it)}

    println("___")


    val resultIntersect = funcionarios3.intersect(funcionarios2)
    resultIntersect.forEach {println(it)}
}