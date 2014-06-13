package com.hackbulgaria.corejava.tddintro;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Problem2Test {

    private Problem2 problem2;
    
    @Before
    public void setUp() throws Exception {
        this.problem2 = new Problem2();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() {
        assertEquals("Hello world!", problem2.joinStrings(" ", "Hello", "world!"));
    }

}
