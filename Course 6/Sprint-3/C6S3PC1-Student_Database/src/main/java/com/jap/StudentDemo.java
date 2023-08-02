package com.jap;

import java.io.Reader;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDemo
{

    public void getAllStudentDetails(){
        Connection connection = null;
        List<Student> list = new ArrayList<>();
        //Load the Drivers
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Get the connection from database
            String url = "jdbc:mysql://localhost:3306/school";
            String user = "root";
            String password = "Mimansa@123";
            connection = DriverManager.getConnection(url,user,password);
            //Create statement object
            Statement statement = connection.createStatement();
            //execute the query
            int row = 0;
            String sql = "SELECT * from student";
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next())
            {
                int s_rollNo = resultSet.getInt(1);
                String s_name = resultSet.getString(2);
                double s_totalMarks = resultSet.getDouble(3);
                String s_grade = resultSet.getString(4);
                Student student = new Student(s_rollNo,s_name,s_totalMarks,s_grade);
                list.add(student);
            }
        }
        catch (SQLException | ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        //display the ResultSet Data
        for (Student student : list)
        {
            System.out.println(student);
        }
    }
    public static void main( String[] args ) {
        StudentDemo studentDemo = new StudentDemo();
        studentDemo.getAllStudentDetails();
    }
}
