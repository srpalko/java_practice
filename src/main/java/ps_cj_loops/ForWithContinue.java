package ps_cj_loops;

public class ForWithContinue
{
    public static void main(String[] args)
    {
        for (int i = 1; i < 100; i++)
        {
            if (i % 5 == 0)
            {
                if (i >= 25 && i <= 75)
                {
                    continue;
                }
                else
                {
                    System.out.println(i);
                }
            }
        }
    }
}
