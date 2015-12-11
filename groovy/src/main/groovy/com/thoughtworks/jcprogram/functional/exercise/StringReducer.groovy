package com.thoughtworks.jcprogram.functional.exercise

// Given a list of strings like {"Bill", "Archer", "Lana"}
// Print the first letter of each of the string that have a length of 4.
// For example, "BL"

Set strings = ["Bill", "Archer", "Lana"]

println("------------ Groovy: StringReducer ------------")
println new StringReducer().reduceToFirstLetterOfLengthFourStrings(strings)


def reduceToFirstLetterOfLengthFourStrings(strings){
    strings.findAll { it.length() == 4 }.collect { it.charAt(0) }.join("")
}