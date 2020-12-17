package com.shruti.employeemanagementapp.services;

import com.shruti.employeemanagementapp.dao.EmployeeDao;
import com.shruti.employeemanagementapp.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public List<Employee> getEmployees() {

        return employeeDao.findAll();
    }

    @Override
    public Employee getEmployee(long emp_id) {
        return employeeDao.getOne(emp_id);
    }

    @Override
    public Employee addEmployee(Employee employee) {
        employeeDao.save(employee);
        return employee ;
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        employeeDao.save(employee);
        return employee;
    }


    @Override
    public void deleteEmployee(long parseLong) {
        employeeDao.delete( employeeDao.getOne(parseLong));
    }


}
