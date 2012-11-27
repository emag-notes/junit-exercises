package org.study.java.junit.exercises.basic18_4;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class NumberUtilsTest {

    @Test
    public void isEven_10はtrueを返す() throws Exception {
        assertThat(NumberUtils.isEven(10), is(true));
    }
    
    @Test
    public void isEven_7はfalseを返す() throws Exception {
        assertThat(NumberUtils.isEven(7), is(false));
    }
}
