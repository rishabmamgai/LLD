package org.example.iterator;

import java.util.Iterator;
import java.util.List;


public class EmployeeIterator implements Iterator<Employee> {
    private final List<Employee> employees;
    private int curr = 0;

    public EmployeeIterator(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public boolean hasNext() {
        return curr < employees.size();
    }

    @Override
    public Employee next() {
        return hasNext() ? employees.get(curr++) : null;
    }
}
