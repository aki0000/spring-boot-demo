package com.example.demo.controller;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.example.demo.controller.ListController;
import com.example.demo.service.EmployeeServiceImpl;
import com.fasterxml.jackson.databind.deser.DataFormatReaders.Match;

@WebMvcTest(ListController.class)
class ListControllerTest {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    EmployeeServiceImpl employeeService;

    @Test
    void test_displayList() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/list/display-list"))
        .andExpect(MockMvcResultMatchers.status().isOk())
        .andExpect(MockMvcResultMatchers.view().name("displayList"))
        .andExpect(MockMvcResultMatchers.content().string(Matchers.containsString("従業員一覧")))
        ;
    }
}
