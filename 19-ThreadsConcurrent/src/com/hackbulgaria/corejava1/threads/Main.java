package com.hackbulgaria.corejava1.threads;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        final Thread t1 = new Thread() {
            @Override
            public void run() {
                TestClass.increase();
            }
        };

        final Thread t2 = new Thread() {
            @Override
            public void run() {
                TestClass.increase();
            }
        };

        long start = System.currentTimeMillis();
        t1.start();
        t2.start();

        t1.join();
        t2.join();
        long end = System.currentTimeMillis();
        long time = end - start;

//        System.out.println(TestClass.counter.get() + " -> " + time + " ms");
        System.out.println(TestClass.counter + " -> " + time + " ms");
    }

}
