package com.pepo.unittesting;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class myTest {

    @Test
    public void checkTwoNo() {
        Arithmetic arithmetic = new Arithmetic();
        float actual = arithmetic.add(2, 3);
        float expected = 5;
        assertEquals(expected, actual);
    }
}
