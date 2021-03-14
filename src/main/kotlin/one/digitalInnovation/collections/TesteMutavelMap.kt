package one.digitalInnovation.collections

fun main() {
    val joao = Funcionario("João", 2000.0, "CLT", "30", "Técnico")
    val pedro = Funcionario("Pedro", 1500.0, "PJ", "45", "Analista")
    val maria = Funcionario("Maria", 4000.0, "PJ", "28","Gerente")
    val antonio = Funcionario("Antônio", 500.0, "CLT", "42", "Ajudante")
    val mario = Funcionario("Mário", 5450.0, "PJ", "60", "Diretor")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(joao.nome, joao)
    repositorio.create(maria.nome, maria)
    repositorio.create(antonio.nome, antonio)
    repositorio.create(pedro.nome, pedro)

    println(repositorio.findById(maria.nome))
    println(repositorio.findById(pedro.nome))
    println(repositorio.findById(joao.nome))

    println("-------------")
    repositorio.findAlt().forEach{println(it)}

    println("-------------")

    repositorio.remove(maria.nome)
    repositorio.findAlt().forEach{println(it)}

}