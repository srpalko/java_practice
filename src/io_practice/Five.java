package io_practice;

import java.io.File;

public class Five
{
    public static void main(String[] args)
    {
        File file = new File("C:\\Go\\lib\\time");

        if (file.isFile())
        {
            System.out.println("File");
        } else if (file.isDirectory())
        {
            System.out.println("Directory");
        }
    }
}
