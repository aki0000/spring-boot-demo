package com.example.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

/**
 * ログイン画面を管理するためのコントローラ
 * @author akhino
 *
 */

@Controller
public class LoginController {

	private final EmployeeService employeeService;

	public LoginController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	@RequestMapping(value = "/login")
	public String index() {
		List<Employee> employeeList = employeeService.findAll();
		return "login";
	}
}
