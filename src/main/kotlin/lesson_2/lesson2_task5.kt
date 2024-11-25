package org.example.lesson_2

import kotlin.math.pow

fun main() {
    val startSum = 70000
    val creditPercent = 16.7
    val years = 20
    val fullPercent = 1;
    val totalPercents = 100;

    val totalSum = startSum * ((fullPercent + creditPercent / totalPercents).pow(years))
    println(String.format("%.3f", totalSum))
}