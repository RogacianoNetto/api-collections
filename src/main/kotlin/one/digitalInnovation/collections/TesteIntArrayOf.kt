package one.digitalInnovation.collections

fun main() {
    val values = intArrayOf(2, 3, 4, 1, 10, 12)

    for (valor in values) {
        println(valor)
    }

    println("")
    // ordena do menor para o maior, independente da arrumação feita no array
    println("")
    values.sort()
    for (valor in values) {
        println(valor)
    }

    println("")

    for (index in values.indices) {
        println(values[index])
    }

    println("")

    values.forEach {
        println(it)
    }

    println("")

    values.forEach { valor ->
        println(valor)
    }

    println("")
    values.sort()
    for (valor in values) {
        println(valor)
    }
}