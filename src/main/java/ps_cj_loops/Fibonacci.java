package ps_cj_loops;

public class Fibonacci
{
    public static void main(String[] args)
    {
        int i = 0;
        int j = 1;
        int next;
        System.out.print(i + " ");
        System.out.print(j + " ");
        do
        {
            next = j + i;
            System.out.print(next + " ");
            i = j;
            j = next;
        } while (i + j <= 50);
    }
}
