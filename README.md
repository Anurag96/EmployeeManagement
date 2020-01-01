Version 3: Use of Spring Data JPA

Spring Dta JPA provides the interface : JPA repository.
Exposes methods (some by inheritance from parents)
-findAll(..)
-findbyId(..)
-save(..)
etc..etc..

Just Plugin the following:
Entity type : Employee and Primary key : Integer

Extend the JpaRepository interface.
Use your repository in your app.
No need of the implementation class.
 
URLs:
 GET : http://localhost:8080/api/employees
 GET by ID : http://localhost:8080/api/employees/6
 POST : http://localhost:8080/api/employees
 PUT : http://localhost:8080/api/employees
 DELETE : http://localhost:8080/api/employees/6
 

 
 