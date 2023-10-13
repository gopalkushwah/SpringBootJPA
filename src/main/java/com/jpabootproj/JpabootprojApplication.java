package com.jpabootproj;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpabootproj.model.User;
import com.jpabootproj.repository.UserRepository;

@SpringBootApplication
public class JpabootprojApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(JpabootprojApplication.class, args);
		UserRepository userRepository = applicationContext.getBean(UserRepository.class);
	
		
//		List<User> findByName = userRepository.findByName("Satyam");
//		findByName.forEach(e -> System.out.println(e));
		
		
//		List<User> findByAddress = userRepository.findByAddress("Bhopal");
//		findByAddress.forEach(e -> System.out.println(e));
		
		
//		List<User> findByAddressOrName = userRepository.findByAddressOrName("Bhopal", "Raju");
//		findByAddressOrName.forEach(e -> System.out.println(e));
//		System.out.println("----------------------------------------------------");

//		List<User> findByAddressAndName = userRepository.findByAddressAndName("Bhopal", "Satyam");
//		findByAddressAndName.forEach(e -> System.out.println(e));
//		System.out.println("----------------------------------------------------");

//		List<User> findByIdLessThan = userRepository.findByIdLessThan(4);
//		findByIdLessThan.forEach(e -> System.out.println(e));
//		System.out.println("----------------------------------------------------");

//		List<User> findByIdLessThanEqual = userRepository.findByIdLessThanEqual(5);
//		findByIdLessThanEqual.forEach(e -> System.out.println(e));
//		System.out.println("----------------------------------------------------");

//		List<User> findByIdGreaterThan = userRepository.findByIdGreaterThan(5);
//		findByIdGreaterThan.forEach(e -> System.out.println(e));
//		System.out.println("----------------------------------------------------");
//		
//		List<User> findByIdGreaterThanEqual = userRepository.findByIdGreaterThanEqual(5);
//		findByIdGreaterThanEqual.forEach(e -> System.out.println(e));
//		System.out.println("----------------------------------------------------");
	}

}
