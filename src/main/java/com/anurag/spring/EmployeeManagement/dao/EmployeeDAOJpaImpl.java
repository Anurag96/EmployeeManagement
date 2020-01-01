package com.anurag.spring.EmployeeManagement.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.anurag.spring.EmployeeManagement.entity.Employee;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
public class EmployeeDAOJpaImpl implements EmployeeDAO {

	// define field for entitymanager	
	private EntityManager entityManager;
		
	// set up constructor injection
	@Autowired
	public EmployeeDAOJpaImpl(EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}
	
	
	@Override
	public List<Employee> findAll() {

				// create a query
		TypedQuery<Employee> theQuery = entityManager.createQuery("from Employee", Employee.class);
		
		// execute query and get result list
		List<Employee> employees = theQuery.getResultList();
		
		// return the results		
		return employees;
	}

	@Override
	public Employee findbyID(int id) {
				// create a query
		Employee employee =
				entityManager.find(Employee.class, id);

		return employee;
	}

	@Override
	public void save(Employee employee) {
		// save or update the employee, if id==0, then save/insert else update
		Employee employeeDB = entityManager.merge(employee);
		//update with id from db.. so we can get generated id for save/insert
		employee.setId(employeeDB.getId());
	}


	@Override
	public void deletebyId(int id) {
		// create a query
		Query theQuery = entityManager.createQuery("delete from Employee where id=:employeeId");
		theQuery.setParameter("employeeId", id);
		theQuery.executeUpdate();
	}

}







