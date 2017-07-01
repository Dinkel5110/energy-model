package org.codefx.demo.bingen.energy_model.math

val decimalToRomanMapping : Map<Int, String> = mapOf(

        Pair(50, "L"),      //Mapping of the values needed to compile the Roman numerals
        Pair(40, "XL"),
        Pair(10, "X"),
        Pair(9, "IX"),
        Pair(5, "V"),
        Pair(4, "IV"),
        Pair(1, "I")
)


fun asRoman(n: Int): String {          //the function

    var decimalRemainder = n           // Declaration of the variable
    var romanOutput = ""               // "" for the correct output


    decimalToRomanMapping.forEach {        //

        val (decimal, roman) = it


        while(decimalRemainder >= decimal) {
            romanOutput += roman
            decimalRemainder -= decimal
        }
    }
    return romanOutput
}
