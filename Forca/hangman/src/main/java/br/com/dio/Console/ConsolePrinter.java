package br.com.dio.Console;

public class ConsolePrinter {
    public static void printHangman(int errors) {
        String[] hangman = {
                " +---+",
                " |   |",
                " " + (errors >= 1 ? "O" : " ") + "   |",
                "" + (errors >= 3 ? "/" : " ") + (errors >= 2 ? "|" : " ") + (errors >= 4 ? "\\" : " ") + "  |",
                  (errors >= 5 ? "/" : " ") + " " + (errors >= 6 ? "\\" : " ") + "  |",
                "     |",
                "====="
        };
        for (String line : hangman) {
            System.out.println(line);
        }
    }
}

