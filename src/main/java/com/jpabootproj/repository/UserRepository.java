package com.jpabootproj.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.jpabootproj.model.User;

public interface UserRepository extends CrudRepository<User, Integer>{

//	In Spring Data JPA, "Derived Query Methods" or "Custom Finder Methods" are methods in a repository interface that Spring Data JPA automatically translates into corresponding database queries without requiring you to write explicit SQL or JPQL (Java Persistence Query Language) queries. These methods are called "derived" because the query is derived from the method name and parameters.
	
//	Spring jpa will automaticly translate this method and generate the spacific query
	
	public List<User> findByName(String name);  //SELECT u FROM User u WHERE u.name =: nameValue
	
	public List<User> findByAddress(String address); //SELECT u FROM User u WHERE u.address =: addressValue
	
	
	
//	Spring Data JPA provides a variety of keywords for use in JPQL (Java Persistence Query Language) queries. These keywords make it easier to write repository methods that involve complex queries, as you don't have to write explicit JPQL queries. Here are some of the commonly used Spring Data JPA keywords:

//	1. And: Used to combine two or more conditions in a query.
//	public List<User> findByFirstNameAndLastName(String firstName, String lastName);
	   

//	2. Or: Used to combine two or more conditions with logical OR in a query.
	public List<User> findByAddressOrName(String address, String name);
	   
	public List<User> findByAddressAndName(String address, String name);

//	3. Between: Used to find values within a range.
//	public List<User> findBySalaryBetween(int minSalary, int maxSalary);
	   

//	4. GreaterThan, LessThan: Used to find values greater or less than the specified value.
//	public List<User> findByAgeGreaterThan(int age);
//	public List<User> findByAgeLessThan(int age);
	   

//	5. Like: Used for pattern matching with wildcard characters (% and _).
//	public List<User> findByLastNameLike(String lastName);
	   

//	6.IsNull, IsNotNull: Used to check for null or non-null values.
//	public List<User> findByAddressIsNull();
//	public List<User> findByAddressIsNotNull();
	   

//	7. OrderBy: Used to specify the order of results.
//	public List<User> findByLastNameOrderByFirstNameAsc(String lastName);
	   

//	8. In: Used to find values that match any element in a given collection.
//	public List<User> findByAgeIn(List<Integer> ages);
	   

//	9. NotIn: Used to find values that do not match any element in a given collection.
//	   public List<User> findByAgeNotIn(List<Integer> ages);
	   

//	10. IgnoreCase: Used to perform case-insensitive queries.
//	   public List<User> findByLastNameIgnoreCase(String lastName);
	    

//	11. True, False: Used to find boolean values that are true or false.
//		public List<User> findByActiveTrue();
//		public List<User>  findByDeletedFalse();
	    

//	12. StartingWith, EndingWith: Used for prefix and suffix matching.
//	    public List<User> findByFirstNameStartingWith(String prefix);
//	    public List<User> findByLastNameEndingWith(String suffix);
	    

//	13. Containing: Used to find values containing a specific string.
//	    public List<User> findByEmailContaining(String keyword);
	    

//	14. Not: Used to negate a condition.
//	    public List<User> findByAgeNot(int age);
	    

//	15.And/Or with Multiple Properties: You can combine properties and use `And`, `Or`, and other keywords to build more complex queries.

//	   public List<User> findByFirstNameAndLastNameOrAge(String firstName, String lastName, int age);
	    

//	These are just some of the commonly used keywords provided by Spring Data JPA. Spring Data JPA also allows you to define custom query methods using these keywords and, if needed, write your custom JPQL queries for more complex queries that cannot be expressed using the keywords alone.

	
//	id less then equal
	public List<User> findByIdLessThan(int id);
	
	public List<User> findByIdLessThanEqual(int id);
	
	public List<User> findByIdGreaterThan(int id);
	
	public List<User> findByIdGreaterThanEqual(int id);
}
