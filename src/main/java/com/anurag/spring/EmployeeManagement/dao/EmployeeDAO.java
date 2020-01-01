package com.anurag.spring.EmployeeManagement.dao;

import com.anurag.spring.EmployeeManagement.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    public List<Employee> findAll();

    public Employee findbyID(int id);

    public void save(Employee employee);

    public void deletebyId(int id);
}
