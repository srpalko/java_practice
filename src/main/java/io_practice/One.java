package io_practice;

import java.io.File;

public class One
{
    public static void main(String[] args)
    {
        File file1 = new File("src/io_practice");
        String[] fileList = file1.list();
        assert fileList != null;
        for (String name : fileList)
        {
            System.out.println(name);
        }

    }
}
