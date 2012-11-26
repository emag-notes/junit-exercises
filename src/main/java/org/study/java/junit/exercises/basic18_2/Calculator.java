package org.study.java.junit.exercises.basic18_2;

public class Calculator {

    /**
     * <p>
     * 第1引数を第2匹数で割った値を返す(小数点以下切り捨て)。
     * 第2引数が0の時は {@link IllegalArgumentException} が送出される。
     * </p>
     * @param dividend 被除数
     * @param divisor  除数
     * @return 除算結果
     * @throws IllegalArgumentException
     */
    public static int divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("divisor must not be zero!");
        }
        return dividend / divisor;
    }

}
