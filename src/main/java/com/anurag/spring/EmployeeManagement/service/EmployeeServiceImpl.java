package com.anurag.spring.EmployeeManagement.service;

import com.anurag.spring.EmployeeManagement.dao.EmployeeRepository;
import com.anurag.spring.EmployeeManagement.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

   private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findbyID(int id) {
        //Optional : Different pattern instead of having to check for nulls
        Optional<Employee> result = employeeRepository.findById(id);
        Employee theemployee=null;
        if(result.isPresent())
        {
            theemployee=result.get();
        }
        else{
            throw new RuntimeException("Didn't find employee id");
        }
        return theemployee;
    }

    @Override
    public void save(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public void deletebyId(int id) {

        employeeRepository.deleteById(id);
    }
}
