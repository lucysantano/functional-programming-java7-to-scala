package com.thoughtworks.jcprogram.functional.exercise;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

// Given a list of strings like {"Bill", "Archer", "Lana"}
// Print the first letter of each of the string that have a length of exactly 4.
// For example, "BL"

public class StringReducer {

    public static void main(String[] args) {
        List<String> strings = asList("Bill", "Archer", "Lana");

        System.out.println("------------ Java 8: StringReducer ------------");
        System.out.println(new StringReducer().reduceToFirstLetterOfLengthFourStrings(strings));
    }

    public String reduceToFirstLetterOfLengthFourStrings(List<String> strings) {
        return strings
                .stream()
                .filter(value -> value.length() == 4)
                .map(value -> value.charAt(0))
                .map(Object::toString)
                .collect(Collectors.joining());

    }
}
