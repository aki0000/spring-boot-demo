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

    public String getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmployeePassword() {
        return employeePassword;
    }
}
