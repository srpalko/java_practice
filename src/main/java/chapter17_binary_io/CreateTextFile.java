package chapter17_binary_io;

import java.io.*;
import java.util.Random;

public class CreateTextFile
{
    public static void main(String[] args)
    {
        File file = new File("Exercise17_01.txt");

        try (PrintWriter output = new PrintWriter(new BufferedOutputStream(new FileOutputStream(file, true))))
        {
            Random generator = new Random();

            for (int i = 0; i < 100; i++)
            {
                output.print(generator.nextInt());
                output.println(' ');
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
