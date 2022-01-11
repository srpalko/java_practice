package chapter_34_java_database_programming;

import java.sql.*;

public class DatabaseTest
{
    public static void main(String[] args) throws SQLException, ClassNotFoundException
    {
        // Connect to a database
        Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/javabook", "root", "root");
        System.out.println("Database connected");

        // Create a statement
        Statement statement = connection.createStatement();

        // Execute a statement
        ResultSet resultSet = statement.executeQuery("select firstName, mi, lastName from Student where lastName = 'Smith'");

        // Iterate through the result and print the student names
        while (resultSet.next())
        {
            System.out.println(resultSet.getString(1) + "\t" + resultSet.getString(2) + "\t" + resultSet.getString(3));
        }

        // close the connection
        connection.close();
    }
}
