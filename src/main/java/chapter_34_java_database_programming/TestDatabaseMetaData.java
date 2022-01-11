package chapter_34_java_database_programming;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestDatabaseMetaData
{
    public static void main(String[] args) throws SQLException, ClassNotFoundException
    {
        // Load the JDBC driver
//        Class.forName("com.mariadb.jdbc.Driver");
//        System.out.println("Driver loaded");

        // Connect to a database
        Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/javabook", "root", "root");
        System.out.println("Database connected");

        DatabaseMetaData dbMetaData = connection.getMetaData();
        System.out.println("database URL: " + dbMetaData.getURL());
        System.out.println("database username: " + dbMetaData.getUserName());
        System.out.println("database product name: " + dbMetaData.getDatabaseProductName());
        System.out.println("database product version: " + dbMetaData.getDatabaseProductVersion());
        System.out.println("JDBC driver version: " + dbMetaData.getDriverVersion());
        System.out.println("JDBC driver major version: " + dbMetaData.getDatabaseMajorVersion());
        System.out.println("JDBC driver minor version: " + dbMetaData.getDriverMinorVersion());
        System.out.println("Max number of connections: " + dbMetaData.getMaxConnections());
        System.out.println("MaxTableNameLength: " + dbMetaData.getMaxTableNameLength());
        System.out.println("MaxColumnsInTable: " + dbMetaData.getMaxColumnsInTable());

        // Close the connection
        connection.close();
    }
}
