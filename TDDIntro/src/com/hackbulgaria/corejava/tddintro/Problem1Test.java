package com.hackbulgaria.corejava.tddintro;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.hackbulgaria.corejava.tddintro.Problem1;

public class Problem1Test {

    private Problem1 problem1;
    
    @Before
    public void setUp() throws Exception {
        this.problem1 = new Problem1();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() {
        assertEquals(1, problem1.getNumberOfDigits(2));
        assertEquals(3, problem1.getNumberOfDigits(100));
        assertEquals(1, problem1.getNumberOfDigits(-1));
    }

}
