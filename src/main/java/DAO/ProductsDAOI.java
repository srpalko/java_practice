package DAO;

import java.util.List;

public interface ProductsDAOI
{
    List<Product> getAllProducts();

    void addProduct(Product product);

    void removeProduct(int id);

    enum SQL
    {
        GET_ALL_PRODUCTS("select * from products"),
        ADD_PRODUCT("insert into products values (?, ?, ?, ?, ?, ?, ?, ?, ?)"),
        REMOVE_PRODUCT_BY_ID("delete from products where id = ?");
        private final String query;

        private SQL(String s)
        {
            this.query = s;
        }

        public String getQuery()
        {
            return query;
        }
    }
}
