package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (boolean datum : data) {
            boolean check = data[0];
            if (check != datum) {
                result = false;
                break;
            }
        }
        return result;
    }
}
