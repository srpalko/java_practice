package chapter_34_java_database_programming;

import java.sql.*;

public class FindUserTables
{
    public static void main(String[] args) throws SQLException
    {
        // Connect to a database
        Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/javabook", "root", "root");
        System.out.println("Database connected");

        DatabaseMetaData dbMetaData = connection.getMetaData();

        ResultSet rsTables = dbMetaData.getTables(null, null, null, new String[]{"TABLE"});
        System.out.println("User tables: ");
        while (rsTables.next())
        {
            System.out.print(rsTables.getString("TABLE_NAME") + " ");
        }

        // Close the connection
        connection.close();
    }
}
