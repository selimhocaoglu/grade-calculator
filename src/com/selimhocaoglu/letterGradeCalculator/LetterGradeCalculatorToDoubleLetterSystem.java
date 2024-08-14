package com.selimhocaoglu.letterGradeCalculator;

public class LetterGradeCalculatorToDoubleLetterSystem implements LetterGradeCalculatorStrategy{

    @Override
    public String determineLetterGrade(double tScore, double average) {
        if (average >= 80) {
            if (tScore >= 57) return "AA";
            else if (tScore >= 52) return "BA";
            else if (tScore >= 47) return "BB";
            else if (tScore >= 42) return "CB";
            else if (tScore >= 37) return "CC";
            else if (tScore >= 32) return "DC";
            else if (tScore >= 27) return "DD";
            else return "FF";
        } else if (average >= 70) {
            if (tScore >= 59) return "AA";
            else if (tScore >= 54) return "BA";
            else if (tScore >= 49) return "BB";
            else if (tScore >= 44) return "CB";
            else if (tScore >= 39) return "CC";
            else if (tScore >= 34) return "DC";
            else if (tScore >= 29) return "DD";
            else return "FF";
        } else if (average >= 62.5) {
            if (tScore >= 61) return "AA";
            else if (tScore >= 56) return "BA";
            else if (tScore >= 51) return "BB";
            else if (tScore >= 46) return "CB";
            else if (tScore >= 41) return "CC";
            else if (tScore >= 36) return "DC";
            else if (tScore >= 31) return "DD";
            else return "FF";
        } else if (average >= 57.5) {
            if (tScore >= 63) return "AA";
            else if (tScore >= 58) return "BA";
            else if (tScore >= 53) return "BB";
            else if (tScore >= 48) return "CB";
            else if (tScore >= 43) return "CC";
            else if (tScore >= 38) return "DC";
            else if (tScore >= 33) return "DD";
            else return "FF";
        } else if (average >= 52.5) {
            if (tScore >= 65) return "AA";
            else if (tScore >= 60) return "BA";
            else if (tScore >= 55) return "BB";
            else if (tScore >= 50) return "CB";
            else if (tScore >= 45) return "CC";
            else if (tScore >= 40) return "DC";
            else if (tScore >= 35) return "DD";
            else return "FF";
        } else if (average >= 47.5) {
            if (tScore >= 67) return "AA";
            else if (tScore >= 62) return "BA";
            else if (tScore >= 57) return "BB";
            else if (tScore >= 52) return "CB";
            else if (tScore >= 47) return "CC";
            else if (tScore >= 42) return "DC";
            else if (tScore >= 37) return "DD";
            else return "FF";
        } else if (average >= 42.5) {
            if (tScore >= 69) return "AA";
            else if (tScore >= 64) return "BA";
            else if (tScore >= 59) return "BB";
            else if (tScore >= 54) return "CB";
            else if (tScore >= 49) return "CC";
            else if (tScore >= 44) return "DC";
            else if (tScore >= 39) return "DD";
            else return "FF";
        } else {
            if (tScore >= 71) return "AA";
            else if (tScore >= 66) return "BA";
            else if (tScore >= 61) return "BB";
            else if (tScore >= 56) return "CB";
            else if (tScore >= 51) return "CC";
            else if (tScore >= 46) return "DC";
            else if (tScore >= 41) return "DD";
            else return "FF";
        }
    }
}

