package chapter6_methods;

import java.util.Scanner;

public class CreditCardValidation
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a credit card number as a long integer: ");
        long number = input.nextLong();
        if (isValid(number))
        {
            System.out.println(number + " is valid");
        } else
        {
            System.out.println(number + " is invalid");
        }
    }


    /**
     * Determines if a credit card number is valid.
     * @param number the number to check
     * @return true if valid
     */
    public static boolean isValid(long number)
    {
        final int VISA = 4;
        final int MASTERCARD = 5;
        final int AMEX = 37;
        final int DISCOVER = 6;

        if (getSize(number) >= 13 && getSize(number) <= 16)
        {
            if (prefixMatched(number, VISA) || prefixMatched(number, MASTERCARD)
                    || prefixMatched(number, AMEX) || prefixMatched(number, DISCOVER))
            {
                long evenPlace = sumOfDoubleEvenPlace(number);
                long oddPlace = sumOfOddPlace(number);
                long sumOfDigits = oddPlace + evenPlace;
                return sumOfDigits % 10 == 0;
            }
        }
        return false;
    }

    /**
     * Calculates the sum of every second digit from right to left.
     * If doubling results in two digits, the digits are added to
     * create a single digit number.
     * @param number number to compute
     * @return the sum as above
     */
    public static long sumOfDoubleEvenPlace(long number)
    {
        long sum = 0;
        int length = getSize(number);
        for (int i = 0; i < length; i++)
        {
            long digit =  number % 10;
            if (i % 2 != 0)
            {
                sum += getDigit(digit * 2);
            }
            number /= 10;
        }
        return sum;
    }

    /**
     * Returns the same number if it is a single digit.
     * Otherwise it returns the sum of the digits.
     * @param number number to check
     * @return number or sum of digits
     */
    public static long getDigit(long number)
    {
        if (number < 10)
        {
            return number;
        }
        long digit1 = number % 10;
        long digit2 = number / 10;
        return digit1 + digit2;
    }

    /**
     * Returns sum of odd place digits in a number
     * @param number number to process
     * @return the sum of odd place digits
     */
    public static long sumOfOddPlace(long number)
    {
        long sum = 0;
        int length = getSize(number);
        for (int i = 0; i < length; i++)
        {
            long digit =  number % 10;
            if (i % 2 == 0)
            {
                sum += digit;
            }
            number /= 10;
        }
        return sum;
    }

    /**
     * Returns true if the digit d is a prefix for the number
     * @param number number to check
     * @param d prefix to check
     * @return true if matches
     */
    public static boolean prefixMatched(long number, int d)
    {
        return Long.toString(number).startsWith(Integer.toString(d));
    }

    /**
     * Returns the number of digits in d
     * @param d number to check
     * @return number of digits
     */
    public static int getSize(long d)
    {
        return Long.toString(d).length();
    }
}
