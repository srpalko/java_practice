package chapter5;

public class PatternA
{
    public static void main(String[] args)
    {
        System.out.println("Pattern A");
        for (int i = 1; i <= 6; i++)
        {
            for (int j = 1; j <= 6; j++)
            {
                if (j <= i)
                {
                    System.out.printf("%-2d", j);
                }
            }
            System.out.println();
        }
    }
}
