package com.thoughtworks.jcprogram.functional.exercise

import org.junit.Before
import org.junit.Ignore
import org.junit.Test

import static org.hamcrest.CoreMatchers.both
import static org.hamcrest.CoreMatchers.containsString
import static org.hamcrest.CoreMatchers.is
import static org.junit.Assert.assertThat

class IntegerReporterTest {
    private IntegerReporter reporter

    @Before
    def void setUp() {
        reporter = new IntegerReporter()
    }

    @Test
    def void shouldTakeSquareRootOfNumbers() {
        def result = reporter.reportSquareRootsOfLargeNumbers([9, 16])
        assertThat result, both(containsString("3")).and(containsString("4"))
    }

    @Test
    def void shouldReportNothingWhenThereIsOneNumberAndItIsLessThan4() {
        assertThat reporter.reportSquareRootsOfLargeNumbers([3]), is("")
    }

    @Test
    def void shouldInsertCommaAndSpaceBetweenNumbers() {
        assertThat reporter.reportSquareRootsOfLargeNumbers([9, 9]), is("3, 3")
    }

}
