package com.hackbulgaria.corejava1.generics2;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {

        // Playing with class Box
        Box<Integer> box = new Box<>();
        box.set(3);
        System.out.println(box.get()); // =>3

        Box<String> box2 = new Box<>("this example belongs to Oracle");
        System.out.println(box2.get()); // "this example belongs to  Oracle"

        Box<List<String>> box3 = new Box<>(Arrays.asList("sup1", "sup2", "sup3"));
        System.out.println(box3.get()); // "[sup1, sup2, sup3]"

        // Playing with class Pair
        System.out.println(".............");
        Pair<Integer, String> pair = new Pair<>();
        pair.setFirst(3);
        pair.setSecond("shalala");

        System.out.println(pair.toString()); // => <3, "string">
        System.out.println(pair.first().toString() + " -> " + pair.first().getClass());
        System.out.println(pair.second().toString() + " -> " + pair.second().getClass());

        // Playing with class TypeInstance
        System.out.println(".............");
        System.out.println(TypeInstance.newInstance(Object.class));
        
        // Playing with class Favourites
        System.out.println(".............");
        Favourites favourites = new Favourites();
        favourites.add(String.class, "myString");
        favourites.add(Integer.class, 3);

        System.out.println(favourites.get(Integer.class)); // 3
    }

}
