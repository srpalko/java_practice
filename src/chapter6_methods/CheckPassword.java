package chapter6_methods;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CheckPassword
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a password");
        System.out.print("Password must have at least eight alphanumeric characters, and must contain two digits: ");
        String password = input.nextLine();
        if (checkPassword(password))
        {
            System.out.println("Valid Password");
        } else
        {
            System.out.println("Invalid password");
        }
    }
    public static boolean checkPassword(String password)
    {
        Pattern alphaNumericTest = Pattern.compile("^(?=.*?\\d.*\\d)[a-zA-Z0-9]{8,}$");

        return password.matches(alphaNumericTest.pattern());
    }
}
