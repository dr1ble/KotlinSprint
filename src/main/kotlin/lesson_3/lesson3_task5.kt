package org.example.lesson_3

fun main() {
    val inputTurn = "D2-D4;0"

    val turnFrom = inputTurn.split("-")[0]
    val turnTo = inputTurn.split("-",";")[1]
    val turnNum = inputTurn.split(";")[1]

    println(turnFrom)
    println(turnTo)
    println(turnNum)
}