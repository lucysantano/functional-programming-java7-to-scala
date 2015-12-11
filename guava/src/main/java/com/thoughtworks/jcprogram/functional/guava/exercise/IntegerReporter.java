package com.thoughtworks.jcprogram.functional.guava.exercise;

import com.google.common.base.Function;
import com.google.common.base.Joiner;

import java.util.Collection;
import java.util.List;

import static com.google.common.collect.Collections2.filter;
import static com.google.common.collect.Lists.transform;
import static com.google.common.collect.Lists.newArrayList;

// Given a list of numbers like {1, 9, 4, 16, 4}
// Print the square root of all of the numbers larger than 4.
// For example, "3, 4"

public class IntegerReporter {
    public static void main(String[] args) {
        List<Integer> numbers = newArrayList(1, 9, 4, 16, 4);

        System.out.println("------------ Guava: IntegerReporter ------------");
        System.out.println(new IntegerReporter().reportSquareRootsOfLargeNumbers(numbers));
    }

    public String reportSquareRootsOfLargeNumbers(List<Integer> numbers) {
        Collection<Integer> numbersGreaterThanFour = filter(numbers, new IsGreaterThanFourPredicate());
        List<Integer> squareRootNumbers = transform(newArrayList(numbersGreaterThanFour), new SquareRootFunction());
        return Joiner.on(", ").join(squareRootNumbers);
    }

    private static class IsGreaterThanFourPredicate implements com.google.common.base.Predicate<Integer> {
        public boolean apply(Integer integer) {
            return integer>4;
        }
    }

    private static class SquareRootFunction implements Function<Integer, Integer> {

        public Integer apply(Integer integer) {
            return (int)Math.sqrt(integer);
        }
    }
}
