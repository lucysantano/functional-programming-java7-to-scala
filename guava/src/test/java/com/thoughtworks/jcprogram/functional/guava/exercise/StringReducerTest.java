package com.thoughtworks.jcprogram.functional.guava.exercise;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class StringReducerTest {

    private List<String> strings;
    private StringReducer reducer;

    @Before
    public void setUp() throws Exception {
        reducer = new StringReducer();
        strings = new ArrayList<>();
    }

    @Test
    public void shouldReduceAllStrings() {
        strings.add("1234");
        strings.add("2345");
        String result = reducer.reduceToFirstLetterOfLengthFourStrings(strings);

        assertThat(result, is("12"));
    }

    @Test
    public void shouldReduceToNothingWhenStringIsNotLength4() {
        strings.add("12345");
        String result = reducer.reduceToFirstLetterOfLengthFourStrings(strings);

        assertThat(result, is(""));
    }
}