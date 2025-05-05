package InterviewPrep.jdbcPractice;

import java.sql.*;
public class JDBCTestImpl {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/jdbc_test";
        String username = "root";
        String password = "Mani@12345";
        String query = "insert into students (name,id) values ('smk',101)";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url,username,password);
            Statement st = conn.createStatement();
            int count = st.executeUpdate(query);
            System.out.println("Number of rows affected by this query :" + count);
            st.close();
            conn.close();
        }catch(ClassNotFoundException e){
            System.err.println("JDBC Driver not found " + e.getMessage());
        }catch (SQLException e){
            System.err.println("SQL Error : " +e.getMessage());
        }
    }
}
