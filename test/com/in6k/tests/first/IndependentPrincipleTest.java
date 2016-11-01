package com.in6k.tests.first;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import org.testng.annotations.Test;

public class IndependentPrincipleTest {

    @Test
    public void test2() throws Exception {
        int result = 4;
        assertThat(result, equalTo(4));
    }

    @Test
    public void test1() throws Exception {
        int result = 2;
        assertThat( result, equalTo(2));
    }

}
