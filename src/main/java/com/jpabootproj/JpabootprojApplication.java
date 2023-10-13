package com.jpabootproj;

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
		User user1 = new User();
		user1.setName("Satyam");
		user1.setAddress("Bhopal");
		User save = userRepository.save(user1);
		
		System.out.println(save);
		
	}

}
