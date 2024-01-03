package com.example.demo.repository;

import java.util.List;

import com.example.demo.entity.Employee;

public interface EmployeeRepository {
    Employee selectByEmployeeId(String employeeId);

    List<Employee> selectAll();
}
