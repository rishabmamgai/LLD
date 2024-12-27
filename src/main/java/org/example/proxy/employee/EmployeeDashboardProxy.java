package org.example.proxy.employee;

import org.example.proxy.ClientType;

import java.util.ArrayList;


public class EmployeeDashboardProxy implements Dashboard {
    private final EmployeeDashboard employeeDashboard = new EmployeeDashboard(new ArrayList<>());

    @Override
    public boolean createUser(ClientType client, Employee employee) throws Exception {
        if (client == ClientType.ADMIN) {
            return employeeDashboard.createUser(client, employee);
        }

        throw new Exception("Permission denied to add user.");
    }

    @Override
    public Employee getUser(ClientType client, String id) throws Exception {
        if (client == ClientType.USER || client == ClientType.ADMIN) {
            return employeeDashboard.getUser(client, id);
        }

        throw new Exception("Permission denied to get user.");
    }

    @Override
    public boolean deleteUser(ClientType client,  String id) throws Exception {
        if (client == ClientType.ADMIN) {
            return employeeDashboard.deleteUser(client, id);
        }

        throw new Exception("Permission denied to delete user.");
    }
}
