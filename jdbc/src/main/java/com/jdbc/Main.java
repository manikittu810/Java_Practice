package com.jdbc;

import com.jdbc.dao.StudentDAO;
import com.jdbc.model.Student;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();
        List<Student> studentList = Arrays.asList(new Student("Manikrishna","Mani@@gmail.com",25),
        new Student("Manisharma","sharma@gmail.com",17),
    new Student("Dhruva","dhruva@gmail.com",25));
        //Create
        for(Student s : studentList){
            dao.create(s);
        }

        System.out.println("After create() Operation");


        //readAll();

        studentList = dao.readAll();

        for(Student s : studentList){
            System.out.println(s);
        }
        System.out.println("After readAll() Operation");

        //update
        if(!studentList.isEmpty()){
            Student obj = studentList.get(1);
            obj.setName("Ajay");
            obj.setAge(26);
            obj.setEmail("aj@aj.com");
            obj.setId(5);
        }

        //delete
        if(!studentList.isEmpty()){
            dao.delete(studentList.get(1).getId());
        }

        System.out.println("After Delete Operation");

        for(Student s : studentList){
            System.out.println(s);
        }
    }
}