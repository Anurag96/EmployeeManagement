package com.anurag.spring.EmployeeManagement.dao;

import java.util.List;

import javax.persistence.EntityManager;

import com.anurag.spring.EmployeeManagement.entity.Employee;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
public class EmployeeDAOHibernateImpl implements EmployeeDAO {

	// define field for entitymanager	
	private EntityManager entityManager;
		
	// set up constructor injection
	@Autowired
	public EmployeeDAOHibernateImpl(EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}
	
	
	@Override
	public List<Employee> findAll() {

		// get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
		
		// create a query
		Query<Employee> theQuery =
				currentSession.createQuery("from Employee", Employee.class);
		
		// execute query and get result list
		List<Employee> employees = theQuery.getResultList();
		
		// return the results		
		return employees;
	}

	@Override
	public Employee findbyID(int id) {
		// get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);

		// create a query
		Employee employee =
				currentSession.get(Employee.class, id);

		return employee;
	}

	@Override
	public void save(Employee employee) {
		// get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);

		// create a query
		currentSession.saveOrUpdate(employee);

	}

	@Override
	public void deletebyId(int id) {

		// get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);

		// create a query
		Query<Employee> theQuery =
				currentSession.createQuery("delete from Employee where id=:employeeId");
		theQuery.setParameter("employeeId", id);
		theQuery.executeUpdate();

	}

}







