package org.study.java.junit.exercises.testdouble20_1;

import java.util.Calendar;

public class MonthlyCalendar {

    private final Calendar cal_;
    
    public MonthlyCalendar() {
        this(Calendar.getInstance());
    }
    
    // このコンストラクタは UT 要のためパッケージプライベート
    MonthlyCalendar(Calendar cal) {
        cal_ = cal;
    }

    public int getRemainingDays() {
        return cal_.getActualMaximum(Calendar.DATE) - cal_.get(Calendar.DATE);
    }

}
