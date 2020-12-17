package com.shruti.employeemanagementapp.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
    @Id
    private long emp_id;
    private String name;
    private String description;

    public Employee() {
    }

    public Employee(long id, String name, String description) {
        this.emp_id = id;
        this.name = name;
        this.description = description;
    }

    public long getId() {
        return emp_id;
    }

    public void setId(long id) {
        this.emp_id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + emp_id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
