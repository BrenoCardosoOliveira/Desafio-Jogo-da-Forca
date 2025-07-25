package br.com.dio.Game;

import br.com.dio.Console.ConsolePrinter;
import br.com.dio.Model.WordBank;


import java.util.*;

public class HangmanGame {
    private final String hiddenWord;
    private final char[] guessedLetters;
    private final Set<Character> wrongGuesses = new HashSet<>();
    private int errors = 0;
    private static final int MAX_ERRORS = 6;

    public HangmanGame() {
        this.hiddenWord = WordBank.getRandomWord();
        this.guessedLetters = new char[hiddenWord.length()];
        Arrays.fill(guessedLetters, '_');
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n===== Jogo da Forca  =====\n");

        while (errors < MAX_ERRORS && !isWordGuessed()) {
            ConsolePrinter.printHangman(errors);
            printWord();
            System.out.print("Digite uma letra: ");
                    String input = scanner.nextLine().toUpperCase();

            if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
                System.out.println("Entrada inválida. Digite apenas uma letra.");
                continue;
            }

            char guess = input.charAt(0);

            if (hiddenWord.indexOf(guess) >= 0) {
                for (int i = 0; i < hiddenWord.length(); i++) {
                    if (hiddenWord.charAt(i) == guess) {
                        guessedLetters[i] = guess;
                    }
                }
            } else if (!wrongGuesses.contains(guess)) {
                wrongGuesses.add(guess);
                errors++;
                System.out.println("Letra incorreta!");
            } else {
                System.out.println("Você já tentou essa letra.");
            }
        }

        ConsolePrinter.printHangman(errors);
        if (isWordGuessed()) {
            System.out.println("\nParabéns! Você acertou a palavra: " + hiddenWord);
        } else {
            System.out.println("\nGame Over! A palavra era: " + hiddenWord);
        }
    }

    private void printWord() {
        System.out.print("\nPalavra: ");
        for (char c : guessedLetters) {
            System.out.print(c + " ");
        }
        System.out.println("\nLetras erradas: " + wrongGuesses);
    }

    private boolean isWordGuessed() {
        return hiddenWord.equals(new String(guessedLetters));
    }
}
