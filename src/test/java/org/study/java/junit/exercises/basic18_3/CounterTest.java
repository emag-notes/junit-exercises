package org.study.java.junit.exercises.basic18_3;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

@RunWith(Enclosed.class)
public class CounterTest {

    public static class 初期状態 {
        @Test
        public void incrementを実行すると1を返す() throws Exception {
            // SetUp
            Counter sut = new Counter();
            // Exercise
            // Verify
            assertThat(sut.increment(), is(1));
        }
    }
}
