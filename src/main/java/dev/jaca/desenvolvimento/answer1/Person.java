package dev.jaca.desenvolvimento.answer1;

import java.util.Scanner;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person {
    private String name;
    private int age;
    private int yearOfBirth;
    private String birthplace;

    Scanner scanner = new Scanner(System.in);

    public void inputData() {
        System.out.print("Enter name: ");
        this.name = scanner.nextLine();
        System.out.print("Enter age: ");
        this.age = scanner.nextInt();
        calculateYearOfBirth();
        System.out.print("Enter birthplace: ");
        this.birthplace = scanner.next();
    }
    
    public void displayData() {
        System.out.println("\n");
        System.out.println("Hi %s, from the city of %s, born in %d, is %d years old.".formatted(this.name, this.birthplace, this.yearOfBirth, this.age));
        System.out.println("\n");
    }

    public void calculateYearOfBirth() {
        int currentYear = java.time.Year.now().getValue();
        this.yearOfBirth = currentYear - this.age;
    }

    public void Older(Person p1, Person p2, Person p3) {
        if (p1.getAge() > p2.getAge() && p1.getAge() > p3.getAge()) {
            System.out.println("%s is the oldest.".formatted(p1.getName()));
        } else if (p2.getAge() > p1.getAge() && p2.getAge() > p3.getAge()) {
            System.out.println("%s is the oldest.".formatted(p2.getName()));
        } else if (p3.getAge() > p1.getAge() && p3.getAge() > p2.getAge()) {
            System.out.println("%s is the oldest.".formatted(p3.getName()));
        } else {
            System.out.println("There is a tie for the oldest age.");
        }
    }

    public void Younger(Person p1, Person p2, Person p3) {
        if (p1.getAge() < p2.getAge() && p1.getAge() < p3.getAge()) {
            System.out.println("%s is the youngest.".formatted(p1.getName()));
        } else if (p2.getAge() < p1.getAge() && p2.getAge() < p3.getAge()) {
            System.out.println("%s is the youngest.".formatted(p2.getName()));
        } else if (p3.getAge() < p1.getAge() && p3.getAge() < p2.getAge()) {
            System.out.println("%s is the youngest.".formatted(p3.getName()));
        } else {
            System.out.println("There is a tie for the youngest age.");
        }
    }

    public static void compareAge(Person p1, Person p2, Person p3) {
        p1.Older(p1, p2, p3);
        p1.Younger(p1, p2, p3);
    }
}