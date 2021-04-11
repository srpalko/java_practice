package chapter20;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * Test of set operations on PriorityQueues
 */
public class SetOperationsOnPriorityQueues
{
    public static void main(String[] args)
    {
        PriorityQueue<String> pQueue1 = new PriorityQueue<>(Arrays.asList("George", "Jim", "John",
                "Blake", "Kevin", "Michael"));
        PriorityQueue<String> pQueue2 = new PriorityQueue<>(Arrays.asList("George", "Katie", "Kevin",
                "Michelle", "Ryan"));

        // Intersection
        //pQueue1.retainAll(pQueue2);

        // Difference
        //pQueue1.removeAll(pQueue2);

        //Union
        pQueue1.addAll(pQueue2);



        System.out.println(pQueue1);
    }
}
