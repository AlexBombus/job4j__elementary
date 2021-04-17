package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board[row].length; i++) {
            if (board[row][i] != 'X') {
                result = false;
                break;
            }
        }
        return result; // метод проверяет что строка  row в двухмерном массиве целиком заполнена символом 'X'.
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][column] != 'X') {
                result = false;
                break;
            }
        }               // метод проверяет что в каждой строке двухмерного массива
        return result; // ячейка с индексом column заполнена символом 'X'.
    }
}
