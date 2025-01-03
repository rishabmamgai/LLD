package org.example.builder;

import lombok.Data;


@Data
public class Employee {
    private String firstName;
    private String lastName;
    private String address;
    private String employeeId;
    private String phoneNumber;

    public Employee(EmployeeBuilder employeeBuilder) {
        this.firstName = employeeBuilder.getFirstName();
        this.lastName = employeeBuilder.getLastName();
        this.address = employeeBuilder.getAddress();
        this.employeeId = employeeBuilder.getEmployeeId();
        this.phoneNumber = employeeBuilder.getPhoneNumber();
    }
}
