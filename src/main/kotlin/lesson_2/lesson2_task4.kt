package org.example.lesson_2

fun main() {
    val crystalOreCount = 7
    val ironOreCount = 11
    val increaseBuff = 1.2

    val bonusCrystalOreCount = (crystalOreCount * increaseBuff).toInt() - crystalOreCount
    val bonusIronOreCount = (ironOreCount * increaseBuff).toInt() - ironOreCount

    println("Bonus crystal ore: $bonusCrystalOreCount")
    println("Bonus iron ore: $bonusIronOreCount")
}