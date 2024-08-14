package com.selimhocaoglu.letterGradeCalculator;

import java.util.Scanner;

public class LetterGradeCalculatorMainScreen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hangi harf notu sistemini kullandığınızı seçiniz.\n" +
                "1. AA, BA, BB...\n" +
                "2. A, A-, B+...");
        int letterGradeSystem = scanner.nextInt();

        System.out.println("Dersin ortalama notunu giriniz:");
        double average = scanner.nextDouble();

        System.out.println("Dersin standart sapmasını giriniz:");
        double stdDeviation = scanner.nextDouble();

        System.out.println("Kendi notunuzu giriniz:");
        double studentGrade = scanner.nextDouble();

        LetterGradeCalculatorStrategy calculatorStrategy = LetterGradeCalculatorSystemType.getCalculator(letterGradeSystem);
        LetterGradeCalculator letterGradeCalculator = new LetterGradeCalculator(studentGrade, average, stdDeviation);
        double tScore = letterGradeCalculator.CalculateTScore();
        String letterGrade = calculatorStrategy.determineLetterGrade(tScore, average);

        System.out.println("Aldığınız harf notu: " + letterGrade);

        scanner.close();
    }
}
