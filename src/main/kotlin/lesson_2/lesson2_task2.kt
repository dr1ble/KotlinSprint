package org.example.lesson_2

fun main() {
    val workersQuantity = 50
    val workerSalary = 30000
    val traineeQuantity = 30
    val traineeSalary = 20000

    val regularWorkersSalaries = workersQuantity * workerSalary
    val totalSpendsOnSalaries = regularWorkersSalaries + traineeQuantity * traineeSalary
    val avgSalariyOnPerson = totalSpendsOnSalaries / (workersQuantity + traineeQuantity)

    println(regularWorkersSalaries)
    println(totalSpendsOnSalaries)
    println(avgSalariyOnPerson)
}