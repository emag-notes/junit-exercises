package org.study.java.junit.exercises.basic18_2;

public class Calculator {

    public static int divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("divisor must not be zero!");
        }
        return dividend / divisor;
    }

}
