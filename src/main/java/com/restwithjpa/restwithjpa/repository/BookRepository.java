package com.restwithjpa.restwithjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.restwithjpa.restwithjpa.entities.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {
    public Book findById(int id);

    public Book findByName(String name);
}
