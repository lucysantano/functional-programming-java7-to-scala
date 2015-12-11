package com.thoughtworks.jcprogram.functional.exercise

import org.junit.Before
import org.junit.Ignore
import org.junit.Test

import static org.hamcrest.CoreMatchers.is
import static org.junit.Assert.assertThat

class StringReducerTest {
    StringReducer reducer

    @Before
    void setUp() {
        reducer = new StringReducer()
    }

    @Test
    void shouldReduceStrings() {
        assertThat reducer.reduceToFirstLetterOfLengthFourStrings(["1234", "2345"]), is("12");
    }

    @Test
    void shouldReduceToNothingWhenStringIsNotLength4() {
        assertThat reducer.reduceToFirstLetterOfLengthFourStrings(["12345"]), is("");
    }

}
