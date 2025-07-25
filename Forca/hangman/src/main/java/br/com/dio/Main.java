package br.com.dio;

import br.com.dio.Game.HangmanGame;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            mostrarMenu();
            opcao = lerOpcao();

            switch (opcao) {
                case 1:
                    iniciarNovoJogo();
                    break;
                case 0:
                    System.out.println("Saindo do jogo. Até a próxima!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 0);
    }

    private static void mostrarMenu() {
        System.out.println("\n=== JOGO DA FORCA ===");
        System.out.println("1. Novo Jogo");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static int lerOpcao() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    private static void iniciarNovoJogo() {
        HangmanGame jogo = new HangmanGame();
        jogo.play();
    }


}
