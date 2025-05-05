package com.jdbc;

import com.jdbc.dao.StudentDAO;
import com.jdbc.model.Student;

public class Main {
    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();

        // Create
        dao.create(new Student("Alice", "alice@example.com", 22));

        // Read
        dao.readAll().forEach(System.out::println);

        // Update
        dao.update(new Student(1, "Alice Johnson", "alicej@example.com", 23));

        // Delete
        dao.delete(1);
    }
}