package com.in6k.tests.first;

import org.testng.annotations.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class SelfVerifyingPrincipleTest {
    @Test
    public void doNotUseConsoleLoggingForManualResultTests() throws Exception {
        int result = 2 + 2;
        assertThat(result , is(4));
    }
}
