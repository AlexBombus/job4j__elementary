package ru.job4j.array;

public class MatrixCheck {
    /***
     *  метод проверяет что строка  row в двухмерном массиве целиком заполнена символом 'X'.
     * @param row - индекс проверяемой строки - char[row][] board;
     */
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board[row].length; i++) {
            if (board[row][i] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    /***
     *  метод проверяет что в каждой строке двухмерного массива  ячейка с индексом column заполнена символом 'X'.
     * @param column  индекс ячейки в строке - char[][row] board;
     */
    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (char[] chars : board) {
            if (chars[column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    /***
     * метод заполняет одномерный массив элементами диагонали из двухмерного массива
     */
    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int i = 0; i < board.length; i++) {
            rsl[i] = board[i][i];
        }
        return rsl;
    }

    /**
     * Метод проверяет наличие горизонт. или верт. строки полностью заполненной 'Х'
     */
    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 'X' && (monoHorizontal(board, i) || monoVertical(board, i))) {
                result = true;
                break;
            }
        }
        return result;
    }
}

