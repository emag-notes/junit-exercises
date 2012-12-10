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
    }
}
