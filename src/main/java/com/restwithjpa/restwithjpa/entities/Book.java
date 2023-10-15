package com.restwithjpa.restwithjpa.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String auother;
    @Column(nullable = false)
    private String description;

    public Book() {
    }

    public Book(int id, String name, String auother, String description) {
        this.id = id;
        this.name = name;
        this.auother = auother;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuother() {
        return auother;
    }

    public void setAuother(String auother) {
        this.auother = auother;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Book [id=" + id + ", name=" + name + ", auother=" + auother + ", description=" + description + "]";
    }

}
