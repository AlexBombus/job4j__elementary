package ru.job4j.tasks.array;

/**
 *1. Открытые и закрытые скобки
 * Реализовать метод проверки корректности открытых и закрытых скобок.
 * Например, ()(()((()))) - true, ()) - false
 */
public class Parentheses {
    /**
     * Метод проверяет правильное расположение скобок.
     * Суть метода состоит в том, то по доду исполнения цикла  и чтения строки
     * открытывающих скобок всегда должно быть больше или равно чем закрывающих,
     * а в конечном итоге они должны сравняться по кол-ву.
     *решить через тернарный оператор
     * return  (o > c ? func1() : func2());
     */
    public static boolean valid(char[] data) {
        int x = 0, y = 0;
        for (char i : data) {
            if (x < y) {
                return false;
                } else if (i == '(') {
                    x++;
                } else if (i == ')') {
                    y++;
                }
            }
        return x == y;
    }

    public static void main(String[] args) {
        char[] dat =  {'(', '(', ')', ')', '(', ')', '(', ')'};
        System.out.println(valid(dat));
    }

}
