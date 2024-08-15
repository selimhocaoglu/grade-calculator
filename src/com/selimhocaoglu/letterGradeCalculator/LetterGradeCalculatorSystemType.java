package com.selimhocaoglu.letterGradeCalculator;

public enum LetterGradeCalculatorSystemType {
    DOUBLE_LETTER {
        @Override
        public LetterGradeCalculatorStrategy getCalculatorStrategy() {
            return new LetterGradeCalculatorToDoubleLetterSystem();
        }
    },
    SINGLE_LETTER {
        @Override
        public LetterGradeCalculatorStrategy getCalculatorStrategy() {
            return new LetterGradeCalculatorToOneLetterSystem();
        }
    };

    public abstract LetterGradeCalculatorStrategy getCalculatorStrategy();
}
