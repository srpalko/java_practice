package chapter3_selections;

import java.util.Scanner;

public class CostOfShipping
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Package weight: ");
        double weight = input.nextDouble();
        double price = 0;
        if (weight < 0)
        {
            System.out.println("Illegal entry. Weight cannot be negative");
            System.exit(1);
        }
        if (weight > 0 && weight <= 1)
        {
            price = 3.5;
        } else if (weight <= 3)
        {
            price = 5.5;
        } else if (weight <= 10)
        {
            price = 8.5;
        } else if (weight <= 20)
        {
            price = 10.5;
        } else if (weight > 50)
        {
            System.out.println("the package cannot be shipped");
            System.exit(0);
        } else
        {
            System.out.println("There is no price information for that weight");
            System.exit(1);
        }

        System.out.printf("Shipping cost: $%.2f", price);
    }
}
