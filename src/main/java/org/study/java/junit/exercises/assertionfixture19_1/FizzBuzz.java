package org.study.java.junit.exercises.assertionfixture19_1;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public static List<String> createFizzBuzzList(int num) {
        List<String> fizzBuzzList = new ArrayList<String>();
        fizzBuzzList.add("1");
        fizzBuzzList.add("2");
        fizzBuzzList.add("Fizz");
        fizzBuzzList.add("4");
        fizzBuzzList.add("Buzz");
        fizzBuzzList.add("Fizz");
        fizzBuzzList.add("7");
        fizzBuzzList.add("8");
        fizzBuzzList.add("Fizz");
        fizzBuzzList.add("Buzz");
        fizzBuzzList.add("11");
        fizzBuzzList.add("Fizz");
        fizzBuzzList.add("13");
        fizzBuzzList.add("14");
        fizzBuzzList.add("FizzBuzz");
        fizzBuzzList.add("16");
        return fizzBuzzList;
    }

}
