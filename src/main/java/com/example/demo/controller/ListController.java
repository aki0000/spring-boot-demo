package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.service.EmployeeService;

@Controller
@RequestMapping("/list")
public class ListController {

    private final EmployeeService employeeService;

    public ListController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

	@GetMapping("/display-list")
	public String displayList(Model model) {
        model.addAttribute("employeeList", employeeService.findAll());
		return "displayList";
	}
}
