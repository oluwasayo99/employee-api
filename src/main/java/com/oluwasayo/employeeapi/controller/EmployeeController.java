package com.oluwasayo.employeeapi.controller;


import com.oluwasayo.employeeapi.model.Employee;
import com.oluwasayo.employeeapi.repository.EmployeeRepository;
import com.oluwasayo.employeeapi.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    public final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public List<Employee> findAll() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/{id}")
    public Employee findById(@PathVariable int id) {
        return employeeService.getById(id);
    }

    @PostMapping
    public Employee save(@RequestBody Employee employee) {
        return employeeService.save(employee);
    }
}
