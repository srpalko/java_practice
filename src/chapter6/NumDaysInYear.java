package chapter6;

public class NumDaysInYear
{
    public static void main(String[] args)
    {
        System.out.println("Year    Days");
        System.out.println("------------");
        for (int year = 2000; year <= 2020; year++)
        {
            System.out.println(year + "    " + numberOfDaysInAYear(year));
        }
    }

    public static int numberOfDaysInAYear(int year)
    {
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;

        return isLeapYear ? 366 : 365;
    }
}
