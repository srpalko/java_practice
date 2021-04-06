package chapter5;

public class PatternD
{
    public static void main(String[] args)
    {
        System.out.println("Pattern D");
        for (int i = 6, spaces = 0; i >= 1; i--, spaces++)
        {
            for (int k = 0; k < spaces; k++)
            {
                System.out.print("  ");
            }
            for (int j = 1; j <= 6; j++)
            {
                if (j <= i)
                {
                    System.out.printf("%2d", j);
                } else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
