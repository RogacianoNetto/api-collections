package one.digitalInnovation.collections

fun main() {
    val nomes = Array <String> (3) {" "}
    nomes[0] = "Maria"
    nomes[1] = "Zazá"
    nomes[2] = "José"

    for (nome in nomes) {
        println(nome)
    }

    println("")

    nomes.sort()
    nomes.forEach() {println(it)}

    println("")

    nomes.sort()
    nomes.forEach() {
        println(it)
    }

    println("----")

    val nomes2 = arrayOf("Maria", "Zazá", "Pedro")

    println("----")
        nomes2.sort()
        nomes2.forEach() {
            println(it)
    }


}