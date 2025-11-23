package dev.jaca.desenvolvimento;

import java.util.List;
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
            System.out.println("5 - Comparar idade de tres pessoas");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    Person case1_person = new Person();
                    case1_person.inputData();
                    case1_person.displayData();
                    break;
                case 2:
                    System.out.println("Qual o tamanho em cm do lado do quadrado?");
                    var lado = scanner.nextFloat();
                    var area = lado * lado;
                    System.out.println("A área do quadrado é: %s cm²".formatted(area));
                    break;
                case 3:
                    System.out.println("Qual a largura em cm do retângulo?");
                    var largura = scanner.nextFloat();
                    System.out.println("Qual a altura em cm do retângulo?");
                    var altura = scanner.nextFloat();
                    var areaRetangulo = largura * altura;
                    System.out.println("A área do retângulo é: %s cm²".formatted(areaRetangulo));
                    break;
                case 4:
                    Person case4_pessoa1 = new Person();
                    Person case4_pessoa2 = new Person();
                    System.out.println("Digite o nome da primeira pessoa:");
                    case4_pessoa1.setName(scanner.next());
                    System.out.println("Digite a idade da primeira pessoa:");
                    case4_pessoa1.setAge(scanner.nextInt());

                    System.out.println("Digite o nome da segunda pessoa:");
                    case4_pessoa2.setName(scanner.next());
                    System.out.println("Digite a idade da segunda pessoa:");
                    case4_pessoa2.setAge(scanner.nextInt());

                    int diferencaIdade = Math.abs(case4_pessoa1.getAge() - case4_pessoa2.getAge());
                    System.out.println("A diferença de idade entre %s e %s é de %d anos."
                            .formatted(case4_pessoa1.getName(), case4_pessoa2.getName(), diferencaIdade));
                    break;
                case 5:
                    Person case5_pessoa1 = new Person();
                    Person case5_pessoa2 = new Person();
                    Person case5_pessoa3 = new Person();
                    List<Person> case5_pessoas = List.of(case5_pessoa1, case5_pessoa2, case5_pessoa3);
                    for (Person pessoa : case5_pessoas) {
                        pessoa.inputData();
                        pessoa.displayData();
                    }
                    Person.compareAge(case5_pessoa1, case5_pessoa2, case5_pessoa3);
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