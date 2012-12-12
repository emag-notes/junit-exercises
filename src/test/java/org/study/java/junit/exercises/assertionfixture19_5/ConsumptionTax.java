package org.study.java.junit.exercises.assertionfixture19_5;

public class ConsumptionTax {

    private final int taxRate_;
    
    public ConsumptionTax(int taxRate) {
        taxRate_ = taxRate;
    }

    public int apply(int price) {
        return price + (price * taxRate_ / 100);
    }

}
