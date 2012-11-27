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
        
        ItemStock sut;
        Item itemA;
        
        @Before
        public void setUp() throws Exception {
            sut = new ItemStock();
            itemA = new Item("A", 100);
            sut.add(itemA);
        }
        
        @Test
        public void add_itemAの実行後はgetNum_itemAは2を返す() throws Exception {
            // Exercise
            sut.add(itemA);
            // Verify
            assertThat(sut.getNum(itemA), is(2));
        }
        
        @Test
        public void add_itemBの実行後はgetNum_itemBは1を返す() throws Exception {
            // SetUp
            Item itemB = new Item("B", 200);
            // Exercise
            sut.add(itemB);
            // Verify
            assertThat(sut.getNum(itemB), is(1));
        }
        
        @Test
        public void nameがAでpriceが200であるitemA200をaddした後はget_itemAは2を返す() throws Exception {
            // SetUp
            Item itemA200 = new Item("A", 200);
            // Exercise
            sut.add(itemA200);
            // Verify
            assertThat(sut.getNum(itemA), is(2));
        }
    }
}
