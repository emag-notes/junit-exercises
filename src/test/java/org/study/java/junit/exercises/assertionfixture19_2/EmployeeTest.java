package org.study.java.junit.exercises.assertionfixture19_2;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import static org.study.java.junit.exercises.assertionfixture19_2.EmployeeMatcher.*;

import java.io.InputStream;
import java.util.List;

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
    
    @Test
    public void loadでEmployeeの一覧を取得できる_カスタムMatcher利用() throws Exception {
        // SetUp
        InputStream input = getClass().getResourceAsStream("Employee.txt");
        Employee expected = new Employee("Ichiro", "Tanaka", "ichiro@example.com");
        // Exercise
        List<Employee> actual = Employee.load(input);
        // Verify
        assertThat(actual, is(notNullValue()));
        assertThat(actual.size(), is(1));
        assertThat(actual.get(0), is(employee(expected)));
    }
    
}
