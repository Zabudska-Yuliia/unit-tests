package com.in6k.tests.first;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import org.testng.annotations.Test;


public class IndependentPrincipleTest {

    public int result = 0;

    @Test
    public void test2() throws Exception {
        result += 4;
        assertThat(result, equalTo(6));
    }

    @Test
    public void test1() throws Exception {
        result += 2;
        assertThat( result, equalTo(2));
    }

}
