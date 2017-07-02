package org.codefx.demo.bingen.energy_model.math

val decimalToRomanMapping : Map<Int, String> = mapOf(   //declaration of the values (x{integer},y{String}) of the destructured pair in map

        Pair(50, "L"),      // Mapping of the values needed to compile the Roman numerals
        Pair(40, "XL"),
        Pair(10, "X"),
        Pair(9, "IX"),
        Pair(5, "V"),
        Pair(4, "IV"),
        Pair(1, "I")        // Here the order from greatest number to smallest is important or
        // it would have to be changed while (...)
)
fun asRoman(n: Int): String {          // function
    var decimalRemainder = n           // declaration of the variable decimalRemainder
    var romanOutput = ""               // declaration of the variable romanOutput -> empty

    decimalToRomanMapping.forEach {        // for each in the map
        val (decimal, roman) = it          //  multiple values
        while(decimalRemainder >= decimal) {   // detects the next smaller or the same decimal number from the map
            romanOutput += roman             // adds the corresponding roman number to the empty output
            decimalRemainder -= decimal      // subtracts the current decimal number from the source value
        }                                      // repeat the loop with the rest of the number
    }
    return romanOutput                         // output --> return of the calculated Roman number
}