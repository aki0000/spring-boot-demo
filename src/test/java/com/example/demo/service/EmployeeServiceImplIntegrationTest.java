package com.example.demo.service;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Employee;

@Sql("EmployeeServiceImplIntegrationTest.sql")
@SpringBootTest(webEnvironment = WebEnvironment.NONE)
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Transactional
class EmployeeServiceImplIntegrationTest {

    @Autowired
    EmployeeServiceImpl employeeService;

    @Test
    void test_findById() {
        Employee employee = employeeService.findById("00005");
        assertThat(employee.getEmployeeName()).isEqualTo("TEST GORO");
    }

    @Test
    void test_findAll() {
        List<Employee> employees = employeeService.findAll();
        assertThat(employees.size()).isEqualTo(1);
    }
}
