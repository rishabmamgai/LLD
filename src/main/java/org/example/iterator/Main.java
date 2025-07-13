package org.example.iterator;

import java.util.Iterator;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Rishab", "Mamgai", 20000.00),
                new Employee("Harsh", "Mamgai", 30000.00),
                new Employee("Hardik", "Mamgai", 40000.00)
        );

        Company company = new Company(employees);
        Iterator<Employee> iterator = company.createIterator();

        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            System.out.println(employee.getFirstName() + " " + employee.getLastName());
        }
    }
}
