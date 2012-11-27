package org.study.java.junit.exercises.basic18_5;

import java.util.HashMap;
import java.util.Map;

public class ItemStock {

    private Map<String, Integer> cart_ = new HashMap<String, Integer>();
    
    public int getNum(Item item) {
        Integer itemNum = cart_.get(item.name);
        return itemNum != null ? itemNum.intValue() : 0;
    }

    public void add(Item item) {
        if (getNum(item) == 0) {
            cart_.put(item.name, Integer.valueOf(1));
        } else {
            cart_.put(item.name, getNum(item)+1);
        }
    }

}
