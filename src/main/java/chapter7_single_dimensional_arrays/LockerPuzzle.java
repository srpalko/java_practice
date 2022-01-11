package chapter7_single_dimensional_arrays;

/**
 * A school has 100 lockers and 100 students. All lockers are closed on the first day of school.
 * As the students enter, the first student, denoted S1, opens every locker.
 * Then the second student, S2, begins with the second locker, denoted L2, and closes every other locker.
 * Student S3 begins with the third locker and changes every third locker
 * (closes it if it was open, and opens it if it was closed).
 * Student S4 begins with locker L4 and changes every fourth locker.
 * Student S5 starts with L5 and changes every fifth locker, and so on, until student S100 changes L100.
 * <p>
 * This program finds the answer to which lockers are open after all of the students have passed through the
 * building and changed the lockers. It displays all open lockers separated by exactly one space.
 */
public class LockerPuzzle
{
    public static void main(String[] args)
    {
        // Array to hold the status of each locker. Should start with all false.
        boolean[] whichLockersAreOpen = new boolean[100];


        // The number of students that will pass through the school.
        final int STUDENT_POPULATION = 100;

        // Loop once for each student. Each student starts with their respective locker number
        // Numbers are one less than actual value.
        for (int startingLocker = 0; startingLocker < STUDENT_POPULATION; startingLocker++)
        {
            // Represents how many lockers a student should skip before opening another
            int skipCount = startingLocker + 1; // Students always skip their number/starting locker

            // Loop past lockers starting with the start locker, skipping according to student number
            // Change each locker visited.
            for (int locker = startingLocker, numberOfLockers = whichLockersAreOpen.length;
                 locker < numberOfLockers;
                 locker += skipCount)
            {
                boolean isLockerOpen = whichLockersAreOpen[locker];
                if (isLockerOpen)
                {
                    whichLockersAreOpen[locker] = false;
                }
                else if (!isLockerOpen)
                {
                    whichLockersAreOpen[locker] = true;
                }
            }
        }

        // Display the open lockers
        System.out.println("After student s100, the open lockers are: ");
        for (int i = 0, whichLockersAreOpenLength = whichLockersAreOpen.length; i < whichLockersAreOpenLength; i++)
        {
            boolean isLockerOpen = whichLockersAreOpen[i];
            if (isLockerOpen)
            {
                System.out.print((i + 1) + " ");
            }
        }

    }
}
