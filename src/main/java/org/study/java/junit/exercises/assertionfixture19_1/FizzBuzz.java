package org.study.java.junit.exercises.assertionfixture19_1;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public static List<String> createFizzBuzzList(int num) {
        List<String> fizzBuzzList = new ArrayList<String>();
        for (int i = 1; i <= num; i++) {
            if (i % 15 == 0) {
                fizzBuzzList.add("FizzBuzz");
            } else if (i % 3 == 0) {
                fizzBuzzList.add("Fizz");
            } else if (i % 5 == 0) {
                fizzBuzzList.add("Buzz");
            } else {
                fizzBuzzList.add(Integer.toString(i));
            }
        }
        return fizzBuzzList;
    }

}
