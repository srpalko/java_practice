package chapter4_math_functions_chars_strings;

import java.util.Scanner;

/**
 * Takes two characters and displays a students major
 * and status. Majors are
 * M: Mathematics
 * C: Computer Science
 * I: Information Technology
 *
 * Numbers are 1-4 representing freshman - senior
 *
 * Format <major><status>
 */
public class StudentMajorAndStatus
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two characters: ");
        String entry = input.nextLine();
        entry = entry.toUpperCase();

        char major = entry.charAt(0);
        int status = Integer.parseInt(entry.substring(1));

        String majorString = "";

        switch (major)
        {
            case 'M':
                majorString = "Mathematics";
                break;
            case 'C':
                majorString = "Computer Science";
                break;
            case 'I':
                majorString = "Information Technology";
                break;
            default:
                System.out.println("Invalid input");
                System.exit(1);
        }

        String statusString = "";

        switch (status)
        {
            case 1:
                statusString = "Freshman";
                break;
            case 2:
                statusString = "Sophomore";
                break;
            case 3:
                statusString = "Junior";
                break;
            case 4:
                statusString = "Senior";
                break;
            default:
                System.out.println("Invalid input");
                System.exit(2);
        }

        System.out.println(majorString + " " + statusString);


    }
}
