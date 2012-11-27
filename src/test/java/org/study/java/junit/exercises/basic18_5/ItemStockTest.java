package org.study.java.junit.exercises.basic18_5;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

@RunWith(Enclosed.class)
public class ItemStockTest {

    public static class 初期状態 {
        ItemStock sut;
        
        @Before
        public void setUp() throws Exception {
            sut = new ItemStock();
        }
        
        @Test
        public void getNumは0を() throws Exception {
            // SetUp
            Item item = new Item("A", 100);
            // Exercise
            // Verify
            assertThat(sut.getNum(item), is(0));
        }
        
    }
    
    public static class Itemが1つ追加された状態 {
        
    }
}
