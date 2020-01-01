package com.anurag.spring.EmployeeManagement.dao;

import com.anurag.spring.EmployeeManagement.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
