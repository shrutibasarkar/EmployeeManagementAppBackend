package com.shruti.employeemanagementapp.dao;

import com.shruti.employeemanagementapp.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeDao extends JpaRepository<Employee,Long> {

}
