package com.thoughtworks.jcprogram.functional.guava.exercise;

import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.base.Predicate;

import java.util.Collection;
import java.util.List;

import static com.google.common.collect.Collections2.filter;
import static com.google.common.collect.Lists.newArrayList;
import static com.google.common.collect.Lists.transform;

// Given a list of strings like {"Bill", "Archer", "Lana"}
// Print the first letter of each of the string that have a length of exactly 4.
// For example, "BL"

public class StringReducer {

    public static void main(String[] args) {
        List<String> strings = newArrayList("Bill", "Archer", "Lana");

        System.out.println("------------ Guava: StringReducer ------------");
        System.out.println(new StringReducer().reduceToFirstLetterOfLengthFourStrings(strings));
    }

    public String reduceToFirstLetterOfLengthFourStrings(List<String> strings) {
        Collection<String> filteredCollection = filter(strings, new IsEqualToFourPredicate());
        List<String> transformedCollection = transform(newArrayList(filteredCollection), new FirstLetterFunction());
        return Joiner.on("").join(transformedCollection);
    }

    private static class IsEqualToFourPredicate implements Predicate<String> {
        public boolean apply(String string) {
            return string.length()==4;
        }
    }

    private static class FirstLetterFunction implements Function<String, String> {

        public String apply(String string) {
            return String.valueOf(string.charAt(0));
        }
    }
}
