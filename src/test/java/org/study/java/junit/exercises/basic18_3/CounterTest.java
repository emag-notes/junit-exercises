package org.study.java.junit.exercises.basic18_3;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Before;
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
    
    public static class incrementを1回実行した状態 {
        Counter sut;
        
        @Before
        public void setUp() throws Exception {
            sut = new Counter();
            sut.increment();
        }
        
        @Test
        public void incrementを実行すると2を返す() throws Exception {
            // Exercise
            // Verify
            assertThat(sut.increment(), is(2));
        }
    }
    
    public static class incrementを50回実行した状態 {
        Counter sut;
        
        @Before
        public void setUp() throws Exception {
            sut = new Counter();
            for (int i = 0; i < 50; i++) {
                sut.increment();
            }
        }
        
        @Test
        public void incrementを実行すると51を返す() throws Exception {
            // Exercise
            // Verify
            assertThat(sut.increment(), is(51));
        }
    }
}
