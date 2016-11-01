package com.in6k.tests;


import org.testng.annotations.Test;
import java.util.Arrays;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class HamcrestAssertionsTest {
    @Test
    public void equalityMatcher() throws Exception {
        assertThat(2 + 2, is(4));
    }

    @Test
    public void negation() throws Exception {
        assertThat(4, is(not(5)));
    }

    @Test
    public void itemInCollection() throws Exception {
        assertThat(Arrays.asList(1, 2, 3), hasItem(3));
    }

    @Test
    public void severalItemsInCollection() throws Exception {
        assertThat(Arrays.asList(1, 2, 3), hasItems(2, 3));
    }

    @Test
    public void nullValueMatcher() throws Exception {
        assertThat(new Object(), is(not(nullValue())));
    }
}