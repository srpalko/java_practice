package io_practice;

import java.io.File;
import java.util.Date;

public class Seven
{
    public static void main(String[] args)
    {
        File file = new File("src/io_practice/One.java");
        long lastMod = file.lastModified();
        Date date = new Date(lastMod);
        System.out.println(date);
    }
}
