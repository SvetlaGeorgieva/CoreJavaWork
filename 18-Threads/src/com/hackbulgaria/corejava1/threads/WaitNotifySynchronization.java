package com.hackbulgaria.corejava1.threads;

public class WaitNotifySynchronization {
    public static int counter = 0;
    public static int turn = 1;

    public static final Object monitor = new Object();

    public static synchronized void increase() {
        counter++;
    }

    public static void main(String[] args) throws InterruptedException {
        final Thread t1 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 20_000; i++) {
                    synchronized (monitor) {
                        while (turn != 1) {
                            try {
                                monitor.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        increase();

                        turn = 2;
                        monitor.notify();
                    }
                }

            }
        };

        final Thread t2 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 20_000; i++) {
                    synchronized (monitor) {
                        while (turn != 2) {
                            try {
                                monitor.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        increase();

                        turn = 1;
                        monitor.notify();
                    }
                }

            }
        };

        long start = System.currentTimeMillis();
        t1.setName("T1");
        t2.setName("T2");

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        long end = System.currentTimeMillis();
        long time = end - start;

        System.out.println(counter + " -> " + time + " ms");
    }

}
