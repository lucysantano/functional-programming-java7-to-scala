package com.thoughtworks.jcprogram.functional.exercise;

import com.sun.javafx.binding.StringFormatter;

import java.util.List;

import static java.util.Arrays.asList;

// Given a list of numbers like {1, 9, 4, 16, 4}
// Print the square root of all of the numbers larger than 4.
// For example, "3, 4"

public class IntegerReporter {
    public static void main(String[] args) {
        List<Integer> numbers = asList(1, 9, 4, 16, 4);

        System.out.println("------------ Java 7: IntegerReporter ------------");
        System.out.println(new IntegerReporter().reportSquareRootsOfLargeNumbers(numbers));

    }

    public String reportSquareRootsOfLargeNumbers(List<Integer> numbers) {
        String ans = "";
        for(Integer num : numbers){
            if(num>4){
                ans += (int)Math.sqrt(num) + ", ";
            }
        }
        if(ans.equals("")){
            return ans;
        } else {
            return ans.substring(0,ans.length()-2);
        }
    }

}
