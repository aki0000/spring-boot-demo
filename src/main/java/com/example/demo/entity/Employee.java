package com.example.demo.entity;

import lombok.Data;

@Data
public class Employee {

    private Integer id;
    private String employeeId;
    private String employeeName;
    private String employeePassword;


    public Integer getId() {
        return id;
    }

    public void setId() {
        this.id = id;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId() {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName() {
        this.employeeName = employeeName;
    }

    public String getEmployeePassword() {
        return employeePassword;
    }

    public void setEmployeePassword() {
        this.employeePassword = employeePassword;
    }
}
