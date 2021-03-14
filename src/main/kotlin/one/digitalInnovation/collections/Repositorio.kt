package one.digitalInnovation.collections

class Repositorio<T> {

    private val map = mutableMapOf<String, T>()

    fun create(id: String, value: T) {
        map[id] = value
    }

    fun remove(id: String) = map.remove(id)

    fun findById(id: String) = map[id]

    fun findAlt() = map.values
}