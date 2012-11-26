package org.study.java.junit.exercises.basic18_2;

public class Calculator {

    public static int divide(int x, int y) {
        if (y == 0) {
            throw new IllegalArgumentException("divisor must not be zero!");
        }
        return x / y;
    }

}
