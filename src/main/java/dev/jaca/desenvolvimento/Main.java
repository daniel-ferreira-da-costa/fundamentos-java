package dev.jaca.desenvolvimento;

import java.util.Scanner;

import dev.jaca.desenvolvimento.answer1.Person;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== MENU DE EXERCÍCIOS ===");
            System.out.println("1 - Nome e ano de nascimento");
            System.out.println("2 - Área do quadrado");
            System.out.println("3 - Área do retângulo");
            System.out.println("4 - Diferença de idade entre duas pessoas");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    Person person = new Person();
                    person.inputData();
                    person.displayData();
                    break;
                case 2:
                    // Chame o exercício 2 aqui
                    System.out.println("Executando exercício 2...");
                    break;
                case 3:
                    // Chame o exercício 3 aqui
                    System.out.println("Executando exercício 3...");
                    break;
                case 4:
                    // Chame o exercício 4 aqui
                    System.out.println("Executando exercício 4...");
                    break;
                case 0:
                    System.out.println("Saindo do programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}