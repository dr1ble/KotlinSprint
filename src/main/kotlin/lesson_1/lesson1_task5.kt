package org.example.lesson_1

fun main() {
    val totalSeconds = 6480
    val secondsInMinute = 60
    val totalHours = totalSeconds / secondsInMinute * secondsInMinute
    val totalMinutes = totalSeconds % secondsInMinute * secondsInMinute / secondsInMinute
    val lastSeconds = totalSeconds % secondsInMinute
    println(String.format("%02d:%02d:%02d", totalHours, totalMinutes, lastSeconds))
}