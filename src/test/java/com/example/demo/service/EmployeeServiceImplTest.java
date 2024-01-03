package com.example.demo.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.doReturn;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;

@ExtendWith(MockitoExtension.class)
class EmployeeServiceImplTest {

    @InjectMocks
    EmployeeServiceImpl employeeService;

    @Mock
    EmployeeRepository employeeRepository;

    @Test
    void test_findById() {
        Employee employee = new Employee();
        employee.setEmployeeName("TEST TARO");
        doReturn(employee).when(employeeRepository).selectByEmployeeId("0001");

        Employee actual = employeeService.findById("0001");
        assertThat(actual.getEmployeeName()).isEqualTo("TEST TARO");
    }

    @Test
    void test_findByAll() {
        List<Employee> employees = new ArrayList<>();

        Employee employee1 = new Employee();
        employee1.setEmployeeName("TEST TARO");
        employees.add(employee1);

        Employee employee2 = new Employee();
        employee2.setEmployeeName("TEST JIRO");
        employees.add(employee2);

        Employee employee3 = new Employee();
        employee3.setEmployeeName("TEST SABURO");
        employees.add(employee3);

        doReturn(employees).when(employeeRepository).selectAll();

        List<Employee> actuals = employeeService.findAll();
        assertThat(actuals.size()).isEqualTo(3);
    }
}
