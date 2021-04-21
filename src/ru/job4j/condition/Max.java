package ru.job4j.condition;

public class Max {
    public static int max(int a, int b) {
        return a > b ? a : b;
    }

    public static int max(int a, int b, int c) {
        int x = a > b ? a : b;
        return x > c ? x : c;
    }

    public static int max(int a, int b, int c, int d) {
        int x = a > b ? a : b;
        int y = c > d ? c : d;
        return x > y ? x : y;
    }

    public static void main(String[] args) {
        System.out.println(Max.max(7, 9));
    }
}
