package com.jpabootproj.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.jpabootproj.model.Employee;

import jakarta.transaction.Transactional;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

//	In a Spring Boot application with JPA (Java Persistence API), you can use JPQL (Java Persistence Query Language) to perform database queries and retrieve data from a relational database. JPQL is a query language specific to JPA, and it allows you to express database queries using object-oriented concepts, rather than writing SQL queries directly. Here's how you can use JPQL in a Spring Boot application:
	
	
	@Query("INSERT INTO Employee (name, address, mobile, salary) VALUES (:name, :address, :mobile , :salary)")
	@Modifying
	@Transactional
	void insertEmployee(@Param("name") String name, @Param("address") String price, @Param("mobile") String mobile,@Param("salary") double salary);
	
	@Query("FROM Employee")
	public List<Employee> getAll();
	
	@Query("SELECT e FROM Employee e WHERE e.id=:id")
	public List<Employee> getEmployeeById(@Param("id") int id);
	
	
	@Query("UPDATE Employee p SET p.address = :address WHERE p.name = :name")
	@Modifying
	@Transactional
	void updateEmployee(@Param("name") String name,@Param("address") String address);
	
	@Query("DELETE Employee e WHERE e.name = :name")
	@Modifying
	@Transactional
	void deleteEmployee(@Param("name") String name);
	

//	NATIVE QUERY SPACIFIC TO DBMS
	@Query(value="SELECT * FROM employee",nativeQuery = true)
	public List<Employee> getEmployeeByNative();
	
	
	
}
