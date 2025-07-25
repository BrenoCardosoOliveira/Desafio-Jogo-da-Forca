package br.com.dio.Model;

import java.util.Random;

public class WordBank {
    private static final String[] WORDS = {
            "JAVA", "ORIENTACAO", "OBJETOS", "CLASSE", "METODO", "ATRIBUTO"
    };

    public static String getRandomWord() {
        return WORDS[new Random().nextInt(WORDS.length)];
    }
}
