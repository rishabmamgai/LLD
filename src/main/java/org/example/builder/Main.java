package org.example.builder;


public class Main {
    public static void main(String[] args) {
        EmployeeBuilder employeeBuilder = new EmployeeBuilder();

        Employee employee = employeeBuilder
                .setFirstName("Rishab")
                .setLastName("Mamgai")
                .setEmployeeId("EMP-1")
                .build();

        System.out.println(employee.toString());
    }
}
