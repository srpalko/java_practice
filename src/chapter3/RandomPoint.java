package chapter3;

public class RandomPoint
{
    public static void main(String[] args)
    {
        int x = (int)(Math.random() * 101) - 50;
        int y = (int)(Math.random() * 201) - 100;
        System.out.println("Random coordinate: " + x + ", " + y);
    }
}
