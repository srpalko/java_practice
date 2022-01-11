package chapter6_methods;

public class DisplayCharacters
{
    public static void main(String[] args)
    {
        // Test program
        printChars('1', 'Z', 10);
    }

    public static void printChars(char ch1, char ch2, int numberPerLine)
    {
        int count = 1;
        for (; ch1 <= ch2; ch1++)
        {
            if (count % numberPerLine == 0)
            {
                System.out.println(ch1);
            } else
            {
                System.out.print(ch1 + " ");
            }
            count++;
        }
    }
}
