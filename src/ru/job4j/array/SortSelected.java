package ru.job4j.array;

/**
 * Метод сортирует числовые значения массива по возрастанию
 * int min - находит мин значение
 * int index - определяем в каком индексе мин значение
 * SwitchArray.swap() - меняет индексы местами
 */
public class SortSelected {
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1);
            int index = FindLoop.indexOf(data, min, i, data.length - 1);
            SwitchArray.swap(data, index, i);
        }
        return data;
    }
}
