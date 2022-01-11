package chapter.eight.multidimensional.arrays;

import java.util.Scanner;

/**
 * Banks lend money to each other. In tough economic times, if a bank goes bankrupt, it may not be able to pay back the
 * loan. A bank's total assets are its current balance plus its loans to other banks. If a bank's total assets are
 * below a certain limit, the bank is unsafe. The money it borrowed cannot be returned to the lender, and the lender
 * cannot count the loan in its total assets. Consequently, the lender may also be unsafe, if its total assets are
 * under the limit. This program finds all unsafe banks. It reads the input as follows. It first reads two integers
 * n and limit, where n indicates the number of banks and limit is the minimum total assets for keeping a bank safe.
 * It then reads n lines that describe the information for n banks with IDs from 0 to n-1.
 * <p>
 * The first number in the line is the bank's balance, the second number indicates the number of banks that borrowed
 * money from the bank, and the rest are pairs of two numbers. Each pair describes a borrower. The first number in the
 * pair is the borrower's ID and the second is the amount borrowed.
 */
public class FinancialTsunami {
    public static void main(String[] args) {

        /* Collect input for calculations */
        var input = new Scanner(System.in);
        var n = input.nextInt();
        var limit = input.nextInt();
        input.nextLine();
        var bankBalances = new int[n];
        var borrowers = new double[n][n];
        for (var i = 0; i < n; i++) {
            bankBalances[i] = input.nextInt();
            var loanCount = input.nextInt();
            for (var j = 0; j < loanCount; j++) {
                var bankID = input.nextInt();
                borrowers[i][bankID] = input.nextDouble();
            }
            input.nextLine();
        }

        /* Process results */
        /* Iterate through the banks until no changes have been made */
        var changesMade = false;
        var unsafe = new boolean[n];
        do {
            changesMade = false;

            /* Check each bank's total assets*/
            for (var i = 0; i < n; i++) {
                var loanTotals = 0;
                for (var j = 0; j < borrowers[i].length; j++) {
                    loanTotals += borrowers[i][j];
                }

//                Check to see if the total assets are below the limit
                if (bankBalances[i] + loanTotals < limit) {

                    /* If so, mark the bank unsafe and zero out their loans from other banks */
                    unsafe[i] = true;
                    for (var borrower : borrowers) {
                        if (borrower[i] > 0) {
                            borrower[i] = 0;
                            changesMade = true;
                        }
                    }
                }
            }
        } while (changesMade);

        /* Print results to the console. */
        System.out.print("Unsafe banks are ");
        for (var i = 0; i < unsafe.length; i++) {
            if (unsafe[i]) {
                System.out.print(i + " ");
            }
        }
    }
}

