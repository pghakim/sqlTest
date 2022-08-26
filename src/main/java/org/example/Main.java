package org.example;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {


        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbctest","root", "awwaqe");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * " +
                "FROM departments " +
                "JOIN employees " +
                "WHERE employees.departmentid = departments.departmentid " +
                "ORDER BY departments.departmentid; "
);


        while (resultSet.next()){
            System.out.println("Department ID: " + resultSet.getString("departmentid") + " Employee ID: " + resultSet.getString("id") +
                    " Name: " + resultSet.getString("name") + " Department: " + resultSet.getString("department"));
        }


    }
}


