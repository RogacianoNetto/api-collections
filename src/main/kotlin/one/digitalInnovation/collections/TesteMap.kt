package one.digitalInnovation.collections

fun main() {
    val pair1: Pair<String, Double> = Pair("João ", 1000.0)
    val pair2: Pair<String, Double> = Pair("Maria", 2000.0)

    val map1 = mapOf(pair1)
    val map2 = mapOf(pair2)

    map1.forEach{ (k, v) -> println("Nome $k - Valor: $v")}
    map2.forEach{ (k, v) -> println("Nome $k - Valor: $v")}

    val map3 = mapOf(
        "Pedro" to 5000.0,
        "Jorge" to 10000.0
    )

    val map4 = mapOf("Luis " to 2200.0)
    val map5 = mapOf("Paulo" to 4000.0)

    map3.forEach{ (k, v) -> println("Nome $k - Valor: $v")}
    map4.forEach{ (k, v) -> println("Nome $k - Valor: $v")}
    map5.forEach{ (k, v) -> println("Nome $k - Valor: $v")}
}