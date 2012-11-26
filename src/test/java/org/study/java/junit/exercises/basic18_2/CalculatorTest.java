package org.study.java.junit.exercises.basic18_2;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

    @Test
    public void divide_4_2は2を返す() throws Exception {
        assertThat(Calculator.divide(4, 2), is(2));
    }
    
    @Test
    public void divide_3_2は1を返す() throws Exception {
        assertThat(Calculator.divide(3, 2), is(1));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void divideの第2引数にゼロを指定するとIllegalArugumentExceptionを送出する() throws Exception {
        Calculator.divide(5, 0);
    }
}
