package com.jap;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DeleteUpdateStudentData
{

    public Connection getConnection() throws ClassNotFoundException, SQLException {
        Connection connection=null;
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/school";
            String admin = "root";
            String password = "Mimansa@123";
            connection = DriverManager.getConnection(url,admin,password);
        return connection;
    }


    public void deleteStudentData() throws SQLException, ClassNotFoundException {
      // call getConnection() method
       Connection connection = getConnection();
        //execute delete query
        Statement statement = connection.createStatement();
        int row = 0;
        String sql0 = "insert into student values(14,'Meera',500.0,'A')";
        row = statement.executeUpdate(sql0);

        //Retrieving all the values of the table before deletion
        String sql1 = "select * from student";
        List<Student> list = new ArrayList<>();
        ResultSet resultSet = statement.executeQuery(sql1);
        while (resultSet.next())
        {
            int s_rollNo = resultSet.getInt(1);
            String s_name = resultSet.getString(2);
            double s_totalMarks = resultSet.getDouble(3);
            String s_grade = resultSet.getString(4);
            Student student = new Student(s_rollNo,s_name,s_totalMarks,s_grade);
            list.add(student);
        }
        System.out.println("Data before Deletion");
        for (Student s : list)
        {
            System.out.println(s);
        }

        //deleting data from table
        String sql2 = "delete from student where s_rollNo = "+14;
        row = statement.executeUpdate(sql2);
        if(row>=1)
        {
            System.out.println("\n\ndata deleted successfully");
        }
        else
        {
            System.out.println("\n\ndata not deleted");
        }
        System.out.println("\n");


        //Retrieving all the values of the table after deletion
        String sql3 = "select * from student";
        List<Student> list2 = new ArrayList<>();
        resultSet = statement.executeQuery(sql3);
        while (resultSet.next())
        {
            int s_rollNo = resultSet.getInt(1);
            String s_name = resultSet.getString(2);
            double s_totalMarks = resultSet.getDouble(3);
            String s_grade = resultSet.getString(4);
            Student student = new Student(s_rollNo,s_name,s_totalMarks,s_grade);
            list2.add(student);
        }
        System.out.println("Data After Deletion");
        for (Student s : list2)
        {
            System.out.println(s);
        }
    }

    public void updateStudentData() throws SQLException, ClassNotFoundException {
        // call getConnection() method
        Connection connection = getConnection();
        //execute update query
        Statement statement = connection.createStatement();

        //Adding rows to the table
        int row = 0;
        //Retrieving all the values of the table before updating
        String sql3 = "select * from student";
        List<Student> list1 = new ArrayList<>();
        ResultSet resultSet = statement.executeQuery(sql3);
        while (resultSet.next())
        {
            int s_rollNo = resultSet.getInt(1);
            String s_name = resultSet.getString(2);
            double s_totalMarks = resultSet.getDouble(3);
            String s_grade = resultSet.getString(4);
            Student student = new Student(s_rollNo,s_name,s_totalMarks,s_grade);
            list1.add(student);
        }
        System.out.println("\n\nData Before Updating");
        for (Student s : list1)
        {
            System.out.println(s);
        }


        //Updating data of the table
        String sql4 = "update student set s_name = 'Arnav' where s_rollNo = "+15+" and s_totalMarks = "+678;
        row = statement.executeUpdate(sql4);
        if(row==1)
        {
            System.out.println("\ndata updated successfully");
        }
        else
        {
            System.out.println("\ndata not updated");
        }


        //Retrieving all the values of the table after updating
        String sql5 = "select * from student";
        List<Student> list2 = new ArrayList<>();
        resultSet = statement.executeQuery(sql5);
        while (resultSet.next())
        {
            int s_rollNo = resultSet.getInt(1);
            String s_name = resultSet.getString(2);
            double s_totalMarks = resultSet.getDouble(3);
            String s_grade = resultSet.getString(4);
            Student student = new Student(s_rollNo,s_name,s_totalMarks,s_grade);
            list2.add(student);
        }
        System.out.println("\n\nData Before Updating");
        for (Student s : list2)
        {
            System.out.println(s);
        }
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        DeleteUpdateStudentData salesDataDemo = new DeleteUpdateStudentData();
        salesDataDemo.deleteStudentData();
        System.out.println("___________________________________________________________________________________________");
        salesDataDemo.updateStudentData();
    }
}
