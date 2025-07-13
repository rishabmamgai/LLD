package org.example.iterator;

import lombok.AllArgsConstructor;

import java.util.Iterator;
import java.util.List;


@AllArgsConstructor
public class Company implements Aggregate {
    private final List<Employee> employees;

    @Override
    public Iterator<Employee> createIterator() {
        return new EmployeeIterator(employees);
    }
}
