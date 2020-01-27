package com.pepo.unittesting;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class myTest {
    Arithmetic arithmetic = new Arithmetic();

    @Before
    public void test(){
        arithmetic = new Arithmetic();
    }
    @Test
    public void Add() {

        float actual = arithmetic.add(2, 3);
        float expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    public void Sub() {
        float actual = arithmetic.subtract(5, 4);
        float expected = 1;
        assertEquals(expected, actual);
    }
    @Test
    public void Div() {
        float actual = arithmetic.divide(12, 2);
        float expected = 6;
        assertEquals(expected, actual);
    }

    @After
    public void aftertest(){
        arithmetic = null;
    }
}
