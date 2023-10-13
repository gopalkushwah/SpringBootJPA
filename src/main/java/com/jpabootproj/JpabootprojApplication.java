package com.jpabootproj;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpabootproj.model.Employee;
import com.jpabootproj.repository.EmployeeRepository;

@SpringBootApplication
public class JpabootprojApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(JpabootprojApplication.class, args);
		
		EmployeeRepository employeeRepository = applicationContext.getBean(EmployeeRepository.class);
		
		
//		INSERT
//		employeeRepository.insertEmployee("Ram", "Bhopal", "54687841245", 45544.5454);
		
//		GET ALL
//		List<Employee> all = employeeRepository.getAll();
//		
//		for(Employee emp : all) {
//			System.out.println(emp);
//		}
		
//		GET BY ID
//		List<Employee> getEmployeeById = employeeRepository.getEmployeeById(2);
//		for(Employee emp : getEmployeeById) {
//			System.out.println(emp);
//		}
		
		
//		employeeRepository.updateEmployee("Ram", "Harda");
		
		
//		employeeRepository.deleteEmployee("Ram");.
		
		
//		native query 
		List<Employee> employeeByNative = employeeRepository.getEmployeeByNative();
		for(Employee e : employeeByNative)
			System.out.println(e);
	}

}
