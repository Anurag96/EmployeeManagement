Version 2: Use of EntityManager and standard JPA API 

 Create/Save new Entity : entityManager.persist(..)
 Retrieve entity by id: entityManager.find(..)
 Retrieve list of entities : entityManager.createQuery(..)
 Save or update entity: entityManager.merge(..)
 Delete entity : session.remove(..)
 
URLs:
 GET : http://localhost:8080/api/employees
 GET by ID : http://localhost:8080/api/employees/6
 POST : http://localhost:8080/api/employees
 PUT : http://localhost:8080/api/employees
 DELETE : http://localhost:8080/api/employees/6
 

 
 