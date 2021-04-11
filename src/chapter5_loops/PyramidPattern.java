package chapter5_loops;

public class PyramidPattern
{
    public static void main(String[] args)
    {
        for (int i = 8; i >= 1; i--)
        {
            int num = 1;
            for (int j = 1; j <= 8; j++)
            {
                if (j < i)
                {
                    System.out.print("    ");
                } else
                {
                    System.out.printf("%4d", num);
                    num *= 2;
                }
            }
            num /= 4;
            for (int k = 1; k <= 8; k++)
            {
                if (k > i)
                {
                    System.out.printf("%4d", num);
                    num /= 2;
                }
            }
            System.out.println();
        }
    }
}
