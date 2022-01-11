package DAO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerQuery extends AbstractDAO implements CustomersDAOI
{

    @Override
    public List<Customer> getAllCustomers()
    {
        ArrayList<Customer> list = new ArrayList<>();
        try
        {
            this.connect();
            preparedStatement = connection.prepareStatement(SQL.GET_ALL_CUSTOMERS.getQuery());
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next())
            {
                list.add(new Customer(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3),
                                      resultSet.getString(4), resultSet.getString(5), resultSet.getString(6),
                                      resultSet.getString(7), resultSet.getString(8), resultSet.getString(9),
                                      resultSet.getString(10), resultSet.getString(11), resultSet.getInt(12),
                                      resultSet.getDouble(13)));
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        finally
        {
            this.dispose();
        }
        return list;
    }

    @Override
    public Customer getCustomerById(int id)
    {
        Customer customer = new Customer();
        try
        {
            this.connect();
            preparedStatement = connection.prepareStatement(SQL.GET_CUSTOMER_BY_ID.getQuery());
            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next())
            {
                customer.setCustomerNumber(resultSet.getInt(1));
                customer.setCustomerName(resultSet.getString(2));
                customer.setContactLastName(resultSet.getString(3));
                customer.setContactFirstName(resultSet.getString(4));
                customer.setPhone(resultSet.getString(5));
                customer.setAddressLine1(resultSet.getString(6));
                customer.setAddressLine2(resultSet.getString(7));
                customer.setCity(resultSet.getString(8));
                customer.setState(resultSet.getString(9));
                customer.setPostalCode(resultSet.getString(10));
                customer.setCountry(resultSet.getString(11));
                customer.setSalesRepEmployeeNumber(resultSet.getInt(12));
                customer.setCreditLimit(resultSet.getDouble(13));
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        finally
        {
            this.dispose();
            return customer;
        }
    }

    @Override
    public void addCustomer(Customer C)
    {
        int id = C.getCustomerNumber();
        String name = C.getCustomerName();
        String lastName = C.getContactLastName();
        String firstName = C.getContactFirstName();
        String phone = C.getPhone();
        String address1 = C.getAddressLine1();
        String address2 = C.getAddressLine2();
        String city = C.getCity();
        String state = C.getState();
        String postal = C.getPostalCode();
        String country = C.getCountry();
        int salesRepNum = C.getSalesRepEmployeeNumber();
        double credit = C.getCreditLimit();

        try
        {
            this.connect();
            preparedStatement = connection.prepareStatement(SQL.ADD_CUSTOMER.getQuery());
            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, name);
            preparedStatement.setString(3, lastName);
            preparedStatement.setString(4, firstName);
            preparedStatement.setString(5, phone);
            preparedStatement.setString(6, address1);
            preparedStatement.setString(7, address2);
            preparedStatement.setString(8, city);
            preparedStatement.setString(9, state);
            preparedStatement.setString(10, postal);
            preparedStatement.setString(11, country);
            preparedStatement.setInt(12, salesRepNum);
            preparedStatement.setDouble(13, credit);
            preparedStatement.executeUpdate();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        finally
        {
            this.dispose();
        }
    }

    @Override
    public void removeCustomer(int id)
    {
        try
        {
            this.connect();
            preparedStatement = connection.prepareStatement(SQL.REMOVE_CUSTOMER.getQuery());
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        finally
        {
            this.dispose();
        }
    }

}
