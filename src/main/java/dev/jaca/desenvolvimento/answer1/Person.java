package dev.jaca.desenvolvimento.answer1;

import java.util.Scanner;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person {
    private String name;
    private int age;
    Scanner scanner = new Scanner(System.in);

    public void inputData() {
        System.out.print("Enter name: ");
        this.name = scanner.nextLine();
        System.out.print("Enter age: ");
        this.age = scanner.nextInt();
    }
}
