package org.example.lesson_2

import kotlin.math.pow

fun main() {
    val startSum = 70000
    val creditPercent = 16.7
    val years = 20

    val totalSum = startSum*((1+creditPercent/100).pow(years))
    println(String.format("%.3f", totalSum))
}