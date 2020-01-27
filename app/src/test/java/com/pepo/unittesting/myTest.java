package com.pepo.unittesting;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class myTest {

    @Test
    public void Add() {
        Arithmetic arithmetic = new Arithmetic();
        float actual = arithmetic.add(2, 3);
        float expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    public void Sub() {
        Arithmetic arithmetic = new Arithmetic();
        float actual = arithmetic.subtract(5, 4);
        float expected = 1;
        assertEquals(expected, actual);
    }
    @Test
    public void Div() {
        Arithmetic arithmetic = new Arithmetic();
        float actual = arithmetic.divide(12, 2);
        float expected = 6;
        assertEquals(expected, actual);
    }
}
