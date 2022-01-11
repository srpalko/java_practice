package chapter10_object_oriented_thinking;

public class MyInteger
{
    private final int value;

    public MyInteger(int value)
    {
        this.value = value;
    }

    public int getValue()
    {
        return value;
    }

    public boolean isEven()
    {
        return MyInteger.isEven(value);
    }

    public boolean isOdd()
    {
        return !isEven();
    }

    public boolean isPrime()
    {
        return MyInteger.isPrime(getValue());
    }

    public static boolean isEven(int n)
    {
        return n % 2 == 0;
    }

    public static boolean isOdd(int n)
    {
        return !MyInteger.isEven(n);
    }

    public static boolean isPrime(int n)
    {
        if (n == 2 || n == 3)
        {
            return true;
        }
        else if (n <= 1 || n % 2 == 0 || n % 3 == 0)
        {
            return false;
        }

        int i = 5;
        while (Math.pow(i, 2) <= n)
        {
            if (n % i == 0 || n % (i + 2) == 0)
            {
                return false;
            }
            i += 6;
        }
        return true;
    }

    public static boolean isEven(MyInteger myInteger)
    {
        return MyInteger.isEven(myInteger.getValue());
    }

    public static boolean isOdd(MyInteger myInteger)
    {
        return MyInteger.isOdd(myInteger.getValue());
    }

    public static boolean isPrime(MyInteger myInteger)
    {
        return MyInteger.isPrime(myInteger.getValue());
    }

    public boolean equals(int value)
    {
        return this.value == value;
    }

    public boolean equals(MyInteger myInteger)
    {
        return this.value == myInteger.value;
    }

    public static int parseInt(char[] array)
    {
        return Integer.parseInt(String.valueOf(array));
    }

    public static int parseInt(String s)
    {
        return Integer.parseInt(s);
    }
}
