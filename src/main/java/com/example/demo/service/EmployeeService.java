package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Employee;

public interface EmployeeService {
    List<Employee> findAll();

    Employee findById(String employeeId);
}