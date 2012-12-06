package org.study.java.junit.exercises.assertionfixture19_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Employee {

    private final String firstName;
    private final String lastName;
    private final String email;
    
    public Employee(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
    
    public static List<Employee> load(InputStream input) {
        List<Employee> employees = new ArrayList<Employee>();
        BufferedReader reader = null;
        
        try {
            
            reader = new BufferedReader(new InputStreamReader(input));
            while (true) {
                String line = reader.readLine();
                if (line == null) break;
                String[] values = line.split(",");
                Employee employee = new Employee(values[0], values[1], values[2]);
                employees.add(employee);
            }
            return employees;
            
        } catch (IOException e) {
          throw new RuntimeException(e);  
        } finally {
            if (reader != null) {
                try { reader.close(); }
                catch (IOException e) { /* do nothing */ }
            }
        }
        
    }
    
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getEmail() {
        return email;
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result
                + ((firstName == null) ? 0 : firstName.hashCode());
        result = prime * result
                + ((lastName == null) ? 0 : lastName.hashCode());
        return result;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;
        if (firstName == null) {
            if (other.firstName != null)
                return false;
        } else if (!firstName.equals(other.firstName))
            return false;
        if (lastName == null) {
            if (other.lastName != null)
                return false;
        } else if (!lastName.equals(other.lastName))
            return false;
        return true;
    }
    
    @Override
    public String toString() {
        return "Employee [firstName=" + firstName + ", lastName=" + lastName
                + ", email=" + email + "]";
    }

}
