package chapter9_objects_classes;

import java.util.Date;

public class Account
{
    private int id = 0;
    private double balance = 0;
    private static double annualInterestRate = 0;
    private Date dateCreated;

    public Account()
    {
        dateCreated = new Date();
    }

    public Account(int id, double startingBalance)
    {
        this();
        this.id = id;
        balance = startingBalance;
    }

    public int getId()
    {
        return id;
    }

    public double getBalance()
    {
        return balance;
    }

    public static double getAnnualInterestRate()
    {
        return annualInterestRate;
    }

    public void setId(int newId)
    {
        id = newId;
    }

    public void setBalance(double newBalance)
    {
        balance = newBalance;
    }

    public static void setAnnualInterestRate(double newRate)
    {
        Account.annualInterestRate = newRate;
    }

    public Date getDateCreated()
    {
        return dateCreated;
    }

    public static double getMonthlyInterestRate()
    {
        return Account.annualInterestRate / 12;
    }

    public double getMonthlyInterest()
    {
        return balance * (Account.getMonthlyInterestRate() / 100);
    }

    public double withdraw(double amount)
    {
        if (amount <= balance)
        {
            balance -= amount;
            return amount;
        }
        return 0;
    }

    public void deposit(double amount)
    {
        balance += amount;
    }


    public static void main(String[] args)
    {
        Account account = new Account(1122, 20000);
        Account.setAnnualInterestRate(4.5);

        double withdrawal = account.withdraw(2500);
        account.deposit(3000);

        System.out.println("balance is " + account.getBalance());
        System.out.println("monthly interest is " + account.getMonthlyInterest());
        System.out.println("date created is " + account.getDateCreated().toString());
    }


}
