package org.example.iterator;

import java.util.Iterator;


public interface Aggregate {
    Iterator<Employee> createIterator();
}
