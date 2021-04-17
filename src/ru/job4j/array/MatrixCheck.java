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

    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int i = 0; i < board.length; i++) {
            rsl[i] = board[i][i];
        }
        return rsl; //метод заполняет одномерный массив элементами диагонали из двухмерного массива
    }

    public static boolean isWin(char[][] board) {
        int index = 0;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 'X') {
                index = i;
                break;
            }
        }
        return monoHorizontal(board, index) || monoVertical(board, index);
    }
}
