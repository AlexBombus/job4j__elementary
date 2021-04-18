package ru.job4j.array;

import java.util.Arrays;

/**
 *Жадный алгоритм. Сдача в кофе машине
 */
public class Machine {
    /**
     *  метод  change возвращает массив rls, содержащий перечень монет сдачи.
     * @param money деньги помещенные в автомат кофе-машины
     * @param price стоимость выбранного напитка
     *  int[] coins = {10, 5, 2, 1}; -  массив с типом имеющихся монет
     *  int[] rsl = new int[100];  это массив, с перечнем  номинала монет сдачи с заданным размером
     *  int size = 0; размер массива rsl - колличество монет сдачи,
     * @return  // метод Arrays.copyOf() сокращает размер массива с изначального rls до размера  size
     */
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int moneyBack = money - price;
        for (int coin : coins) {
            while (moneyBack >= coin) {
                moneyBack -= coin;
                rsl[size] = coin;
                size++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
