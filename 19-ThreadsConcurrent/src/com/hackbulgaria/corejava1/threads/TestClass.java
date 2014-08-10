package com.hackbulgaria.corejava1.threads;

import java.util.concurrent.atomic.AtomicInteger;

public class TestClass {
    public static AtomicInteger counter = new AtomicInteger(0);

    // public static int counter = 0;

    // private final Object monitor = new Object();

    public static synchronized void increase() {
        // synchronized (TestClass.class) {
        for (int i = 0; i < 2_000_000; i++) {
            counter.incrementAndGet();
            // counter++;
        }
        // }
    }
}
