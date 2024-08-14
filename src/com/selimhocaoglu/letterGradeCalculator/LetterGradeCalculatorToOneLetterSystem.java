package com.selimhocaoglu.letterGradeCalculator;

public class LetterGradeCalculatorToOneLetterSystem implements LetterGradeCalculatorStrategy{

    @Override
    public String determineLetterGrade(double tScore, double average) {
        if (average >= 80) {
            if (tScore >= 57) return "A";
            else if (tScore >= 52) return "A-";
            else if (tScore >= 46) return "B+";
            else if (tScore >= 40) return "B";
            else if (tScore >= 34) return "B-";
            else if (tScore >= 28) return "C+";
            else if (tScore >= 22) return "C";
            else if (tScore >= 16) return "C-";
            else if (tScore >= 10) return "D+";
            else if (tScore >= 4) return "D";
            else return "F";
        } else if (average >= 70) {
            if (tScore >= 55) return "A";
            else if (tScore >= 50) return "A-";
            else if (tScore >= 45) return "B+";
            else if (tScore >= 40) return "B";
            else if (tScore >= 35) return "B-";
            else if (tScore >= 30) return "C+";
            else if (tScore >= 25) return "C";
            else if (tScore >= 20) return "C-";
            else if (tScore >= 15) return "D+";
            else if (tScore >= 10) return "D";
            else return "F";
        } else if (average >= 62.5) {
            if (tScore >= 53) return "A";
            else if (tScore >= 48) return "A-";
            else if (tScore >= 43) return "B+";
            else if (tScore >= 38) return "B";
            else if (tScore >= 33) return "B-";
            else if (tScore >= 28) return "C+";
            else if (tScore >= 23) return "C";
            else if (tScore >= 18) return "C-";
            else if (tScore >= 13) return "D+";
            else if (tScore >= 8) return "D";
            else return "F";
        } else if (average >= 57.5) {
            if (tScore >= 50) return "A";
            else if (tScore >= 45) return "A-";
            else if (tScore >= 40) return "B+";
            else if (tScore >= 35) return "B";
            else if (tScore >= 30) return "B-";
            else if (tScore >= 25) return "C+";
            else if (tScore >= 20) return "C";
            else if (tScore >= 15) return "C-";
            else if (tScore >= 10) return "D+";
            else if (tScore >= 5) return "D";
            else return "F";
        } else if (average >= 52.5) {
            if (tScore >= 48) return "A";
            else if (tScore >= 43) return "A-";
            else if (tScore >= 38) return "B+";
            else if (tScore >= 33) return "B";
            else if (tScore >= 28) return "B-";
            else if (tScore >= 23) return "C+";
            else if (tScore >= 18) return "C";
            else if (tScore >= 13) return "C-";
            else if (tScore >= 8) return "D+";
            else if (tScore >= 3) return "D";
            else return "F";
        } else if (average >= 47.5) {
            if (tScore >= 46) return "A";
            else if (tScore >= 41) return "A-";
            else if (tScore >= 36) return "B+";
            else if (tScore >= 31) return "B";
            else if (tScore >= 26) return "B-";
            else if (tScore >= 21) return "C+";
            else if (tScore >= 16) return "C";
            else if (tScore >= 11) return "C-";
            else if (tScore >= 6) return "D+";
            else if (tScore >= 1) return "D";
            else return "F";
        } else if (average >= 42.5) {
            if (tScore >= 44) return "A";
            else if (tScore >= 39) return "A-";
            else if (tScore >= 34) return "B+";
            else if (tScore >= 29) return "B";
            else if (tScore >= 24) return "B-";
            else if (tScore >= 19) return "C+";
            else if (tScore >= 14) return "C";
            else if (tScore >= 9) return "C-";
            else if (tScore >= 4) return "D+";
            else return "D";
        } else if (average >= 37.5) {
            if (tScore >= 42) return "A";
            else if (tScore >= 37) return "A-";
            else if (tScore >= 32) return "B+";
            else if (tScore >= 27) return "B";
            else if (tScore >= 22) return "B-";
            else if (tScore >= 17) return "C+";
            else if (tScore >= 12) return "C";
            else if (tScore >= 7) return "C-";
            else if (tScore >= 2) return "D+";
            else return "D";
        } else if (average >= 32.5) {
            if (tScore >= 40) return "A";
            else if (tScore >= 35) return "A-";
            else if (tScore >= 30) return "B+";
            else if (tScore >= 25) return "B";
            else if (tScore >= 20) return "B-";
            else if (tScore >= 15) return "C+";
            else if (tScore >= 10) return "C";
            else if (tScore >= 5) return "C-";
            else if (tScore >= 0) return "D+";
            else return "D";
        } else {
            if (tScore >= 38) return "A";
            else if (tScore >= 33) return "A-";
            else if (tScore >= 28) return "B+";
            else if (tScore >= 23) return "B";
            else if (tScore >= 18) return "B-";
            else if (tScore >= 13) return "C+";
            else if (tScore >= 8) return "C";
            else if (tScore >= 3) return "C-";
            else if (tScore >= -2) return "D+";
            else return "D";
        }
    }
}
