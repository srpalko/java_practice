package chapter2;

import java.util.Scanner;

public class BMICalc
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();
        System.out.print("Enter height in inches: ");
        double height = input.nextDouble();
        double weightInKg = weight * 0.45359237;
        double heightInMeters = height * 0.0254;
        double bmi = weightInKg / Math.pow(heightInMeters, 2);
        System.out.printf("BMI is %.4f", bmi);
    }


}
