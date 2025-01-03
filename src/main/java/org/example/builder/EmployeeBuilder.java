package org.example.builder;

import lombok.Getter;


@Getter
public class EmployeeBuilder {
    private String firstName;
    private String lastName;
    private String address;
    private String employeeId;
    private String phoneNumber;

    public EmployeeBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public EmployeeBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public EmployeeBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public EmployeeBuilder setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
        return this;
    }

    public EmployeeBuilder setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public Employee build() {
        return new Employee(this);
    }
}
