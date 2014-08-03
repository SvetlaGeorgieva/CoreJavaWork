package com.hackbulgaria.corejava1.threads;

import java.awt.Point;
import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        final List<Point> pl = PointsCalculator.generatePointsList(10_000);

        long start = System.currentTimeMillis();
        PointsCalculator.getNearestPoints(pl);
        long end = System.currentTimeMillis();
        System.out.println(end - start);

        // List<Point> pl2 = new ArrayList<Point>();
        // pl2.add(new Point(0, 1));
        // pl2.add(new Point(0, 2));
        // pl2.add(new Point(0, 5));
        // System.out.println(PointsCalculator.getNearestPoints(pl2));
    }

}
