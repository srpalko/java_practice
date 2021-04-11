package chapter20;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class StoreNumbersLinkedList
{
    public static void main(String[] args)
    {
        LinkedList<Integer> list = new LinkedList<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter some numbers (0 ends input): ");
        while (true)
        {
            int next = input.nextInt();
            if (next == 0)
            {
                break;
            }

            if (!list.contains(next))
            {
                list.add(next);
            }
        }
        System.out.println("List contains: " + list);

        Collections.sort(list);
        System.out.println("The sorted list is: " + list);

        Collections.shuffle(list);
        System.out.println("The shuffled list is: " + list);

        Collections.reverse(list);
        System.out.println("The reverse of the suffle is: " + list);
    }

}
