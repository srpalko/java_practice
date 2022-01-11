package DAO;

public class Product
{
    private String code;
    private String name;
    private String productLine;
    private String scale;
    private String vendor;
    private String description;
    private int quantityInStock;
    private double buyPrice;
    private double msrp;

    public Product()
    {

    }
    public Product(String code, String name, String productLine, String scale, String vendor, String description,
                   int quantityInStock, double buyPrice, double msrp)
    {
        this.code = code;
        this.name = name;
        this.productLine = productLine;
        this.scale = scale;
        this.vendor = vendor;
        this.description = description;
        this.quantityInStock = quantityInStock;
        this.buyPrice = buyPrice;
        this.msrp = msrp;
    }

    @Override
    public String toString()
    {
        return "Product{" +
               "code='" + code + '\'' +
               ", name='" + name + '\'' +
               ", productLine='" + productLine + '\'' +
               ", scale='" + scale + '\'' +
               ", vendor='" + vendor + '\'' +
               ", description='" + description + '\'' +
               ", quantityInStock=" + quantityInStock +
               ", buyPrice=" + buyPrice +
               ", msrp=" + msrp +
               '}';
    }

    public String getCode()
    {
        return code;
    }

    public void setCode(String code)
    {
        this.code = code;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getProductLine()
    {
        return productLine;
    }

    public void setProductLine(String productLine)
    {
        this.productLine = productLine;
    }

    public String getScale()
    {
        return scale;
    }

    public void setScale(String scale)
    {
        this.scale = scale;
    }

    public String getVendor()
    {
        return vendor;
    }

    public void setVendor(String vendor)
    {
        this.vendor = vendor;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public int getQuantityInStock()
    {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock)
    {
        this.quantityInStock = quantityInStock;
    }

    public double getBuyPrice()
    {
        return buyPrice;
    }

    public void setBuyPrice(double buyPrice)
    {
        this.buyPrice = buyPrice;
    }

    public double getMsrp()
    {
        return msrp;
    }

    public void setMsrp(double msrp)
    {
        this.msrp = msrp;
    }
}
