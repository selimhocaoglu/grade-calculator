package com.selimhocaoglu.letterGradeCalculator;

public class LetterGradeCalculator {
    protected double grade;
    protected double average;
    protected double stdDeviation;
    protected final int T_SCORE_CONSTANT = 50;

    public LetterGradeCalculator(double grade, double average, double stdDeviation) {
        this.grade = grade;
        this.average = average;
        this.stdDeviation = stdDeviation;
    }

    protected double CalculateTScore() {
        return 10 * ((this.grade - this.average) / this.stdDeviation) + T_SCORE_CONSTANT;
    }
}
