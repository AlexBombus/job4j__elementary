package ru.job4j.tasks.array;

/**
 * Задан числовой массив. Необходимо написать программу, которая проверит, что массив отсортирован по возрастанию.
 * Сортировать сам массив не нужно!
 */
public class Sorted {
    /**
     * Приватный конструктор запрещает создание экземпляра класса вне самого класса.
     * Для целей данного задания это и не нужно. Он не обязателен, но SonarLint настойчиво рекомендует.
     * Дабы привыкать писать правильный код
     */
    private Sorted() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * Метод проверяет отсортирован массив или нет
     * @param arr массив для проверки на наличие сортировки
     * @return true если массив отсортирован и false если нет
     */
    public static boolean isSorted(int[] arr) {
        boolean result = true;
        int a = arr[0];
        for (int j : arr) {
            if (j < a) {
                result = false;
                break;
            }
            a = j;
        }
        return result;
    }

}
