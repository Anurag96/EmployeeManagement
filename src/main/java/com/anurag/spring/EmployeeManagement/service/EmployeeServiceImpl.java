package com.anurag.spring.EmployeeManagement.service;

import com.anurag.spring.EmployeeManagement.dao.EmployeeDAO;
import com.anurag.spring.EmployeeManagement.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

   private EmployeeDAO employeeDAO;

   @Autowired
    public EmployeeServiceImpl(@Qualifier("employeeDAOJpaImpl") EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @Override
    @Transactional
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }

    @Override
    @Transactional
    public Employee findbyID(int id) {
        return employeeDAO.findbyID(id);
    }

    @Override
    @Transactional
    public void save(Employee employee) {
       employeeDAO.save(employee);
    }

    @Override
    @Transactional
    public void deletebyId(int id) {
        employeeDAO.deletebyId(id);
    }
}
