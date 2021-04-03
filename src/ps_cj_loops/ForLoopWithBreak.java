package ps_cj_loops;

public class ForLoopWithBreak
{
    public static void main(String[] args)
    {
        for (int i = 1; i < 100; i++)
        {
            if (i > 50)
            {
                break;
            } else if (i % 5 == 0)
            {
                System.out.println(i);
            }
        }
    }
}
