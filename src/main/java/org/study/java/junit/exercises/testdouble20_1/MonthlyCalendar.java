package org.study.java.junit.exercises.testdouble20_1;

import java.util.Calendar;

public class MonthlyCalendar {

    private final Calendar cal_;
    
    public MonthlyCalendar() {
        this(Calendar.getInstance());
    }
    
    public MonthlyCalendar(Calendar cal) {
        // Calendar#clone はオーバーライドされている
        cal_ = (Calendar) cal.clone();
    }

    public int getRemainingDays() {
        return cal_.getActualMaximum(Calendar.DATE) - cal_.get(Calendar.DATE);
    }

}
