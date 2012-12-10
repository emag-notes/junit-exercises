package org.study.java.junit.exercises.assertionfixture19_4;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Enclosed.class)
public class RangeTest {

    @RunWith(Enclosed.class)
    public static class minが0_0でmaxが10_5で {
        
        @RunWith(Theories.class)
        public static class かつ範囲外の場合 {
            
            Range sut;
            
            @Before
            public void setUp() throws Exception {
                sut = new Range(0.0, 10.5);
            }
            
            @DataPoints
            public static double[] VALUES = {-0.1, 10.6};
            
            @Theory
            public void containsはfalseを返す(double value) throws Exception {
                assertThat("value=" + value, sut.contains(value), is(false));
            }
        }
        
        @RunWith(Theories.class)
        public static class かつ範囲の場合 {
            
            Range sut;
            
            @Before
            public void setUp() throws Exception {
                sut = new Range(0.0, 10.5);
            }
            
            @DataPoints
            public static double[] VALUES = {0.0, 10.5};
            
            @Theory
            public void containsはtrueを返す(double value) throws Exception {
                assertThat("value=" + value, sut.contains(value), is(true));
            }
        }
    }
    
    @RunWith(Enclosed.class)
    public static class minがminus5_1でmaxが5_1で {
        
        @RunWith(Theories.class)
        public static class かつ範囲外の場合 {
            
            Range sut;
            
            @Before
            public void setUp() throws Exception {
                sut = new Range(-5.1, 5.1);
            }
            
            @DataPoints
            public static double[] VALUES = {-5.2, 5.2};
            
            @Theory
            public void containsはfalseを返す(double value) throws Exception {
                assertThat("value=" + value, sut.contains(value), is(false));
            }
        }
        
        @RunWith(Theories.class)
        public static class かつ範囲の場合 {
            
            Range sut;
            
            @Before
            public void setUp() throws Exception {
                sut = new Range(-5.1, 5.1);
            }
            
            @DataPoints
            public static double[] VALUES = {-5.1, 5.1};
            
            @Theory
            public void containsはtrueを返す(double value) throws Exception {
                assertThat("value=" + value, sut.contains(value), is(true));
            }
        }
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
