package com.hackbulgaria.corejava.exam1;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Arrays;

import org.junit.Test;

public class ExamListTest {

    private boolean assertAscending (List<Integer> arr) {
        boolean ascending = true;
        for (int i = 1; i < arr.size() && ascending; i++) {
            ascending = ascending && arr.get(i) >= arr.get(i-1);
        }
        return ascending;
        
    }

    @Test
    public void testSortWithPositiveNumbers() {
        ExamList listA1 = new ExamList(Arrays.asList(5,4,6,3,2,1));
        List<Integer> listA2 = listA1.sort();
        
        assertEquals(true, assertAscending(listA2));
    }
    
    @Test
    public void testSortWithNegativeNumbers() {
        ExamList listB1 = new ExamList(Arrays.asList(10, -10, 9, 0, 1));
        List<Integer> listB2 = listB1.sort();
        
        assertEquals(true, assertAscending(listB2));

    }
    
    @Test
    public void testReverse() {
        ExamList listC1 = new ExamList(Arrays.asList(1,2,3,4,5,6));
        List<Integer> expexted = Arrays.asList(6,5,4,3,2,1);
        
        assertEquals(expexted, listC1.reverse());
    }
    
    @Test
    public void testAssertMonotonic() {
        assertEquals(true, ExamList.assertMonotonic(Arrays.asList(1,2,3,4,5,6))); //true
        assertEquals(true, ExamList.assertMonotonic(Arrays.asList(6,5,4,3,2,1,1,1))); //true
        assertEquals(false, ExamList.assertMonotonic(Arrays.asList(1,2,1,4,5,4))); //false
    }
    
}
