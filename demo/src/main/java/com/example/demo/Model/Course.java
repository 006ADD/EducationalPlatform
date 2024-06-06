package com.example.demo.Model;

import lombok.*;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;


@Table(name = "courses")
@Data
@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotBlank(message = "Course author have to be filled")
    @Column(name = "author")
    private String author;

    @NotBlank(message = "Course title have to be filled")
    @Column(name = "title")
    private String title;

    @ManyToMany
    private Set<User> users = new HashSet<>();

//    public Course(Long id, String author, String title) {
//        this.id = id;
//        this.author = author;
//        this.title = title;
//    }

}
