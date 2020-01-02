package com.anurag.spring.EmployeeManagement.dao;

import com.anurag.spring.EmployeeManagement.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "employees") //explicitly exposing this rest repository and changing the name of end-point.
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
