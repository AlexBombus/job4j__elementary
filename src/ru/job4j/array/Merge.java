package ru.job4j.array;

public class Merge {

    /**
     * Даны два отсортированных по возрастанию массива. Как без сортировки их объединить в третий массив?
     */

    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int leftIndex = 0, rightIndex = 0;
        for (int i = 0; i < rsl.length; i++) {
            if (leftIndex > left.length - 1) {
                rsl[i] = right[rightIndex];
                rightIndex++;
            } else if (rightIndex > right.length - 1) {
                rsl[i] = left[leftIndex];
                leftIndex++;
            } else if (left[leftIndex] < right[rightIndex]) {
                rsl[i] = left[leftIndex];
                leftIndex++;
            } else  {
                rsl[i] = right[rightIndex];
                rightIndex++;
            }
        }
        return rsl;
    }
}
