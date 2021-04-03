package chapter2;

import java.util.Scanner;

public class Exercises
{
    public static void main(String[] args)
    {
        int num1 = (int) (Math.random() * 20);
        int num2 = (int) (Math.random() * 10) + 10;
        int num3 = (int) (Math.random() * 41) + 10;
        int num4 = (int) Math.round(Math.random());

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
    }
}
