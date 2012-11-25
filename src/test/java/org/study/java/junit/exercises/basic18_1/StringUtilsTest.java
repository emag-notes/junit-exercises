package org.study.java.junit.exercises.basic18_1;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilsTest {

    @Test
    public void toSnakeCas_aaaはaaaを返す() throws Exception {
        // SetUp
        StringUtils sut = new StringUtils();
        // Exercise
        // Verify
        assertThat(sut.toSnakeCase("aaa"), is("aaa"));
    }
}
