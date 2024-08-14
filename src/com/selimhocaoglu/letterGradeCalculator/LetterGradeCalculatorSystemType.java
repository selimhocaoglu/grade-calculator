package com.selimhocaoglu.letterGradeCalculator;

public class LetterGradeCalculatorSystemType {
    public static LetterGradeCalculatorStrategy getCalculator(int systemType){
        if(systemType == 1){
            return new LetterGradeCalculatorToDoubleLetterSystem();
        }
        else if(systemType == 2){
            return new LetterGradeCalculatorToOneLetterSystem();
        }
        else{
            return (LetterGradeCalculatorStrategy) new IllegalArgumentException("There is no system type for that number.");
        }
    }
}
