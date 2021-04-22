package chapter12_exception_handling_and_text_io;

import java.util.Scanner;

public class ReadData
{
    public static void main(String[] args) throws Exception
    {
        // Create a file instance
        java.io.File file = new java.io.File("scores.txt");

        // Create a Scanner for the file
        Scanner input = new Scanner(file);

        // Read data from the file
        while (input.hasNext())
        {
            String firstName = input.next();
            String mi = input.next();
            String lastName = input.next();
            int score = input.nextInt();
            System.out.println(firstName + " " + mi + " " + lastName + " " + score);
        }

        // close the file
        input.close();
    }
}
