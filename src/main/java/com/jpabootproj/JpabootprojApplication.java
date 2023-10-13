package com.jpabootproj;

import java.util.List;
import java.util.Optional;

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
		
		
//		creating and saving data using jpa (insert)
//		it will return the object which we are trying to save
//		User user1 = new User();
//		user1.setName("Ram");
//		user1.setAddress("Bhopal");
//		User save = userRepository.save(user1);
//		System.out.println(save);
		
		
		
//		get operation --- getting a single object by its primary id
//		Retrieves an entity by its id.
//		Optional<User> findById = userRepository.findById(3);
//
////		If a value is present, returns the value, otherwise throws NoSuchElementException.
//		User user = findById.get();
//		System.out.println(user);
		
		
//		update operation -- updating the single object by its id
//		User user = userRepository.findById(7).get();
//		user.setName("Anish");
//		User save = userRepository.save(user);
//		System.out.println(save);
		
		
//		delete operation 
		User user = userRepository.findById(8).get();
		userRepository.delete(user);
	}

}
