package com.example.demo.repository;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.DataClassRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Employee;

@Repository
public class JdbcEmployeeRepository implements EmployeeRepository {

    @Autowired
    private final JdbcTemplate jdbctemplate;

    public JdbcEmployeeRepository(JdbcTemplate jdbcTemplate) {
        this.jdbctemplate = jdbcTemplate;
    }

    @Override
    public Employee selectByEmployeeId(String employeeId) {
        Employee employee = jdbctemplate.queryForObject("SELECT * FROM employees WHERE employee_id = ?",
        new DataClassRowMapper<>(Employee.class),
        employeeId);
        return employee;
    }

    @Override
    public List<Employee> selectAll() {
        return jdbctemplate.query("SELECT * FROM employees",
        new DataClassRowMapper<>(Employee.class));
    }
}
