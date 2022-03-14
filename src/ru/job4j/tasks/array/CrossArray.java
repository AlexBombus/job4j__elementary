package ru.job4j.tasks.array;

import java.util.*;

/**
 *Заданы два числовых массива.
 *Нужно вывести на консоль числа, которые есть одновременно в первом и втором массиве.
 */
public class CrossArray {

/**
 * Используем множество(Set), чтобы исключить повторение при выводе на консоль
 * чисел, которые могут встречаться многократно в обоих массивах.
 * в циклах проводим проверку совпадений и в случае совпадения отправляем в множество
 *
 */
    public static void printCrossEl(int[] left, int[] right) {
        Set<Integer> set = new HashSet<>();
        for (int k : left) {
            for (int i : right) {
                if (k == i) {
                    set.add(k);
                }
            }
        }
        for (Object a: set) {
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        int[] left = {1, 45, 87, 23, 65, 86, 34, 34, 34, 76};
        int[] right = {7, 45, 83, 23, 61, 86, 34, 34, 37, 76};
        printCrossEl(left, right);
    }
}

