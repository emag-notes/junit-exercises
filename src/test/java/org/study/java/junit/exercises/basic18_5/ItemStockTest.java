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
        Item itemA100;
        
        @Before
        public void setUp() throws Exception {
            sut = new ItemStock();
            itemA100 = new Item("A", 100);
        }
        
        @Test
        public void getNum_itemA100は0を返す() throws Exception {
            // Exercise
            // Verify
            assertThat(sut.getNum(itemA100), is(0));
        }
        
        @Test
        public void add_itemA100の実行後はgetNum_itemA100は1を返す() throws Exception {
            // Exercise
            sut.add(itemA100);
            // Verify
            assertThat(sut.getNum(itemA100), is(1));
        }
        
    }
    
    public static class ItemA100が1つ追加された状態 {
        
        ItemStock sut;
        Item itemA100;
        
        @Before
        public void setUp() throws Exception {
            sut = new ItemStock();
            itemA100 = new Item("A", 100);
            sut.add(itemA100);
        }
        
        @Test
        public void getNum_itemA100は1を返す() throws Exception {
            // Exercise
            // Verify
            assertThat(sut.getNum(itemA100), is(1));
        }
        
        @Test
        public void add_itemA100の実行後はgetNum_itemA100は2を返す() throws Exception {
            // Exercise
            sut.add(itemA100);
            // Verify
            assertThat(sut.getNum(itemA100), is(2));
        }
        
        @Test
        public void add_itemB200の実行後はgetNum_itemB200は1を返す() throws Exception {
            // SetUp
            Item itemB200 = new Item("B", 200);
            // Exercise
            sut.add(itemB200);
            // Verify
            assertThat(sut.getNum(itemB200), is(1));
        }
        
        @Test
        public void add_itemA200の実行後はget_itemAは2を返す() throws Exception {
            // SetUp
            Item itemA200 = new Item("A", 200);
            // Exercise
            sut.add(itemA200);
            // Verify
            assertThat(sut.getNum(itemA100), is(2));
        }
        
        @Test
        public void add_itemB200の実行後はgetNum_itemA100とgetNum_itemB200はそれぞれ1を返す() throws Exception {
            // SetUp
            Item itemB200 = new Item("B", 200);
            // Exercise
            sut.add(itemB200);
            // Verify
            assertThat(sut.getNum(itemA100), is(1));
            assertThat(sut.getNum(itemB200), is(1));
        }
    }
}
