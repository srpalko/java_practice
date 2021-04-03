package ps_cj_loops;

public class NestedFor
{
    public static void main(String[] args)
    {
        for (var i = 0; i < 2; i++)
        {
            System.out.println("Week " + (i + 1) + ":");
            for (var j = 0; j < 5; j++)
            {
                System.out.println("Day " + (j + 1));
            }
        }
    }
}
