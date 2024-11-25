package org.example.lesson_2

fun main() {
    val departureHour = 9
    val departureMinute = 39
    val travelTime = 457

    val minutesInHour = 60

    val totalTravelTime = departureHour * minutesInHour + departureMinute + travelTime

    val arriveHour = totalTravelTime / minutesInHour
    val arriveMinute = totalTravelTime % minutesInHour

    println("Arrive Time: " + String.format("%02d:%02d", arriveHour, arriveMinute))
}