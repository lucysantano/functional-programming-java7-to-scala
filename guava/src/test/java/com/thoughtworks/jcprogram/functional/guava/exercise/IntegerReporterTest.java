package com.thoughtworks.jcprogram.functional.guava.exercise;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

public class IntegerReporterTest {

    private IntegerReporter integerReporter;
    private List<Integer> numbers;

    @Before
    public void setUp() throws Exception {
        numbers = new ArrayList<Integer>();
        integerReporter = new IntegerReporter();
    }

    @Test
    public void shouldTakeSquareRootOfAllNumbers() {
        numbers.add(9);
        numbers.add(16);

        String result = integerReporter.reportSquareRootsOfLargeNumbers(numbers);

        assertThat(result, both(containsString("3")).and(containsString("4")));
    }

    @Test
    public void shouldSeparateNumbersWithCommaAndSpace() {
        numbers.add(9);
        numbers.add(9);

        String result = integerReporter.reportSquareRootsOfLargeNumbers(numbers);

        assertThat(result, is("3, 3"));
    }

    @Test
    public void shouldReportNothingWhenNumberIs4() {
        numbers.add(4);

        String result = integerReporter.reportSquareRootsOfLargeNumbers(numbers);

        assertThat(result, is(""));
    }
}