package chapter11_inheritance_polymorphism;

import java.util.Scanner;

public class Triangle extends GeometricObject
{
    private double side1;
    private double side2;
    private double side3;

    public Triangle()
    {
        this(1.0, 1.0, 1.0);
    }

    public Triangle(double side1, double side2, double side3)
    {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1()
    {
        return side1;
    }

    public double getSide2()
    {
        return side2;
    }

    public double getSide3()
    {
        return side3;
    }

    public double getArea()
    {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public double getPerimeter()
    {
        return side1 + side2 + side3;
    }

    @Override
    public String toString()
    {
        return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three sides of a triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
        input.nextLine();
        System.out.print("Enter a color: ");
        String color = input.nextLine();
        System.out.print("Enter true or false to determine if the triangle will be filled: ");
        boolean isFilled = input.nextBoolean();

        Triangle test = new Triangle(side1, side2, side3);
        test.setColor(color);
        test.setFilled(isFilled);

        System.out.println("The area of the triangle is " + test.getArea());
        System.out.println("The perimeter of the triangle is " + test.getPerimeter());
        System.out.println("The color of the triangle is " + test.getColor());
        System.out.println("The triangle is filled: " + test.isFilled());
    }
}
