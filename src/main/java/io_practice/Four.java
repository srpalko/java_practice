package io_practice;

import java.io.File;

public class Four
{
    public static void main(String[] args)
    {
        File file = new File("C:\\Go\\lib\\time");

        if (file.canRead() && file.canWrite())
        {
            System.out.println("Yes");
        } else
        {
            System.out.println("No");
        }
    }
}
