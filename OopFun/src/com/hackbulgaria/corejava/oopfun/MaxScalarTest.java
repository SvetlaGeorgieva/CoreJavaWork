package com.hackbulgaria.corejava.oopfun;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MaxScalarTest {
    private MaximumScalar ms;
    
    @Before
    public void setUp() throws Exception {
        ms = new MaximumScalar();
    } 

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testMaxScalarProduct() {
        int[] a = {1};
        int[] b = {1};
        assertEquals(1, ms.maxScalarProduct(a, b));
    }

    @Test
    public void testMaxScalarProductWithZeros() {
        int[] a = {1, 0};
        int[] b = {0, 1};
        assertEquals(1, ms.maxScalarProduct(a, b));
    }

}
