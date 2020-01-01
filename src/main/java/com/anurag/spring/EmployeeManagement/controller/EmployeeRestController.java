package com.anurag.spring.EmployeeManagement.controller;

import com.anurag.spring.EmployeeManagement.dao.EmployeeDAO;
import com.anurag.spring.EmployeeManagement.entity.Employee;
import com.anurag.spring.EmployeeManagement.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@AllArgsConstructor
@RequestMapping("/api")
public class EmployeeRestController {

     private EmployeeService employeeService;

    @Autowired
    public EmployeeRestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    //Expose "/employees" and return the list of employees
    @GetMapping("/employees")
    public List<Employee> findAll(){

        return employeeService.findAll();
    }

    //Expose "/employees" and return the list of employees
    @GetMapping("/employees/{employeeId}")
    public Employee findbyId(@PathVariable int employeeId){

        Employee employee= employeeService.findbyID(employeeId);
        if(employee==null){
            throw new RuntimeException("Employee Id is not found "+ employee);
        }
        return employee;
    }

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee){  //We know that employee data is comes in request body as JSON, we need to handle bindind that JSON over to our given object.
    employee.setId(0);
    employeeService.save(employee);
    return  employee;
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee){
        employeeService.save(employee);
        return employee;
    }

    @DeleteMapping("/employees/{employeeId}")
    public String deleteEmployee(@PathVariable int employeeId){

        Employee tempEmployyee=employeeService.findbyID(employeeId);

        if(tempEmployyee==null){
            throw new RuntimeException("Employee id not found : "+ employeeId);
        }
        employeeService.deletebyId(employeeId);
        return "Deleted employee id : "+employeeId;
    }

}
