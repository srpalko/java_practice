package ps_cj_loops;

public class Palindromes
{
    public static void main(String[] args)
    {
        for (int i = 10; i <= 200; i++)
        {
            if (i < 100)
            {
                if (i % 10 == i / 10)
                {
                    System.out.println(i);
                }
            } else
            {
                if (i % 10 == i / 100)
                {
                    System.out.println(i);
                }
            }
        }
    }
}
