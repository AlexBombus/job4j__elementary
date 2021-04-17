package ru.job4j.array;

public class SwitchArray {

    public static int[] swap(int[] array, int source, int dest) {
        int temp = array[source];
        array[source] = array[dest];
        array[dest] = temp;
        return array; // меняет местами  значения  указанных индексов массива
    }

    public static int[] swapBorder(int[] array) {
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        return array; // меняет местами нулевой элемент и последний элемент в массиве
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1, 2, 3, 4, 5, 6};
        int[] rsl = swapBorder(nums);
        for (int i : rsl) {
            System.out.print(i);
        }
        System.out.println();
        int[] swapedRsl = swap(rsl, 1, 4);
        for (int j : swapedRsl) {
            System.out.print(j);
        }
    }
}
