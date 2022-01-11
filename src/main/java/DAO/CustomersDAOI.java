package DAO;

import java.util.List;

public interface CustomersDAOI
{
    List<Customer> getAllCustomers();

    Customer getCustomerById(int id);

    void addCustomer(Customer C);

    void removeCustomer(int id);

    enum SQL
    {
        GET_ALL_CUSTOMERS("select * from customers"),
        GET_CUSTOMER_BY_ID("select * from customers where customerNumber = ?"),
        ADD_CUSTOMER("insert into customers values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"),
        REMOVE_CUSTOMER("delete from customers where customerNumber = ?");
        private final String query;

        private SQL(String S)
        {
            this.query = S;
        }

        public String getQuery()
        {
            return query;
        }
    }


}
