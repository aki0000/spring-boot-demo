package com.example.demo.repository;

import static org.assertj.core.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.JdbcTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.jdbc.Sql;

import com.example.demo.entity.Employee;

@JdbcTest
@Sql("JdbcEmployeeRepositoryTest.sql")
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class JdbcEmployeeRepositoryTest {

    @Autowired
    JdbcTemplate jdbcTemplate;

    EmployeeRepository employeeRepository;

    @BeforeEach
    void SetUp() {
        employeeRepository = new JdbcEmployeeRepository(jdbcTemplate);
    }

    @Test
    void test_selectByEmployeeId() {
        Employee employee = employeeRepository.selectByEmployeeId("00001");
        assertThat(employee.getEmployeeId()).isEqualTo("00001");
        assertThat(employee.getEmployeeName()).isEqualTo("TEST TARO");
    }

    @Test
    void test_selectAll() {
        List<Employee> employee = employeeRepository.selectAll();
        assertThat(employee.size()).isEqualTo(3);
    }
}
