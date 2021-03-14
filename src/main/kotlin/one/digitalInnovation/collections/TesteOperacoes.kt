package one.digitalInnovation.collections

fun main() {
    val salarios = doubleArrayOf(200.00, 1000.0, 2250.0, 4000.0, 7000.0, 2000.0, 10000.0)

    for (salario in salarios) {
        println(salario)
    }
    println("---")
    println("Maior salário: ${salarios.maxOrNull()}")
    println("Menor salário: ${salarios.minOrNull()}")
    println("Média salarial: ${salarios.average()}")

    println("---")

    val salarioMaioresQue2500 = salarios.filter{it > 2500}
    salarioMaioresQue2500.forEach { println(it) }

    println("---")

    println(salarios.count {it in 2000.00 .. 7000.0})
    println(salarios.count {it in 500.00 .. 800.0})
    println(salarios.find { it == 2250.0 })
    println(salarios.find { it == 2350.0 })

    println("---")

    println(salarios.any{ it == 1000.0})
    println(salarios.any{ it == 500.0})
    println(salarios.first{it < 7000.0})
}