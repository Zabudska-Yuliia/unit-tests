package com.in6k.tests;

import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

import org.testng.annotations.Test;

public class BaseAssertionsTest {
    @Test
    public void assertInt() throws Exception {
        int expected = 4;
        int actual = 2 + 2;
        assertThat(actual, equalTo(expected));
    }

    @Test
    public void assertDouble() throws Exception {
        double expected = 4.0;
        double actual = 2.0 + 2.0;
        double delta = 0.0;
        assertThat(actual, equalTo(expected));
        assertThat((actual-expected), equalTo(delta));

    }

    @Test
    public void assertDoublePrecision() throws Exception {
        float expected = 0.004999995f;
        float actual = 1.435f - 1.43f;
        float delta = 0.000f;
        assertThat(actual, equalTo(expected));
        assertThat((actual-expected), equalTo(delta));
    }

    @Test
    public void assertBoolean() throws Exception {
        assertThat("Sorry, the result must be true.", true, is(true));
    }

    @Test
    public void assertNullValue() throws Exception {
        assertThat("Sorry, NULL is not allowed.", null, is(nullValue()));
    }
}
