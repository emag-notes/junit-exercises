package org.study.java.junit.exercises.basic18_1;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilsTest {

    @Test
    public void toSnakeCase_aaaはaaaを返す() throws Exception {
        assertThat(StringUtils.toSnakeCase("aaa"), is("aaa"));
    }
    
    @Test
    public void toSnakeCase_HelloWorldはhello_worldを返す() throws Exception {
        assertThat(StringUtils.toSnakeCase("HelloWorld"), is("hello_world"));
    }

    @Test
    public void toSnakeCase_practiceJunitはpractice_junitを返す() throws Exception {
        assertThat(StringUtils.toSnakeCase("practiceJunit"), is("practice_junit"));
    }
    
    @Test
    public void toSnakeCase_nullはnullを返す() throws Exception {
        assertThat(StringUtils.toSnakeCase(null), is(nullValue()));
    }
}
