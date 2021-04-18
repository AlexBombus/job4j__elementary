package ru.job4j.array;

/**
 * Метод находит и возвращает индекс массива в котором находитмя мин значение
 * если элемента нет в массиве, то возвращаем -1.
 */
public class FindLoop {
    public static int indexOf(int[] data, int el) {
        int rst = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }

    /**
     * Метод находит и возвращает индекс массива в котором находитмя мин значение в заданном диапазоне
     * @return индекс, а если элемента нет в массиве, то возвращаем -1.
     */
    public static int indexOf(int[] data, int el, int start, int finish) {
        int rst = -1;
        for (int index = start; index <= finish; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}
