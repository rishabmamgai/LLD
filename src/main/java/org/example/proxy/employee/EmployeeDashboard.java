package org.example.proxy.employee;

import lombok.AllArgsConstructor;
import org.example.proxy.ClientType;

import java.util.List;
import java.util.Objects;


@AllArgsConstructor
public class EmployeeDashboard implements Dashboard {
    private List<Employee> employees;

    @Override
    public boolean createUser(ClientType client, Employee employee) {
        System.out.println("Creating user with employee Id : " + employee.getEmployeeId());
        return employees.add(employee);
    }

    @Override
    public Employee getUser(ClientType client, String id) {
        System.out.println("Fetching user with employee Id : " + id);
        return employees.stream()
                .filter(employee -> Objects.equals(employee.getEmployeeId(), id))
                .findFirst().orElse(null);
    }

    @Override
    public boolean deleteUser(ClientType client, String id) {
        System.out.println("Deleting user with employee Id : " + id);
        return employees.removeIf(employee -> Objects.equals(employee.getEmployeeId(), id));
    }
}
