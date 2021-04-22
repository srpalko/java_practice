package chapter17_binary_io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileStream
{
    public static void main(String[] args) throws IOException
    {
        try ( // Create an output stream to the file
              FileOutputStream output = new FileOutputStream("temp.dat"))
        {
            // Output values to the file
            for (int i = 0; i <= 10; i++)
                output.write(i);
        }

        // Create an input stream for the file
        try (FileInputStream input = new FileInputStream("temp.dat"))
        {
            // Read values from the file
            int value;
            while ((value = input.read()) != -1)
                System.out.print(value + " ");
        }
    }
}
