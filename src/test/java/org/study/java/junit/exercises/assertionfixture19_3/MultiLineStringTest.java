package org.study.java.junit.exercises.assertionfixture19_3;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class MultiLineStringTest {

    @Test
    public void joinで文字列が連結される() throws Exception {
        // SetUp
        // Exercise
        // Verify
        assertThat(MultiLineString.join("Hello", "World"), is("Hello\nWorld"));
    }
}
