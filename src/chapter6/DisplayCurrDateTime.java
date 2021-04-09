package chapter6;

import java.util.Calendar;

public class DisplayCurrDateTime
{
    public static void main(String[] args)
    {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
    }
}
