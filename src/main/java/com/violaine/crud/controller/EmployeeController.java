package com.violaine.crud.controller;

import com.violaine.crud.entity.Employee;
import com.violaine.crud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @PostMapping("/save/employee")
    public Employee saveEmployee(@RequestBody Employee employee){
    return employeeService.saveEmployee(employee);

    }
}
