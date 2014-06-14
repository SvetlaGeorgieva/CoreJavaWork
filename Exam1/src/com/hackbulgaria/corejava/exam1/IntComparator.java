package com.hackbulgaria.corejava.exam1;

import java.util.Comparator;

public class IntComparator implements Comparator<Integer> {

    //ascending comparator
    @Override
    public int compare(Integer o1, Integer o2) {
        return (o1>o2 ? 1 : (o1==o2 ? 0 : -1));
    }

}
