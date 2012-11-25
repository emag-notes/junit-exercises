package org.study.java.junit.exercises.basic18_1;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilsTest {

    @Test
    public void toSnakeCase_aaaはaaaを返す() throws Exception {
        // SetUp
        // Exercise
        // Verify
        assertThat(StringUtils.toSnakeCase("aaa"), is("aaa"));
    }
}
