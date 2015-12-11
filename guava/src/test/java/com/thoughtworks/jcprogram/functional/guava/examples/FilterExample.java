package com.thoughtworks.jcprogram.functional.guava.examples;


import com.google.common.base.Predicate;
import org.hamcrest.CoreMatchers;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

import static com.google.common.collect.Collections2.filter;
import static com.google.common.collect.Lists.newArrayList;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FilterExample {
    private static class IsEvenPredicate implements Predicate<Integer> {
        public boolean apply(Integer integer) {
            return integer % 2 == 0;
        }
    }

    @Test
    public void shouldRemoveOddElements(){

        Collection<Integer> filteredCollection = filter(newArrayList(1, 2, 3, 4), new IsEvenPredicate());

        assertThat(newArrayList(filteredCollection), is(newArrayList(2, 4)));
    }
}
