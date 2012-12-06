package org.study.java.junit.exercises.assertionfixture19_2;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.io.InputStream;
import java.util.List;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.junit.Test;

public class EmployeeTest {

    @Test
    public void loadでEmployeeの一覧を取得できる() throws Exception {
        // SetUp
        InputStream input = getClass().getResourceAsStream("Employee.txt");
        // Exercise
        List<Employee> actual = Employee.load(input);
        // Verify
        assertThat(actual, is(notNullValue()));
        assertThat(actual.size(), is(1));
        Employee actualEmployee = actual.get(0);
        assertThat(actualEmployee.getFirstName(), is("Ichiro"));
        assertThat(actualEmployee.getLastName(), is("Tanaka"));
        assertThat(actualEmployee.getEmail(), is("ichiro@example.com"));
    }
    
    static class EmployeeMatcher extends BaseMatcher<Employee> {
        
        private final Employee expected;
        private String field;
        private Object expectedValue;
        private Object actualValue;
        
        public static Matcher<Employee> employee(Employee expected) {
            return new EmployeeMatcher(expected);
        }
        
        EmployeeMatcher(Employee expected) {
            this.expected = expected;
        }
        
        @Override
        public boolean matches(Object actual) {
            if (expected == null) return (actual == null);
            if (!(actual instanceof Employee)) return false;
            Employee other = (Employee) actual;
            if (notEquals(expected.getFirstName(), other.getFirstName())) {
                field = "firstName";
                expectedValue = expected.getFirstName();
                actualValue   = other.getFirstName();
                return false;
            }
            if (notEquals(expected.getLastName(), other.getLastName())) {
                field = "lastName";
                expectedValue = expected.getLastName();
                actualValue   = other.getLastName();
                return false;
            }
            if (notEquals(expected.getEmail(), other.getEmail())) {
                field = "email";
                expectedValue = expected.getEmail();
                actualValue   = other.getEmail();
                return false;
            }
            return true;
        }

        private boolean notEquals(Object obj, Object other) {
            if (obj == null) return other != null;
            return !obj.equals(other);
        }

        @Override
        public void describeTo(Description desc) {
            if (expected == null || field == null) {
                desc.appendValue(expected);
            } else {
                desc.appendText(field + " is ").appendValue(expectedValue)
                    .appendText(", but ").appendValue(actualValue);
            }
            
        }
    }
}
