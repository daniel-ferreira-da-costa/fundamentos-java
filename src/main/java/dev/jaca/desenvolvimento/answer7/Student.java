package dev.jaca.desenvolvimento.answer7;

import java.util.List;
import java.util.Scanner;

import dev.jaca.desenvolvimento.answer1.Person;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student extends Person {
    private List<Float> testScores;
    private float average;

    Scanner scanner = new Scanner(System.in);

    public void imputStudentData() {
        System.out.println("Enter student name:");
        setName(scanner.nextLine());
        testScores = new java.util.ArrayList<>();

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter score %d: ".formatted(i + 1));
            float score = scanner.nextFloat();
            testScores.add(score);
        }
    }

    public float calculateAverage() {
        if (testScores == null || testScores.isEmpty()) {
            return 0;
        }
        float sum = 0;
        for (Float grade : testScores) {
            sum += grade;
        }
        average = sum / testScores.size();
        return average;
    }

    public String highetAverage(Student student1, Student student2) {
        return student1.calculateAverage() > student2.calculateAverage() ? student1.getName() : student2.getName();
    }
}