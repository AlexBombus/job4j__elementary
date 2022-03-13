package ru.job4j.array;

public class Turn {
    /**
     * Метод возвращает массив в обратном порядке
     * @param array массив для изменения
     * @return измененный массив
     */
    public static int[] back(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }
}
