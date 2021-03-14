package one.digitalInnovation.collections

fun main() {
    val salarios = DoubleArray(3)
    salarios[0] = 3333.0
    salarios[1] = 6838.0
    salarios[2] = 517.0

    salarios.forEach {println(it)}

    println("agora")

    salarios.forEachIndexed {Index, salario ->
        salarios[Index] = salario * 1.1
    }
    salarios.forEach {println(it)}

    println("---")

    val salarios2 = doubleArrayOf (1500.0, 1250.0, 5000.0)
    salarios2.sort()
    salarios2.forEach{println(it)}
}