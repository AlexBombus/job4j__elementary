package ru.job4j.array;

public class Square {
    /**
     * Метод заполняет массив заданной длины значениями индекса в квадрате
     * например array[2] = 4; (2*2)   array[3] = 9; (3*3)
     * @param bound - длина массива
     * @return массив заполненный значениями
     */
    public static int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int i = 0; i < rst.length; i++) {
            rst[i] = i * i;
        }
        return rst;
    }

    public static void main(String[] args) {
        int[] array = calculate(4);
        for (int i : array) {
            System.out.println(i);
        }
    }
}
