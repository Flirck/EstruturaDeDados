package one.digitalinnovation.collections

fun main() {
    val values = IntArray(5)

    values[0] = 1
    values[1] = 19
    values[2] = 4
    values[3] = 6
    values[4] = 2

    for(v in values) {
        println(v)
    }
    println("-------------------------------")

    values.forEach { v ->
        println(v)
    }
    println("-------------------------------")

    for (index in values.indices) {
        println(index)
    }
    println("-------------------------------")

    values.sort()
    for(v in values) {
        println(v)
    }
}