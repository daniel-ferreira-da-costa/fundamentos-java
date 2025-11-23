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
}
