package org.example.structural.proxy;

import org.example.structural.proxy.employee.Dashboard;
import org.example.structural.proxy.employee.Employee;
import org.example.structural.proxy.employee.EmployeeDashboardProxy;


public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Rishab", "Emp1");
        Employee employee2 = new Employee("Harsh", "Emp2");

        Dashboard dashboard = new EmployeeDashboardProxy();
        try {
            dashboard.createUser(ClientType.ADMIN, employee1);
            dashboard.createUser(ClientType.ADMIN, employee2);

            dashboard.getUser(ClientType.USER, employee1.getEmployeeId());
            dashboard.deleteUser(ClientType.USER, employee2.getEmployeeId());
        }
        catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}
