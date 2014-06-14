package com.hackbulgaria.corejava.exam1;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class ExamList {

    // fields
    private List<Integer> list;
    private List<Integer> listCopy = new ArrayList<Integer> ();
    
    // constructor
    public ExamList (List<Integer> list){
        this.listCopy.addAll(list); 
        this.list = list;
    }
    
    // methods
    
    public List<Integer> getlist(){
        return this.list;
    }
    
    // Restores this.listCopy to be equal to this.list.
    public List<Integer> setListCopy(){
        this.listCopy.clear();
        this.listCopy.addAll(this.list);
        return this.listCopy;
    }
    
    // Sorts a copy of the given list and returns it.
    public List<Integer> sort() {
        this.setListCopy();
        Collections.sort(this.listCopy, new IntComparator());
        return this.listCopy;
    }
    
    // Reverses a copy of the given list and returns it.
    public List<Integer> reverse() {
        this.setListCopy();
        Collections.reverse(this.listCopy);
        return this.listCopy;
    }
    
    // Checks if the given list is monotonic.
    public static boolean assertMonotonic(List<Integer> arr) {
        boolean ascending = true, descending = true;
        for (int i = 1; i < arr.size() && (ascending || descending); i++) {
            ascending = ascending && arr.get(i) >= arr.get(i-1);
            descending = descending && arr.get(i) <= arr.get(i-1);
        }
        boolean result = ascending || descending;
        return result;
    }
    
    public static void main(String[] args) {
        ExamList list1 = new ExamList(Arrays.asList(5,4,6,3,2,1));

        System.out.println(list1.getlist());
        List<Integer> listSorted = list1.sort();
        System.out.println(listSorted);

        List<Integer> listReversed = list1.reverse();
        System.out.println(listReversed);
        
        boolean res1 = ExamList.assertMonotonic(Arrays.asList(1,2,3,4,5,6)); // True
        System.out.println(res1);

    }

}
