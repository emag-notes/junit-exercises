package org.study.java.junit.exercises.basic18_4;

public class NumberUtils {

    /**
     * 引数が2で割りきれる場合にtrueを返す
     * @param num int型整数
     * @return 引数が2で割りきれるかどうかの真偽値
     */
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

}
