package org.example.lesson_1

fun main(){
    val totalSeconds = 6480
    val totalHours = totalSeconds / 60 * 60
    val totalMinutes = totalSeconds % 3600 / 60
    val lastSeconds = totalSeconds % 60
    println(String.format("%02d:%02d:%02d", totalHours, totalMinutes, lastSeconds))

}