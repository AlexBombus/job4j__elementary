package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100]; // это массив, содержащий монеты, которыми дается сдача
        int size = 0; // размер массива сдачи - колличество монет сдачи
        int moneyBack = money - price;
        while (moneyBack > 0) {
            for (int i = 0; i < coins.length; i++) {
                if (moneyBack >= coins[i]) {
                    moneyBack -= coins[i];
                    rsl[size] = coins[i];
                    size++;
                    break;
                }
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
