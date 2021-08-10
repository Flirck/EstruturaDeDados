package one.digitalinnovation.collections

fun main() {
    val salary = DoubleArray(3)
    salary[0] = 1000.0
    salary[1] = 3000.0
    salary[2] = 500.0

    salary.forEach { println(it) }

    println("------------------------")
    salary.forEachIndexed { index, s ->
        salary[index] = s * 1.1
    }

    salary.forEach { println(it) }

    val salary2 = doubleArrayOf(1500.0, 1250.0, 5000.0)
    salary2.sort()
    salary2.forEach { println(it) }

}