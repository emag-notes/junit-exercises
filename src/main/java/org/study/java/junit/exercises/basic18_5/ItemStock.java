package org.study.java.junit.exercises.basic18_5;

import java.util.HashMap;
import java.util.Map;

public class ItemStock {

    /**
     * 商品がストックされた個数を格納する、商品名=個数のMap。
     */
    private Map<String, Integer> cart_ = new HashMap<String, Integer>();
    
    /**
     * 商品がストックされている個数を返す。
     * @param item 
     * @return
     */
    public int getNum(Item item) {
        Integer itemNum = cart_.get(item.name);
        return itemNum != null ? itemNum.intValue() : 0;
    }

    /**
     * <p>
     * 商品をカート(cart_)にストックする。<br/>
     * 同じ商品名(name)を持つものがストックされると、カウントが1増える(ユニーク値：商品名)。<br/>
     * </p>
     * 
     * @param item ストックする商品
     */
    public void add(Item item) {
        if (getNum(item) == 0) {
            cart_.put(item.name, Integer.valueOf(1));
        } else {
            cart_.put(item.name, getNum(item)+1);
        }
    }

}
