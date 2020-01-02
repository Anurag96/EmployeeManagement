Version 4: Use of Spring Data REST + Spring Data JPA

Spring Data REST will expose these  below endpoint for free.
It will scan your project for JpaRepository.
Exposes REST APIs for each entity type for JpaRepository.

By default, Spring Data REST will create endpoint based on entity type.
Simple pluralized form
-First character of entity is lowercase
-Then just adds an "s" to the entity.

public interface EmployeeRepository extends JpaRepository<Employee,Integer>
Employee => employees 

URLs:
 GET : http://localhost:8080/emp-mgmt/employees
 GET by ID : http://localhost:8080/emp-mgmt/employees/6
 POST : http://localhost:8080/emp-mgmt/employees
 PUT : http://localhost:8080/emp-mgmt/employees
 DELETE : http://localhost:8080/emp-mgmt/employees/6
 