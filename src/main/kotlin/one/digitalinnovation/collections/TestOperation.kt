package one.digitalinnovation.collections

fun main() {
    val salary = doubleArrayOf(1000.0, 2250.0, 4000.0, 5000.0)

    for (s in salary) {
        println(s)
    }

    println("---------------")
    println("Maior salario: ${salary.maxOrNull()}")
    println("Menor salario: ${salary.minOrNull()}")
    println("Média salario: ${salary.average()}")

    val salaryFilter = salary.filter{ it > 2500 }
    println("---------------")
    salaryFilter.forEach { println(it) }

    println("---------------")
    println(salary.count { it in 2000.0..5000.00 })

    println("---------------")
    println(salary.find { it == 2250.0 })

    println("---------------")
    println(salary.any { it == 1000.0 })

}