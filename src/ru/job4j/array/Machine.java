package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1}; // массив с типом имеющихся монет
        int[] rsl = new int[100]; // это массив, с перечнем монет сдачи
        int size = 0; // размер массива сдачи - колличество монет сдачи
        int moneyBack = money - price; // расчет сдачи
        for (int i = 0; i < coins.length; i++) {
            while (moneyBack >= coins[i]) {
                moneyBack -= coins[i];
                rsl[size] = coins[i];
                size++;
                }       // метод Arrays.copyOf() сокращает размер массива с изначального rls
            }           //  до размера кол-ва полученых монет - size
        return Arrays.copyOf(rsl, size); // метод  change возвращает массив rls, содержащий перечень монет сдачи.
    }
}
