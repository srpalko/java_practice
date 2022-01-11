package chapter_34_java_database_programming;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;
import java.util.Scanner;

public class TestCallableStatement
{
    /**
     * Creates new form TestTableEditor
     */
    public static void main(String[] args) throws Exception
    {
        Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/javabook", "root", "root");

        // Create a callable statement
        CallableStatement callableStatement = connection.prepareCall("{? = call studentFound(?, ?)}");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter student's first name: ");
        String firstName = input.nextLine();
        System.out.print("Enter student's last name: ");
        String lastName = input.nextLine();

        callableStatement.setString(2, firstName);
        callableStatement.setString(3, lastName);
        callableStatement.registerOutParameter(1, Types.INTEGER);
        callableStatement.execute();

        if (callableStatement.getInt(1) >= 1)
        {
            System.out.println(firstName + " " + lastName + " is in the database");
        }
        else
        {
            System.out.println(firstName + " " + lastName + " is not in the database");
        }
    }
}
