package com.thoughtworks.tddintro.exercises.factorial;

public class Factorial {
    public Integer compute(int value) {
        if (value < 0) {
            throw new IllegalArgumentException();
        }

        int factorial = 1;
        for (int i = 1; i <= value; i++) {
            factorial = factorial*i;
        }
        return factorial;
    }
}
