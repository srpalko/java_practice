package chapter9_objects_classes;

public class Stock
{
    private String symbol, name;
    private double previousClosingPrice, currentPrice;

    Stock(String symbol, String name)
    {
        this.symbol = symbol;
        this.name = name;
    }

    Stock(String symbol, String name, double previousClosingPrice)
    {
        this(symbol, name);
        this.previousClosingPrice = previousClosingPrice;
    }

    public void setPreviousClosingPrice(double price)
    {
        previousClosingPrice = price;
    }

    public void setCurrentPrice(double price)
    {
        currentPrice = price;
    }

    public double getChangePercent()
    {
        return (currentPrice - previousClosingPrice) / previousClosingPrice * 100;
    }

    public static void main(String[] args)
    {
        Stock stock = new Stock("ORCL", "Oracle Corporation", 34.5);
        stock.setCurrentPrice(34.35);
        System.out.println("Percent change is " + stock.getChangePercent());
    }

}
