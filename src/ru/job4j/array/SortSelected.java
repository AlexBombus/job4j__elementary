package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1); // находит мин значение
            int index = FindLoop.indexOf(data, min, i, data.length - 1); // определяем в каком индексе мин значение
            SwitchArray.swap(data, index, i); // меняет индексы местами
        }
        return data; // метод сортирует числовые значения массива по возрастанию
    }
}
