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
        Item item;
        
        @Before
        public void setUp() throws Exception {
            sut = new ItemStock();
            item = new Item("A", 100);
        }
        
        @Test
        public void getNumは0を返す() throws Exception {
            // Exercise
            // Verify
            assertThat(sut.getNum(item), is(0));
        }
        
        @Test
        public void addでItemを追加するとgetNumは1を返す() throws Exception {
            // Exercise
            sut.add(item);
            // Verify
            assertThat(sut.getNum(item), is(1));
        }
        
    }
    
    public static class Itemが1つ追加された状態 {
        
    }
}
