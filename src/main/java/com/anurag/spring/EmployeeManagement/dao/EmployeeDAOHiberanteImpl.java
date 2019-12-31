package com.anurag.spring.EmployeeManagement.dao;

import com.anurag.spring.EmployeeManagement.entity.Employee;
import lombok.AllArgsConstructor;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

import java.util.List;

@Repository
@AllArgsConstructor
public class EmployeeDAOHiberanteImpl implements EmployeeDAO {

    private EntityManager entityManager;

    @Override
    @Transactional  //handles the transaction management, So we don't have to manually start and commit the transaction
    public List<Employee> findAll() {
        //get the current hibernate session
        Session currentSession=entityManager.unwrap(Session.class);

        //create the query
        Query<Employee> query=currentSession.createQuery("from Employee", Employee.class);

        //execute the query and get the result
        List<Employee>employees =query.getResultList();

        //return the results
        return employees;
    }
}
