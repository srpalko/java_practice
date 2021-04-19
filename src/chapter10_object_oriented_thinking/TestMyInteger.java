package chapter10_object_oriented_thinking;

import chapter10_object_oriented_thinking.MyInteger;

public class TestMyInteger
{
    public static void main(String[] args)
    {
        MyInteger num1 = new MyInteger(45);
        MyInteger num2 = new MyInteger(100);

        System.out.println("num1 = " + num1.getValue());
        System.out.println("num1 even ? " + num1.isEven());
        System.out.println("num1 odd ? " + num1.isOdd());
        System.out.println("num2 even? " + num2.isEven());
        System.out.println("num1 prime? " + num1.isPrime());
        System.out.println("num2 prime? " + num2.isPrime());
        System.out.println("num1 = num2? " + num1.equals(num2));
        System.out.println("num1 = 45? " + num1.equals(45));
        int testInt = MyInteger.parseInt("344");
        int testInt2 = MyInteger.parseInt(new char[]{'2', '3', '3'});

        System.out.println("static even " + MyInteger.isEven(66));
        System.out.println("static odd " + MyInteger.isOdd(66));
        System.out.println("static odd MyInteger " + MyInteger.isOdd(num1));
        System.out.println("Static prime " + MyInteger.isPrime(455885));
        System.out.println("Static prime MyInteger " + MyInteger.isPrime(num2));

    }
}
