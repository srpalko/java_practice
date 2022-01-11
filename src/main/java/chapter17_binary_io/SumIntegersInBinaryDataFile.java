package chapter17_binary_io;

import java.io.*;

public class SumIntegersInBinaryDataFile
{
    public static void main(String[] args)
    {
        File file = new File("Exercise17_02.dat");
        int sum = 0;
        try (DataInputStream input = new DataInputStream(new BufferedInputStream(new FileInputStream(file))))
        {
            int r;

            while (true)
            {
                sum += input.readInt();
            }
        }
        catch (EOFException e)
        {
            System.out.println("All data read");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        System.out.println("The sum of all integers in the file is " + sum);
    }
}
