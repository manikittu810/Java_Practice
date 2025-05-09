package com.jdbc.model;

public class Student {
    private int id;
    private String name;
    private String email;
    private int age;
    public Student(){}

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    // Constructor for CREATE (no ID)
    public Student(String name, String email, int age){
        this.name = name;
        this.email = email;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
    // Constructor for READ/UPDATE (includes ID)
    public Student(int id, String name, String email, int age) {
        this(name, email, age);
        this.id = id;
    }

}
