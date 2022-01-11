package DAO;

import java.sql.*;

public abstract class AbstractDAO
{
    private final String url = "jdbc:mariadb://localhost:3306/classicmodels";
    private final String userName = "root";
    private final String password = "root";
    private final Driver driver = new org.mariadb.jdbc.Driver();

    protected Connection connection = null;
    protected PreparedStatement preparedStatement = null;
    protected ResultSet resultSet = null;

    public AbstractDAO()
    {

    }

    public void connect() throws SQLTransientConnectionException
    {
        try
        {
            DriverManager.registerDriver(driver);
            connection = DriverManager.getConnection(url, userName, password);
        }
        catch (SQLException ex)
        {
            throw new SQLTransientConnectionException(ex.getMessage() );
        }
    }

    public void dispose()
    {
        try
        {
            if (!resultSet.equals(null))
            {
                if (!resultSet.isClosed())
                {
                    resultSet.close();
                }
            }
            if (!preparedStatement.equals(null))
            {
                if (!preparedStatement.isClosed())
                {
                    preparedStatement.close();
                }
            }
            if (!resultSet.equals(null))
            {
                if (!resultSet.isClosed())
                {
                    resultSet.close();
                }
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }
}
