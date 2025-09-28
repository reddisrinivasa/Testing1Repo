package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name="students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable=false)
    private String name;
    @Column(nullable = false)
    private int age;
    @Column(nullable = false, unique = true)
    private String email;
    //constructor
    public Student(){}
    public Student(String name, int age, String email){
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
