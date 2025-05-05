package com.jdbc.dao;

import com.jdbc.model.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
    String url = "jdbc:mysql://localhost:3306/jdbc_test";
    String username = "root";
    String password = "Mani@12345";

    public void create(Student student){
        String sql ="insert into students (name,email,age) values (?,?,?)";
        try(Connection con = DriverManager.getConnection(url,username,password);
            PreparedStatement stmt = con.prepareStatement(sql)){
            stmt.setString(1,"sms");
            stmt.setString(2,"smk@example.com");
            stmt.setInt(3,18);
            stmt.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    public List<Student> readAll(){
        List<Student> student = new ArrayList<>();
        String sql = "select * from students";
        try(Connection con = DriverManager.getConnection(url,username,password);
        PreparedStatement stmt = con.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery()){
            while(rs.next()){
                student.add(new Student(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getInt("age")
                ));
            }

        }catch(SQLException e) {e.printStackTrace();}
        return student;

    }
    public void update(Student student){
        String sql = "update students SET name = ?, email = ?, age = ? where id = ?";

        try(Connection con = DriverManager.getConnection(url,username,password);
        PreparedStatement stmt = con.prepareStatement(sql)){
            stmt.setString(1,student.getName());
            stmt.setString(2,student.getEmail());
            stmt.setInt(3,student.getAge());
            stmt.setInt(4,student.getId());
            stmt.executeUpdate();
            System.out.println("Student updated.");
        }catch(SQLException e){
            e.printStackTrace();
        }

    }
    public void delete(int id){
        String sql = "delete from students where id=?";
        try(Connection con = DriverManager.getConnection(url,username,password);
        PreparedStatement stmt = con.prepareStatement(sql)){
            stmt.setInt(1,id);
            stmt.executeUpdate();
            System.out.println("Student deleted");

        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
