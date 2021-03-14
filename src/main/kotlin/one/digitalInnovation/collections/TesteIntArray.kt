package one.digitalInnovation.collections

fun main(){
    val values = IntArray(5)
    values[0] = 1
    values[1] = 7
    values[2] = 6
    values[3] = 3
    values[4] = 2

    for (valor in values){
        println(valor)
    }

    println("")
    // ordena do menor para o maior, independente da arrumação feita no array
    println("")
    values.sort()
    for (valor in values){
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
    for (valor in values){
        println(valor)
    }

    println("---")

    values.forEachIndexed {Index, salario ->
        values[Index] = salario * 3
    }
    values.forEach {println(it)}
}