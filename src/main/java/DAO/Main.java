package DAO;

import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        CustomerQuery query = new CustomerQuery();

        Customer find = query.getCustomerById(103);
        System.out.println(find);

        query.addCustomer(
                new Customer(9999, "BassGear", "Pastorius", "Jaco", "45155547777", "123 Weather St", "Apt. 2", "Tampa",
                             "FL", "16454", "USA", 1370, 655321.33));

        Customer findJaco = query.getCustomerById(9999);
        System.out.println(findJaco);
    }
}
