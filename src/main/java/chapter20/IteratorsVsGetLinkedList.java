package chapter20;

import java.util.*;

/**
 * This is a test of the time difference between using an iterator
 * and using the get(index) method of on a LinkedList
 */
public class IteratorsVsGetLinkedList
{
    public static void main(String[] args)
    {
        LinkedList<Integer> list = new LinkedList<>();
        Random generator = new Random(20);

        for (int i = 0; i < 100_000; i++)
        {
            list.add(generator.nextInt());
        }

        ListIterator<Integer> listIterator = list.listIterator();
        long start1 = System.currentTimeMillis();
        while (listIterator.hasNext())
        {
            listIterator.next();
        }
        long end1 = System.currentTimeMillis();


        long start2 = System.currentTimeMillis();
        for (int i = 0, size = list.size(); i < size; i++)
        {
            list.get(i);
        }
        long end2 = System.currentTimeMillis();
        long time1 = (end1 - start1);
        long time2 = (end2 - start2);
        System.out.println("Iterator time was " + time1 + "ms");
        System.out.println("get(index) time was " + time2 + "ms");
    }
}
