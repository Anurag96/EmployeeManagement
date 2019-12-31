package com.anurag.spring.EmployeeManagement.dao;

import com.anurag.spring.EmployeeManagement.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    public List<Employee> findAll();
}
