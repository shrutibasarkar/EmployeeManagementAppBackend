package com.shruti.employeemanagementapp.controller;

import com.shruti.employeemanagementapp.dao.EmployeeDao;
import com.shruti.employeemanagementapp.entities.Employee;
import com.shruti.employeemanagementapp.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private EmployeeDao employeeDao;

    //get list of employees
    @GetMapping("/employees")
    public List<Employee> getEmployees(){
        return this.employeeService.getEmployees();
    }

    //get single employee
    @GetMapping("/employees/{emp_id}")
    public Employee getEmployee(@PathVariable String emp_id){
        return this.employeeService.getEmployee(Long.parseLong(emp_id));
    }

    //add employees
    @PostMapping("/employees")
    public  Employee addEmployee(@RequestBody Employee employee){
        return this.employeeService.addEmployee(employee);
    }

    //update employee
    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee e){
        return this.employeeService.updateEmployee(e);
    }



    //delete course
    @DeleteMapping("/employees/{emp_id}")
    public ResponseEntity<HttpStatus> deleteEmployee(@PathVariable String emp_id){
        try{
            this.employeeService.deleteEmployee(Long.parseLong(emp_id));
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception e)
        {
            return  new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
