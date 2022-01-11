package chapter3_selections;

import java.util.Scanner;

/**
 * Compares the cost of a product in two different packages and displays which has the
 * better price
 */
public class CompareCosts
{
    public static void main(String[] args)
    {
        // Get input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight and price for package 1: ");
        double weight1 = input.nextDouble();
        double price1 = input.nextDouble();
        System.out.print("Enter weight and price for package 2: ");
        double weight2 = input.nextDouble();
        double price2 = input.nextDouble();

        // Find price per 1 unit of weight
        double pricePerUnit1 = price1 / weight1;
        double pricePerUnit2 = price2 / weight2;

        if (pricePerUnit1 == pricePerUnit2)
        {
            System.out.println("Two packages have the same price.");
        } else
        {
            int better = pricePerUnit1 < pricePerUnit2 ? 1 : 2;
            System.out.println("Package " + better + " has a better price.");
        }
    }
}
