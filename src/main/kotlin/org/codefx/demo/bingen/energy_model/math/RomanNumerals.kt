package org.codefx.demo.bingen.energy_model.math

val decimalToRomanMapping : Map<Int, String> = mapOf(

        Pair(50, "L"),
        Pair(40, "XL"),
        Pair(10, "X"),
        Pair(9, "IX"),
        Pair(5, "V"),
        Pair(4, "IV"),
        Pair(1, "I")
)


fun asRoman(n: Int): String {

