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
		
		User user1 = new User();
		user1.setName("Ram");
		user1.setAddress("Bhopal");
		
		
		User user2 = new User();
		user2.setName("Girraj");
		user2.setAddress("Bhopal");
		List<User> list = List.of(user1,user2);
		
		Iterable<User> saveAll = userRepository.saveAll(list);
		
		saveAll.forEach(result -> {
			System.out.println(result);
		});
		
	}

}
