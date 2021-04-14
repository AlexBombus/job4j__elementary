package ru.job4j.tasks.loop;

    /*9.5. Сумма цифр
        Дано число, нужно получить сумму его цифр. Например,
        12 => 1 + 2 => 3 */

public class DigitSum {
    public static int sum(int num) {
        int n = 0;
        int sum = 0;
        while (num >= 1) {
            if (num < 10) {
                n = num;
            }
            if (num >= 10) {
                n = num % 10;
            }
            sum += n;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(1));

    }

}