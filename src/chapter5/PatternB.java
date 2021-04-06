package chapter5;

public class PatternB
{
    public static void main(String[] args)
    {
        System.out.println("Pattern B");
        for (int i = 6; i >= 1; i--)
        {
            for (int j = 1; j <= 6; j++)
            {
                if (j <= i)
                {
                    System.out.printf("%2d", j);
                }
            }
            System.out.println();
        }
    }
}
