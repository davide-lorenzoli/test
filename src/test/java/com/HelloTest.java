package com;

import org.junit.Assert;
import org.junit.Test;

public class HelloTest {
    private static final String GREETING = "hello";

    @Test
    public void testGreeting() {
        Hello hello = new Hello(GREETING);
        Assert.assertEquals(GREETING, hello.getGreeting());
    }
}
