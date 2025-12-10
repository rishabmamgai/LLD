package org.example.behavioural.iterator;

import java.util.Iterator;


public interface Aggregate {
    Iterator<Employee> createIterator();
}
