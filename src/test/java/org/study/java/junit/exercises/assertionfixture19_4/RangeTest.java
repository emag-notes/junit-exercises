package org.study.java.junit.exercises.assertionfixture19_4;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

@RunWith(Enclosed.class)
public class RangeTest {

    public static class minが0_0でmaxが10_5のとき {
        
        Range sut;
        
        @Before
        public void setUp() throws Exception {
            sut = new Range(0.0, 10.5);
        }
        
        @Test
        public void contains_miunus0_1はfalse() throws Exception {
            assertThat(sut.contains(-0.1), is(false));
        }
        
        @Test
        public void contains_0_0はtrue() throws Exception {
            assertThat(sut.contains(0.0), is(true));
        }
        
        @Test
        public void contains_10_5はtrue() throws Exception {
            assertThat(sut.contains(10.5), is(true));
        }
        
        @Test
        public void contains_10_6はfalse() throws Exception {
            assertThat(sut.contains(10.6), is(false));
        }
    }
    
    public static class minがminus5_1でmaxが5_1のとき {
        
        Range sut;
        
        @Before
        public void setUp() throws Exception {
            sut = new Range(-5.1, 5.1);
        }
        
        @Test
        public void contains_minus5_2はfalse() throws Exception {
            assertThat(sut.contains(-5.2), is(false));
        }
        
        @Test
        public void contains_minus5_1はtrue() throws Exception {
            assertThat(sut.contains(-5.1), is(true));
        }
        
        @Test
        public void contains_5_1はtrue() throws Exception {
            assertThat(sut.contains(5.1), is(true));
        }
        
        @Test
        public void contains_5_2はfalse() throws Exception {
            assertThat(sut.contains(5.2), is(false));
        }
    }
}
