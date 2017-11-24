package com.isquarebsys.mongodb;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "employee")
public interface EmployeeRepository extends MongoRepository<Employee, String> {
	List<Employee> findByLastName(@Param("name") String name);
	public Employee findByFirstName(@Param("name") String name);
}