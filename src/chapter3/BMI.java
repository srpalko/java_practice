package chapter3;

import java.util.Scanner;

public class BMI
{
    public static void main(String[] args)
    {
        final double POUNDS_TO_KG = 2.205;
        final double INCHES_TO_METERS = 39.37;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();
        System.out.print("Enter feet: ");
        double feet = input.nextInt();
        System.out.print("Enter inches: ");
        double inches = input.nextInt();
        double kg = weight / POUNDS_TO_KG;
        double totalInches = (feet * 12) + inches;
        double meters = totalInches / INCHES_TO_METERS;
        double bmi = kg / (meters * meters);
        String classification;
        if (bmi < 18.5)
        {
            classification = "Underweight";
        } else if (bmi <= 24.9)
        {
            classification = "Normal weight";
        } else if (bmi <= 29.9)
        {
            classification = "Overweight";
        } else
        {
            classification = "Obese";
        }
        System.out.println("BMI is " + bmi);
        System.out.println(classification);
    }
}
