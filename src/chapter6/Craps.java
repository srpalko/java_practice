package chapter6;

public class Craps
{
    public static void main(String[] args)
    {
        int roll1 = rollDie();
        int roll2 = rollDie();
        int sum = roll1 + roll2;
        printRoll(roll1, roll2, sum);
        if (sum == 2 || sum == 3 || sum == 12)
        {
            System.out.println("You lose");
        } else if (sum == 7 || sum == 11)
        {
            System.out.println("You win");
        } else
        {
            System.out.println("The point is " + sum);
            int nextSum;
            int next1;
            int next2;
            do
            {
                next1 = rollDie();
                next2 = rollDie();
                nextSum = next1 + next2;
                printRoll(next1, next2, nextSum);
                if (nextSum == 7)
                {
                    System.out.println("You lose");
                    System.exit(0);
                }
            } while (nextSum != sum);
            System.out.println("You win");
        }
    }


    public static int rollDie()
    {
        return (int) (1 + Math.random() * 5);
    }

    public static void printRoll(int roll1, int roll2, int sum)
    {
        System.out.println("You rolled " + roll1 + " + " + roll2 + " = " + sum);
    }

}
