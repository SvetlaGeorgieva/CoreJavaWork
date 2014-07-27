package com.hackbulgaria.corejava1.generics2;

public class TypeInstance {

    public static <T> T newInstance(Class<T> clazz) throws InstantiationException, IllegalAccessException {
        return clazz.newInstance();
    }
}
