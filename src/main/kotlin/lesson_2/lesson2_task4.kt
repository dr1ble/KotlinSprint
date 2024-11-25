package org.example.lesson_2

fun main() {
    val crystalOreCount = 7
    val ironOreCount = 11
    val increaseBuff = 20
    val harvestRate = 100
    val totalPercentage = 100

    val bonusCrystalOreCount = (crystalOreCount * (harvestRate + increaseBuff)/totalPercentage) - crystalOreCount
    val bonusIronOreCount = (ironOreCount * (harvestRate + increaseBuff)/totalPercentage) - ironOreCount

    println("Bonus crystal ore: $bonusCrystalOreCount")
    println("Bonus iron ore: $bonusIronOreCount")
}