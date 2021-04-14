package ru.job4j.tasks.loop;

 /* 13. Аббревиатуры
Аббревиатуры стали неотъемлемой частью нашей жизни. Мы очень часто используем и много какие выражения
сокращаем, забирая от каждого слова только первую букву - именно так формируются аббревиатуры.
Метод принимает строку, которая состоит из нескольких слов каждое из которых начинается с прописной буквы.
Необходимо из полученной строки сформировать аббревиатуру.
Для формирования новой строки используйте StringBuilder и его метод append(). */

public class Abbreviation {
    public static String collect(String s) {
        StringBuilder str = new StringBuilder();
        str.append(s.charAt(0));
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                str.append(s.charAt(i + 1));
            }
        }

        return str.toString();
    }
}
