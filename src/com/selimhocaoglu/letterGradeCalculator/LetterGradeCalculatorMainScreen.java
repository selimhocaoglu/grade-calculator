package com.selimhocaoglu.letterGradeCalculator;

import java.util.Scanner;

public class LetterGradeCalculatorMainScreen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose letter grade system.\n" +
                "1. AA, BA, BB...\n" +
                "2. A, A-, B+...");
        int letterGradeSystem = scanner.nextInt();
        LetterGradeCalculatorSystemType selectedSystemType;

        switch (letterGradeSystem){
            case 1 -> selectedSystemType = LetterGradeCalculatorSystemType.DOUBLE_LETTER;
            case 2 -> selectedSystemType = LetterGradeCalculatorSystemType.SINGLE_LETTER;
            default -> {
                System.out.println("There is no system type for your choice. EXITING...");
                scanner.close();
                return;
            }
        }

        System.out.print("Enter the average grade of the course: ");
        double average = scanner.nextDouble();

        System.out.print("Enter the standard deviation of the course: ");
        double stdDeviation = scanner.nextDouble();

        System.out.print("Enter your grade: ");
        double studentGrade = scanner.nextDouble();

        LetterGradeCalculatorStrategy calculatorStrategy = selectedSystemType.getCalculatorStrategy();
        LetterGradeCalculator letterGradeCalculator = new LetterGradeCalculator(studentGrade, average, stdDeviation);
        double tScore = letterGradeCalculator.CalculateTScore();
        String letterGrade = calculatorStrategy.determineLetterGrade(tScore, average);

        System.out.println("Your letter grade: " + letterGrade);

        scanner.close();
    }
}
