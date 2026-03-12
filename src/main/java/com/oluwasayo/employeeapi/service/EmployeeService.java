package com.oluwasayo.employeeapi.service;


import com.oluwasayo.employeeapi.model.Employee;
import com.oluwasayo.employeeapi.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }


    public List<Employee> getAllEmployees() {
       return employeeRepository.findAll();
    }

    public Employee getById(Integer id) {
        return employeeRepository.getReferenceById(id);
    }

    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }



}
