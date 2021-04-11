package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double x = Math.pow((x2 - x1), 2);
        double y = Math.pow((y2 - y1), 2);
        return Math.sqrt(x + y);
    }

    public static void main(String[] args) {
        double result = Point.distance(1, 7, 5, 4);
        System.out.println("result (0, 0) to (2, 0) " + result);

        double result1 = Point.distance(3, 6, 2, 5);
        System.out.println("result (2, 10) to (4, 5) " + result1);
    }
}
