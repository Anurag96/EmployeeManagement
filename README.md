Version 1: Use of EntityManager but leverage native HIbernate API

 Create/Save new Entity : session.save(..)
 Retrieve entity by id: session.get(..)
 Retrieve list of entities : session.createQuery(..)
 Save or update entity: session.saveorUpdate(..)
 Delete entity : session.delete(..)
 
URLs:
 GET : http://localhost:8080/api/employees
 GET by ID : http://localhost:8080/api/employees/6
 POST : http://localhost:8080/api/employees
 PUT : http://localhost:8080/api/employees
 DELETE : http://localhost:8080/api/employees/6
 

 
 