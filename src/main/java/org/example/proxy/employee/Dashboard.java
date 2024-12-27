package org.example.proxy.employee;


import org.example.proxy.ClientType;

public interface Dashboard {
    boolean createUser(ClientType client, Employee employee) throws Exception;
    Employee getUser(ClientType client, String id) throws Exception;
    boolean deleteUser(ClientType client, String id) throws Exception;
}
