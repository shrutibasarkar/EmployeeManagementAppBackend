package com.shruti.employeemanagementapp.services;

import com.shruti.employeemanagementapp.entities.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> getEmployees();

    public  Employee getEmployee(long emp_id);

    public Employee addEmployee(Employee employee);

    public Employee updateEmployee(Employee employee);

    void deleteEmployee(long parseLong);
}
