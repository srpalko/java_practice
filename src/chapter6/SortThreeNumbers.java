package chapter6;

import java.util.Scanner;

public class SortThreeNumbers
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();
        displaySortedNumbers(num1, num2, num3);
    }

    public static void displaySortedNumbers(double num1, double num2, double num3)
    {
        if (num1 < num2 && num2 < num3)
        {
            System.out.println(num1 + " " + num2 + " " + num3);
        } else if (num1 < num3 && num3 < num2)
        {
            System.out.println(num1 + " " + num3 + " " + num2);
        } else if (num2 < num1 && num1 < num3)
        {
            System.out.println(num2 + " " + num1 + " " + num3);
        } else if (num2 < num3 && num3 < num1)
        {
            System.out.println(num2 + " " + num3 + " " + num1);
        } else if (num3 < num1 && num1 < num2)
        {
            System.out.println(num3 + " " + num1 + " " + num2);
        } else
        {
            System.out.println(num3 + " " + num2 + " " + num1);
        }
    }
}
