package com.anurag.spring.EmployeeManagement.controller;

import com.anurag.spring.EmployeeManagement.dao.EmployeeDAO;
import com.anurag.spring.EmployeeManagement.entity.Employee;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//@AllArgsConstructor
@RequestMapping("/api")
public class EmployeeRestController {

    //quick and dirty: inject employee dao
    private EmployeeDAO employeeDAO;

    @Autowired
    public EmployeeRestController(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    //Expose "/employees" and return the list of employees
    @GetMapping("/employees")
    public List<Employee> findAll(){

        return employeeDAO.findAll();
    }
}
