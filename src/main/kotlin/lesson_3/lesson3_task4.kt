package org.example.lesson_3

fun main() {
    var stepFrom = "E2"
    var stepTo = "E4"
    var stepNum = 1

    var fullTurn = "$stepFrom-$stepTo;$stepNum"
    println(fullTurn)

    stepFrom = "D2"
    stepTo = "D${stepFrom.split("D")[1].toInt() + 1}"
    stepNum++

    fullTurn = "$stepFrom-$stepTo;$stepNum"
    println(fullTurn)
}